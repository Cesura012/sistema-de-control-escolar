package AuthController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import AuthModel.User;
import AuthView.AdminaluView;
import AuthView.AdminasigView;
import AuthView.AdmindoceView;
import AuthView.AdmingroupView;
import AuthView.LoginView;

import AuthView.MenuadminView;
import AuthView.RegisterView;

public class AuthController {
    private User modelo;
    public static LoginView loginVista;
    private static RegisterView registerVista;
    private static MenuadminView menuAdminVista = null;
    private static JMenuItem logoutItem;
    private static AdminasigView adminasigView;
    private static AdminaluView adminaluView;
    private static AdmindoceView admindoceView;
	private static AdmingroupView admingroupView;
  
    
    public AuthController(User modelo, LoginView loginVista, RegisterView registerVista, boolean mostrarMenuAdmin,AdminasigView adminasigView, AdminaluView adminaluView,  AdmindoceView admindoceView,AdmingroupView admingroupView) {
    	  this.modelo = modelo;
      
     
        this.loginVista = loginVista;
        this.registerVista = registerVista;
        this.adminasigView = adminasigView;
        this.adminaluView = adminaluView;
        this.admindoceView = admindoceView;
        this.admingroupView = admingroupView;
     

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

        registerVista.getRegistreButton().addActionListener(new ActionListener() {
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
                closesesion();
            }

			private void closesesion() {
				// TODO Auto-generated method stub
				
			}
        });
       
        if (mostrarMenuAdmin) {
            mostrarMenuAdmin();
        }

       /* if (menuAdminVista != null) {
            menuAdminVista.getaddoce().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    mostrarAdminDoce();
                }
            });
        }*/

        if (adminaluView != null) {
            adminaluView.getBtnRegresar().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    mostrarMenuAdmin();
                }
            });
        }

        if (adminasigView != null) {
            adminasigView.getBtnRegresar().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    mostrarMenuAdmin();
                }
            });
        }

        if (admindoceView != null) {
            admindoceView.getBtnRegresar().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    mostrarMenuAdmin();
                }
            });
        }

        if (admingroupView != null) {
            admingroupView.getBtnRegresar().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    mostrarMenuAdmin();
                }
            });
        }
        
       
      
    }

   

  //Aqui se valida el login
    private void validarLogin() {
        String email = loginVista.getEmailField().getText().trim();
        String password = new String(loginVista.getPasswordField().getPassword()).trim();

        if (email.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(loginVista.getFrame(), "Por favor, llene todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            modelo = new User(email, password);
            if (modelo.validateUser()) {
                JOptionPane.showMessageDialog(loginVista.getFrame(), "Login exitoso", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                mostrarMenuAdmin();
            } else {
                JOptionPane.showMessageDialog(loginVista.getFrame(), "Credenciales incorrectas", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }


   
    private void validarRegistro() {
        String email = registerVista.getEmailField().getText().trim();
        String password = new String(registerVista.getPasswordField().getPassword()).trim();
        String confirmPassword = new String(registerVista.getConfirmPasswordField().getPassword()).trim();

        if (email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            JOptionPane.showMessageDialog(registerVista.getFrame(), "Por favor, llene todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(registerVista.getFrame(), "Las contraseñas no coinciden", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            modelo = new User(email, password);
            if (modelo.registerUser()) {
                JOptionPane.showMessageDialog(registerVista.getFrame(), "Registro exitoso", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                mostrarLogin();
            } else {
                JOptionPane.showMessageDialog(registerVista.getFrame(), "Error en el registro", "Error", JOptionPane.ERROR_MESSAGE);
            }
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

    public static void mostrarMenuAdmin() {
        if (menuAdminVista == null) {
            menuAdminVista = new MenuadminView();
        }
        loginVista.getFrame().setVisible(false);
        menuAdminVista.getFrame().setVisible(true);
    }
    
    public static  void mostrarAdminDoce() {
    	System.out.println("Mostrando vista de administración de docentes");
        try {
			if (admindoceView == null) {
			    admindoceView = new AdmindoceView();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        menuAdminVista.getFrame().setVisible(false);
        admindoceView.getFrame().setVisible(true);
    }
    
    public static  void mostrarAdminalu() {
    	System.out.println("Mostrando vista de administración de docentes");
        try {
			if (adminaluView == null) {
				adminaluView = new AdminaluView();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        menuAdminVista.getFrame().setVisible(false);
        adminaluView.getFrame().setVisible(true);
    }
    
    public static  void mostrarAdmingru() {
    	System.out.println("Mostrando vista de administración de docentes");
        try {
        	if (admingroupView == null) {
				admingroupView = new AdmingroupView();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        menuAdminVista.getFrame().setVisible(false);
        admingroupView.getFrame().setVisible(true);
    }
    
    public static  void mostrarAdminasig() {
    	System.out.println("Mostrando vista de administración de docentes");
        try {
			if (adminasigView == null) {
				adminasigView = new AdminasigView();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        menuAdminVista.getFrame().setVisible(false);
        adminasigView.getFrame().setVisible(true);
    }
    
   

}