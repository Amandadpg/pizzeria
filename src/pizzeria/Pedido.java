package pizzeria;

import java.time.LocalDate;

public class Pedido {

	private int id;
	private Cliente cliente;
	private LocalDate fecha;
	private double total;
	private Tipo tipo;
	
	public Pedido (int id, Cliente cliente, LocalDate fecha, double total, Tipo tipo) {
		this.id = id;
		this.cliente = cliente;
		this.fecha = fecha;
		this.total = total;
		this.tipo = tipo;
		
	}

	public int getId() {
		if (id < 0) {
			throw new IllegalArgumentException("El id tiene que ser mayor que 0");
		}
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cliente getCliente() {
		if (cliente == null) {
			throw new IllegalArgumentException("El nombre del cliente no puede ser nulo");
		}
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public LocalDate getFecha(LocalDate fecha) {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		if (total > 0 ) {
			throw new IllegalArgumentException("El total del pedido no puede ser menos que 0");
		}
		this.total = total;
	}

	public String getTipo() {
		return tipo.toString();
	}

	public void setTipo(String tipo) {
		this.tipo = Tipo.valueOf(tipo);
	}
	
	public void mostrarInformacion() {
		System.out.println("Pedido;" + this.id);
		System.out.println("Nombre del cliente:" + this.cliente);
		System.out.println("Fecha:" + this.fecha);
		System.out.println("Total del pedido:" + this.total);
		System.out.println("Tipo de pedido:" + this.tipo);
	}
	
	
}
