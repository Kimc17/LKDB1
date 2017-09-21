package GUI;

import java.net.URL;
import java.util.ResourceBundle;

import Controller.JsonStores;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ControllerGUI implements Initializable {
	
public TableView <Store>TableTB; 
	public void commit(){
		System.out.println("hi");
		
	}
public void table () {
	TableColumn<Documento, String> colNombre = new TableColumn<>("Nombre");
  	TableColumn<Documento, String> colApellido = new TableColumn<>("Tipo");
	TableTB.getColumns().addAll(colNombre,colApellido);
  
	colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
  	colApellido.setCellValueFactory(new PropertyValueFactory<>("tipo"));
	Data = new Data ("nombre");
	TableTB.getItems().addAll(a);
}
public void otro() {
	JsonStores a= new JsonStores("Store");
	a.NewStore("Store");
}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		table();
	}
	

}
