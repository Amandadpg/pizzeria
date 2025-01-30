package pizzeria;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("prueba");
		
		Pizza pizza1 = new Pizza("Margarita", "Tomate, Mozzarella, Albahaca", 8.99);
		Pizza pizza2 = new Pizza("Pepperoni", "Tomate, Mozzarella, Pepperoni", 10.99);
		Pizza pizza3 = new Pizza("Cuatro Quesos", "Mozzarella, Gorgonzola, Parmesano, Cheddar", 11.99);
		Pizza pizza4 = new Pizza("Hawaiana", "Tomate, Mozzarella, Jamón, Piña", 9.99);

		pizza1.mostrarInformación();
		
		
		
		
		Cliente cliente1 = new Cliente("Juan Pérez", "Calle Falsa 123", "juan.perez@example.com", "555-1234", 1500.50);
        Cliente cliente2 = new Cliente("Ana Gómez", "Av. Siempre Viva 456", "ana.gomez@example.com", "555-5678", 3000.00);
        Cliente cliente3 = new Cliente("Carlos López", "Plaza Central 789", "carlos.lopez@example.com", "555-8765", 500.25);
        Cliente cliente4 = new Cliente("María Rodríguez", "Boulevard Principal 321", "maria.rodriguez@example.com", "555-4321", 2500.75);
        
        cliente1.Info();

	}

}
