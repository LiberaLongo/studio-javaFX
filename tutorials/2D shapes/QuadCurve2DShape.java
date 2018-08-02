import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.QuadCurve;
public class QuadCurve2DShape extends Application {
        @Override
        public void start(Stage primaryStage) throws Exception {
                Double startX=100.0, startY=220.0, controlX=250.0, controlY=0.0, endX=500.0, endY=220.0;
                //Creating a CubicCube object whit all its caracheristic
                QuadCurve quadcurve = new QuadCurve(startX, startY, controlX, controlY, endX, endY);
                //Creating a Group object
                Group root = new Group(quadcurve);
                //Creating a Scene by passing the group object, height and width
                Scene scene = new Scene(root ,600, 300);
                //Setting the title to stage.
                primaryStage.setTitle("QuadCurve 2D Shape");
                //Adding the scene to stage
                primaryStage.setScene(scene);
                //Displaying the contents of the stage
                primaryStage.show();
        }
        public static void main(String args[]){
                launch(args);
        }
}
