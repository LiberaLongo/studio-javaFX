import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Shape;
import javafx.scene.paint.Color;

public class Topolino extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		//variabili ampiezza schermo
		Double widthScene = 1000.0, heightScene = 700.0;
		//variabili coordinate del soggetto
		Double x = widthScene*1/2, y = heightScene*2/3;
		//proporzioni fisiche del soggetto
		//testa
		Double raggioTesta = 200.0;
		//orecchie
		Double distanzaOrecchie = raggioTesta*3/4;
		Double altezzaOrecchie = raggioTesta*2/3;
		Double raggioOrecchie = raggioTesta*1/2;
		//orbite
		Double distanzaOrbite = raggioTesta*1/4;
		Double radiusXOrbite = raggioTesta*1/3;
		Double radiusYOrbite = raggioTesta*1/8;
		//occhi
		Double distanzaOcchi = distanzaOrbite;
		Double radiusXOcchi = radiusXOrbite*1/2;
		Double radiusYOcchi = radiusYOrbite*1/2;
		//pupille
		Double distanzaPupille = distanzaOcchi;
		Double radiusXPupille = radiusXOcchi*1/2;
		Double radiusYPupille = radiusYOcchi*1/2;
		//bocca
		Double altezzaBocca = raggioTesta*1/2;
		Double radiusXBocca = raggioTesta*1/2;
		Double radiusYBocca = raggioTesta*1/2;
		//naso
		Double altezzaNaso = raggioTesta - altezzaBocca;
		Double radiusXNaso = raggioTesta*1/8;
		Double radiusYNaso = raggioTesta*1/10;

		//Disegno del soggetto
		Circle cranio = new Circle(x, y, raggioTesta);
		Circle orecchioSinistro = new Circle(x-altezzaOrecchie, y-distanzaOrecchie, raggioOrecchie);
		Circle orecchioDestro = new Circle(x+altezzaOrecchie, y-distanzaOrecchie, raggioOrecchie);
		Shape orecchie = Shape.union(orecchioSinistro, orecchioDestro);
		Shape testa = Shape.union(cranio, orecchie);

		//stampa tutto
		Group topolino = new Group(testa);
		Scene scene = new Scene(topolino ,widthScene, heightScene);
		primaryStage.setTitle("Topolino");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String args[]){
		launch(args);
	}
}
