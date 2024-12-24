package kelompok6.repo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import kelompok6.lib.koneksii;
import kelompok6.model.UserModel;

public class UserRepo {
    private static final String TABLE_NAME = "user";

    public boolean create(UserModel user) {
        String query = "INSERT INTO " + TABLE_NAME + " (id, nama, username, password, email, alamat) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection connection = koneksii.getConnection();
                PreparedStatement stmt = connection.prepareStatement(query)) {
            String uniqueId = generateUniqueId(connection);
            stmt.setString(1, uniqueId);
            stmt.setString(2, user.getNama());
            stmt.setString(3, user.getUsername());
            stmt.setString(4, user.getPassword());
            stmt.setString(5, user.getEmail());
            stmt.setString(6, user.getAlamat());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    private String generateUniqueId(Connection connection) throws SQLException {
        String uniqueId;
        boolean isUnique;
        do {
            uniqueId = java.util.UUID.randomUUID().toString();
            String query = "SELECT COUNT(*) FROM " + TABLE_NAME + " WHERE id = ?";
            try (PreparedStatement stmt = connection.prepareStatement(query)) {
                stmt.setString(1, uniqueId);
                try (ResultSet rs = stmt.executeQuery()) {
                    rs.next();
                    isUnique = rs.getInt(1) == 0;
                }
            }
        } while (!isUnique);
        return uniqueId;
    }

    public List<UserModel> readAll() {
        List<UserModel> users = new ArrayList<>();
        String query = "SELECT * FROM " + TABLE_NAME;
        try (Connection connection = koneksii.getConnection();
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                String uniqueId = generateUniqueId(connection);
                UserModel user = new UserModel();
                user.setId(uniqueId);
                user.setNama(rs.getString("nama"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setEmail(rs.getString("email"));
                user.setAlamat(rs.getString("alamat"));
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    public UserModel login(String username, String password) {
        String query = "SELECT * FROM " + TABLE_NAME + " WHERE username = ? AND password = ?";
        try (Connection connection = koneksii.getConnection();
                PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, username);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new UserModel(
                        rs.getString("id"),
                        rs.getString("nama"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("email"),
                        rs.getString("alamat"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean update(UserModel user) {
        String query = "UPDATE " + TABLE_NAME + " SET nama = ?, password = ?, email = ?, alamat = ? WHERE id = ?";
        try (Connection connection = koneksii.getConnection();
                PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, user.getNama());
            stmt.setString(2, user.getPassword());
            stmt.setString(3, user.getEmail());
            stmt.setString(4, user.getAlamat());
            stmt.setString(5, user.getId());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean delete(String id) {
        String query = "DELETE FROM " + TABLE_NAME + " WHERE id = ?";
        try (Connection connection = koneksii.getConnection();
                PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, id);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
