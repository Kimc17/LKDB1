package Herramientas;

public class NodoDoble  {

	String name;
	ListaCircularDoble valor;
	private NodoDoble  siguiente;
	private NodoDoble  anterior;
	
	
	
	public NodoDoble(ListaCircularDoble valor) {
		this.name = valor.getName();
		this.valor = valor;
		this.siguiente = null;
		this.anterior = null;
	}



	public NodoDoble getSiguiente() {
		return siguiente;
	}



	public void setSiguiente(NodoDoble siguiente) {
		this.siguiente = siguiente;
	}



	public NodoDoble getAnterior() {
		return anterior;
	}



	public void setAnterior(NodoDoble anterior) {
		this.anterior = anterior;
	}



	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}



	public ListaCircularDoble getValor() {
		return valor;
	}
	
	public void setValor(ListaCircularDoble valor) {
		this.valor = valor;
	}
	
	
	


}

