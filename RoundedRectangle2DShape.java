import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;

public class RoundedRectangle2DShape extends Application {
        @Override
        public void start(Stage primaryStage) throws Exception {
                //Rectangle rectangle = new Rectangle(x, y, width, height);
                Double x=150.0, y=75.0, width=300.0, height=150.0;
                //Drawing a Rectangle
                Rectangle rectangle = new Rectangle();
                //Setting the properties of the rectangle
                rectangle.setX(x);
                rectangle.setY(y);
                rectangle.setWidth(width);
                rectangle.setHeight(height);
		//Setting th height and width of the arc
		rectangle.setArcWidth(30.0);
		rectangle.setArcHeight(20.0);
                //Creating a Group object
                Group root = new Group(rectangle);
                //Creating a Scene by passing the group object, height and width
                Scene scene = new Scene(root ,600, 300);
                //Setting the title to stage.
                primaryStage.setTitle("Rectangle 2D Shape");
                //Adding the scene to stage
                primaryStage.setScene(scene);
                //Displaying the contents of the stage
                primaryStage.show();
        }
        public static void main(String args[]){
                launch(args);
        }
}

