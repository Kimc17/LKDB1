package Herramientas;

public class ListaCircularDoble {
		
		NodoCD inicio;
		NodoCD fin;
		int size;
		String name;
		
		
		
		public ListaCircularDoble(String name) {
			this.inicio = null;
			this.fin = null;
			this.size = 0;
			this.name = name;
		}
		
		
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
		
