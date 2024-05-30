package AuthModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
	            /*String sql = "INSERT INTO alumno (num_control, nombre, apellido_paterno, apellido_materno, fecha_nacimiento, correo_electronico, telefono, grado) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
	            PreparedStatement statement = conn.prepareStatement(sql);
	            statement.setInt(1, this.num_control);
	            statement.setString(2, this.nombre);
	            statement.setString(3, this.apellido_paterno);
	            statement.setString(4, this.apellido_materno);
	            statement.setDate(5, (java.sql.Date) this.fecha_nacimiento);
	            statement.setString(6, this.correo_electronico);
	            statement.setString(7, this.telefono);
	            statement.setInt(2, this.grado);*/
	        	String sql = "INSERT INTO alumno (num_control, nombre) VALUES (?, ?)";
	            PreparedStatement statement = conn.prepareStatement(sql);
	            statement.setInt(1, this.num_control);
	            statement.setString(2, this.nombre);
	            int rowsInserted = statement.executeUpdate();

	            return rowsInserted > 0;
	        } catch (SQLException | ClassNotFoundException e) {
	            e.printStackTrace();
	            return false;
	        }
	}

}
