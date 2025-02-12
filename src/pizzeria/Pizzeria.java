package pizzeria;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pizzeria {

	private List<Cliente> clientes;
	private List<Pizza> pizzas;
	private List<Pedido> pedidos;

	public Pizzeria() {

		this.clientes = new ArrayList<Cliente>();
		this.pizzas = new ArrayList<Pizza>();
		this.pedidos = new ArrayList<Pedido>();

	}
	
	public   List<Pizza> getPizza(){
		return pizzas;
	}
	
	public  List<Pedido> getPedido(){
		return pedidos;
	}

	public void addPizza(Pizza pi) {
		if (pi == null) {
			throw new IllegalArgumentException("La pizza no puede ser nula");
		}
		pizzas.add(pi);
	}

	public void addCliente(Cliente cli) {
		if (cli == null) {
			throw new IllegalArgumentException("El cliente no puede ser nulo");
		}
		for (Cliente cliente : this.clientes) {
			if (cliente.getId() == cli.getId()) {
				throw new IllegalArgumentException("El comprador ya ha sido añadido");
			}
		}
		clientes.add(cli);
	}

	public void addPedido(Pedido pe) {
		if (pe == null) {
			throw new IllegalArgumentException("El pedido no puede ser nula");
		}
		
		pedidos.add(pe);
	}

	public void verPedidos() {
		if (pedidos.isEmpty()) {
			System.out.println("No hay pedidos registrados.");
		} else {
			System.out.println("Lista de pedidos:");
			int contadorPedidos = 1;
			for (Pedido p : pedidos) {
				System.out.println(contadorPedidos + ". " + pedidos);
			}
		}
	}

	public void verPizzas() {
		if (pizzas.isEmpty()) {
			System.out.println("No hay pizzas disponibles en el menú.");
		} else {
			System.out.println("=== Menú de Pizzas ===");
			int contador = 1;
			for (Pizza pizza : pizzas) {
				System.out.println(contador + ". " + pizza.getNombre());
				System.out.println("   Precio: $" + pizza.getPrecio());
				System.out.println("---------------------------");
				contador++;
			}
		}
	}

	public void verClientes() {
		if (clientes.isEmpty()) {
			System.out.println("No hay clientes registrados en el sistema.");
		} else {
			System.out.println("=== Lista de Clientes ===");
			int contador = 1;
			for (Cliente cliente : clientes) {
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
		for (Cliente cliente : clientes) {
			if (cliente.getTelefono().equals(telef)) {
				cliente.Info();

			}
		}
		

	}

	public Cliente buscarClientePorId(int id) {
		Cliente c = null;
		for (Cliente cliente : clientes) {
			if (cliente.getId() == id) {
				c = cliente;

			}
		}
		return c;
	}
	
	public Pizza buscarPizzaPorId(int id) {
		Pizza p = null;
		for (Pizza pizza : pizzas) {
			if (pizza.getId() == id) {
				p = pizza;

			}
		}
		return p;
	}

	public void pizzasConIngrediente(Scanner sc) {
		System.out.println("Ingrediente:");
		String ingre = sc.next();
		for (Pizza p : this.pizzas) {
			if (p.getIngredientes().contains(ingre)) {
				p.mostrarInformación();
			}
		}
	}

	public void pizzasSinIngrediente(Scanner sc) {
		System.out.println("Ingrediente:");
		String ingre = sc.next();
		for (Pizza p : this.pizzas) {
			if (!(p.getIngredientes().contains(ingre))) {
				p.mostrarInformación();
			}
		}
	} 
	
	public void mostrarPedido() {
		if(pedidos == null || pedidos.size() == 0) {
			throw new IllegalArgumentException("No hay pedido");
		}
		for(Pedido pedido : this.pedidos) {
			pedido.mostrarInformacion();
			System.out.println();
		
		}
	}



public void mostrarPedidosLocal() {
	System.out.println(" Pedidos Consumidos en el Local:");
    boolean hayPedidosLocal = false;
    
    for (Pedido pedido : pedidos) {
        if (pedido.getTipo().equals("LOCAL")) {
            pedido.mostrarInformacion();
            hayPedidosLocal = true;
        }
    }

    if (!hayPedidosLocal) {
        System.out.println("No hay pedidos consumidos en el local.");
    }
}


public void mostrarPedidosRecoger() {
	System.out.println(" Pedidos Consumidos para recoger:");
    boolean hayPedidosRecoger = false;
    
    for (Pedido pedido : pedidos) {
        if (pedido.getTipo().equals("RECOGER")) {
        	pedido.mostrarInformacion();
            hayPedidosRecoger = true;
        }
    }

    if (!hayPedidosRecoger) {
        System.out.println("No hay pedidos consumidos para recoger.");
    }
}

public void mostrarPedidosDomicilio() {
	System.out.println(" Pedidos Consumidos para domicilio:");
    boolean hayPedidosDomicilio = false;
    
    for (Pedido pedido : pedidos) {
        if (pedido.getTipo().equals("DOMICILIO")) {
        	pedido.mostrarInformacion();
            hayPedidosDomicilio = true;
        }
    }

    if (!hayPedidosDomicilio) {
        System.out.println("No hay pedidos consumidos para el domicilio.");
    }
}


public void mostrarNombrePizza() {
	for(Pizza pizza : pizzas) {
		System.out.println(" -" + pizza.getId() + " " + pizza.getNombre());
	}
}


	public Pizza buscarPizzaId(int idPizza) {
		Pizza pizza = null;
		
		for(Pizza p : this.pizzas) {
			if(p.getId() == idPizza) {
				pizza = p;
			}
		}
		
		return pizza;
	}
	public void mostrarPedidosHoy() {
		LocalDateTime inicio = LocalDateTime.of(LocalDate.now(), LocalTime.NOON);
		LocalDateTime fin = LocalDateTime.of(LocalDate.now(), LocalTime.MAX);
		
		for(Pedido p : pedidos) {
			if(p.getFecha().isAfter(inicio) && p.getFecha().isBefore(fin)) {
				p.mostrarInformacion();
			}
		}
		
	}
	public void mostrarUltimoPedido() {
	    System.out.println("Último Pedido Realizado:");
	    
	    if (pedidos.isEmpty()) {
	        System.out.println("No hay pedidos registrados aún.");
	    } else {
	        Pedido ultimo = pedidos.get(pedidos.size() - 1);  
	        ultimo.mostrarInformacion();
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
//	if (cliente.getDineroDisponible() >= pizza.getPrecio()) {
//   	 double total = pizzas.getPrecio();
//        Pedido pedido = new Pedido(clientes, total, tipo);
//        this.addPedido(pedido);
//       Pedido ultimoPedido = pedido;
//         System.out.println("Pedido realizado con éxito.");
//     } 
//    else {
//        System.out.println("Dinero insuficiente.");
//    }
//	
//	}
	}
	
