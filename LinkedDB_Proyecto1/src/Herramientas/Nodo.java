package Herramientas;

import org.json.simple.JSONObject;

public class Nodo {

	public Nodo(JSONObject valor) {
		this.valor = valor;
			siguiente=null;
		
	}
		private JSONObject valor;
	    private String name;
	    private Nodo siguiente;
	    
	    
		public Nodo getSiguiente() {
			return siguiente;
		}
		
		
		public void setSiguiente(Nodo siguiente) {
			this.siguiente = siguiente;
		}
	
		
		public JSONObject getValor() {
			return valor;
		}
		
		public void setValor(JSONObject valor) {
			this.valor=valor;
		}
		
		
		public String getName() {
			return name;
		}
	    
		public void setName(String name) {
			this.name= name;
		}
	    

	  
	}
	  



