package Übungen;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class AdressFormular extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		//HBoxs1-4
		
		final HBox centerFileds5 = new HBox(10); // Abstand zwischen einzelnen Buttoms
		centerFileds5.setAlignment(Pos.TOP_LEFT);
		final Label labelTop = new Label("Adresse");
		labelTop.setPrefWidth(70);
		centerFileds5.getChildren().addAll(labelTop);
		
		final HBox centerFileds1 = new HBox(10); // Abstand zwischen einzelnen Buttoms
		//centerFileds1.setAlignment(Pos.TOP_RIGHT);
		final Label label1 = new Label("Name");
		label1.setPrefWidth(70);
		final TextField textField1 = new TextField();
		centerFileds1.getChildren().addAll(label1, textField1);
		
		final HBox centerFields2 = new HBox(10);
		//centerFields2.setAlignment(Pos.TOP_RIGHT);
		final Label label2 = new Label("Vorname");
		label2.setPrefWidth(60);
		final TextField textField2 = new TextField();
		centerFields2.getChildren().addAll(label2, textField2);
		
		final HBox centerFields3 = new HBox(10);
		//centerFields3.setAlignment(Pos.TOP_RIGHT);
		final Label label3 = new Label("Strasse");
		label3.setPrefWidth(60);
		final TextField textField3 = new TextField();
		centerFields3.getChildren().addAll(label3, textField3);
		
		final HBox centerFields4 = new HBox(10);
		centerFields4.setAlignment(Pos.TOP_RIGHT);
		final Label label4 = new Label("PlZ");
		final TextField textField4 = new TextField();
		final Label label5 = new Label("Ort");
		final TextField textField5 = new TextField();
		centerFields4.getChildren().addAll(label4, textField4, label5, textField5);
		
		//VBox1
		
		final VBox vbox1 = new VBox();
		vbox1.getChildren().addAll(centerFileds5, centerFileds1, centerFields2, centerFields3, centerFields4);
		
		
		//HBox Bottom
		
		final HBox bottomField = new HBox(10); // Abstand zwischen einzelnen Buttoms
		bottomField.setAlignment(Pos.BOTTOM_RIGHT);
		final Button start = new Button("OK");
		final Button stop = new Button("Cancel");
		bottomField.getChildren().addAll(start, stop);
		
		// BorderPane that a window shows up
		final BorderPane borderPane = new BorderPane();
		borderPane.setCenter(vbox1);
		borderPane.setBottom(bottomField);
		
	
		// Set up the stage
		Scene scene = new Scene(borderPane);
		stage.setTitle("Adress Formular");
		stage.setScene(scene);
		stage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
