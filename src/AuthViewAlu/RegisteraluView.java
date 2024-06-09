package AuthViewAlu;

import java.awt.EventQueue;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import AuthController.AuthController;
import AuthModel.Alumno;

public class RegisteraluView {

    private JFrame frame;
    private JTable table;
    private JPanel panel;
    private JButton btnNewButton_1;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    RegisteraluView window = new RegisteraluView();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public RegisteraluView() {
        initialize();
        loadData();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 890, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        panel = new JPanel();
        panel.setBackground(new Color(255, 255, 255));
        panel.setBounds(0, 0, 875, 538);
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        JPanel panel_1 = new JPanel();
        panel_1.setBounds(0, 30, 972, 31);
        panel_1.setBackground(new Color(0, 128, 255));
        panel.add(panel_1);
        panel_1.setLayout(null);

        JLabel lblNewLabel = new JLabel("Consultar registros de alumnos");
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
        panel_3.setLayout(null);

        table = new JTable();
        table.setBackground(new Color(176, 216, 255));
        table.setModel(new DefaultTableModel(
            new Object[][] {},
            new String[] {"N° control", "Nombre completo"}
        ));

        JTableHeader header = table.getTableHeader();
        header.setBackground(new Color(0, 128, 255));
        header.setForeground(Color.white);
        header.setFont(new Font("Tahoma", Font.BOLD, 16));

        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        header.setDefaultRenderer(headerRenderer);

        JScrollPane table_scroll = new JScrollPane(table);
        table_scroll.setBounds(40, 40, 420, 300);
        panel_3.add(table_scroll);

        btnNewButton_1 = new JButton("detalles de alumno");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    int numControl = (int) table.getValueAt(selectedRow, 0);
                    AuthController.mostrarDetallesAlumno(numControl);
                }else {
                	JOptionPane.showMessageDialog(null, "Seleccione a un alumno.", "Error", JOptionPane.ERROR_MESSAGE); 
                }
            }
        });

        btnNewButton_1.setBounds(711, 420, 150, 23);
        panel.add(btnNewButton_1);

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

    public void loadData() {
        Alumno alumnoModel = new Alumno();
        List<Alumno> alumnos = alumnoModel.getAlumnos();

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);

        for (Alumno alumno : alumnos) {
            model.addRow(new Object[] {alumno.getNum_control(), alumno.getNombre()});
        }
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

    public JButton getBtnRegresar() {
        return getBtnRegresar();
    }

    public JFrame getFrame() {
        return frame;
    }
    
    public JButton getBtnNewButton_1() {
        return btnNewButton_1;
    }
}

