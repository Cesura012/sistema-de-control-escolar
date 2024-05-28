package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
	
    private final String URL = "jdbc:mysql://127.0.0.1:3306/";
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private final String DB_USER = "freedb_mchlDeveloper";
    private final String DB_PASSWORD = "ZbZeqqUR@P!wb4r";
    private final String DB_NAME = "freedb_programacionDataBase";
    private final String QUERY_PARAMS = "?serverTimezone=UTC&useSSL=NO&allowPublicKeyRetrieval=true";
    
    private Connection conn;

	public DB() {
		this.conn = null;
	}
	
	 public Connection getConnection() throws ClassNotFoundException, SQLException {  
		 Class.forName(DRIVER);
	        this.conn = DriverManager.getConnection(URL + DB_NAME + QUERY_PARAMS, DB_USER, DB_PASSWORD);
	        return this.conn;
	    }
	   
	    public void close() throws SQLException {
	        this.conn.close();
	    }

}
