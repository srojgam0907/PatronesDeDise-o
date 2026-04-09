package actividad1;

import java.util.List;

public class Logger {

	private static Logger logger; 
	private List<String> mensajes; 
	
	private Logger() {}
	
	public static Logger getLogger() { 
        if (logger == null) {
            logger = new Logger();
        }
        return logger; 
    }
	
	public void registrar(String mensaje) {
		mensajes.add(mensaje);
	}
	
	public void mostrarLogs() {
		mensajes.forEach(System.out::println); 
	}
}
