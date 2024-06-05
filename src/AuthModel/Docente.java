package AuthModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import dataBase.DB;

public class Docente {
	
	private int num_control;
	private String nombre, apellido_paterno, apellido_materno, correo_electronico, telefono, grado_estudios;
	private Date fecha_nacimiento;

	public Docente() {

	}

	public Docente(int num_control, String grado_estudios, String nombre, String apellido_paterno, String apellido_materno,
			String correo_electronico, String telefono, Date fecha_nacimiento) {
		this.num_control = num_control;
		this.grado_estudios = grado_estudios;
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

	public String getGrado_estudios() {
		return grado_estudios;
	}

	public void setGrado_estudios(String grado_estudios) {
		this.grado_estudios = grado_estudios;
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
	        	String sql = "INSERT INTO DOCENTE (nombre, apellido_paterno, apellido_materno, fecha_nacimiento, correo_electronico, telefono, grado_estudios) VALUES (?, ?, ?, ?, ?, ?, ?)";
	            PreparedStatement statement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
	            statement.setString(1, this.nombre);
	            statement.setString(2, this.apellido_paterno);
	            statement.setString(3, this.apellido_materno);
	            
	            // Convertir java.util.Date a java.sql.Date
	            java.sql.Date fechaSQL = new java.sql.Date(this.fecha_nacimiento.getTime());
	            statement.setDate(4, fechaSQL);
	            
	            statement.setString(5, this.correo_electronico);
	            statement.setString(6, this.telefono);
	            statement.setString(7, this.grado_estudios);
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
	

}
