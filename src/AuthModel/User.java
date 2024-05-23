package AuthModel;

public class User {
    private String gmail;
    private String password;

    public User(String gmail, String password) {
        this.gmail = gmail;
        this.password = password;
    }

    public String getCorreoElectronico() {
        return gmail;
    }

    public String getContrasena() {
        return password;
    }
}