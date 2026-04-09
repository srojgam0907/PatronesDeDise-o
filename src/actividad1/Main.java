package actividad1;

public class Main {

	public static void main(String[] args) {
		new Main().show();

	}

	public void show() {
		Logger logger= Logger.getLogger();
		
		ServiciosUsuarios su1= new ServiciosUsuarios();
		ServicioPedidos sp1= new ServicioPedidos();
		ServiciosUsuarios su2= new ServiciosUsuarios();
		ServicioPedidos sp2= new ServicioPedidos();
		
		su1.registrar("Usuario creado");
		su2.registrar("Usuario eliminado");
		sp1.registrar("Pedido creado");
		sp2.registrar("Pedido enviado");
		
		logger.mostrarLogs();
	}
}
