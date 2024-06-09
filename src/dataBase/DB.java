package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
    private static final String URL = "jdbc:mysql://monorail.proxy.rlwy.net:14713/railway";
    private static final String USER = "root";
    private static final String PASS = "OVSDgbHAUpatRMXjPBIjrVytUKlvDSEL";

    public Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL, USER, PASS);
    }
}
