package factory;

public class SmsNotificacion implements Notificacion{

	@Override
	public void enviar(String mensaje) {
		System.out.printf("Sms: %s\n", mensaje);
	} 
}
