package AuthViewAlu;



import java.awt.EventQueue;
import javax.swing.JComboBox;
import java.time.Year;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JMenu;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;

import AuthController.AuthController;

public class DeleteAluView {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JButton btnConfirm;
	private JButton btnNewButton_1;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteAluView window = new DeleteAluView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DeleteAluView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 890, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 875, 538);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 30, 972, 31);
		panel_1.setBackground(new Color(0, 128, 255));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Eliminar alumno");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(230, 0, 508, 25);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 520, 880, 16);
		panel_2.setBackground(new Color(0, 128, 255));
		panel.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(151, 203, 255));
		panel_3.setBounds(50, 150, 480, 350);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(new Color(0, 128, 255));
		panel_2_1.setBounds(0, 0, 480, 16);
		panel_3.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Datos generales");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(0, 0, 150, 14);
		panel_2_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre(s):");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(30, 20, 100, 18);
		panel_3.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(205, 20, 250, 20);
		panel_3.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Apellido paterno:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(30, 60, 150, 18);
		panel_3.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(205, 60, 250, 20);
		panel_3.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Apellido materno:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(30, 110, 150, 18);
		panel_3.add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(205, 110, 250, 20);
		panel_3.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Fecha de nacimiento:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(30, 160, 170, 18);
		panel_3.add(lblNewLabel_5);
		
		
		JLabel lblNewLabel_6 = new JLabel("Correo electrónico:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6.setBounds(30, 210, 150, 14);
		panel_3.add(lblNewLabel_6);
		
		textField_4 = new JTextField();
		textField_4.setBounds(205, 210, 250, 20);
		panel_3.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Teléfono:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_7.setBounds(30, 260, 100, 14);
		panel_3.add(lblNewLabel_7);
		
		textField_5 = new JTextField();
		textField_5.setBounds(205, 260, 250, 20);
		panel_3.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Grado:");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_8.setBounds(30, 310, 70, 14);
		panel_3.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("DD:");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_9.setBounds(205, 160, 46, 14);
		panel_3.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("MM:");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_10.setBounds(275, 160, 46, 14);
		panel_3.add(lblNewLabel_10);
		
		
		JLabel lblNewLabel_11 = new JLabel("AA:");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_11.setBounds(351, 160, 46, 14);
		panel_3.add(lblNewLabel_11);
		   
		    
		    textField_10 = new JTextField();
		    textField_10.setBounds(205, 310, 250, 20);
		    panel_3.add(textField_10);
		    textField_10.setColumns(10);
		    
		    textField_11 = new JTextField();
		    textField_11.setBounds(235, 160, 40, 20);
		    panel_3.add(textField_11);
		    textField_11.setColumns(10);
		    
		    textField_12 = new JTextField();
		    textField_12.setBounds(308, 160, 40, 20);
		    panel_3.add(textField_12);
		    textField_12.setColumns(10);
		    
		    textField_13 = new JTextField();
		    textField_13.setBounds(380, 160, 70, 20);
		    panel_3.add(textField_13);
		    textField_13.setColumns(10);

		    
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(567, 100, 250, 300);
		panel_4.setBackground(new Color(151, 203, 255));
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBackground(new Color(0, 128, 255));
		panel_2_1_1.setBounds(0, 0, 250, 16);
		panel_4.add(panel_2_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Fotografia del alumno");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(0, 0, 250, 14);
		panel_2_1_1.add(lblNewLabel_1_1);
		
		btnConfirm = new JButton("Confirmar");
	    btnConfirm.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            if (areFieldsValid()) {
	               
	                JOptionPane.showMessageDialog(frame, "Alumno eliminado.");
	            } else {
	               
	                JOptionPane.showMessageDialog(frame, "El numero de control no coincide, Por favor complete todos los campos correctamente.", "Error", JOptionPane.ERROR_MESSAGE);
	            }
	        }
	    });
	    btnConfirm.setForeground(new Color(255, 255, 255));
	    btnConfirm.setBackground(new Color(0, 64, 128));
	    btnConfirm.setBounds(620, 420, 170, 40);
	    panel.add(btnConfirm);
		
		JButton btnNewButton_2 = new JButton("Cancelar");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(0, 64, 128));
		btnNewButton_2.setBounds(620, 473, 170, 40);
		panel.add(btnNewButton_2);
		
		JLabel lblNewLabel_12 = new JLabel("Numero de control:");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_12.setBounds(50, 100, 150, 14);
		panel.add(lblNewLabel_12);
		
		textField_9 = new JTextField();
		textField_9.setBounds(210, 100, 170, 20);
		panel.add(textField_9);
		textField_9.setColumns(10);
		
		btnNewButton_1 = new JButton("Buscar");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(0, 64, 128));
		btnNewButton_1.setBounds(414, 98, 89, 23);
		panel.add(btnNewButton_1);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 JOptionPane.showMessageDialog(frame, "credencial descargada", "Créditos", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
	    JMenuBar menuBar = new JMenuBar();
	    menuBar.setForeground(new Color(0, 0, 0));
	    menuBar.setBackground(new Color(255, 255, 255));
	    menuBar.setBounds(10, 0, 101, 22);

	    ImageIcon creditsIcon = new ImageIcon(getClass().getResource("/img/creditos.png"));
	    ImageIcon logoutIcon = new ImageIcon(getClass().getResource("/img/cerrar-sesion.png"));

	        frame.setJMenuBar(menuBar);
	        JMenuBar menuBar1 = new JMenuBar();
	           	        	menuBar1.setForeground(new Color(0, 0, 0));
	           	        	menuBar1.setBackground(new Color(255, 255, 255));
	           	        	menuBar1.setBounds(20, 0, 101, 22);
	           	        	
	           	        	JButton btnNewButton = new JButton("Regresar");
	           	        	btnNewButton.setBackground(new Color(255, 255, 255));
	           	        	btnNewButton.setBorder(null);
	           	         btnNewButton.addActionListener(new ActionListener() {
	           	            public void actionPerformed(ActionEvent e) {
	           	            	AuthController.mostrarAdminalu();
           	        			frame.dispose();
	           	            	
	           	            
	           	              
	           	            }
	           	        });
	           	        	
	           	        	JLabel r = new JLabel("");
	           	        	menuBar.add(r);
	           	        	r.setIcon(new ImageIcon(getClass().getClassLoader().getResource("img/regresar.png")));
	           	        	menuBar.add(btnNewButton);
	           	        	
	           	        	JLabel p = new JLabel("");
	           	        	menuBar.add(p);
	           	        	p.setIcon(new ImageIcon(getClass().getClassLoader().getResource("img/opciones.png")));
	           	        	menuBar.add(Box.createHorizontalStrut(1));
           	     	        frame.setJMenuBar(menuBar);
	           	     	       
	           	     	    JMenu optionsMenu = new JMenu("Opciones");
	           	     	    menuBar.add(optionsMenu);
	           	     	         
	           	     	           JMenuItem creditsItem = new JMenuItem("Créditos", creditsIcon);
	           	     	           JMenuItem logoutItem = new JMenuItem("Cerrar Sesión", logoutIcon);
	           	     	           
	           	     	           	        creditsItem.addActionListener(new ActionListener() {
	           	     	           	            public void actionPerformed(ActionEvent e) {
	           	     	           	            	 JOptionPane.showMessageDialog(frame, "Hecho por \nObeso Sanchez Michelle de Jesus\nGracia Nava Ernesto\nRojo Martínez Jesús Javier", "Créditos", JOptionPane.INFORMATION_MESSAGE);
	           	     	           	            }
	           	     	           	        });
	           	     	           	        
	           	     	           	        	        logoutItem.addActionListener(new ActionListener() {
	           	     	           	        	            public void actionPerformed(ActionEvent e) {
	           	     	           	        	                int response = JOptionPane.showConfirmDialog(frame, "¿Estás seguro que deseas cerrar sesión?", "Confirmar Cierre de Sesión", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
	           	     	           	        	                if (response == JOptionPane.YES_OPTION) {
	           	     	           	        	             closesesion();
	           	     	           	        	                }
	           	     	           	        	            }
	           	     	           	        	        });
	           	     	           	        	        
	           	     	           	        	        optionsMenu.add(creditsItem);
	           	     	           	        	        optionsMenu.add(logoutItem);       	        	        
	        frame.setVisible(true);
	    }
	
	private void closesesion() {
	    int response = JOptionPane.showConfirmDialog(frame, "¿Estás seguro que deseas cerrar sesión?", "Confirmar Cierre de Sesión", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
	    if (response == JOptionPane.YES_OPTION) {
	        frame.dispose();
	        try {
				AuthController.loginVista.getEmailField().setText("");
				AuthController.loginVista.getPasswordField().setText("");
				AuthController.mostrarLogin();
		       
			} catch (Exception e) {
				
				e.printStackTrace();
			}
	        
	    }
	}

	public JFrame getFrame() {
		// TODO Auto-generated method stub
		return frame;
	}
	
	 public JTextField getTextField() {
	        return textField;
	 }
	 
	 public JTextField getTextField_1() {
	        return textField_1;
	 }
	 
	 public JTextField getTextField_2() {
	        return textField_2;
	 }
	 
	 public JTextField getTextField_4() {
	        return textField_4;
	 }
	 
	 public JTextField getTextField_5() {
	        return textField_5;
	 }
	 
	 public JTextField getTextField_9() {
	        return textField_9;
	 }
	 
	 
	 public JTextField getTextField_10() {
	        return textField_10;
	 }
	 
	 public JTextField getTextField_11() {
	        return textField_11;
	 }
	 
	 public JTextField getTextField_12() {
	        return textField_12;
	 }
	 
	 public JTextField getTextField_13() {
	        return textField_13;
	 }

	 public JButton getBtnRegresar() {
	        return getBtnRegresar();
	 }
	 
	 public JButton getBtnConfirm() {
	        return btnConfirm;
	 }
	 
	 public JButton getBtnNewButton_1() {
	        return btnNewButton_1;
	 }
	 
	
}