package AuthView;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
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

public class MenuadminView {
    private JFrame frame;
    private JMenuItem logoutItem; 
    private JButton adalu;
    private JButton addoce;
    private JButton adgru;
    private JButton adsig;

    public JFrame getFrame() {
        return frame;
    }
    public JMenuItem getLogoutItem() {
        return logoutItem;
    }

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuadminView window = new MenuadminView();
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
	public MenuadminView() {
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
		
		JLabel lblNewLabel = new JLabel("Bienvenido admin");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(305, 0, 508, 25);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 128, 255));
		panel_2.setBounds(0, 550, 880, 16);
		panel.add(panel_2);
		
		 JLabel img = new JLabel("");
	     img.setBounds(200, 72, 152, 160);
	     img.setIcon(new ImageIcon(getClass().getClassLoader().getResource("img/adminalu.png")));
	     panel.add(img);
	     
	     JButton adalu = new JButton("Administrar alumnos");
	     adalu.setBackground(new Color(255, 255, 255));
	     adalu.setFont(new Font("Tahoma", Font.PLAIN, 15));
	     adalu.setBounds(210, 224, 142, 24);
	     panel.add(adalu);
	     adalu.setBorder(null);
	     adalu.addActionListener(new ActionListener() {
        		public void actionPerformed(ActionEvent e) {
        			AuthController.mostrarAdminalu();
        		}
        	});
	     
	     JLabel img2 = new JLabel("");
	     img2.setBounds(514, 60, 152, 160);
	     img2.setIcon(new ImageIcon(getClass().getClassLoader().getResource("img/admindoce.png")));
	     panel.add(img2);
	    
	     
	     JButton addoce = new JButton("Administrar docentes");
	     addoce.setBackground(new Color(255, 255, 255));
	     addoce.setFont(new Font("Tahoma", Font.PLAIN, 15));
	     addoce.setBounds(524, 224, 142, 24);
	     panel.add(addoce);
	     addoce.setBorder(null);
	     addoce.addActionListener(new ActionListener() {
        		public void actionPerformed(ActionEvent e) {
        			AuthController.mostrarAdminDoce();
        		}
        	});
	     
	     JLabel img3 = new JLabel("");
	     img3.setBounds(210, 250, 152, 160);
	     img3.setIcon(new ImageIcon(getClass().getClassLoader().getResource("img/admingru.png")));
	     panel.add(img3);
	     
	     JButton adgru = new JButton("Administrar grupos");
	     adgru.setBackground(new Color(255, 255, 255));
	     adgru.setFont(new Font("Tahoma", Font.PLAIN, 15));
	     adgru.setBounds(210, 420, 142, 24);
	     panel.add(adgru);
	     adgru.setBorder(null);
	     adgru.addActionListener(new ActionListener() {
        		public void actionPerformed(ActionEvent e) {
        			
        			AuthController.mostrarAdmingru();
        		}
        	});
	     
	     JLabel img4 = new JLabel("");
	     img4.setBounds(524, 250, 152, 160);
	     img4.setIcon(new ImageIcon(getClass().getClassLoader().getResource("img/adminasig.png")));
	     panel.add(img4);
	     
	     JButton adsig = new JButton("Administrar asignaturas");
	     adsig.setBackground(new Color(255, 255, 255));
	     adsig.setFont(new Font("Tahoma", Font.PLAIN, 15));
	     adsig.setBounds(524, 420, 160, 24);
	     panel.add(adsig);
	     adsig.setBorder(null);
	     adsig.addActionListener(new ActionListener() {
        		public void actionPerformed(ActionEvent e) {
        			
        			AuthController.mostrarAdminasig();
        		}
        	});
	     
	     JMenuBar menuBar = new JMenuBar();
	     menuBar.setForeground(new Color(0, 0, 0));
	     menuBar.setBackground(new Color(255, 255, 255));
	     menuBar.setBounds(10, 0, 101, 22);
	     panel.add(menuBar);
	     JMenu optionsMenu = new JMenu("Opciones");

	        ImageIcon creditsIcon = new ImageIcon(getClass().getResource("/img/creditos.png"));
	        ImageIcon logoutIcon = new ImageIcon(getClass().getResource("/img/cerrar-sesion.png"));
	      
	        JMenuItem creditsItem = new JMenuItem("Créditos", creditsIcon);
	        logoutItem = new JMenuItem("Cerrar Sesión", logoutIcon);

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
	        menuBar.add(optionsMenu);

	        
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
	

	public JButton getadalu() {
	    return adalu;
	}

	public JButton getaddoce() {
	    return addoce;
	}

	public JButton getadgru() {
	    return adgru;
	}

	public JButton getadsig() {
	    return adsig;
	}

	
	
}

