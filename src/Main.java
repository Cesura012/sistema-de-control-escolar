//Sistema escolar equipo
import AuthController.AuthController;
import AuthModel.User;
import AuthView.LoginView;
import AuthView.RegisterView;


public class Main {
	public static void main(String[] args) {
		User modelo = new User("", "");
	    LoginView loginVista = new LoginView();
	    RegisterView registroVista = new RegisterView();
	    new AuthController(modelo, loginVista, registroVista, false, null, null, null, null); 
	}
}
//hola
//aqui