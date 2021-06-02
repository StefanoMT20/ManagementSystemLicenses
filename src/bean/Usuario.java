package bean;

public class Usuario {
	
	public String usuario;
	public String clave;
	
	public Usuario(String usuario, String clave) {
		this.usuario = usuario;
		this.clave = clave;
	}

	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
	
	
	
}
