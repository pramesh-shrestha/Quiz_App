package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import modal.Credentials;

import java.io.IOException;

public class loginFXMLController
{
  @FXML private TextField adminEmail;
  @FXML private PasswordField adminPassword;
  @FXML private Button adminLoginBtn;
  @FXML private TextField studentEmail;
  @FXML private PasswordField studentPassword;
  @FXML private Button studentLoginBtn;

  public void adminLogin(ActionEvent event) throws IOException
  {
    Alert alert;

    if(adminEmail.getText().equals(Credentials.getAdminEmail()) && adminPassword.getText().equals(Credentials.getAdminPassword()))
    {
      Parent root = FXMLLoader.load(getClass().getResource("adminHomeScreenFXML.fxml"));

      //We can only have one Stage, for the same stage we want to have a new scene.
      //To do that, we need to access getWindow and cast it to the Stage because we want to provide this root to the same Stage.
      //To get getWindow we can either use one of the private fields and get it like this:
//     Stage stage = (Stage) adminEmail.getScene().getWindow();
      //Or, we can use the event, get its source, cast it to the node(node is an any control on the scene graph),
      // and then getWindow and cast it to Stage like this:
      Stage stage = (Stage) (((Node)event.getSource()).getScene().getWindow());
      Scene scene = new Scene(root);
      stage.setScene(scene);
      //resizable false will not allow users to resize the window
      stage.setResizable(true);
      stage.show();

      alert = new Alert(Alert.AlertType.CONFIRMATION);
      alert.setHeaderText(null);
      alert.setContentText("Successfully logged in");
      System.out.println("success");
    }
    else
    {
      alert = new Alert(Alert.AlertType.ERROR);
      alert.setHeaderText(null);
      alert.setContentText("Login failed");
      System.out.println("failed");
    }
    alert.showAndWait();
  }

  public void studentLogin(ActionEvent event)
  {
  }


}
