import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class StrokeExample extends Application {
        @Override
        public void start(Stage primaryStage) {
                Double width = 1000., height = 300.;
                Text text = new Text();
                text.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 50));
                text.setText("Hello from the other side");
                text.setX(50);
                text.setY(130);
		text.setFill(Color.BROWN);
		text.setStrokeWidth(2);
		text.setStroke(Color.BLUE);
                Group root = new Group(text);
                Scene scene = new Scene(root, width, height);
                primaryStage.setTitle("Sample Text");
                primaryStage.setScene(scene);
                primaryStage.show();
        }
        public static void main(String args[]){
                launch(args);
        }
}
