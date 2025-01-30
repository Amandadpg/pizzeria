package pizzeria;

public class Pizzeria {

	private Cliente cliente;
	private Pizza pizza;
	private Pedido pedido;
	
	public Pizzeria(Cliente cliente, Pizza pizza, Pedido pedido) {
		
		setCliente(cliente);
		setPedido(pedido);
		setPizza(pizza);
	
	}

	
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Pizza getPizza() {
		return pizza;
	}

	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	
}
