package AuthView;
import javax.swing.*;
import java.awt.*;

public class LoginView {
    private JFrame frame;
    private JTextField emailField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton registerButton;

    public LoginView() {
        frame = new JFrame("Iniciar Sesión");
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
        img.setIcon(new ImageIcon(getClass().getClassLoader().getResource("img/fondo.png")));
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
        img2.setIcon(new ImageIcon(getClass().getClassLoader().getResource("img/logo.png")));
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

        passwordField = new JPasswordField();
        passwordField.setBounds(36, 216, 202, 20);
        panelc.add(passwordField);
        passwordField.setColumns(10);
        passwordField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));

        loginButton = new JButton("Confirmar");
        loginButton.setForeground(Color.WHITE);
        loginButton.setBackground(Color.BLUE);
        loginButton.setFont(new Font("Arial", Font.BOLD, 15));
        loginButton.setBounds(20, 266, 118, 23);
        panelc.add(loginButton);

        registerButton = new JButton("Registrarse");
        registerButton.setForeground(Color.WHITE);
        registerButton.setBackground(Color.BLUE);
        registerButton.setFont(new Font("Arial", Font.BOLD, 15));
        registerButton.setBounds(172, 266, 118, 23);
        panelc.add(registerButton);

        frame.setVisible(true);
    }

    public JFrame getFrame() {
        return frame;
    }

    public JTextField getEmailField() {
        return emailField;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }

    public JButton getLoginButton() {
        return loginButton;
    }

    public JButton getRegisterButton() {
        return registerButton;
    }
}
