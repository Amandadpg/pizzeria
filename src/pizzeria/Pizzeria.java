package pizzeria;

import java.util.ArrayList;
import java.util.List;

public class Pizzeria {

	private List<Cliente> cliente;
	private List<Pizza> pizza;
	private List<Pedido> pedido;
	
	public Pizzeria() {
		
		this.cliente = new ArrayList<Cliente>();
		this.pizza = new ArrayList<Pizza>();
		this.pedido = new ArrayList<Pedido>();
		
	}

 public void addPizza(Pizza p){
	 if(p == null){
		throw new IllegalArgumentException("La pizza no puede ser nula");
	 }
 }
	
 public void addCliente(Cliente c) {
	 if(c == null) {
		 throw new IllegalArgumentException("El cliente no puede ser nulo");
	 }
	
 }

}
