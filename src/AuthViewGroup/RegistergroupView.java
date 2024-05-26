package AuthViewGroup;

import java.awt.EventQueue;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JMenu;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

import AuthController.AuthController;

public class RegistergroupView {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistergroupView window = new RegistergroupView();
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
	public RegistergroupView() {
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
		
		JLabel lblNewLabel = new JLabel("Consultar registros de grupos");
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
		panel_3.setBounds(150, 100, 500, 400);
		panel.add(panel_3);
		
		String titles[] = {"N° control", "Nombre completo"};
		String data[][] = {
				{"19310556", "Leonardo Gutierrez"},
                {"19310492", "Sugey Lara"},
                {"19310556", "Daniel Martínez Martínez"},
                {"19310134", "Alan Aramburo Peña"},
                {"19310249", "Alonso Piñas Colada"},
				{"N° control", "Nombre completo"},
				{"N° control", "Nombre completo"},
				{"N° control", "Nombre completo"},
				{"N° control", "Nombre completo"},
				{"N° control", "Nombre completo"},
				{"N° control", "Nombre completo"},
				{"N° control", "Nombre completo"},
				{"N° control", "Nombre completo"},
				{"N° control", "Nombre completo"},
				{"N° control", "Nombre completo"},
				{"N° control", "Nombre completo"},
				{"N° control", "Nombre completo"},
				{"N° control", "Nombre completo"},
				{"N° control", "Nombre completo"},
				{"N° control", "Nombre completo"},
				{"N° control", "Nombre completo"},
				{"N° control", "Nombre completo"},
				{"N° control", "Nombre completo"},
				{"N° control", "Nombre completo"},
				{"N° control", "Nombre completo"},
				{"N° control", "Nombre completo"},
				{"N° control", "Nombre completo"},
		};
		
		JTable table = new JTable(data,titles);
		table.setBackground(new Color(176, 216, 255));
		
		JTableHeader header = table.getTableHeader();
	    header.setBackground(new Color(0, 128, 255));
	    header.setForeground(Color.white);
	    header.setFont(new Font("Tahoma", Font.BOLD, 16));
	        	       
	    DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
	    headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
	    header.setDefaultRenderer(headerRenderer);
		
		JScrollPane table_scroll = new JScrollPane(table);
        table_scroll.setBounds(40, 40, 420, 300); 
        table_scroll.setForeground(new Color(0, 128, 192));
        table_scroll.setBackground(new Color(0, 128, 192));
        panel_3.add(table_scroll);
        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    int row = table.getSelectedRow();
                    String controlNumber = table.getValueAt(row, 0).toString();
                    String fullName = table.getValueAt(row, 1).toString();
                    showDetailsWindow(controlNumber, fullName);
                }
            }
        });
        
        JButton btnNewButton_1 = new JButton("detalles de alumno");
		btnNewButton_1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        // Obtener los datos del alumno seleccionado en la tabla
		        int selectedRow = table.getSelectedRow();
		        if (selectedRow != -1) {
		            String fullName = table.getValueAt(selectedRow, 1).toString();
		            
		            // Crear e inicializar la ventana de detalles del alumno
		            DetailsgroupView detailsgroupView = new DetailsgroupView();
		            frame.dispose();
		            detailsgroupView.getFrame().setVisible(true);
		            
		            // Pasar los datos del alumno a la ventana de detalles
		            detailsgroupView.getTextField().setText(fullName); // Por ejemplo, asigna el nombre completo al campo de texto correspondiente en DetailsaluView
		            // Similarmente, puedes asignar otros datos del alumno a los campos de texto correspondientes en DetailsaluView
		        } else {
		            JOptionPane.showMessageDialog(frame, "Por favor selecciona un alumno de la tabla.", "Error", JOptionPane.ERROR_MESSAGE);
		        }
		    }
		});
		 btnNewButton_1.setBounds(711, 420, 150, 23);
	        panel.add(btnNewButton_1);
        
    
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
	           	        			AuthController.mostrarAdmingru();
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
	
	private void showDetailsWindow(String controlNumber, String fullName) {
        JFrame detailsFrame = new JFrame("Detalles del Alumno");
        detailsFrame.setBounds(100, 100, 450, 300);
        detailsFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        detailsFrame.getContentPane().setLayout(null);

        JLabel lblControlNumber = new JLabel("N° control: " + controlNumber);
        lblControlNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblControlNumber.setBounds(30, 30, 380, 30);
        detailsFrame.getContentPane().add(lblControlNumber);

        JLabel lblFullName = new JLabel("Nombre completo: " + fullName);
        lblFullName.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblFullName.setBounds(30, 80, 380, 30);
        detailsFrame.getContentPane().add(lblFullName);

        detailsFrame.setVisible(true);
    }

	 public JFrame getFrame() {
	        return frame;
	    }
}
