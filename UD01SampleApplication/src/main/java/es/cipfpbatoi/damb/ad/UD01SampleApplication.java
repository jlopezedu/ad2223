package es.cipfpbatoi.damb.ad;

import es.cipfpbatoi.damb.ad.ventanas.VentanaPrincipal;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class UD01SampleApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
    	new VentanaPrincipal(primaryStage).pintarVentana();
    }

    public static void main(String[] args) {
        launch();
    }

}