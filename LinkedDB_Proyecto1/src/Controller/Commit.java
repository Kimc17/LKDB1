package Controller;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import Herramientas.ListaCircularDoble;
import Herramientas.ListaDobleEnlazada;
import Herramientas.ListaSimpleEnlazada;
import Herramientas.Nodo;
import Herramientas.NodoCD;
import Herramientas.NodoDoble;

public class Commit{



	public JSONObject GuardarDatos(ListaDobleEnlazada lista) {
		int cont=0;
		int cont2=0;
		int cont3=0;
		JSONObject Data= new JSONObject();
		JSONObject Store= new JSONObject();
		JSONObject Documento= new JSONObject();
		NodoDoble aux = lista.getInicio();
		ListaCircularDoble lista2= aux.getValor();
		NodoCD aux2= lista2.getInicio();
		ListaSimpleEnlazada lista3=aux2.getValor();
		Nodo aux3=lista3.getInicio();




		while(cont!= lista.getSize()) {
			Data.put("Store", aux.getName());
			while(cont2!= lista.getSize()) {
				Store.put("Documento", aux2.getName());
				while(cont3!=lista2.getSize()){
					Documento.put("Objeto", aux3.getValor());


					cont3++;
					aux3=aux3.getSiguiente();
				}
			}








			cont2 ++ ;
			aux2= aux2.getSiguiente();
		}



		cont ++;
		aux= aux.getSiguiente();
		return Data;
	}

}

