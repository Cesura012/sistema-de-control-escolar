package AuthViewDoce;

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
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.time.Year;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import AuthController.AuthController;
import AuthViewAlu.AddaluView;
import javax.swing.SwingConstants;

public class Adddoce {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	public JComboBox<Integer> dayComboBox;
	public JComboBox<Integer> monthComboBox;
	public JComboBox<Integer> yearComboBox;
	private JComboBox<String> gradeComboBox;
	private JButton btnConfirm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddaluView window = new AddaluView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * 
	 * @wbp.parser.entryPoint
	 */
	public Adddoce() {
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

		JLabel lblNewLabel = new JLabel("Agregar docente");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(0, 0, 873, 31);
		panel_1.add(lblNewLabel);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 520, 880, 16);
		panel_2.setBackground(new Color(0, 128, 255));
		panel.add(panel_2);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(151, 203, 255));
		panel_3.setBounds(50, 72, 480, 400);
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
		lblNewLabel_2.setBounds(30, 45, 100, 18);
		panel_3.add(lblNewLabel_2);

		textField = new JTextField();
		textField.setBounds(205, 44, 250, 20);
		panel_3.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Apellido paterno:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(30, 85, 150, 18);
		panel_3.add(lblNewLabel_3);

		textField_1 = new JTextField();
		textField_1.setBounds(205, 84, 250, 20);
		panel_3.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("Apellido materno:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(30, 129, 150, 18);
		panel_3.add(lblNewLabel_4);

		textField_2 = new JTextField();
		textField_2.setBounds(205, 130, 250, 20);
		panel_3.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("Fecha de nacimiento:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(30, 181, 170, 18);
		panel_3.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("Correo electrónico:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6.setBounds(30, 229, 150, 14);
		panel_3.add(lblNewLabel_6);

		textField_4 = new JTextField();
		textField_4.setBounds(205, 228, 250, 20);
		panel_3.add(textField_4);
		textField_4.setColumns(10);

		JLabel lblNewLabel_7 = new JLabel("Teléfono:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_7.setBounds(30, 280, 100, 14);
		panel_3.add(lblNewLabel_7);

		textField_5 = new JTextField();
		textField_5.setBounds(205, 279, 250, 20);
		panel_3.add(textField_5);
		textField_5.setColumns(10);

		JLabel lblNewLabel_8 = new JLabel("Grado de estudios:");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_8.setBounds(30, 335, 170, 14);
		panel_3.add(lblNewLabel_8);

		gradeComboBox = new JComboBox<>();
		gradeComboBox.addItem("primaria");
		gradeComboBox.addItem("secundaria");
		gradeComboBox.addItem("preparatoria");
		gradeComboBox.addItem("licenciatura");
		gradeComboBox.addItem("maestria");
		gradeComboBox.addItem("doctorado");
		gradeComboBox.setBounds(205, 332, 250, 20);
		panel_3.add(gradeComboBox);

		JLabel lblNewLabel_9 = new JLabel("DD:");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_9.setBounds(205, 185, 46, 14);
		panel_3.add(lblNewLabel_9);

		JLabel lblNewLabel_10 = new JLabel("MM:");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_10.setBounds(275, 185, 46, 14);
		panel_3.add(lblNewLabel_10);

		JLabel lblNewLabel_11 = new JLabel("AA:");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_11.setBounds(351, 185, 46, 14);
		panel_3.add(lblNewLabel_11);

		dayComboBox = new JComboBox<>();
		for (int i = 1; i <= 31; i++) {
			dayComboBox.addItem(i);
		}
		dayComboBox.setBounds(235, 180, 40, 20);
		panel_3.add(dayComboBox);

		monthComboBox = new JComboBox<>();
		for (int i = 1; i <= 12; i++) {
			monthComboBox.addItem(i);
		}
		monthComboBox.setBounds(308, 180, 40, 20);
		panel_3.add(monthComboBox);

		yearComboBox = new JComboBox<>();
		int currentYear = Year.now().getValue();
		for (int i = 1990; i <= currentYear; i++) {
			yearComboBox.addItem(i);
		}
		yearComboBox.setBounds(379, 180, 70, 20);
		panel_3.add(yearComboBox);

		monthComboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					updateDays();
				}
			}
		});

		yearComboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					updateDays();
				}
			}
		});

		updateDays();

		JPanel panel_4 = new JPanel();
		panel_4.setBounds(567, 72, 250, 300);
		panel_4.setBackground(new Color(151, 203, 255));
		panel.add(panel_4);
		panel_4.setLayout(null);

		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBackground(new Color(0, 128, 255));
		panel_2_1_1.setBounds(0, 0, 250, 16);
		panel_4.add(panel_2_1_1);

		JLabel lblNewLabel_1_1 = new JLabel("Fotografia del docente");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(0, 0, 250, 14);
		panel_2_1_1.add(lblNewLabel_1_1);

		btnConfirm = new JButton("Confirmar");
		btnConfirm.setToolTipText("Confirmar");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (areFieldsValid()) {

					JOptionPane.showMessageDialog(frame, "Datos confirmados.");
				} else {

					JOptionPane.showMessageDialog(frame, "Por favor, complete todos los campos correctamente.", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnConfirm.setForeground(new Color(255, 255, 255));
		btnConfirm.setBackground(new Color(0, 64, 128));
		btnConfirm.setBounds(607, 383, 170, 40);
		panel.add(btnConfirm);

		JButton btnNewButton_2 = new JButton("Cancelar");
		btnNewButton_2.setToolTipText("Cancelar");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(0, 64, 128));
		btnNewButton_2.setBounds(607, 432, 170, 40);
		panel.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Cancelando acción", "Créditos", JOptionPane.INFORMATION_MESSAGE);
				AuthController.mostrarAdminDoce();
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
				AuthController.mostrarAdminDoce();
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

	public JButton getBtnRegresar() {
		return getBtnRegresar();
	}

	private void updateDays() {
		int selectedMonth = (int) monthComboBox.getSelectedItem();
		int selectedYear = (int) yearComboBox.getSelectedItem();

		int daysInMonth = getDaysInMonth(selectedMonth, selectedYear);
		dayComboBox.removeAllItems();
		for (int i = 1; i <= daysInMonth; i++) {
			dayComboBox.addItem(i);
		}
	}

	private int getDaysInMonth(int month, int year) {
		Calendar calendar = new GregorianCalendar(year, month - 1, 1);
		return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
	}

	private boolean areFieldsValid() {

		if (!isAlphabetic(textField.getText().trim())) {
			return false;
		}

		if (!isAlphabetic(textField_1.getText().trim())) {
			return false;
		}

		if (!isAlphabetic(textField_2.getText().trim())) {
			return false;
		}

		String email = textField_4.getText().trim();
		if (email.isEmpty() || !email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
			return false;
		}

		String phone = textField_5.getText().trim();
		if (phone.isEmpty() || !phone.matches("\\d{10}")) {
			return false;
		}

		if (gradeComboBox.getSelectedItem() == null) {
			return false;
		}

		return true;
	}

	private boolean isAlphabetic(String text) {
		return text.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+");
	}

	public JButton getBtnConfirm() {
		return btnConfirm;
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

	public JComboBox<String> getGradeComboBox() {
		return gradeComboBox;
	}

}