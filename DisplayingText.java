import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
//import javafx.collections.ObservableList;

public class DisplayingText extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		//Creating a Text object
		Text text = new Text();
		//Setting font to the text
		text.setFont(new Font(45));
		//Setting the posizion of the text
		text.setX(50);
		text.setY(150);
		//Setting the text to be added.
		text.setText("Welcome to Tutorials point");
		//Creating a Group object
		Group root = new Group(text);
		//Retrieving the observable list object
//		ObservableList list = root.getChildren();
		//Setting the text object as a node to the group object
//		list.add(text);
		//Creating a scene object
		Scene scene = new Scene(root, 700, 300);
		//Setting title to the stage
		stage.setTitle("Sample Application");
		//Adding scene to the stage
		stage.setScene(scene);
		//Displaying the contents of the stage
		stage.show();
	}
	public static void main (String args[]) {
		launch(args);
	}
}
