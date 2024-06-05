package AuthModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import dataBase.DB;

public class Alumno {
	
	private int num_control, grado;
	private String nombre, apellido_paterno, apellido_materno, correo_electronico, telefono;
	private Date fecha_nacimiento;

	public Alumno() {
		
	}

	public Alumno(int num_control, int grado, String nombre, String apellido_paterno, String apellido_materno,
			String correo_electronico, String telefono, Date fecha_nacimiento) {
		this.num_control = num_control;
		this.grado = grado;
		this.nombre = nombre;
		this.apellido_paterno = apellido_paterno;
		this.apellido_materno = apellido_materno;
		this.correo_electronico = correo_electronico;
		this.telefono = telefono;
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public int getNum_control() {
		return num_control;
	}

	public void setNum_control(int num_control) {
		this.num_control = num_control;
	}

	public int getGrado() {
		return grado;
	}

	public void setGrado(int grado) {
		this.grado = grado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido_paterno() {
		return apellido_paterno;
	}

	public void setApellido_paterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}

	public String getApellido_materno() {
		return apellido_materno;
	}

	public void setApellido_materno(String apellido_materno) {
		this.apellido_materno = apellido_materno;
	}

	public String getCorreo_electronico() {
		return correo_electronico;
	}

	public void setCorreo_electronico(String correo_electronico) {
		this.correo_electronico = correo_electronico;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	
	public boolean insert() {
		DB db = new DB();
		 
	    try (Connection conn = db.getConnection()) {
	        	//Consulta
	        	String sql = "INSERT INTO ALUMNO (nombre, apellido_paterno, apellido_materno, fecha_nacimiento, correo_electronico, telefono, grado) VALUES (?, ?, ?, ?, ?, ?, ?)";
	            PreparedStatement statement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
	            statement.setString(1, this.nombre);
	            statement.setString(2, this.apellido_paterno);
	            statement.setString(3, this.apellido_materno);
	            
	            // Convertir java.util.Date a java.sql.Date
	            java.sql.Date fechaSQL = new java.sql.Date(this.fecha_nacimiento.getTime());
	            statement.setDate(4, fechaSQL);
	            
	            statement.setString(5, this.correo_electronico);
	            statement.setString(6, this.telefono);
	            statement.setInt(7, this.grado);
	            int rowsInserted = statement.executeUpdate();
	            
	         // Obtener el num_control generado automáticamente
	            if (rowsInserted > 0) {
	                ResultSet generatedKeys = statement.getGeneratedKeys();
	                if (generatedKeys.next()) {
	                    this.num_control = generatedKeys.getInt(1); 
	                }
	            }

	            return rowsInserted > 0;
	        } catch (SQLException | ClassNotFoundException e) {
	            e.printStackTrace();
	            return false;
	        }
	}
	
	public static Alumno buscarPorNumControl(int numControl) {
        DB db = new DB();
        Alumno alumno = null;
        
        try (Connection conn = db.getConnection()) {
        	//Consulta
            String sql = "SELECT * FROM ALUMNO WHERE num_control = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, numControl);
            
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                alumno = new Alumno();
                alumno.setNum_control(resultSet.getInt("num_control"));
                alumno.setNombre(resultSet.getString("nombre"));
                alumno.setApellido_paterno(resultSet.getString("apellido_paterno"));
                alumno.setApellido_materno(resultSet.getString("apellido_materno"));
                alumno.setFecha_nacimiento(resultSet.getDate("fecha_nacimiento"));
                alumno.setCorreo_electronico(resultSet.getString("correo_electronico"));
                alumno.setTelefono(resultSet.getString("telefono"));
                alumno.setGrado(resultSet.getInt("grado"));
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        
        return alumno;
    }

	
	public boolean delete() {
	    DB db = new DB();

	    try (Connection conn = db.getConnection()) {
	    	//Consulta
	        String sql = "DELETE FROM ALUMNO WHERE num_control = ?";
	        PreparedStatement statement = conn.prepareStatement(sql);
	        statement.setInt(1, this.num_control);
	        int rowsDeleted = statement.executeUpdate();
	        
	        return rowsDeleted > 0;
	    } catch (SQLException | ClassNotFoundException e) {
	        e.printStackTrace();
	        return false;
	    }
	}

}
