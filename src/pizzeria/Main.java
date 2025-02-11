package pizzeria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		menu();
	/*
	 * System.out.println("prueba");
	 * 
	 * Pizza pizza1 = new Pizza("Margarita", "Tomate, Mozzarella, Albahaca", 8.99);
	 * Pizza pizza2 = new Pizza("Pepperoni", "Tomate, Mozzarella, Pepperoni",
	 * 10.99); Pizza pizza3 = new Pizza("Cuatro Quesos",
	 * "Mozzarella, Gorgonzola, Parmesano, Cheddar", 11.99); Pizza pizza4 = new
	 * Pizza("Hawaiana", "Tomate, Mozzarella, Jamón, Piña", 9.99);
	 * 
	 * pizza1.mostrarInformación();
	 * 
	 * 
	 * Cliente cliente1 = new Cliente("Juan Pérez", "Calle Falsa 123",
	 * "juan.perez@example.com", "555-1234", 1500.50); Cliente cliente2 = new
	 * Cliente("Ana Gómez", "Av. Siempre Viva 456", "ana.gomez@example.com",
	 * "555-5678", 3000.00); Cliente cliente3 = new Cliente("Carlos López",
	 * "Plaza Central 789", "carlos.lopez@example.com", "555-8765", 500.25); Cliente
	 * cliente4 = new Cliente("María Rodríguez", "Boulevard Principal 321",
	 * "maria.rodriguez@example.com", "555-4321", 2500.75);
	 * 
	 * cliente1.Info();
	 */
	}
	// Pizza pizza1 = new Pizza(p);
	public static void menu() {
		
		
        Pizzeria pizzeria = new Pizzeria();
		Scanner sc = new Scanner(System.in);
//		Cliente c = new Cliente("Laura", "calle", "mari", "123456789", 23);
//				pizzeria.addCliente(c);
//		Pizza p = new Pizza("Margarita", "tomate,queso", 12);
//		Pizza pepperoni = new Pizza("Pepperoni", "tomate,mozzarella,pepperoni", 9.50);
//        Pizza cuatroQuesos = new Pizza("Cuatro Quesos", "mozzarella,gorgonzola,parmesano,queso de cabra", 10.00);
//        Pizza hawaiana = new Pizza("Hawaiana", "tomate,mozzarella,jamon,piña", 30.00);
//			pizzeria.addPizza(p);
		 int opcion;
		do {
			System.out.println("----Menú de la pizzeria----");
			System.out.println("Bienvenido a nuestra pizzeria, seleccione una opción:");
			System.out.println("1. Nueva pizza");
			System.out.println("2. Nuevo cliente");
			System.out.println("3. Realizar un pedido");
			System.out.println("4. Ver pizzas");
			System.out.println("5. Ver pedidos");
			System.out.println("6. Ver clientes");
			System.out.println("7. Consultar clientes mediante su teléfono");
			System.out.println("8. Buscar pizza con ingrediente");
			System.out.println("9. Buscar pizza sin ingrediente");
			System.out.println("10. Pedidos de hoy");
			System.out.println("11. Pedidos consumidos en el local");
			System.out.println("12. Pedidos para recoger");
			System.out.println("13. Pedidos a domicilio ");
			System.out.println("14. Pizza más cara");
			System.out.println("15. Pizza más barata");
			System.out.println("16. Último pedido realizado");
			System.out.println("17. Salir");
			
			
			opcion = sc.nextInt();
			
			System.out.println();
			System.out.println();
			
			switch(opcion) {
			case 1:
//				Pizza p = nuevaPizza (sc);
			//	pizzeria.addPizza(p);
				System.out.println("Nombre:");
				String nombrePizza = sc.next();
				System.out.println("Ingredientes: ");
				String ingredientes = sc.next();
				System.out.println("Precio: ");
				double precio = sc.nextDouble();

				pizzeria.addPizza(new Pizza(nombrePizza, ingredientes, precio));
				break;

				
			case 2:
				System.out.println("Nombre:");
				String nombreCliente = sc.next();
				System.out.println("Direccion: ");
				String direccion = sc.next();
				System.out.println("Email: ");
				String email = sc.next();
				System.out.println("Telefono: ");
				String telefono = sc.next();
				System.out.println("Dinero disponible: ");
				double dineroDisponible = sc.nextDouble();
			
				pizzeria.addCliente(new Cliente(nombreCliente, direccion, email, telefono, dineroDisponible));
				break;
				
			case 3:
				//Pedido pe = nuevoPedido(sc);
				//pizzeria.addPedido(pe);
				pizzeria.realizarPedido(sc);
				break;
			
			case 4:
				pizzeria.verPizzas();
				break;
				
			case 5:
				pizzeria.verPedidos();
				break;
				
			case 6:
				pizzeria.verClientes();
				break;

			case 7:
				pizzeria.buscarClientePorTelefono(sc);
				break;
				
			case 8:
				pizzeria.pizzasConIngrediente(sc);
				break;
				
			case 9:
				pizzeria.pizzasSinIngrediente(sc);
				break;
				
			case 10:
				pizzeria.verPedidos();
				break;
				
			case 11: 
				
				
			case 14:
				Pizza.pizzaMasCara.getPrecio();
				Pizza.pizzaMasCara.mostrarInformación();
				break;
				
			case 15:
				Pizza.pizzaMasBarata.getPrecio();
				Pizza.pizzaMasBarata.mostrarInformación();
				break;
				
			default:
                System.out.println("Opción no válida. Intenta de nuevo.");
                System.out.println("------------------------------");
                System.out.println();
                break;

			}
			
		
			
			
		}while(opcion >= 1 || opcion <=17);
		
//		public static Pedido nuevoPedido(Scanner sc) {
//			System.out.println("Dame el ID del cliente: ");
//			int cliente = sc.nextInt();
//			System.out.println("Tipo de pedido: ");
//			String tipo = sc.next().toUpperCase();
//			
//			return new Pedido(cliente, tipo);
//			
//			}
	}
	
}
	
//	public static Pizza nuevaPizza(Scanner sc) {
//		System.out.println("Nombre:");
//		String nombre = sc.next();
//		System.out.println("Ingredientes: ");
//		String ingredientes = sc.next();
//		System.out.println("Precio: ");
//		double precio = sc.nextDouble();
//
//		return new Pizza(nombre, ingredientes, precio);
//	}

//	public static Cliente nuevoCliente(Scanner sc) {
//		System.out.println("Nombre:");
//		String nombre = sc.next();
//		System.out.println("Direccion: ");
//		String direccion = sc.next();
//		System.out.println("Email: ");
//		String email = sc.next();
//		System.out.println("Telefono: ");
//		String telefono = sc.next();
//		System.out.println("Dinero disponible: ");
//		double dineroDisponible = sc.nextDouble();
//	
//		return new Cliente(nombre, direccion, email, telefono, dineroDisponible);
//		// Cambio
//	}
	
	
	

	

