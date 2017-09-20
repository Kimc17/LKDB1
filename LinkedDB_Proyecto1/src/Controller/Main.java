package Controller;

import java.io.IOException;

public class Main {
public static void main(String[] args) throws IOException {
		
	Data Store1= new Data();

	Store1.NewStore("TEC");
	Store1.NewStore("UCR");
	Store1.NewStore("UNA");
	Store1.CrearDocumento("Fisica","TEC");
	Store1.CrearDocumento("Calculo","TEC");
	System.out.println("Hello");
	Store1.NuevoObjeto("kim", "hola", "foranea", true, 78, "Fisica", "TEC");
	System.out.println("Hello");
	Store1.NuevoObjeto("lala", "tipo", "llave", false, "valor", "Calculo", "TEC");
	System.out.println("Hello");
	System.out.println("Holaaa");

}
}

