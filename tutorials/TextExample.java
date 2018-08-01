import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.text.Text;

public class TextExample extends Application {
	@Override
	public void start(Stage primaryStage) {
		Double width = 600., height = 300.;
		Text text = new Text();
		text.setText("Hello from the other side");
		text.setX(50);
		text.setY(50);
		Group root = new Group(text);
		Scene scene = new Scene(root, width, height);
		primaryStage.setTitle("Sample Text");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String args[]){
		launch(args);
	}
}
