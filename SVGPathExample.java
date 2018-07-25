import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.SVGPath;

public class SVGPathExample extends Application {
        @Override
        public void start(Stage primaryStage) throws Exception {
		//Creating a SVGPath object
		SVGPath svgpath = new SVGPath();

		String path = "M 100 100 L 300 100 L 200 300 z";

		//Setting the SVGPath in the form of string
		svgpath.setContent(path);
                //Creating a Group object
                Group root = new Group(svgpath);
                //Creating a Scene by passing the group object, height and width
                Scene scene = new Scene(root ,600, 300);
                //Setting the title to stage.
                primaryStage.setTitle("SVGPath");
                //Adding the scene to stage
                primaryStage.setScene(scene);
                //Displaying the contents of the stage
                primaryStage.show();
        }
        public static void main(String args[]){
                launch(args);
        }
}
