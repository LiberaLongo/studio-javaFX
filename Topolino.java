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
		Double x = widthScene*1/2, y = heightScene*1/2;
		//proporzioni fisiche del soggetto
		//testa
		Double raggioTesta = 200.0;
		//orecchie
		Double distanzaOrecchie = raggioTesta*3/4;
		Double altezzaOrecchie = raggioTesta*1;
		Double raggioOrecchie = raggioTesta*1/2;
		//orbite
		Double distanzaOrbite = raggioTesta*1/4;
		Double radiusXOrbite = raggioTesta*1/3;
		Double radiusYOrbite = raggioTesta*1/2;
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
		testa.setFill(Color.BLACK);
		//orbite
		Ellipse orbitaSinistra = new Ellipse(x-distanzaOrbite, y, radiusXOrbite, radiusYOrbite);
		Ellipse orbitaDestra = new Ellipse(x+distanzaOrbite, y, radiusXOrbite, radiusYOrbite);
		Shape orbite = Shape.union(orbitaSinistra, orbitaDestra);
		orbite.setFill(Color.PINK);
		//occhi
		Ellipse occhioSinistro = new Ellipse(x-distanzaOcchi, y, radiusXOcchi, radiusYOcchi);
		Ellipse occhioDestro = new Ellipse(x+distanzaOcchi, y, radiusXOcchi, radiusYOcchi);
		Shape occhi = Shape.union(occhioSinistro, occhioDestro);
		occhi.setFill(Color.WHITE);
		//pupille
		Ellipse pupillaSinistra = new Ellipse(x-distanzaPupille, y, radiusXPupille, radiusYPupille);
		Ellipse pupillaDestra = new Ellipse(x+distanzaPupille, y, radiusXPupille, radiusYPupille);
		Shape pupille = Shape.union(pupillaSinistra, pupillaDestra);
		pupille.setFill(Color.BLACK);
		//bocca
		Ellipse bocca = new Ellipse(x, y+altezzaBocca, radiusXBocca, radiusYBocca);
		bocca.setFill(Color.PINK);
		//naso
		Ellipse naso = new Ellipse(x, y+altezzaNaso, radiusXNaso, radiusYNaso);
		naso.setFill(Color.BLACK);

		//stampa tutto
		Group topolino = new Group();
		topolino.getChildren().addAll(testa, orbite, occhi, pupille, bocca, naso);
		Scene scene = new Scene(topolino ,widthScene, heightScene);
		primaryStage.setTitle("Topolino");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String args[]){
		launch(args);
	}
}
