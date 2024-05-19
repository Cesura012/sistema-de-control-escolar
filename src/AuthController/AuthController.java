package AuthController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import AuthModel.Usuario;
import AuthView.LoginView;
import AuthView.RegistroView;
import AuthView.MenuadminView;

public class AuthController {
    private Usuario modelo;
    public static LoginView loginVista;
    private static RegistroView registerVista;
    private static MenuadminView menuAdminVista = null;
    private JMenuItem logoutItem;

    public AuthController(Usuario modelo, LoginView loginVista, RegistroView registerVista, boolean mostrarMenuAdmin) {
        this.modelo = modelo;
        this.loginVista = loginVista;
        this.registerVista = registerVista;

        loginVista.getLoginButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validarLogin();
            }
        });

        loginVista.getRegisterButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarRegistro();
            }
        });

        registerVista.getRegistroButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validarRegistro();
            }
        });

        registerVista.getCancelarButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarLogin();
            }
        });
        
        logoutItem = new JMenuItem("Cerrar Sesión");

        logoutItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cerrarSesion();
            }
        });
        if (mostrarMenuAdmin) {
            mostrarMenuAdmin();
        }
    }

    private void validarLogin() {
        String email = loginVista.getEmailField().getText().trim();
        String password = new String(loginVista.getPasswordField().getPassword()).trim();

        if (email.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(loginVista.getFrame(), "Por favor, llene todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(loginVista.getFrame(), "Login exitoso", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            mostrarMenuAdmin();
        }
    }


    //con esto enlazas la base de datos, creo ,nose ahi tu ves michi
   /* private boolean validarCredenciales(String email, String password) {
        // Aquí deberías reemplazar esta lógica con tu propia validación de credenciales
        return email.equals("usuario@example.com") && password.equals("contraseña");
    }*/

    private void validarRegistro() {
        String email = registerVista.getEmailField().getText().trim();
        String password = new String(registerVista.getPasswordField().getPassword()).trim();
        String confirmPassword = new String(registerVista.getConfirmPasswordField().getPassword()).trim();

        if (email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            JOptionPane.showMessageDialog(registerVista.getFrame(), "Por favor, llene todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(registerVista.getFrame(), "Las contraseñas no coinciden", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            modelo = new Usuario(email, password);
            JOptionPane.showMessageDialog(registerVista.getFrame(), "Registro exitoso", "Éxito", JOptionPane.INFORMATION_MESSAGE);         
            mostrarLogin();
         
        }
    }

    public static void mostrarLogin() {
        registerVista.getFrame().setVisible(false);
        if (menuAdminVista != null) {
            menuAdminVista.getFrame().setVisible(false);
        }
        loginVista.getFrame().setVisible(true);
    }

    private void mostrarRegistro() {
        loginVista.getFrame().setVisible(false);
        registerVista.getFrame().setVisible(true);
    }

    private void mostrarMenuAdmin() {
        if (menuAdminVista == null) {
            menuAdminVista = new MenuadminView();
        }
        loginVista.getFrame().setVisible(false);
        menuAdminVista.getFrame().setVisible(true);
    }
    
    private void cerrarSesion() {
    	reiniciarLoginVista();
    }




    private void reiniciarLoginVista() {
        loginVista.getEmailField().setText("");
        loginVista.getPasswordField().setText("");
        
       mostrarLogin(); 
    }

}