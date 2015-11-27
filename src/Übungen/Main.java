package Übungen;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		final Stopwatch gui = new Stopwatch();
		
		Scene scene = new Scene(gui);
		primaryStage.setTitle("Stopwatch");
		primaryStage.setScene(scene);
		primaryStage. show ();
	}
		
	public static void main(String[] args) {
		launch(args);
	}

}
	/*
	@Override
	public void start(Stage stage) throws Exception {
	
		final Stopwatch swatch = new Stopwatch();
		
		// Set up the stage
		Scene scene = new Scene(swatch);
		stage.setTitle("Stopwatch");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

	

}*/
