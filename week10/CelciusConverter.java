// Jason Durant
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CelciusConverter extends Application
{	
	Label messageLbl = new Label("Farenheit: 32 Degrees");
	public static void main(String[] args)
	{
		Application.launch(args);
	}

	@Override
	public void start(Stage stage)
	{
		
		TextField textField = new TextField();
		textField.setPrefColumnCount(15);
		
		Button convBtn = new Button("_Convert");
		convBtn.setDefaultButton(true);
		convBtn.setOnAction(new EventHandler<ActionEvent>() 
		{
            @Override public void handle(ActionEvent e) 
            {
            		if(textField.getText().equals("")){
            			printMessage("Please enter a value");
            		}else {
            			float degreesCelcius = Float.parseFloat(textField.getText());
                		float farenheit = degreesCelcius * 1.8F + 32.0F;
                		printMessage("Farenheight: " + (int)farenheit + " Degrees");
            		}
            }
        });				
		
		HBox buttonBox = new HBox();
		buttonBox.getChildren().addAll(textField,convBtn);
		buttonBox.setSpacing(20);
		
		VBox root = new VBox();
		root.getChildren().addAll(buttonBox,messageLbl);
		root.setSpacing(15);
		root.setMinSize(350, 250);

		root.setStyle("-fx-padding: 10;" +
				"-fx-border-width: 2;" +
				"-fx-border-insets: 5;" +
				"-fx-border-radius: 5;");
		
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Celcius Converter");
		stage.show();
	}
	
	public void printMessage(String message)
	{
		messageLbl.setText(message);
	}
}