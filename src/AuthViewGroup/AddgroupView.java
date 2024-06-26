package AuthViewGroup;

import java.awt.EventQueue;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JMenu;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import AuthController.AuthController;
import AuthModel.Alumno;

public class AddgroupView {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_6;
	private JTable table;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddgroupView window = new AddgroupView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public AddgroupView() {
		initialize();
		loadData();
	}

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

		JLabel lblNewLabel = new JLabel("Crear grupo");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(0, 0, 874, 31);
		panel_1.add(lblNewLabel);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 520, 880, 16);
		panel_2.setBackground(new Color(0, 128, 255));
		panel.add(panel_2);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(151, 203, 255));
		panel_3.setBounds(350, 100, 480, 300);
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

		JLabel lblNewLabel_2 = new JLabel("Asignatura:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(30, 45, 100, 18);
		panel_3.add(lblNewLabel_2);

		textField = new JTextField();
		textField.setBounds(205, 44, 200, 20);
		panel_3.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Docente:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(30, 100, 150, 18);
		panel_3.add(lblNewLabel_3);

		textField_1 = new JTextField();
		textField_1.setBounds(205, 100, 200, 20);
		panel_3.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("Grado:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(30, 160, 150, 18);
		panel_3.add(lblNewLabel_4);

		textField_2 = new JTextField();
		textField_2.setBounds(205, 160, 200, 20);
		panel_3.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("Grupo");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6.setBounds(30, 229, 150, 14);
		panel_3.add(lblNewLabel_6);

		textField_6 = new JTextField();
		textField_6.setBounds(205, 229, 200, 20);
		panel_3.add(textField_6);
		textField_6.setColumns(10);

		JPanel panel_4 = new JPanel();
		panel_4.setBounds(50, 100, 250, 300);
		panel_4.setBackground(new Color(151, 203, 255));
		panel.add(panel_4);
		panel_4.setLayout(null);

		table = new JTable();
		table.setBackground(new Color(176, 216, 255));
		table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "N° control", "Nombre completo" }));

		JTableHeader header = table.getTableHeader();
		header.setBackground(new Color(0, 128, 255));
		header.setForeground(Color.white);
		header.setFont(new Font("Tahoma", Font.BOLD, 16));

		DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
		headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
		header.setDefaultRenderer(headerRenderer);

		JScrollPane table_scroll = new JScrollPane(table);
		table_scroll.setBounds(0, 15, 250, 300);
		table_scroll.setForeground(new Color(0, 128, 192));
		table_scroll.setBackground(new Color(0, 128, 192));
		panel_4.add(table_scroll);

		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBounds(0, 0, 250, 16);
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBackground(new Color(0, 128, 255));
		panel_4.add(panel_2_1_1);

		JLabel lblNewLabel_1_1 = new JLabel("Seleccione alumno");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(0, 0, 250, 14);
		panel_2_1_1.add(lblNewLabel_1_1);

		JButton btnNewButton_1 = new JButton("Confirmar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Informacion descargadaer", "Créditos",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(0, 64, 128));
		btnNewButton_1.setBounds(620, 450, 170, 40);
		panel.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Cancelar");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(0, 64, 128));
		btnNewButton_2.setBounds(50, 450, 170, 40);
		panel.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Cancelando acción", "Créditos", JOptionPane.INFORMATION_MESSAGE);
				AuthController.mostrarAdmingru();
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

	public void loadData() {
		Alumno alumnoModel = new Alumno();
		List<Alumno> alumnos = alumnoModel.getAlumnos();

		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);

		for (Alumno alumno : alumnos) {
			model.addRow(new Object[] { alumno.getNum_control(), alumno.getNombre() });
		}
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