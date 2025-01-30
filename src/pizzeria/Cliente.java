package pizzeria;

public class Cliente {
	private int id;
	private String nombre;
	private String direccion;
	private String email;
	private String telefono;
	private double dineroDisponible;
	
	public Cliente(String nombre, String direccion, String email, String telefono, double dineroDisponible) {
		setNombre(nombre);
		setDireccion(direccion);
		setEmail(email);
		setTelefono(telefono);
		setDineroDisponible(dineroDisponible);
		
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre == null || nombre.isBlank()) {
			throw new IllegalArgumentException("El nombre no puede ser vacío, ni en blanco, ni nulo");
		}
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		if (direccion == null || direccion.isBlank()) {
			throw new IllegalArgumentException("La direccion no puede ser vacío, ni en blanco, ni nulo");
		}
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email == null || email.isBlank()) {
			throw new IllegalArgumentException("El email no puede ser vacío, ni en blanco, ni nulo");
		}
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		if(telefono == null || telefono.isBlank()) {
			throw new IllegalArgumentException("El telefono no puede ser vacío, ni en blanco, ni nulo");
		}
		if(telefono.length() != 9) {
			throw new IllegalArgumentException("El telefono debe tener 9 caracteres");
		}
		this.telefono = telefono;
	}

	public double getDineroDisponible() {
		return dineroDisponible;
	}

	public void setDineroDisponible(double dineroDisponible) {
		if(dineroDisponible < 0) {
			throw new IllegalArgumentException("El dinero disponible no puede ser negativo");
		}
		this.dineroDisponible = dineroDisponible;
	}


	//metodos
	
	public void Info() {
		System.out.println("nombre: " + this.nombre);
		System.out.println("Direccion: " + this.direccion);
		System.out.println("Email: " + this.email);
		System.out.println("Telefono: " + telefono);
		System.out.println("Dinero disponible: " + dineroDisponible);
	}

	
}
