package singleton;

public class ServiciosUsuarios {

	Logger log= Logger.getLogger();
	
	public ServiciosUsuarios() {}
	
	public void registrar(String mensaje) {
		log.registrar(mensaje);
	}
}
