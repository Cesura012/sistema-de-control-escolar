package AuthController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import AuthModel.Alumno;
import AuthModel.User;
import AuthView.LoginView;

import AuthView.MenuadminView;
import AuthView.RegisterView;
import AuthViewAlu.AddaluView;
import AuthViewAlu.AdminaluView;
import AuthViewAlu.DeleteAluView;
import AuthViewAlu.EditaluView;
import AuthViewAlu.RegisteraluView;
import AuthViewAsi.AddasiView;
import AuthViewAsi.AdminasigView;
import AuthViewAsi.DeleteasiView;
import AuthViewAsi.EditasiView;
import AuthViewAsi.RegisterasiView;
import AuthViewDoce.Adddoce;
import AuthViewDoce.AdmindoceView;
import AuthViewDoce.DeletedoceView;
import AuthViewDoce.EditdoceView;
import AuthViewDoce.RegisterdoView;
import AuthViewGroup.AddgroupView;
import AuthViewGroup.AdmingroupView;
import AuthViewGroup.DeletegroupView;
import AuthViewGroup.EditgroupView;
import AuthViewGroup.RegistergroupView;

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
	private static RegisteraluView registeraluView = null;
	private static AddaluView addaluView = null;
	private static EditaluView editaluView = null;
	private static DeleteAluView deletaluView = null;
	private static RegisterdoView registerdoceView = null;
	private static Adddoce adddoceView = null;
	private static EditdoceView editdoceView = null;
	private static DeletedoceView deletdoceView = null;
	private static RegisterasiView registerasiView = null;
	private static AddasiView addasiView = null;
	private static EditasiView editasiView = null;
	private static DeleteasiView deletasiView = null;
	private static RegistergroupView registergroupView = null;
	private static AddgroupView addgroupView = null;
	private static EditgroupView editgroupView = null;
	private static DeletegroupView deletgroupView = null;
	
	
  
    
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
    
    public static void registrarAlumno() {
    	Alumno aluModel = new Alumno();
    	
    	String nombre = addaluView.getTextField().getText();
    	aluModel.setNombre(nombre);
    	aluModel.setNum_control(2022456963);
    	aluModel.insert();
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
    
    public static void mostrarRegistroAlumnos() {
        if (registeraluView == null) {
            registeraluView = new RegisteraluView();
            System.out.println("AuthController: RegisteraluView inicializado.");
        }

        
        if (registeraluView.getFrame() == null) {
            throw new IllegalStateException("El frame de RegisteraluView no ha sido inicializado correctamente.");
        }

        if (menuAdminVista != null) {
            menuAdminVista.getFrame().setVisible(false);
        }
        adminaluView.getFrame().setVisible(false);

        registeraluView.getFrame().setVisible(true);
        System.out.println("AuthController: Ventana de Registro de Alumnos mostrada.");
    }
    
    public static void mostraragrealu() {
        if (addaluView == null) {
        	addaluView = new AddaluView();
        	addaluView.getBtnConfirm().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					registrarAlumno();
					
				}
			});
            System.out.println("AuthController: AddaluView inicializado.");
        }

        
        if (addaluView.getFrame() == null) {
            throw new IllegalStateException("El frame de AddaluView no ha sido inicializado correctamente.");
        }

        if (menuAdminVista != null) {
            menuAdminVista.getFrame().setVisible(false);
        }
        adminaluView.getFrame().setVisible(false);

        addaluView.getFrame().setVisible(true);
        System.out.println("AuthController: Ventana de agreagar alumostrada.");
    }
    
    public static void mostraredialu() {
        if (editaluView == null) {
        	editaluView = new EditaluView();
            System.out.println("AuthController: editaluView inicializado.");
        }

        
        if (editaluView.getFrame() == null) {
            throw new IllegalStateException("El frame de editaluView no ha sido inicializado correctamente.");
        }

        if (menuAdminVista != null) {
            menuAdminVista.getFrame().setVisible(false);
        }
        adminaluView.getFrame().setVisible(false);

        editaluView.getFrame().setVisible(true);
        System.out.println("AuthController: Ventana de editar alumostrada.");
    }
    
    public static void mostrardeletalu() {
        if (deletaluView == null) {
        	deletaluView = new DeleteAluView();
            System.out.println("AuthController: deletaluView inicializado.");
        }

        
        if (deletaluView.getFrame() == null) {
            throw new IllegalStateException("El frame de deletaluView no ha sido inicializado correctamente.");
        }

        if (menuAdminVista != null) {
            menuAdminVista.getFrame().setVisible(false);
        }
        adminaluView.getFrame().setVisible(false);

        deletaluView.getFrame().setVisible(true);
        System.out.println("AuthController: Ventana de deletaluView alumostrada.");
    }
    
    public static void vmostrarRegistrodoce() {
        if (registerdoceView == null) {
        	registerdoceView = new RegisterdoView();
            System.out.println("AuthController: registerdoceView inicializado.");
        }

        
        if (registerdoceView.getFrame() == null) {
            throw new IllegalStateException("El frame de registerdoceView no ha sido inicializado correctamente.");
        }

        if (menuAdminVista != null) {
            menuAdminVista.getFrame().setVisible(false);
        }
        admindoceView.getFrame().setVisible(false);

        registerdoceView.getFrame().setVisible(true);
        System.out.println("AuthController: Ventana de registerdoceView alumostrada.");
    }
    
    public static void mostraragredoce() {
        if (adddoceView == null) {
        	adddoceView = new Adddoce();
            System.out.println("AuthController: adddoceView inicializado.");
        }

        
        if (adddoceView.getFrame() == null) {
            throw new IllegalStateException("El frame de adddoceView no ha sido inicializado correctamente.");
        }

        if (menuAdminVista != null) {
            menuAdminVista.getFrame().setVisible(false);
        }
        admindoceView.getFrame().setVisible(false);

        adddoceView.getFrame().setVisible(true);
        System.out.println("AuthController: Ventana de adddoceView alumostrada.");
    }
    
    public static void mostraredidoce() {
        if (editdoceView == null) {
        	editdoceView = new EditdoceView();
            System.out.println("AuthController: editdoceView inicializado.");
        }

        
        if (editdoceView.getFrame() == null) {
            throw new IllegalStateException("El frame de editdoceView no ha sido inicializado correctamente.");
        }

        if (menuAdminVista != null) {
            menuAdminVista.getFrame().setVisible(false);
        }
        admindoceView.getFrame().setVisible(false);

        editdoceView.getFrame().setVisible(true);
        System.out.println("AuthController: Ventana de editdoceView alumostrada.");
    }
    
    public static void mostrardeletdoce() {
        if (deletdoceView == null) {
        	deletdoceView = new DeletedoceView();
            System.out.println("AuthController: deletdoceView inicializado.");
        }

        
        if (deletdoceView.getFrame() == null) {
            throw new IllegalStateException("El frame de deletdoceView no ha sido inicializado correctamente.");
        }

        if (menuAdminVista != null) {
            menuAdminVista.getFrame().setVisible(false);
        }
        admindoceView.getFrame().setVisible(false);

        deletdoceView.getFrame().setVisible(true);
        System.out.println("AuthController: Ventana de deletdoceView alumostrada.");
    }
    
    public static void vmostrarRegistroasi() {
        if (registerasiView == null) {
        	registerasiView = new RegisterasiView();
            System.out.println("AuthController: registerasiView inicializado.");
        }

        
        if (registerasiView.getFrame() == null) {
            throw new IllegalStateException("El frame de registerasiView no ha sido inicializado correctamente.");
        }

        if (menuAdminVista != null) {
            menuAdminVista.getFrame().setVisible(false);
        }
        adminasigView.getFrame().setVisible(false);

        registerasiView.getFrame().setVisible(true);
        System.out.println("AuthController: Ventana de registerasiView alumostrada.");
    }
    
    public static void mostraragreasi() {
        if (addasiView == null) {
        	addasiView = new AddasiView();
            System.out.println("AuthController: AddasiView inicializado.");
        }

        
        if (addasiView.getFrame() == null) {
            throw new IllegalStateException("El frame de AddasiView no ha sido inicializado correctamente.");
        }

        if (menuAdminVista != null) {
            menuAdminVista.getFrame().setVisible(false);
        }
        adminasigView.getFrame().setVisible(false);

        addasiView.getFrame().setVisible(true);
        System.out.println("AuthController: Ventana de AddasiView alumostrada.");
    }
    
    public static void mostrareditasi() {
        if (editasiView == null) {
        	editasiView = new EditasiView();
            System.out.println("AuthController: editasiView inicializado.");
        }

        
        if (editasiView.getFrame() == null) {
            throw new IllegalStateException("El frame de editasiView no ha sido inicializado correctamente.");
        }

        if (menuAdminVista != null) {
            menuAdminVista.getFrame().setVisible(false);
        }
        adminasigView.getFrame().setVisible(false);

        editasiView.getFrame().setVisible(true);
        System.out.println("AuthController: Ventana de editasiView alumostrada.");
    }
    
    public static void mostrardeletasi() {
        if (deletasiView == null) {
        	deletasiView = new DeleteasiView();
            System.out.println("AuthController: DeleteasiView inicializado.");
        }

        
        if (deletasiView.getFrame() == null) {
            throw new IllegalStateException("El frame de DeleteasiView no ha sido inicializado correctamente.");
        }

        if (menuAdminVista != null) {
            menuAdminVista.getFrame().setVisible(false);
        }
        adminasigView.getFrame().setVisible(false);

        deletasiView.getFrame().setVisible(true);
        System.out.println("AuthController: Ventana de DeleteasiView alumostrada.");
    }
   
    public static void vmostrarRegistrogroup() {
        if (registergroupView == null) {
        	registergroupView = new RegistergroupView();
            System.out.println("AuthController: registergroupView inicializado.");
        }

        
        if (registergroupView.getFrame() == null) {
            throw new IllegalStateException("El frame de registergroupView no ha sido inicializado correctamente.");
        }

        if (menuAdminVista != null) {
            menuAdminVista.getFrame().setVisible(false);
        }
        admingroupView.getFrame().setVisible(false);

        registergroupView.getFrame().setVisible(true);
        System.out.println("AuthController: Ventana de registergroupView alumostrada.");
    }
    
    public static void showaddgroup() {
        if (addgroupView == null) {
        	addgroupView = new AddgroupView();
            System.out.println("AuthController: AddgroupView inicializado.");
        }

        
        if (addgroupView.getFrame() == null) {
            throw new IllegalStateException("El frame de AddgroupView no ha sido inicializado correctamente.");
        }

        if (menuAdminVista != null) {
            menuAdminVista.getFrame().setVisible(false);
        }
        admingroupView.getFrame().setVisible(false);

        addgroupView.getFrame().setVisible(true);
        System.out.println("AuthController: Ventana de AddgroupView alumostrada.");
    }
    
    
    public static void showeditgroup() {
        if (editgroupView == null) {
        	editgroupView = new EditgroupView();
            System.out.println("AuthController: editgroupView inicializado.");
        }

        
        if (editgroupView.getFrame() == null) {
            throw new IllegalStateException("El frame de editgroupView no ha sido inicializado correctamente.");
        }

        if (menuAdminVista != null) {
            menuAdminVista.getFrame().setVisible(false);
        }
        admingroupView.getFrame().setVisible(false);

        editgroupView.getFrame().setVisible(true);
        System.out.println("AuthController: Ventana de editgroupView alumostrada.");
    }
   
    public static void showdeletgroup() {
        if (deletgroupView == null) {
        	deletgroupView = new DeletegroupView();
            System.out.println("AuthController: deletgroupView inicializado.");
        }

        
        if (deletgroupView.getFrame() == null) {
            throw new IllegalStateException("El frame de deletgroupView no ha sido inicializado correctamente.");
        }

        if (menuAdminVista != null) {
            menuAdminVista.getFrame().setVisible(false);
        }
        admingroupView.getFrame().setVisible(false);

        deletgroupView.getFrame().setVisible(true);
        System.out.println("AuthController: Ventana de deletgroupView alumostrada.");
    }
}