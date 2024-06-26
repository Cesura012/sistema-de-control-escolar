package AuthViewAsi;

import java.awt.EventQueue;

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
import javax.swing.SwingConstants;

public class AddasiView {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddasiView window = new AddasiView();
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
	public AddasiView() {
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
		panel_1.setBounds(0, 0, 972, 31);
		panel_1.setBackground(new Color(0, 128, 255));
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel = new JLabel("Agregar asignatura");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(0, 0, 875, 31);
		panel_1.add(lblNewLabel);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 520, 880, 16);
		panel_2.setBackground(new Color(0, 128, 255));
		panel.add(panel_2);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(151, 203, 255));
		panel_3.setBounds(50, 70, 800, 400);
		panel.add(panel_3);
		panel_3.setLayout(null);

		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(new Color(0, 128, 255));
		panel_2_1.setBounds(0, 0, 800, 16);
		panel_3.add(panel_2_1);
		panel_2_1.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Datos generales");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(0, 0, 150, 14);
		panel_2_1.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Nombre(s):");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(30, 45, 100, 18);
		panel_3.add(lblNewLabel_2);

		textField = new JTextField();
		textField.setBounds(205, 44, 500, 20);
		panel_3.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Docente:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(30, 100, 150, 18);
		panel_3.add(lblNewLabel_3);

		textField_1 = new JTextField();
		textField_1.setBounds(205, 100, 500, 20);
		panel_3.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("Carrera:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(30, 150, 150, 18);
		panel_3.add(lblNewLabel_4);

		textField_2 = new JTextField();
		textField_2.setBounds(205, 150, 500, 20);
		panel_3.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("Semestre:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6.setBounds(30, 210, 150, 14);
		panel_3.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("Horas a la semana:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_7.setBounds(30, 270, 150, 14);
		panel_3.add(lblNewLabel_7);

		textField_5 = new JTextField();
		textField_5.setBounds(205, 270, 500, 20);
		panel_3.add(textField_5);
		textField_5.setColumns(10);

		textField_6 = new JTextField();
		textField_6.setBounds(205, 210, 500, 20);
		panel_3.add(textField_6);
		textField_6.setColumns(10);

		JButton btnNewButton_1 = new JButton("Confirmar");
		btnNewButton_1.setBounds(550, 325, 170, 40);
		panel_3.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Informacion descargadaer", "Créditos",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(0, 64, 128));

		JButton btnNewButton_2 = new JButton("Cancelar");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(0, 64, 128));
		btnNewButton_2.setBounds(50, 325, 170, 40);
		panel_3.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Cancelando acción", "Créditos", JOptionPane.INFORMATION_MESSAGE);
				AuthController.mostrarAdminasig();
				frame.dispose();
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
				AuthController.mostrarAdminasig();
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
				JOptionPane.showMessageDialog(frame,
						"Hecho por \nObeso Sanchez Michelle de Jesus\nGracia Nava Ernesto\nRojo Martínez Jesús Javier",
						"Créditos", JOptionPane.INFORMATION_MESSAGE);
			}
		});

		logoutItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int response = JOptionPane.showConfirmDialog(frame, "¿Estás seguro que deseas cerrar sesión?",
						"Confirmar Cierre de Sesión", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
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
		int response = JOptionPane.showConfirmDialog(frame, "¿Estás seguro que deseas cerrar sesión?",
				"Confirmar Cierre de Sesión", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
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

	public JButton getBtnRegresar() {
		return getBtnRegresar();
	}

}