import AuthView.LoginView;
import AuthView.RegistroView;
import AuthController.AuthController;
import AuthModel.Usuario;

public class Main {
    public static void main(String[] args) {
        Usuario modelo = new Usuario("", "");
        LoginView loginVista = new LoginView();
        RegistroView registroVista = new RegistroView();
        new AuthController(modelo, loginVista, registroVista);
        
        // Asegurarnos de que la ventana de login sea visible al iniciar la aplicación
        loginVista.getFrame().setVisible(true);
    }
}