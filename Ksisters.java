import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;

public class Ksisters extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		//variabili coordinate del soggetto
		Double x = 20.0, y = 10.0;
		//proporzioni fisiche del soggetto
		Double size = 50.0;
		//variabili ampiezza schermo
		Double width = 2*x + size * 8, height = 2*y + size * 8;
		//KIRIAIR
		Color colorikiria[] = {
			Color.PINK,
			Color.MAROON,
			Color.BLACK,
			Color.GREEN,
			Color.WHITE,
			Color.RED,
			Color.PURPLE
		};
		Integer kiria[][] = {
			{1, 6, 1, 1, 1, 1, 1, 1},
			{6, 1, 1, 0, 0, 1, 1, 1},
			{1, 2, 2, 0, 0, 2, 2, 1},
			{2, 3, 4, 0, 0, 4, 3, 2},
			{0, 3, 2, 0, 0, 2, 3, 0},
			{0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0},
			{1, 0, 0, 5, 5, 0, 0, 1},
		};
		//Disegno del soggetto
		Group root = new Group();
		for(int j=0 ; j < 8 ; j++) {
			for(int i=0; i < 8; i++) {
				Rectangle pixel = new Rectangle(x + j*size, y + i*size, size, size);
				pixel.setFill(colorikiria[kiria[i][j]]);
				root.getChildren().add(pixel);
			}
		}

		//Stampa tutto
		Scene scene = new Scene(root , width, height);
		primaryStage.setTitle("Ksister fan-code by LLibera");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String args[]){
		launch(args);
	}
}


