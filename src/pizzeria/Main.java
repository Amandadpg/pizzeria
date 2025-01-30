package pizzeria;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("prueba");
		
		Pizza pizza1 = new Pizza("Margarita", "Tomate, Mozzarella, Albahaca", 8.99);
		Pizza pizza2 = new Pizza("Pepperoni", "Tomate, Mozzarella, Pepperoni", 10.99);
		Pizza pizza3 = new Pizza("Cuatro Quesos", "Mozzarella, Gorgonzola, Parmesano, Cheddar", 11.99);
		Pizza pizza4 = new Pizza("Hawaiana", "Tomate, Mozzarella, Jamón, Piña", 9.99);

		pizza1.mostrarInformación();
		

	}

}
