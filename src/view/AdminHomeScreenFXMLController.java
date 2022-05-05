package view;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;

import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

import java.net.URL;
import java.util.ResourceBundle;

public class AdminHomeScreenFXMLController implements Initializable
{
  //when we implement Initializable, these private fields are initialized automatically internally
  @FXML private TabPane adminTabPane;
  @FXML private Tab addQuizTab;
  @FXML private Tab addStudentTab;


  /**
   * The initialize function is called first automatically when the FXML file is loaded
   *
   * @param url The location used to resolve relative paths for the root object, or
   * null if the location is not known.
   * @param resourceBundle This is a resource bundle that contains the resources
   * for the controller.
   */
  //Whenever scene is opened, the initialize method is called first
  @Override
  public void initialize(URL url, ResourceBundle resourceBundle)
  {
    quizTab();
  }

  public void quizTab()
  {
    try{
      //We can use Parent or Node as preferred
        Node node = FXMLLoader.load(getClass().getResource("addQuizFXML.fxml"));
        addQuizTab.setContent(node);

    }
    catch (Exception e)
    {
      e.printStackTrace();
    }

  }


}
