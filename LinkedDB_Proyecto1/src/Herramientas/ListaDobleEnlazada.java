package Herramientas;

import Herramientas.ListaCircularDoble;
import Herramientas.NodoDoble;

public class ListaDobleEnlazada {

	String name;
	NodoDoble inicio;
	
	
	public ListaDobleEnlazada(String name) {
		this.name = name;
		this.size=0;
		inicio=null;
		fin= null;
	}
	
	
	
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
	

	
	
	
	
	public boolean esVacia(){
		return inicio == null;
	}
	
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

