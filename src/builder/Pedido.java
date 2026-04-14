package builder;

public class Pedido {

	private String cliente;
	private String direccion;
	private String telefono;
	private String email;
	private String observaciones;
	
	private Pedido(Builder builder) {
		this.cliente= builder.cliente;
		this.direccion= builder.direccion;
		this.telefono= builder.telefono;
		this.email= builder.email;
		this.observaciones= builder.observaciones;
	}
	
	@Override
    public String toString() {
        return "Pedido: " +
                "\n  Cliente: " + cliente +
                "\n  Dirección: " + direccion +
                (telefono != null ? "\n  Teléfono: " + telefono : "") + 
                (email != null ? "\n  Email: " + email : "") +
                (observaciones != null ? "\n  Observaciones: " + observaciones : "");       
    }
	
	public static class Builder {
		private String cliente;
		private String direccion;
		private String telefono;
		private String email;
		private String observaciones;
		
		public Builder(String cliente, String direccion) {
            this.cliente = cliente;
            this.direccion = direccion;
        }
		
        public Builder setTelefono(String telefono) {
            this.telefono = telefono;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setObservaciones(String observaciones) {
            this.observaciones = observaciones;
            return this;
        }

        public Pedido build() {
            return new Pedido(this);
        }
	}
}































