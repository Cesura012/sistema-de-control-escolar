
package AuthView;
import java.awt.EventQueue;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import AuthController.AuthController;

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
import java.awt.Component;

public class AdminaluView {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminaluView window = new AdminaluView();
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
	public AdminaluView() {
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
		panel.setBounds(0, 0, 875, 570);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 128, 255));
		panel_1.setBounds(0, 30, 972, 31);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Administrar alumnos");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(305, 0, 508, 25);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 128, 255));
		panel_2.setBounds(0, 550, 880, 16);
		panel.add(panel_2);
		
		 JLabel img = new JLabel("");
	     img.setBounds(65, 72, 152, 160);
	     img.setIcon(new ImageIcon(getClass().getClassLoader().getResource("img/conalu.png")));
	     panel.add(img);
	     
	     JLabel lblNewLabel_1 = new JLabel("Consultar registros de alumnos");
	     lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	     lblNewLabel_1.setBounds(41, 240, 210, 24);
	     panel.add(lblNewLabel_1);
	     
	     JLabel img2 = new JLabel("");
	     img2.setBounds(680, 72, 152, 160);
	     img2.setIcon(new ImageIcon(getClass().getClassLoader().getResource("img/crearalu.png")));
	     panel.add(img2);
	     
	     JLabel lblNewLabel_5 = new JLabel("Detalles de alumnos");
	     lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
	     lblNewLabel_5.setBounds(360, 240, 210, 24);
	     panel.add(lblNewLabel_5);
	     
	     JLabel img5 = new JLabel("");
	     img5.setBounds(350, 72, 152, 160);
	     img5.setIcon(new ImageIcon(getClass().getClassLoader().getResource("img/dealu.png")));
	     panel.add(img5);
	     
	     JLabel lblNewLabel_2 = new JLabel("Agregar alumno");
	     lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
	     lblNewLabel_2.setBounds(696, 240, 142, 24);
	     panel.add(lblNewLabel_2);
	     
	     JLabel img3 = new JLabel("");
	     img3.setBounds(210, 310, 152, 160);
	     img3.setIcon(new ImageIcon(getClass().getClassLoader().getResource("img/adalu.png")));
	     panel.add(img3);
	     
	     JLabel lblNewLabel_3 = new JLabel("Editar alumno");
	     lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
	     lblNewLabel_3.setBounds(240, 480, 142, 24);
	     panel.add(lblNewLabel_3);
	     
	     JLabel img4 = new JLabel("");
	     img4.setBounds(524, 310, 152, 160);
	     img4.setIcon(new ImageIcon(getClass().getClassLoader().getResource("img/elalu.png")));
	     panel.add(img4);
	     
	     JLabel lblNewLabel_4 = new JLabel("Eliminar alumno");
	     lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
	     lblNewLabel_4.setBounds(550, 480, 160, 24);
	     panel.add(lblNewLabel_4);
	     
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
	           	        	menuBar1.setBounds(100, 0, 101, 22);
	           	        	
           	     	    JLabel r = new JLabel("");
           	     	    menuBar.add(r);
           	     	    r.setIcon(new ImageIcon(getClass().getClassLoader().getResource("img/regresar.png")));
	           	        	
	           	        	JButton btnNewButton = new JButton("Regresar");
	           	        	btnNewButton.setBackground(new Color(255, 255, 255));
	           	        	btnNewButton.setBorder(null);
	           	        	btnNewButton.addActionListener(new ActionListener() {
	           	        		public void actionPerformed(ActionEvent e) {
	           	        			AuthController.mostrarMenuAdmin();
	           	        		}
	           	        	});
	           	        	
	           	        	menuBar.add(btnNewButton);
	           	        	menuBar.add(btnNewButton);
	           	        	
	           	        	
           	     	        frame.setJMenuBar(menuBar);
           	        	
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
	           	     	           	        	         cerrarSesion();
	           	     	           	        	            }
	           	     	           	        	        });
	           	     	           	        	        
	           	     	           	        	        optionsMenu.add(creditsItem);
	           	     	           	        	        optionsMenu.add(logoutItem);       	        	        
	        frame.setVisible(true);
	    }
	
	private void cerrarSesion() {
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
	
	public JButton getBtnRegresar() {
        return getBtnRegresar();
    }

    public JFrame getFrame() {
        return frame;
    }
}
