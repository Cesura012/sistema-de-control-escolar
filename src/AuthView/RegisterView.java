package AuthView;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;

public class RegisterView {

    private JFrame frame;
    private JTextField emailField;
    private JPasswordField passwordField;
    private JPasswordField confirmPasswordField;
    private JButton confirmButton;
    private JButton cancelButton;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    RegisterView window = new RegisterView();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public RegisterView() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 761, 471);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 750, 432);
        frame.getContentPane().add(layeredPane);

        JPanel backpanel = new JPanel();
        backpanel.setBounds(0, 0, 750, 432);
        layeredPane.add(backpanel, JLayeredPane.DEFAULT_LAYER);
        backpanel.setLayout(null);

        JLabel img = new JLabel("");
        img.setBounds(0, 0, 750, 432);
        img.setIcon(new ImageIcon(getClass().getClassLoader().getResource("img/fondo.png")));
        backpanel.add(img);

        JPanel panel_1 = new JPanel();
        panel_1.setBounds(20, 20, 115, 35);
        layeredPane.add(panel_1, JLayeredPane.PALETTE_LAYER);
        panel_1.setBackground(Color.BLUE);

        JLabel lblNewLabel = new JLabel("Registro");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel.setForeground(Color.WHITE);
        panel_1.add(lblNewLabel);

        JPanel panelc = new JPanel();
        panelc.setBackground(Color.WHITE);
        panelc.setBounds(200, 50, 300, 337);
        layeredPane.add(panelc, JLayeredPane.PALETTE_LAYER);
        panelc.setLayout(null);

        JLabel img2 = new JLabel("");
        img2.setBounds(99, 11, 118, 89);
        img2.setIcon(new ImageIcon(getClass().getClassLoader().getResource("img/logo.png")));
        panelc.add(img2);

        JLabel gmail = new JLabel("Correo Electronico");
        gmail.setFont(new Font("Arial", Font.BOLD, 15));
        gmail.setBounds(36, 111, 139, 24);
        panelc.add(gmail);

        emailField = new JTextField();
        emailField.setBounds(36, 146, 202, 24);
        panelc.add(emailField);
        emailField.setColumns(10);
        emailField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));

        JLabel lblNewLabel_1 = new JLabel("Contraseña");
        lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 15));
        lblNewLabel_1.setBounds(36, 181, 139, 24);
        panelc.add(lblNewLabel_1);

        passwordField = new JPasswordField();
        passwordField.setBounds(36, 206, 202, 20);
        panelc.add(passwordField);
        passwordField.setColumns(10);
        passwordField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));

        JLabel lblNewLabel_2 = new JLabel("Confirmar contraseña");
        lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 15));
        lblNewLabel_2.setBounds(36, 237, 202, 20);
        panelc.add(lblNewLabel_2);

        confirmPasswordField = new JPasswordField();
        confirmPasswordField.setBounds(36, 260, 202, 20);
        panelc.add(confirmPasswordField);
        confirmPasswordField.setColumns(10);
        confirmPasswordField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));

        cancelButton = new JButton("Cancelar");
        cancelButton.setForeground(Color.WHITE);
        cancelButton.setFont(new Font("Arial", Font.BOLD, 15));
        cancelButton.setBackground(Color.BLUE);
        cancelButton.setBounds(10, 304, 108, 23);
        panelc.add(cancelButton);

        confirmButton = new JButton("Confirmar");
        confirmButton.setForeground(Color.WHITE);
        confirmButton.setBackground(Color.BLUE);
        confirmButton.setFont(new Font("Arial", Font.BOLD, 15));
        confirmButton.setBounds(172, 304, 118, 23);
        panelc.add(confirmButton);
    }

    public JButton getRegistreButton() {
        return confirmButton;
    }

    public JButton getCancelarButton() {
        return cancelButton;
    }

    public JTextField getEmailField() {
        return emailField;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }

    public JPasswordField getConfirmPasswordField() {
        return confirmPasswordField;
    }

    public JFrame getFrame() {
        return frame;
    }
}
