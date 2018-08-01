import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.Ellipse;

public class Ellipse2DShape extends Application {
        @Override
        public void start(Stage primaryStage) throws Exception {
		Double centerx=200.0, centery=100.0, radiusX=100.0, radiusY=50.0;
		Ellipse ellipse = new Ellipse (centerx, centery, radiusX, radiusY);
                //creating a Group object
                Group root = new Group(ellipse);
                //Creating a Scene by passing the group object, height and width
                Scene scene = new Scene(root ,600, 300);
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

