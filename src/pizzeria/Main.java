package pizzeria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		menu();
	
		
		
		
		
		
		
	}
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
//			pizzeria.addPizza(pepperoni);
//		
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
				Pedido pe = Pedido.nuevoPedido(sc, pizzeria);
				pizzeria.addPedido(pe);
				
				int p1;

				do {

					System.out.println("¿Qué pizza quieres añadir?");
					pizzeria.verPizzas();

					System.out.println("Si no quieres añadir más pizzas presiona 0.");
					p1 = sc.nextInt();
					if (p1 != 0) {
						Pizza pizza = pizzeria.buscarPizzaId(p1);
						
						if(pizza != null) {
							pe.addPizzaPedido(pizza);
						}
					}

				} while (p1 != 0);
				do {
					System.out.println("¿Que pizza quieres eliminar?");
					pe.mostrarPizzaPedido();
					System.out.println("Si no quieres eliminar las pizzas, pulsa 0. ");
					p1 = sc.nextInt();
					if (p1 != 0) {
						Pizza pizza = pizzeria.buscarPizzaId(p1);
						if(pizza != null) {
							pe.deletePizzaPedido(pizza);
						}
					}

				} while (p1 != 0);
				
//				if(Cliente.getDineroDisponible >= Pedido.getTotal) {
//					Cliente.getDineroDisponible -= Pedido.total;
//				}
				
				break;
				 
			case 4:
				
				pizzeria.verPizzas();
				
				break;
				
		
			case 5:
			
				pizzeria.mostrarPedido();
				
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
				
				pizzeria.mostrarPedidosHoy();
				
				break;
		
				
			case 11: 
				pizzeria.mostrarPedidosLocal();
				break;
				
			case 12:
				pizzeria.mostrarPedidosRecoger();
				break;
				
			case 13:
				pizzeria.mostrarPedidosDomicilio();
				break;
				
			case 14:
				
				Pizza.pizzaMasCara.getPrecio();
				Pizza.pizzaMasCara.mostrarInformación();
				
				break;
				
			case 15:
				
				Pizza.pizzaMasBarata.getPrecio();
				Pizza.pizzaMasBarata.mostrarInformación();
				
				break;
			
			case 16:
				pizzeria.mostrarUltimoPedido();	
				
				break;
			
			case 17:
				
				System.out.println("Saliendo del programa, ¡Que aproveche!");
				
				break;
			
			default:
                System.out.println("Opción no válida. Intenta de nuevo.");
                System.out.println("------------------------------");
                System.out.println();
                break;

			}
			
		
			
			
		}while(opcion !=17);
	}
		
//		public static Pedido nuevoPedido(Scanner sc, Pizzeria p) {
//			System.out.println("Dame el ID del cliente: ");
//			int idCliente = sc.nextInt();
//			Cliente cliente = p.buscarClientePorId(idCliente);
//			
//			System.out.println("Tipo de pedido: ");
//			String tipo = sc.next().toUpperCase();
//			
//			
//			return new Pedido(cliente, tipo);
//		}
		{
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
	
	
	

	

