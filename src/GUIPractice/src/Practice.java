//import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.geometry.Pos;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.layout.VBox;
//import javafx.stage.Stage;
//
//public class Practice extends Application
//{
//  private Button button;
//  public void start(Stage stage)
//  {
//    button = new Button("Click  me");
//    VBox root  = new VBox();
//    root.getChildren().add(button);
//    root.setAlignment(Pos.CENTER);
//    button.setOnAction(new EventHandler<ActionEvent>()
//    {
//      @Override public void handle(ActionEvent event)
//      {
//        System.out.println("Clicked");
//      }
//    });
//
//    Scene scene =  new Scene(root);
//    stage.setScene(scene);
//    stage.setWidth(400);
//    stage.setHeight(300);
//
//    stage.show();
//  }
//}
