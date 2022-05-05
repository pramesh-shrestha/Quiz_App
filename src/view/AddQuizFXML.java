package view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import util.MyFileHandler;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;

public class AddQuizFXML implements Initializable
{
  @FXML private TextField quizTitle;
  @FXML private TextArea question;
  @FXML private TextField option1;
  @FXML private TextField option2;
  @FXML private TextField option3;
  @FXML private TextField option4;
  @FXML private Button OK;
  @FXML private Button addQuestion;
  @FXML private Button submitQuiz;
  @FXML private RadioButton radioOption1;
  @FXML private RadioButton radioOption2;
  @FXML private RadioButton radioOption3;
  @FXML private RadioButton radioOption4;
  private ToggleGroup radioGroup;

  /**
   * The function initializes the radio buttons and calls the ok() function
   *
   * @param url The location used to resolve relative paths for the root object, or
   * null if the location is not known.
   * @param resourceBundle This is a resource bundle that contains the resources
   * for the application.
   */
  @Override
  public void initialize(URL url, ResourceBundle resourceBundle)
  {
    radioButtonSetup();
    ok();
  }

  /**
   * This function sets up the radio buttons by adding them to a toggle group
   */
  public void radioButtonSetup()
  {
    radioGroup = new ToggleGroup();
    radioOption1.setToggleGroup(radioGroup);
    radioOption2.setToggleGroup(radioGroup);
    radioOption3.setToggleGroup(radioGroup);
    radioOption4.setToggleGroup(radioGroup);
  }

  //This method must be called in initialize method above. this method will disable the quiz title once OK button is clicked
  public void ok()
  {
    OK.setOnAction(new EventHandler<ActionEvent>()
    {
      @Override public void handle(ActionEvent event)
      {

        if(quizTitle.getText().trim().isEmpty())
        {
          quizTitle.setDisable(false);
          Alert alert = new Alert(Alert.AlertType.WARNING);
          alert.setContentText("Quiz title cannot be empty");
          alert.showAndWait();
        }
        else
        {
          quizTitle.setDisable(true);
        }
      }
    });
  }

  //Instead of above method we could do it like this easily

  //  public void buttonToDisableQuizTitle(ActionEvent event)
  //  {
  //     if(!quizTitle.getText().trim().isEmpty())
  //        {
  //          quizTitle.setDisable(true);
  //        }
  //  }

  /**
   * When the edit button is clicked, the quiz title text field is enabled
   *
   * @param event The event that triggered the method.
   */
  public void edit(ActionEvent event)
  {
    quizTitle.setDisable(false);
  }

  public boolean validateQuestion()
  {
    // This is checking if any of the text fields are empty. If they are, it will
    // display an alert.
    if(quizTitle.getText().isEmpty() || question.getText().isEmpty()
        || option1.getText().isEmpty() || option2.getText().isEmpty()
        || option3.getText().isEmpty() || option4.getText().isEmpty())
    {
      Alert alert = new Alert(Alert.AlertType.WARNING);
      alert.setContentText("All fields are required");
      alert.showAndWait();
      return false;
    }
    else
    {
      // This is checking if the user has selected an answer. If they haven't, it
      // will display an alert.
      if(radioGroup.getSelectedToggle() == null)
      {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Please select an answer");
        alert.showAndWait();
        return false;
      }
    }
    return true;
  }

  /**
   * If the user hasn't entered any text into the text fields, or hasn't selected
   * an answer, display an alert
   *
   * @param event This is the event that is triggered when the user clicks the
   * button.
   */
  @FXML
  private void addQuestion(ActionEvent event)
  {
    //creating HashMap object so that we can store question as key and options as String array
    HashMap<String, String[]> quizQuestion = new HashMap<>();
    String[] option = new String[5];

    //if validateQuestion() return true, we save the question and answer to the HashMap
    boolean valid = validateQuestion();
    if(valid)
    {
      option[0] = option1.getText();
      option[1] = option2.getText();
      option[2] = option3.getText();
      option[3] = option4.getText();
      //for the answer, because it is a radio button type, we must first check which one is selected and then
      //set the selected radio button in option[4].
      if(radioOption1.isSelected())
      {
        option[4] = option1.getText();
      }
      else if(radioOption2.isSelected())
      {
        option[4] = option2.getText();
      }
      else if(radioOption3.isSelected())
      {
        option[4] = option3.getText();
      }
      else
      {
        option[4] = option4.getText();
      }
      //this will add the question to the map
      quizQuestion.put(question.getText(),option);

      //this will notify that the question has been added and clear all the fields
      Alert alert = new Alert(Alert.AlertType.INFORMATION);
      alert.setContentText("Question added.");
      alert.showAndWait();
      question.clear();
      option1.clear();
      option2.clear();
      option3.clear();
      option4.clear();
      radioGroup.getToggles().clear();
    }
  }
  @FXML
  private void submitQuiz(ActionEvent event) throws IOException
  {
//    Object[] obj = new Object[6];
//    obj[0] = quizTitle.getText();
//    obj[1] = question.getText();
//    obj[2] = option1.getText();
//    obj[3] = option2.getText();
//    obj[4] = option3.getText();
//    obj[5] = option4.getText();
//
//    MyFileHandler.writeArrayToBinaryFile("quiz.bin",obj);
  }
}
