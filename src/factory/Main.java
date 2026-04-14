package factory;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().show();

	}
	
	public void show() {
		NotificacionFactory factory = new NotificacionFactory();
	    int option = chooseOption();
	    
	    TipoNotificacion tipo = switch (option) {
	        case 1 -> TipoNotificacion.EMAIL;
	        case 2 -> TipoNotificacion.SMS;
	        default -> TipoNotificacion.PUSH;
	    };
	    
	    Notificacion notificacion = factory.crearNotificacion(tipo.name().toLowerCase());
	    notificacion.enviar("Hola mundo"); 
	}
	
	public void showMenu() {
		System.out.printf("¿Qué tipo de mensaje quieres mandar?\n1. Email\n2. Sms\n3. Push\n");
	}
	
	@SuppressWarnings("resource")
	public int chooseOption() {
		Scanner kb= new Scanner(System.in);
		boolean error= false;
		int option= 0;
		
		do {
			showMenu();
			option= kb.nextInt();
			
			if(option > 3) {
				System.out.println("ERROR: elija una de las opciones disponibles");
				error= true;
				
			} else {
				error= false;
			}
			
		} while(error);
		
		return option;   
	}
}
