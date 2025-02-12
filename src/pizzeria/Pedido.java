package pizzeria;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

	private int id;
	private int idCliente;
	private LocalDateTime fecha;
	private double total;
	private Tipo tipo;
	private List<Pizza> pizzas;

	private static int idCodigo = 1;

	public Pedido(int cliente, String tipo) {
		setCliente(cliente);
		this.fecha = LocalDateTime.now();
		setTotal(0);
		setTipo(tipo);
		this.id = idCodigo++;
		this.pizzas = new ArrayList<Pizza>();

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCliente(int idCliente) {
		if (idCliente <= 0) {
			throw new IllegalArgumentException("El ID no puede ser nulo");
		}
		this.idCliente = idCliente;
	}

	public int getCliente() {
		return idCliente;
	}

	public LocalDateTime getFecha(LocalDateTime fecha) {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		if (total < 0) {
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

	public void addPizzaPedido(Pizza p) {
		if (p == null) {
			throw new IllegalArgumentException("No puede ser nulo");
		}

		pizzas.add(p);
		this.total = this.total + p.getPrecio();
	}

	public void deletePizzaPedido(Pizza p) {
		if (p == null) {
			throw new IllegalArgumentException("No puede ser nulo");
		}

		pizzas.remove(p);
		this.total = this.total - p.getPrecio();

	}

	public void mostrarPizzaPedido() {
		for (Pizza p : pizzas) {
			System.out.println("- " + p.getId() + " " + p.getNombre());
		}
	}

	public void mostrarInformacion() {
		System.out.println("ID del Pedido:" + id);
		System.out.println("ID del cliente:" + idCliente);
		System.out.println("Fecha:" + fecha);
		System.out.println("Total del pedido:" + total);
		System.out.println("Tipo de pedido:" + tipo);
		System.out.println("Pizzas en el pedido: ");
		for (Pizza pizza : pizzas) {
			System.out.println(" - " + pizza.getNombre());
		}
	}

}
