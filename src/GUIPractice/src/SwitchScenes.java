import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SwitchScenes extends Application
{
  private Button button1;
  private Button button2;
  private Scene scene1;
  private Scene scene2;
  private Stage stage;
  public void start(Stage stage) throws Exception
  {
    button1 = new Button("Go to scene 2");
    button1.setOnAction(new Listener());
    button2 = new Button("Go to scene 1");
    button2.setOnAction(new Listener());
    VBox layout1 = new VBox();
    layout1.getChildren().addAll(button1);
    scene1 = new Scene(layout1);
    VBox layout2 = new VBox();
    layout2.getChildren().add(button2);
    scene2 = new Scene(layout2);

    this.stage = stage;

    stage.setScene(scene2);
    stage.show();

  }

  private class Listener implements EventHandler<ActionEvent>
  {

    @Override public void handle(ActionEvent event)
    {
      if(event.getSource() == button1)
      {
        stage.setScene(scene2);
      }
      if(event.getSource() == button2)
      {
        stage.setScene(scene1);
      }

    }
  }
}
