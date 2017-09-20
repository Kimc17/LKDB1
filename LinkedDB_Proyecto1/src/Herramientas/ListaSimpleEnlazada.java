package Herramientas;

import org.json.simple.JSONObject;

public class ListaSimpleEnlazada {
	private Nodo inicio;
	private int size;
	private String name;
	
	
	
	public ListaSimpleEnlazada( String name) {
		super();
		this.inicio = null;
		this.size = 0;
		this.name= name;
	}
	
	
	
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
