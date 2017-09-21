package Herramientas;

public class NodoCD {
	/**
	 * Atributos del nodo, nombre y referencias
	 */
	NodoCD siguiente;
	NodoCD anterior;
	ListaSimpleEnlazada valor;
	String name;
	/**
	 * Inicialia los valores de los atributos
	 * @param valor
	 */
	public NodoCD( ListaSimpleEnlazada valor) {
		this.siguiente = null;
		this.anterior = null;
		this.valor = valor;
		this.name = valor.getName();
	}
	
	/**
	   * metodos que retornan o modifican los valores del nodo 
	   * 
	   */

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
