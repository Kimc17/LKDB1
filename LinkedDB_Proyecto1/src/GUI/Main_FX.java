package GUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main_FX extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			   Parent root = FXMLLoader.load(getClass().getResource("GUI.fxml"));
			   Scene scene = new Scene(root,800,600);
			   primaryStage.setTitle("LinkedDB");
			   primaryStage.setScene(scene);
			   primaryStage.show();
			   
			   
			  
			  } catch(Exception e) {
			   e.printStackTrace();
			  }
			 }
		
	

	public static void main(String[] args) {
		launch(args);
	}
}
