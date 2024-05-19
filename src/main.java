
import AuthController.AuthController;
import AuthModel.Usuario;
import AuthView.LoginView;
import AuthView.RegistroView;

public class Main {
	public static void main(String[] args) {
	    Usuario modelo = new Usuario("", "");
	    LoginView loginVista = new LoginView();
	    RegistroView registroVista = new RegistroView();
	    new AuthController(modelo, loginVista, registroVista, false); 
	}
}
