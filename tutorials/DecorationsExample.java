import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class DecorationsExample extends Application {
        @Override
        public void start(Stage primaryStage) {
                Double width = 600., height = 300.;
                Text text1 = new Text();
                text1.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
                text1.setText("Hello from the other side");
                text1.setX(50);
                text1.setY(75);
		text1.setStrikethrough(true);
		Text text2 = new Text();
                text2.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
                text2.setText("Ciao dall'altro lato!");
                text2.setX(50);
                text2.setY(150);
		text2.setUnderline(true);

                Group root = new Group(text1, text2);
                Scene scene = new Scene(root, width, height);
                primaryStage.setTitle("Decorations Example");
                primaryStage.setScene(scene);
                primaryStage.show();
        }
        public static void main(String args[]){
                launch(args);
        }
}

