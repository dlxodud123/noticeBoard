package noticeBoard;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

public class movieTestMain {
	public void viewFx(Parent root) {
		Stage stage = (Stage)root.getScene().getWindow(); 
		
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("movieTest.fxml"));
			root = loader.load();
			
			testController ctrl = loader.getController();
			ctrl.setRoot(root);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
