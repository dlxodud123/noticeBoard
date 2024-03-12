package noticeBoard;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class noticeBoardMain2 {
	public void viewFx(Parent root) {
		Stage stage = (Stage)root.getScene().getWindow(); 
		
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("boardFX.fxml"));
			System.out.println(root);
			root = loader.load();
			System.out.println(root);
			
			Controller ctrl = loader.getController();
			ctrl.setRoot(root);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		Scene scene = new Scene(root);
		
		stage.setScene(scene);
		stage.show();
	}
}
