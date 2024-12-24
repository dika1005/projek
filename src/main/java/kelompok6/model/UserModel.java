package kelompok6.model;

/**
 * UserModel class representing a user with various attributes.
 */
public class UserModel {
    private String id; // varchar(48), utf8mb4_0900_ai_ci
    private String nama; // varchar(20), utf8mb4_0900_ai_ci
    private String username; // varchar(20), utf8mb4_0900_ai_ci
    private String password; // varchar(20), utf8mb4_0900_ai_ci
    private String email; // varchar(20), utf8mb4_0900_ai_ci
    private String alamat; // varchar(50), utf8mb4_0900_ai_ci

    // Default constructor
    public UserModel() {}

    // Parameterized constructor
    public UserModel(String id, String nama, String username, String password, String email, String alamat) {
        this.id = id;
        this.nama = nama;
        this.username = username;
        this.password = password;
        this.email = email;
        this.alamat = alamat;
    }

    // Getter and setter for id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Getter and setter for nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
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

    // Getter and setter for email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter and setter for alamat
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
