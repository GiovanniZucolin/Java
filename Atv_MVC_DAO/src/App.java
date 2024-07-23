import Controller.ClienteController;
import View.Form;

public class App {

	public static void main(String[] args) {
		Form frCliente = new Form();
		new ClienteController(frCliente);
	}
}
