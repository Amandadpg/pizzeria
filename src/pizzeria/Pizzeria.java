package pizzeria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pizzeria {

	private List<Cliente> cliente;
	private static List<Pizza> pizza;
	private static List<Pedido> pedido;

	public Pizzeria() {

		this.cliente = new ArrayList<Cliente>();
		this.pizza = new ArrayList<Pizza>();
		this.pedido = new ArrayList<Pedido>();

	}
	
	public static  List<Pizza> getPizza(){
		return pizza;
	}
	
	public static List<Pedido> getPedido(){
		return pedido;
	}

	public void addPizza(Pizza pi) {
		if (pi == null) {
			throw new IllegalArgumentException("La pizza no puede ser nula");
		}
		pizza.add(pi);
	}

	public void addCliente(Cliente cli) {
		if (cli == null) {
			throw new IllegalArgumentException("El cliente no puede ser nulo");
		}
		for (Cliente cliente : this.cliente) {
			if (cliente.getId() == cli.getId()) {
				throw new IllegalArgumentException("El comprador ya ha sido añadido");
			}
		}
		cliente.add(cli);
	}

	public void addPedido(Pedido pe) {
		if (pe == null) {
			throw new IllegalArgumentException("El pedido no puede ser nula");
		}
		
		pedido.add(pe);
	}

	public void verPedidos() {
		if (pedido.isEmpty()) {
			System.out.println("No hay pedidos registrados.");
		} else {
			System.out.println("Lista de pedidos:");
			int contadorPedidos = 1;
			for (Pedido p : pedido) {
				System.out.println(contadorPedidos + ". " + pedido);
			}
		}
	}

	public void verPizzas() {
		if (pizza.isEmpty()) {
			System.out.println("No hay pizzas disponibles en el menú.");
		} else {
			System.out.println("=== Menú de Pizzas ===");
			int contador = 1;
			for (Pizza pizza : pizza) {
				System.out.println(contador + ". " + pizza.getNombre());
				System.out.println("   Precio: $" + pizza.getPrecio());
				System.out.println("---------------------------");
				contador++;
			}
		}
	}

	public void verClientes() {
		if (cliente.isEmpty()) {
			System.out.println("No hay clientes registrados en el sistema.");
		} else {
			System.out.println("=== Lista de Clientes ===");
			int contador = 1;
			for (Cliente cliente : cliente) {
				System.out.println("Cliente #" + contador);
				System.out.println("   Nombre     : " + cliente.getNombre());
				System.out.println("   Dirección  : " + cliente.getDireccion());
				System.out.println("   Email      : " + cliente.getEmail());
				System.out.println("   Teléfono   : " + cliente.getTelefono());
				System.out.println("   Dinero Disp: $" + cliente.getDineroDisponible());
				System.out.println("------------------------------");
				contador++;
			}
		}
	}
	
	

	public void buscarClientePorTelefono(Scanner sc) {
		System.out.println("Telefono:");
		String telef = sc.next();
		for (Cliente cliente : cliente) {
			if (cliente.getTelefono().equals(telef)) {
				cliente.Info();

			}
		}
		

	}

	public Cliente buscarClientePorId(int id) {
		Cliente c = null;
		for (Cliente cliente : cliente) {
			if (cliente.getId() == id) {
				c = cliente;

			}
		}
		return c;
	}
	
	public Pizza buscarPizzaPorId(int id) {
		Pizza p = null;
		for (Pizza pizza : pizza) {
			if (pizza.getId() == id) {
				p = pizza;

			}
		}
		return p;
	}

	public void pizzasConIngrediente(Scanner sc) {
		System.out.println("Ingrediente:");
		String ingre = sc.next();
		for (Pizza p : this.pizza) {
			if (p.getIngredientes().contains(ingre)) {
				p.mostrarInformación();
			}
		}
	}

	public void pizzasSinIngrediente(Scanner sc) {
		System.out.println("Ingrediente:");
		String ingre = sc.next();
		for (Pizza p : this.pizza) {
			if (!(p.getIngredientes().contains(ingre))) {
				p.mostrarInformación();
			}
		}
	} 
	
	public void mostrarPedido() {
		if(pedido == null || pedido.size() == 0) {
			throw new IllegalArgumentException("No hay pedido");
		}
		System.out.println("Pizzas en el pedido: ");
		for(Pedido pedido : this.pedido) {
			pedido.mostrarInformacion();
			System.out.println();
		
		}
	}
	
	public void addPizzaPedido(List<Pizza> pizzas) {
		if(pizzas == null || pizzas.isEmpty()) {
			throw new IllegalArgumentException("No puede ser nulo o blanco");
		}
		for(Pizza p : pizzas) {
			pizzas.add(p);
			this.total = this.total + p.getPrecio();
			
		}
	}
	
	

//	public void realizarPedido(Scanner sc) {
//		System.out.println("ID del cliente:");
//		int idCliente = sc.nextInt();
//		Cliente cliente = buscarClientePorId(idCliente);
//		
//		System.out.println("Pizza:");
//		int idPizza = sc.nextInt();
//		Pizza pizza = buscarPizzaPorId(idPizza);
//		
//		System.out.println("Tipo de pedido:");
//		String tipo = sc.next().toUpperCase();
//		
//	
//	 
//     if (cliente.getDineroDisponible() >= pizza.getPrecio()) {
//    	 double total = pizza.getPrecio();
//         Pedido pedido = new Pedido(cliente, total, tipo);
//         this.addPedido(pedido);
//         Pedido ultimoPedido = pedido;
//         System.out.println("Pedido realizado con éxito.");
//     } 
//     else {
//         System.out.println("Dinero insuficiente.");
//     }
	}


