package Herramientas;

public class ListaCircularDoble {
	/**
	 * atributos de la lista, nodos hacia ambas direcciones, tamaño y nombre
	 */
		
		NodoCD inicio;
		NodoCD fin;
		int size;
		String name;
		
		
		/**
		 * Inicializa los valores de la lista
		 * @param name
		 */
		public ListaCircularDoble(String name) {
			this.inicio = null;
			this.fin = null;
			this.size = 0;
			this.name = name;
		}
		
		/**
		 * 
		 * Metodos para obtener y modificar los atributos de la lista
		 */
		public NodoCD getInicio() {
			return inicio;
		}
		public void setInicio(NodoCD inicio) {
			this.inicio = inicio;
		}
		public NodoCD getFin() {
			return fin;
		}
		public void setFin(NodoCD fin) {
			this.fin = fin;
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
		
		/**
		 * Metodo que inserta al final de la lista un nuevo nodo
		 * @param valor
		 */
		public void InsertarAlFinal(ListaSimpleEnlazada valor) {
			NodoCD nuevo= new NodoCD(valor);
			nuevo.setValor(valor);
			if (inicio==null) {
				inicio=nuevo;
				inicio.setSiguiente(inicio);
				nuevo.setAnterior(fin);
				fin=nuevo;	
			}else {
				fin.siguiente=nuevo;
				nuevo.siguiente=inicio;
				nuevo.setAnterior(fin);
				fin=nuevo;
				inicio.setAnterior(fin);
					
			}	
		}
		
		
		/**
		 * Indica si existe un elemento en especifico dentro de la lista
		 * @param referencia
		 * @return encontrado
		 */
		public boolean buscar(String referencia){
			NodoCD aux = inicio;
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
		 * @param valor
		 * @return ListaSimpleEnlazada 
		 */
		public ListaSimpleEnlazada Extraer(String valor) {
			NodoCD actual= fin;
			boolean encontrado= false;
			do {
				if(actual.getName()==valor) {
					encontrado=true;
					return  actual.valor;
			
				}
				actual=actual.anterior;	
			}while(actual!= fin && encontrado != true);
			
			if (encontrado){
				System.out.println("Encontrado");	
				return null;
			}else {
				System.out.println("No encontrado");
				return null;
			}
		
		}

	}
		
