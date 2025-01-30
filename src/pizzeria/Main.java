package pizzeria;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("prueba");
		
		Pizza pizza1 = new Pizza("Margarita", "Tomate, Mozzarella, Albahaca", 8.99);
		Pizza pizza2 = new Pizza("Pepperoni", "Tomate, Mozzarella, Pepperoni", 10.99);
		Pizza pizza3 = new Pizza("Cuatro Quesos", "Mozzarella, Gorgonzola, Parmesano, Cheddar", 11.99);
		Pizza pizza4 = new Pizza("Hawaiana", "Tomate, Mozzarella, Jamón, Piña", 9.99);

		pizza1.mostrarInformación();
		
		
		
		
		Cliente cliente1 = new Cliente("Juan Pérez", "Calle Falsa 123", "juan.perez@example.com", "234568952", 1500.50);
        Cliente cliente2 = new Cliente("Ana Gómez", "Av. Siempre Viva 456", "ana.gomez@example.com", "258764523", 3000.00);
        Cliente cliente3 = new Cliente("Carlos López", "Plaza Central 789", "carlos.lopez@example.com", "235012485", 500.25);
        Cliente cliente4 = new Cliente("María Rodríguez", "Boulevard Principal 321", "maria.rodriguez@example.com", "259630148", 2500.75);
        
        cliente1.Info();
        
      
        
        LocalDate fechaPedido1 = LocalDate.of(2024, 1, 25);
        
        Pedido pedido1 = new Pedido(cliente1, 250.75, "DOMICILIO");
        
        pedido1.mostrarInformacion();
       
        

	}

}
