package Herramientas;

import Herramientas.ListaCircularDoble;
import Herramientas.NodoDoble;

public class ListaDobleEnlazada {
	/**
	 * atributos de la lista, nodos hacia ambas direcciones, tamaño y nombre
	 */
	String name;
	NodoDoble inicio;
	
	/**
	 * Inicializa los valores de la lista
	 * @param name
	 */
	public ListaDobleEnlazada(String name) {
		this.name = name;
		this.size=0;
		inicio=null;
		fin= null;
	}
	
	/**
	 * 
	 * Metodos para obtener y modificar los atributos de la lista
	 */
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public NodoDoble getInicio() {
		return inicio;
	}


	public void setInicio(NodoDoble inicio) {
		this.inicio = inicio;
	}


	public NodoDoble getFin() {
		return fin;
	}


	public void setFin(NodoDoble fin) {
		this.fin = fin;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	NodoDoble fin;
	int size;
	

	
	
	/**
	 * Indica si la lista esta vacia
	 * @return boolean
	 */
	
	public boolean esVacia(){
		return inicio == null;
	}
	
	
	
	/**
	 * Metodo que inserta al final de la lista un nuevo nodo
	 * @param valor
	 */
	public void agregarAlFinal(ListaCircularDoble valor){

		NodoDoble nuevo = new NodoDoble(valor);

		nuevo.setValor(valor);

		if (esVacia()) {

			inicio = nuevo;

		} else{
			NodoDoble aux = inicio;

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
		NodoDoble aux = inicio;
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
	 * @return ListaCircularDoble
	 */
	public ListaCircularDoble Extraer(String referencia){
		NodoDoble aux = inicio;
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

