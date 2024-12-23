package kelompok6.lib;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class koneksii {

    private static final Logger logger = Logger.getLogger(koneksii.class.getName());
    private static HikariDataSource dataSource;

    static {
        try {
            HikariConfig config = new HikariConfig();
            config.setJdbcUrl("jdbc:mysql://217.15.165.147:3306/db_toko");
            config.setUsername("toko");
            config.setPassword("123");
            config.setDriverClassName("com.mysql.cj.jdbc.Driver");

            // Optional: Tuning pool settings
            config.setMaximumPoolSize(10);
            config.setMinimumIdle(2);
            config.setIdleTimeout(30000);
            config.setMaxLifetime(1800000);

            dataSource = new HikariDataSource(config);

            logger.info("Koneksi Berhasil");
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Koneksi Gagal: " + e.getMessage(), e);
            throw new RuntimeException(e);
        }
    }

    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    public static void main(String[] args) {
        try (Connection connection = koneksii.getConnection()) {
            if (connection != null) {
                logger.info("Koneksi berhasil digunakan.");
            }
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Koneksi Gagal: " + e.getMessage(), e);
        }
    }
}