package movieJudge;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class movieJudgeMain {
	
	public void viewFx(Parent root, String name, String mvpath) {
		//System.out.println(root);
		Stage stage = (Stage)root.getScene().getWindow();
		
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("movieJudge.fxml"));
			root = loader.load();
			//System.out.println(root);
			judgeController ctrl = loader.getController();
			ctrl.setRoot(root, name, mvpath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}
