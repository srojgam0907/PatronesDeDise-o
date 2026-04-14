package builder;

public class Main {

	public static void main(String[] args) {
		new Main().show();

	}
	
	public void show() {
		// 1. Pedido básico
        Pedido pedidoBasico = new Pedido.Builder("Ana García", "Av. Constitución 45")
                .build();

        // 2. Pedido completo
        Pedido pedidoCompleto = new Pedido.Builder("Juan Pérez", "Calle Real 5")
                .setTelefono("600123456")
                .setEmail("juan.perez@email.com")
                .setObservaciones("Entregar por la tarde")
                .build();

        System.out.println("--- PEDIDO BÁSICO ---");
        System.out.println(pedidoBasico);
        
        System.out.println("\n--- PEDIDO COMPLETO ---");
        System.out.println(pedidoCompleto);
	}

}
