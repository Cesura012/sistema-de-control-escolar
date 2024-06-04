import java.sql.Connection;
import java.sql.SQLException;

import dataBase.DB;

public class TestDBConnection {
    public static void main(String[] args) {
        DB db = new DB();
        try (Connection conn = db.getConnection()) {
            if (conn != null) {
                System.out.println("Conexión exitosa a la base de datos!");
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
