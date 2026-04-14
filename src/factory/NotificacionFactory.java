package factory;

public class NotificacionFactory {

	public Notificacion crearNotificacion(String tipo) {
		if (tipo == null) return null;
        
        return switch (tipo.toLowerCase()) {
            case "email" -> new EmailNotificacion();
            case "sms"   -> new SmsNotificacion();
            case "push"  -> new PushNotificacion();
            default      -> null;
        };
	}
}
