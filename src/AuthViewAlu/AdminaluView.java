
package AuthViewAlu;
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
	     img.setBounds(65, 72, 160, 160);
	     img.setIcon(new ImageIcon(getClass().getClassLoader().getResource("img/conalu.png")));
	     panel.add(img);
	     
	     JLabel img2 = new JLabel("");
	     img2.setBounds(660, 72, 170, 160);
	     img2.setIcon(new ImageIcon(getClass().getClassLoader().getResource("img/crearalu.png")));
	     panel.add(img2);
	     
	     JLabel img5 = new JLabel("");
	     img5.setBounds(350, 72, 160, 160);
	     img5.setIcon(new ImageIcon(getClass().getClassLoader().getResource("img/dealu.png")));
	     panel.add(img5);
	     
	     JLabel img3 = new JLabel("");
	     img3.setBounds(210, 310, 169, 160);
	     img3.setIcon(new ImageIcon(getClass().getClassLoader().getResource("img/adalu.png")));
	     panel.add(img3);
	     
	     JLabel img4 = new JLabel("");
	     img4.setBounds(524, 310, 160, 160);
	     img4.setIcon(new ImageIcon(getClass().getClassLoader().getResource("img/elalu.png")));
	     panel.add(img4);
	     
	     JButton btnNewButton_1 = new JButton("Consultar registros de alumnos");
	     btnNewButton_1.setBackground(new Color(255, 255, 255));
	     btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
	     btnNewButton_1.setBounds(60, 243, 190, 30);
	     btnNewButton_1.setBorder(null);
	     panel.add(btnNewButton_1);
	     btnNewButton_1.addActionListener(new ActionListener() {
	    	    public void actionPerformed(ActionEvent e) {
	    	        AuthController.mostrarRegistroAlumnos();
	    	    }
	    	});
	     
	     JButton btnNewButton_2 = new JButton("Detalles de alumnos");
	     btnNewButton_2.setBounds(350, 243, 150, 23);
	     btnNewButton_2.setBackground(new Color(255, 255, 255));
	     btnNewButton_2.setBorder(null);
	     panel.add(btnNewButton_2);
	     btnNewButton_2.addActionListener(new ActionListener() {
	    	    public void actionPerformed(ActionEvent e) {
	    	        AuthController.mostrarRegistroAlumnos();
	    	    }
	    	});
	     
	     JButton btnNewButton_3 = new JButton("Agregar alumno");
	     btnNewButton_3.setBackground(new Color(255, 255, 255));
	     btnNewButton_3.setBorder(null);
	     btnNewButton_3.setBounds(660, 243, 150, 23);
	     panel.add(btnNewButton_3);
	     btnNewButton_3.addActionListener(new ActionListener() {
	    	    public void actionPerformed(ActionEvent e) {
	    	        AuthController.mostraragrealu();
	    	    }
	    	});
	     
	     JButton btnNewButton_4 = new JButton("Editar alumno");
	     btnNewButton_4.setBackground(new Color(255, 255, 255));
	     btnNewButton_4.setBorder(null);
	     btnNewButton_4.setBounds(210, 481, 150, 23);
	     panel.add(btnNewButton_4);
	     btnNewButton_4.addActionListener(new ActionListener() {
	    	    public void actionPerformed(ActionEvent e) {
	    	        AuthController.mostraredialu();
	    	    }
	    	});
	     
	     JButton btnNewButton_5 = new JButton("Eliminar alumno");
	     btnNewButton_5.setBackground(new Color(255, 255, 255));
	     btnNewButton_5.setBorder(null);
	     btnNewButton_5.setBounds(524, 481, 150, 23);
	     panel.add(btnNewButton_5);
	     btnNewButton_5.addActionListener(new ActionListener() {
	    	    public void actionPerformed(ActionEvent e) {
	    	        AuthController.mostrardeletalu();
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
	           	        			frame.dispose();
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
	           	     	           	        	         closesesion();
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
	
	public JButton getBtnRegresar() {
        return getBtnRegresar();
    }

    public JFrame getFrame() {
        return frame;
    }
}
