package ch.math.view;

import ch.hfict.math.Statistics;
import ch.hfict.math.StatisticsImpl;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
//import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainDialog extends Application implements EventHandler<ActionEvent> {
  
  Statistics statistics = new StatisticsImpl();
  TextField textField = new TextField();
  
  public MainDialog() { 
    for(double x : new double [] {1.0, 2.0, 3.0}) {
      statistics.addNumber(x);
    }
  }
  
  @Override
  public void start(Stage stage) throws Exception {
    //Label hello = new Label("Hello JavaFX");
    
    Button calcButton = new Button("Calculate");
    calcButton.setOnAction(this);
    
    StackPane root = new StackPane();
    root.getChildren().add(textField);
    root.getChildren().add(calcButton);

    stage.setScene(new Scene(root, 300, 150));
    stage.setTitle("Hello JavaFX");
    stage.show();
  }
  
  public static void main(String[] args) {
    launch(args);
    // TODO Herausfinden, wie Statistics Klasse implementiert werden kann

  }

  @Override
  public void handle(ActionEvent arg0) {
    // TODO Auto-generated method stub
    String result = String.valueOf(statistics.getAverage());
    textField.setText(result);
  }

}
