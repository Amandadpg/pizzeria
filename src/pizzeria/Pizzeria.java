package pizzeria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pizzeria {

	private List<Cliente> cliente;
	private List<Pizza> pizza;
	private List<Pedido> pedido;
	
	private Pizza pizzaMasCara;
    private Pizza pizzaMasBarata;
	
	public Pizzeria() {
		
		this.cliente = new ArrayList<Cliente>();
		this.pizza = new ArrayList<Pizza>();
		this.pedido = new ArrayList<Pedido>();
		
	}

 public void addPizza(Pizza p){
	 if(p == null){
		throw new IllegalArgumentException("La pizza no puede ser nula");
	 }
	 pizza.add(p);
 }
	
 public void addCliente(Cliente c) {
	 if(c == null) {
		 throw new IllegalArgumentException("El cliente no puede ser nulo");
	 }
	for(Cliente cliente : this.cliente) {
		if(cliente.getId() == c.getId()) {
			throw new IllegalArgumentException("El comprador ya ha sido añadido");
		}
	}
	cliente.add(c);
 }
 
 public void verPedidos() {
     if (pedido.isEmpty()) {
         System.out.println("No hay pedidos registrados.");
     } else {
         System.out.println("Lista de pedidos:");
         for (Pedido p : pedido) {
             System.out.println(p);
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
 
 public void pizzasConIngrediente(Scanner sc) {
	 	System.out.println("Ingrediente:");
	 	String ingre = sc.next();
	 	for(Pizza p : this.pizza) {
			if(p.getIngredientes().contains(ingre)) {
				p.mostrarInformación();
			}
		}
	}
 
 public void pizzasSinIngrediente(Scanner sc) {
	 	System.out.println("Ingrediente:");
	 	String ingre = sc.next();
	 	for(Pizza p : this.pizza) {
			if(!(p.getIngredientes().contains(ingre))) {
				p.mostrarInformación();
			}
		}
	}
 
 public void pizzaMasCara(List<Pizza> pizza) {
	 for(Pizza pizza : List<Pizza>) {
		 if()
	 }
     if (pizzaMasCara == null || pizza.getPrecio() > pizzaMasCara.getPrecio()) {
         pizzaMasCara = pizza;
     }
     
     System.out.println("La pizza mas cara: " + pizzaMasCara);
//     if (pizzaMasBarata == null || nuevaPizza.getPrecio() < pizzaMasBarata.getPrecio()) {
//         pizzaMasBarata = nuevaPizza;
//     }
 }

}




