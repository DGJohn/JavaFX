package Übungen;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Stopwatch extends BorderPane implements EventHandler<ActionEvent> {

	final static int interval = 100;
	private static Timer timer = new Timer(interval);
	private static Label counterLabel = new Label("Sekunden: " + timer.getTimeString());
	private final Button exit = new Button("Exit");
	private final Button start = new Button("Start");
	private final Button stop = new Button("Stop");
	private final Button reset = new Button("Reset");

	// CONSTRUCTOR
	public Stopwatch() {

		timer.attach(this);

		reset.setPrefWidth(60);
		exit.setPrefWidth(60);
		start.setPrefWidth(60);
		stop.setPrefWidth(60);

		final HBox startStopReset = new HBox(10);
		startStopReset.getChildren().addAll(start, stop, reset, exit);
		startStopReset.setAlignment(Pos.CENTER);

		final HBox bottom = new HBox();
		final Label bottomLabel = new Label("Stopped");
		bottom.getChildren().addAll(bottomLabel);

		final VBox vBoxBottom = new VBox(5);
		vBoxBottom.getChildren().addAll(startStopReset, bottom);

		// EVENTHANDLER
		start.addEventHandler(ActionEvent.ACTION, new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				timer.start();
				start.setDisable(true);
				stop.setDisable(false);
				bottomLabel.setText("Running");

			}
		});
		// Handler mit Anonymer Klasse umgesetzt
		stop.addEventHandler(ActionEvent.ACTION, new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				timer.stop();
				start.setDisable(false);
				stop.setDisable(true);
				bottomLabel.setText("Stopped");

			}
		});
		// this.getOnContextMenuRequested().setOnAction
		reset.addEventHandler(ActionEvent.ACTION, new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				timer.stop();
				timer.reset();
				start.setDisable(false);
				bottomLabel.setText("Stopped");
			}
		});

		exit.addEventHandler(ActionEvent.ACTION, new EventHandler<Event>() {

			@Override
			public void handle(Event event) {
				// TODO Auto-generated method stub
				System.exit(interval);
			}
		});

		this.setPrefHeight(300);
		this.setPrefWidth(300);
		this.setCenter(counterLabel);
		this.setBottom(vBoxBottom);
	}

	/**
	 * Update Method
	 */
	public void update() {
		// TODO Auto-generated method stub
		/*
		 * Platform.runLater(new Runnable(){
		 * 
		 * @
		 * 
		 * });
		 */
		counterLabel.setText("Sekunden: " + timer.getTimeString());
	}

	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub
	}
}

/*
 * final static int interval = 100; private static Timer timer = new
 * Timer(interval); private static Label counterLabel = new Label("Sekunden: " +
 * timer.getTimeString());
 * 
 * // Konstruktor public Stopwatch() throws Exception {
 * 
 * 
 * timer.attach(this); // timer importieren
 * 
 * 
 * 
 * // HBox with final HBox stopped = new HBox(10); // Abstand zwischen einzelnen
 * Buttoms final Label label1 = new Label("Stopped");
 * stopped.getChildren().addAll(label1);
 * 
 * // HBox with Buttons final HBox startStopReset = new HBox(); final Button
 * start = new Button("Start"); final Button stop = new Button("Stop"); final
 * Button reset = new Button("Reset");
 * startStopReset.getChildren().addAll(start, stop, reset);
 * startStopReset.setAlignment(Pos.CENTER);
 * 
 * // VBox with Bottoms and Stopped sign final VBox vbox = new VBox();
 * vbox.getChildren().addAll(startStopReset, stopped);
 * 
 * // Event Handler Start
 * 
 * start.addEventHandler(ActionEvent.ACTION, new EventHandler<Event>() { //
 * Anonyme Klasse
 * 
 * @Override public void handle(Event event) {
 * 
 * start.setDisable(true); stop.setDisable(false); label1.setText("Running");
 * timer.start(); } }
 * 
 * );
 * 
 * // Event Handler Stop
 * 
 * stop.addEventHandler(ActionEvent.ACTION, new EventHandler<Event>(){
 * 
 * @Override public void handle(Event event){
 * 
 * stop.setDisable(true); stop.setDisable(false); label1.setText("Stopped");
 * timer.stop(); }
 * 
 * }
 * 
 * );
 * 
 * // Event Handler Reset
 * 
 * reset.addEventHandler(ActionEvent.ACTION, new EventHandler<Event>(){
 * 
 * @Override public void handle(Event event){ reset.setDisable(true);
 * reset.setDisable(false); label1.setText("Reset"); timer.reset(); }
 * 
 * }
 * 
 * );
 * 
 * 
 * this.setPrefHeight(300); this.setPrefWidth(300);
 * this.setCenter(counterLabel); this.setBottom(vbox);
 * 
 * }
 * 
 * 
 * public void update() {
 * 
 * counterLabel.setText("Sekunden: " + timer.getTimeString());
 * 
 * }
 * 
 * @Override public void handle(ActionEvent event) {
 * 
 * }}
 */
