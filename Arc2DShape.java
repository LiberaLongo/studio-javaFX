import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.Arc;

public class Arc2DShape extends Application {
        @Override
        public void start(Stage primaryStage) throws Exception {
		Double centerX=100.0, centerY=100.0, radiusX=50.0, radiusY=70.0, startAngle=0.0, lenght=90.0;
		//Creating an Arc whit all its caracteristics
		Arc arc = new Arc(centerX, centerY, radiusX, radiusY, startAngle, lenght);
                //Creating a Group object
                Group root = new Group(arc);
                //Creating a Scene by passing the group object, height and width
                Scene scene = new Scene(root ,600, 300);
                //Setting the title to stage.
                primaryStage.setTitle("Arc 2D Shape");
                //Adding the scene to stage
                primaryStage.setScene(scene);
                //Displaying the contents of the stage
                primaryStage.show();
        }
        public static void main(String args[]){
                launch(args);
        }
}
