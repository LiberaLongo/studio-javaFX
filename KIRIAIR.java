import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;

public class KIRIAIR extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		//variabili coordinate del soggetto
		Double x = 0.0, y = 0.0;
		//proporzioni fisiche del soggetto
		Double size = 75.0;     //minimo altezza e larghezza diviso 8
		//variabili ampiezza schermo
		Double width = size * 8, height = size * 8;
		Color c[] = {
			Color.AQUA,	//colore eventuale sfondo
			Color.PINK,
			Color.MAROON,
			Color.BLACK,
			Color.GREEN,
			Color.WHITE,
			Color.RED,
			Color.FUCHSIA
		};
		Integer kiria[][] = {
			{2, 7, 2, 2, 2, 2, 2, 2},
			{7, 2, 2, 1, 1, 2, 2, 2},
			{2, 3, 3, 1, 1, 3, 3, 2},
			{3, 4, 5, 1, 1, 5, 4, 3},
			{1, 4, 3, 1, 1, 3, 4, 1},
			{1, 1, 1, 1, 1, 1, 1, 1},
			{1, 1, 1, 1, 1, 1, 1, 1},
			{2, 1, 1, 6, 6, 1, 1, 2},
		};
		//Disegno del soggetto
		Group root = new Group();
		for(int i=0 ; i < 8 ; i++) {
			for(int j=0; j < 8; j++) {
				Rectangle pixel = new Rectangle(x + i*size, y + j*size, size, size);
				pixel.setFill(c[kiria[j][i]]);
				root.getChildren().add(pixel);
			}
		}

		//Stampa tutto
		Scene scene = new Scene(root , width, height);
		primaryStage.setTitle("KIRIAIR EternaLove");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String args[]){
		launch(args);
	}
}


