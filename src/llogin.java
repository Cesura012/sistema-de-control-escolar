import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class llogin {

	private JFrame frame;
    private JTextField emailField;
    private JTextField contraField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					llogin window = new llogin();
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
	public llogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 761, 471);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 750, 432);
		frame.getContentPane().add(layeredPane);
		
		JPanel fondopanel = new JPanel();
		fondopanel.setBounds(0, 0, 750, 432);
		layeredPane.add(fondopanel, JLayeredPane.DEFAULT_LAYER);
		fondopanel.setLayout(null);
		
		
		
		JLabel img = new JLabel("");
		img.setBounds(0, 0, 750, 432);
		img.setIcon(new ImageIcon(getClass().getResource("fondo.png")));
		fondopanel.add(img);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(20, 20, 115, 35);
		layeredPane.add(panel_1, JLayeredPane.PALETTE_LAYER);
		panel_1.setBackground(Color.BLUE);
		
		JLabel lblNewLabel = new JLabel("Iniciar Sesion");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setForeground(Color.WHITE);
		panel_1.add(lblNewLabel);
		
		JPanel panelc = new JPanel();
		panelc.setBackground(Color.WHITE);
		panelc.setBounds(200, 50, 300, 300);
		layeredPane.add(panelc, JLayeredPane.PALETTE_LAYER);
		panelc.setLayout(null);
		
		JLabel img2 = new JLabel("");
		img2.setBounds(99, 11, 118, 89);
		img2.setIcon(new ImageIcon(getClass().getResource("logo.png")));
		panelc.add(img2);
		
		JLabel correo = new JLabel("Correo Electronico");
		correo.setFont(new Font("Arial", Font.BOLD, 15));
		correo.setBounds(36, 111, 139, 24);
		panelc.add(correo);
		
	    emailField = new JTextField();
		emailField.setBounds(36, 146, 202, 24);
		panelc.add(emailField);
		emailField.setColumns(10);
		emailField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
		
		JLabel lblNewLabel_1 = new JLabel("Contraseña");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_1.setBounds(36, 181, 139, 24);
		panelc.add(lblNewLabel_1);
		
	    contraField_1 = new JTextField();
		contraField_1.setBounds(36, 216, 202, 20);
		panelc.add(contraField_1);
		contraField_1.setColumns(10);
		contraField_1.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 15));
		btnNewButton.setBounds(74, 266, 118, 23);
		panelc.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (emailField.getText().trim().isEmpty() || contraField_1.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Por favor, llene todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    
                    JOptionPane.showMessageDialog(frame, "Campos llenados correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
		
		JLabel no = new JLabel("¿No tienes una cuenta?");
		no.setFont(new Font("Tahoma", Font.ITALIC, 11));
		no.setForeground(Color.WHITE);
		no.setBounds(270, 370, 200, 18);
		layeredPane.add(no, JLayeredPane.PALETTE_LAYER);
		
		JButton Registrate = new JButton("Registrate");
		Registrate.setBounds(271, 398, 125, 23);
		Registrate.setForeground(Color.WHITE);
		Registrate.setBackground(Color.BLUE);
		Registrate.setFont(new Font("Tahoma", Font.BOLD, 11));
		layeredPane.add(Registrate, JLayeredPane.PALETTE_LAYER);
		
	}
}
