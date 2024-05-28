package AuthModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dataBase.DB;

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
    
    
  //Conectar la base de datos para el login
    public boolean validateUser() {
        /*String url = "jdbc:mysql://sql.freedb.tech:3306/freedb_programacionDataBase";
        String user = "freedb_mchlDeveloper";
        String pass = "ZbZeqqUR@P!wb4r";*/
    	
    	DB db = new DB();

        try (Connection conn = db.getConnection()) {
            String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, this.gmail);
            statement.setString(2, this.password);
            ResultSet resultSet = statement.executeQuery();

            return resultSet.next();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    
  //Conectar la base de datos para el registro

   public boolean registerUser() {
	   /*String url = "jdbc:mysql://sql.freedb.tech:3306/freedb_programacionDataBase";
	   String user = "freedb_mchlDeveloper";
	   String pass = "ZbZeqqUR@P!wb4r";*/
	   DB db = new DB();
	   
	   try (Connection conn = db.getConnection()){
		   String sql = "INSERT INTO users (username, password) VALUES (?, ?)";
		   PreparedStatement statement = conn.prepareStatement(sql);
		   statement.setString(1, this.gmail);
		   statement.setString(2, this.password);
		   int rowsInserted = statement.executeUpdate();
		   return rowsInserted > 0;
	   }catch (SQLException | ClassNotFoundException e) {
		   e.printStackTrace();
		   return false;
   }
   }
}