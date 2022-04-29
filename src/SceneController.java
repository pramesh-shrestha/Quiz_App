import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneController
{
  private Stage stage;
  private Scene scene;
  private FXMLLoader loader;
  @FXML private MenuItem createBooking;
  @FXML private Button backToMainPage;


  //creating methods to switch between scenes
  public void switchToMainPageScene(ActionEvent event) throws IOException
  {

    loader = new FXMLLoader();
    loader.setLocation(getClass().getResource("mainPage.fxml"));
    stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(loader.load());
    stage.setScene(scene);
    stage.show();

  }
  public void switchToCreateBookingScene(ActionEvent event) throws IOException
  {
    loader = new FXMLLoader();
    loader.setLocation(getClass().getResource("createBookingScene.fxml"));
    stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(loader.load());
    stage.setScene(scene);
    stage.show();
  }

  public void lastName(ActionEvent event)
  {

  }
}
