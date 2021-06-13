package clases;

public class Participantes {

	
	public String codigo, nombre, apellido;

	public Participantes(String codigo, String nombre, String apellido) {

		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
}
