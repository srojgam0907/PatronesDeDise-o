package actividad1;

import java.util.ArrayList;
import java.util.List;

public class Logger {

	private static Logger logger; 
	private List<String> mensajes= new ArrayList<>(); 
	
	private Logger() {} 
	
	public static Logger getLogger() { 
        if (logger == null) {
            logger = new Logger();
        }
        return logger; 
    }
	
	public void registrar(String mensaje) {
		mensajes.add("[INFO] " + mensaje); 
	}
	
	public void mostrarLogs() {
		mensajes.forEach(System.out::println); 
	}
}
