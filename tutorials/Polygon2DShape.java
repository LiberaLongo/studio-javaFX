import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;

public class Polygon2DShape extends Application {
        @Override
        public void start(Stage primaryStage) throws Exception {
		//Creating a Polygon object
		Polygon polygon = new Polygon();
		polygon.getPoints().addAll(new Double []{
			200.0, 50.0,
			400.0, 50.0,
			450.0, 150.0,
			400.0, 250.0,
			200.0, 250.0,
			150.0, 150.0,
		});
                //creating a Group object
                Group root = new Group(polygon);
                //Creating a Scene by passing the group object, height and width
                Scene scene = new Scene(root ,600, 300);
                //Setting the title to stage.
                primaryStage.setTitle("Polygone");
                //Adding the scene to stage
                primaryStage.setScene(scene);
                //Displaying the contents of the stage
                primaryStage.show();
        }
        public static void main(String args[]){
                launch(args);
        }
}
