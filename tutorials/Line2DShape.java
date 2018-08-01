import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.Line;

public class Line2DShape extends Application {
        @Override
        public void start(Stage primaryStage) throws Exception {
        	//Line line = newLine(x1, y1, x2, y2);
		Double x1=100.0, y1=150.0, x2=500.0, y2=150.0;
		//Creating a line object
		Line line = new Line();
		//Setting the properties to a line
		line.setStartX(x1);
		line.setStartY(y1);
		line.setEndX(x2);
		line.setEndY(y2);
                //creating a Group object
                Group root = new Group(line);
                //Creating a Scene by passing the group object, height and width
                Scene scene = new Scene(root ,600, 300);
                //Setting the title to stage.
                primaryStage.setTitle("Line 2D Shape");
                //Adding the scene to stage
                primaryStage.setScene(scene);
                //Displaying the contents of the stage
                primaryStage.show();
        }
        public static void main(String args[]){
                launch(args);
        }
}
