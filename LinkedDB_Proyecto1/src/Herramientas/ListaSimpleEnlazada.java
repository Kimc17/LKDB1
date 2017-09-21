package Herramientas;

import org.json.simple.JSONObject;

public class ListaSimpleEnlazada {
	/**
	 * atributos de la lista, nodos hacia ambas direcciones, tamaño y nombre
	 */
	private Nodo inicio;
	private int size;
	private String name;
	
	/**
	 * Inicializa los valores de la lista
	 * @param name
	 */
	
	public ListaSimpleEnlazada( String name) {
		super();
		this.inicio = null;
		this.size = 0;
		this.name= name;
	}
	
	/**
	 * 
	 * Metodos para obtener y modificar los atributos de la lista
	 */
	
	public Nodo getInicio() {
		return inicio;
	}
	public void setInicio(Nodo inicio) {
		this.inicio = inicio;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	
	
	
	public boolean esVacia(){
		return inicio == null;
	}
	
	public void agregarAlFinal(JSONObject valor){

		Nodo nuevo = new Nodo(valor);

		nuevo.setValor(valor);

		if (esVacia()) {

			inicio = nuevo;

		} else{
			Nodo aux = inicio;

			while(aux.getSiguiente() != null){
				aux = aux.getSiguiente();
			}

			aux.setSiguiente(nuevo);
		}
		size++;
	}
	
	
	
	/**
	 * Indica si existe un elemento en especifico dentro de la lista
	 * @param referencia
	 * @return encontrado
	 */
	public boolean buscar(String referencia){
		Nodo aux = inicio;
		boolean encontrado = false;
		while(aux != null && encontrado != true){
			if (referencia == aux.getName()){
				encontrado = true;
			}
			else{
				aux = aux.getSiguiente();
			}
		}
		return encontrado;
	}
	
	
	/**
	 * retorna el elemnto que se busca dentro de la lista
	 * @param referencia
	 * @return Object
	 */
	public Object Extraer(String referencia){
		Nodo aux = inicio;
		boolean encontrado = false;
		while(aux != null && encontrado != true){
			if (referencia == aux.getName()){
				encontrado = true;
			}
			else{
				aux = aux.getSiguiente();
			}
		}
		return aux.getValor();
	}



}
