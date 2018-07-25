import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class JavafxSample extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		//creating a Group object
		Group root = new Group();

		//Creating a Scene by passing the group object, height and width
		Scene scene = new Scene(root ,600, 300);

		//setting color to the scene
		scene.setFill(Color.BROWN);

		//Setting the title to stage.
		primaryStage.setTitle("Simple Application");

		//Adding the scene to stage
		primaryStage.setScene(scene);

		//Displaying the contents of the stage
		primaryStage.show();
	}

	public static void main(String args[]){
		launch(args);
	}
}
