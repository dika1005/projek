package kelompok6.repo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import kelompok6.lib.koneksii;
import kelompok6.model.UserModel;



public class UserRepo {
    private static final String TABLE_NAME = "user";

    public boolean create(UserModel user) {
        String query = "INSERT INTO " + TABLE_NAME + " (nama, username, password, email, alamat) VALUES (?, ?, ?, ?, ?)";
        try (Connection connection = koneksii.getConnection();
                PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, user.getNama());
            stmt.setString(2, user.getUsername());
            stmt.setString(3, user.getPassword());
            stmt.setString(4, user.getEmail());
            stmt.setString(5, user.getAlamat());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<UserModel> readAll() {
        List<UserModel> users = new ArrayList<>();
        String query = "SELECT * FROM " + TABLE_NAME;
        try (Connection connection = koneksii.getConnection();
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                UserModel user = new UserModel();
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
        String query = "UPDATE " + TABLE_NAME + " SET nama = ?, password = ?, email = ?, alamat = ? WHERE username = ?";
        try (Connection connection = koneksii.getConnection();
                PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, user.getNama());
            stmt.setString(2, user.getPassword());
            stmt.setString(3, user.getEmail());
            stmt.setString(4, user.getAlamat());
            stmt.setString(5, user.getUsername());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean delete(String username) {
        String query = "DELETE FROM " + TABLE_NAME + " WHERE username = ?";
        try (Connection connection = koneksii.getConnection();
                PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, username);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
