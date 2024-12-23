package kelompok6.model;

/**
 * AdminModel class representing an admin with username and password.
 */
public class AdminModel {
    private String username; // varchar(100), utf8mb4_0900_ai_ci
    private String password; // varchar(100), utf8mb4_0900_ai_ci

    // Default constructor
    public AdminModel() {}

    // Parameterized constructor
    public AdminModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getter and setter for username
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Getter and setter for password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
