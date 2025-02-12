package pizzeria;

import java.util.Scanner;

public class Pizza {
	private String nombre;
	private String ingredientes;
	private double precio;
	private int idPizza;

	private static int contadorId = 1;
	public static Pizza pizzaMasCara = null;
	public static Pizza pizzaMasBarata = null;

	public Pizza(String nombre, String ingredientes, double precio) {

		setNombre(nombre);
		setIngredientes(ingredientes);
		setPrecio(precio);
		this.idPizza = contadorId++;
		if (pizzaMasCara == null || this.precio > pizzaMasCara.precio) {
			pizzaMasCara = this;
		}
		if (pizzaMasBarata == null || this.precio < pizzaMasBarata.precio) {
			pizzaMasBarata = this;

		}
	}

	public int getId() {
		return idPizza;
	}

	public void setId(int id) {
		this.idPizza = contadorId++;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {

		if (nombre == null || nombre.isBlank()) {
			throw new IllegalArgumentException("El nombre no puede ser nulo ni estar en blanco");

		}
		this.nombre = nombre;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		if (nombre == null || nombre.isBlank()) {
			throw new IllegalArgumentException("Los ingredientes no pueden ser nulo ni estar en blanco");

		}
		this.ingredientes = ingredientes;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {

		if (precio < 0.0) {

			throw new IllegalArgumentException("El precio no puede ser negativo");

		}
		this.precio = precio;

	}

	// Métodos
	public void mostrarInformación() {
		System.out.println("Nombre pizza: " + this.nombre);
		System.out.println("Ingredientes: " + this.ingredientes);
		System.out.println("Precio: " + this.precio);

		System.out.println("------------------------------");
		System.out.println();

	}

}