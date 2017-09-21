package Controller;

	import java.io.File;
	import java.io.FileWriter;
	import java.io.IOException;

	import org.json.simple.JSONObject;

	import Herramientas.ListaCircularDoble;
	import Herramientas.ListaDobleEnlazada;
	import Herramientas.ListaSimpleEnlazada;

	public class Data {
		
		
		
		
		/** lista que almacena todas las otras listas*/
		public ListaDobleEnlazada Stores;

		/**
		 * Constructor que inicializa la lista Stores
		 */
		public Data() {
			Stores= new ListaDobleEnlazada("Stores");
			
		}

		/**
		 * 
		 * @return Lista Doble Enlazada
		 */
		public  ListaDobleEnlazada getStores() {
			return Stores;
		}
		/**
		 * 
		 * @param stores
		 */
		public void setStores(ListaDobleEnlazada stores) {
			Stores = stores;
		} 
		

		/**
		 * método que crea la carpeta que actuara como store
		 * @param name
		 */
		 public void NewStore(String name) {
		        try {
		            File directorio = new File("Data\\" + name);
		            directorio.mkdirs();
		            AddStore(name);
		   
		        } catch (Exception e) {
		        }
		 }
		        
		                
		 /**
		  * método que añade la carpeta a la lista de Stores
		  * @param valor
		  */              

		public  void AddStore(String valor) {
			
			if (Stores.buscar(valor)) {

				System.out.println("Ya estaba creado");

			}else {
				System.out.println("Creare el directorio");
				ListaCircularDoble nueva= new ListaCircularDoble(valor);
				Stores.agregarAlFinal(nueva);
			}
		}


		/**
		 * metodo que añade el documento a la lista circular de su store respectivo
		 * @param doc
		 * @param store
		 */
		private void AddDocumento(String doc, String store) {
			if(Stores.buscar(store)) {
				ListaCircularDoble lista= Stores.Extraer(store);
				if (lista.buscar(doc)) {
					System.out.println("Ya existe en la lista Stores");
				}else {
					ListaSimpleEnlazada nueva= new ListaSimpleEnlazada(doc);
					lista.InsertarAlFinal(nueva);
				}
			}
			else {
				System.out.println("No se encontro en el Store");
			}
		}
		
		/**
		 * Metodo que crea el archivo que actuara como documento dentro de la carpeta especificada
		 * @param name
		 * @param Store
		 */
		public void CrearDocumento(String name, String Store){
			System.out.println("Data\\"+Store+"\\"+name+"\\");
			File fichero = new File ("Data\\"+Store+"\\"+name+"\\");
			try {
				if (fichero.exists()) {
					System.out.println("Ya existe el documento");


				}else {
					fichero.createNewFile();
					System.out.println("Se creó documento");}
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			AddDocumento(name, Store);
			
		}
		
		
		/**
		 * metodo que crea el objeto tipo JSON
		 * @param name
		 * @param tipo
		 * @param llave
		 * @param requerido
		 * @param valor
		 * @param documento
		 * @param store
		 */
		public  void NuevoObjeto(String name, String tipo, String llave, boolean requerido, Object valor, String documento, String store) {
			JSONObject obj = new JSONObject();
			obj.put("name", name);
			obj.put("tipo", tipo);
			obj.put("llave", llave);
			obj.put("requerido", requerido);
			obj.put("valor", valor);
			AddObjetos( documento,store, obj);
			System.out.println(obj);;
			
			try (FileWriter file = new FileWriter("Data\\"+store+"\\"+documento+"\\")){
				file.write(obj.toJSONString());
	            file.flush();
	            
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		}
		
		
		public void Commit() {
			Commit nueva= new Commit();
			nueva.GuardarDatos(Stores);
			
			
		}
		
		/**
		 * Metodo que añade el objeto a la lista simple del documento respectivo
		 * @param doc
		 * @param store
		 * @param objeto
		 */
		private void AddObjetos( String doc,String store, JSONObject objeto) {
			if(Stores.buscar(store)) {
				ListaCircularDoble lista= Stores.Extraer(store);
				System.out.println("Ya existe en la lista de Stores");
				if (lista.buscar(doc)) {
					ListaSimpleEnlazada lista2=lista.Extraer(doc);
					System.out.println("Ya existe en la lista de documentos");	
					lista2.agregarAlFinal(objeto);
				}
				else {
					System.out.println("No se encuentra en la lista de documentos");
				}
			}
			else {
				System.out.println("No se encuentra en la lista de Stores");
			}
		}
		
	}
