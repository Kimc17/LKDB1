package Herramientas;

public class NodoCD {

	NodoCD siguiente;
	NodoCD anterior;
	ListaSimpleEnlazada valor;
	String name;
	
	public NodoCD( ListaSimpleEnlazada valor) {
		this.siguiente = null;
		this.anterior = null;
		this.valor = valor;
		this.name = valor.getName();
	}
	


	public NodoCD getSiguiente() {
		return siguiente;
	}
	
	
	public void setSiguiente(NodoCD siguiente) {
		this.siguiente = siguiente;
	}
	
	
	public NodoCD getAnterior() {
		return anterior;
	}
	
	
	public void setAnterior(NodoCD anterior) {
		this.anterior = anterior;
	}
	
	
	public ListaSimpleEnlazada getValor() {
		return valor;
	}
	
	public void setValor(ListaSimpleEnlazada valor) {
		this.valor = valor;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	

	
}
