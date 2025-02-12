package pizzeria;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pedido {

	private int id;
	private Cliente cliente;
	private LocalDateTime fecha;
	private double total;
	private Tipo tipo;
	private List<Pizza> pizzas;

	private static int idCodigo = 1;
	
	private static Pedido ultimoPedido;
	
	public Pedido (Cliente cliente,  String tipo) {
		this.cliente = cliente;
		this.fecha = LocalDateTime.now();
		setTotal(0);
		setTipo(tipo);
		this.id = idCodigo++;
		this.pizzas = new ArrayList<Pizza>();
		ultimoPedido = this;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

//	public void setCliente(int idCliente) {
//		if (idCliente <= 0) {
//			throw new IllegalArgumentException("El ID no puede ser nulo");
//		}
//		this.idCliente = idCliente;
//	}
//
//	public int getCliente() {
//		return idCliente;
//	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public LocalDateTime getFecha() {
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
		System.out.println("Cliente:" + cliente.getId() + " - " + cliente.getNombre());
		System.out.println("Fecha:" + fecha);
		System.out.println("Total del pedido:" + total);
		System.out.println("Tipo de pedido:" + tipo);
		System.out.println("Pizzas en el pedido: ");
		for (Pizza pizza : pizzas) {
			System.out.println(" - " + pizza.getNombre());
		}
	}
	
	public static Pedido nuevoPedido(Scanner sc, Pizzeria p) {
		System.out.println("Dame el ID del cliente: ");
		int idCliente = sc.nextInt();
		Cliente cliente = p.buscarClientePorId(idCliente);
		
		System.out.println("Tipo de pedido: ");
		String tipo = sc.next().toUpperCase();
		
		
		return new Pedido(cliente, tipo);
	}

}
