package movieTest;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.Parent;

public class testController implements Initializable{
	
	Parent root;
	MovieTestService mts;
	public void setRoot(Parent root) {
		mts.setRoot(root);
		this.root = root;
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		mts = new MovieTestServiceImpl();
	}
	
}
