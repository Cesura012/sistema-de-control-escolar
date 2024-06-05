package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Para las consultas cambiar el noombre que tienes para tus tablas para que concuerde con tu BD

//                                                  Colocar aqui tu base de datos
public class DB {
    private static final String URL = "jdbc:mysql://sql.freedb.tech:3306/freedb_programacionDataBase";
    private static final String USER = "freedb_mchlDeveloper";
    private static final String PASS = "ZbZeqqUR@P!wb4r";

    public Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL, USER, PASS);
    }
}
