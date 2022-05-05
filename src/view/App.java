package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application
{
  @Override
  public void start(Stage stage) throws Exception
  {
//    Parent root = FXMLLoader.load(App.class.getResource("/view/loginFXML.fxml"));
    Parent root = FXMLLoader.load(getClass().getResource("adminHomeScreenFXML.fxml")); //just to get rid of login while testing
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.setTitle("Quiz App");
    stage.setHeight(700);
    stage.setWidth(900);
    stage.setResizable(false);
    stage.show();
  }
}
