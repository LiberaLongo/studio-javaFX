import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;
import javafx.scene.shape.Circle;

public class shapeOperations extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		//variabili ampiezza schermo
		Double width = 600.0, height = 300.0;
		//variabili
		Double x = width/2, y=height/2;
		Double distanza = height/3;
		Double raggio = height/2;
		//cosa voglio disegnare
		Circle rosso = new Circle(x - distanza, y, raggio);
		rosso.setFill(Color.RED);
		Circle blu = new Circle(x + distanza, y, raggio);
		blu.setFill(Color.BLUE);
		Shape viola = Shape.intersect(rosso, blu);
		viola.setFill(Color.PURPLE);
		//Stampa tutto
		Group root = new Group(rosso, blu, viola);
		Scene scene = new Scene(root , width, height);
		primaryStage.setTitle("Simple Application");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String args[]){
        	launch(args);
	}
}

