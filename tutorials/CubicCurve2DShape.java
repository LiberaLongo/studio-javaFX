import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.CubicCurve;
public class CubicCurve2DShape extends Application {
        @Override
        public void start(Stage primaryStage) throws Exception {
		Double startX=100.0, startY=150.0, controlX1=400.0, controlY1=40.0, controlX2=175.0, controlY2=250.0, endX=500.0, endY=150.0;
		//Creating a CubicCube object whit all its caracheristic
		CubicCurve cubiccurve = new CubicCurve(startX, startY, controlX1, controlY1, controlX2, controlY2, endX, endY);
                //Creating a Group object
                Group root = new Group(cubiccurve);
                //Creating a Scene by passing the group object, height and width
                Scene scene = new Scene(root ,600, 300);
                //Setting the title to stage.
                primaryStage.setTitle("CubicCurve 2D Shape");
                //Adding the scene to stage
                primaryStage.setScene(scene);
                //Displaying the contents of the stage
                primaryStage.show();
        }
        public static void main(String args[]){
                launch(args);
        }
}
