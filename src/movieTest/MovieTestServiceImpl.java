package movieTest;

import javafx.scene.Parent;

public class MovieTestServiceImpl implements MovieTestService{
	Parent root;
	
	@Override
	public void setRoot(Parent root) {
		this.root = root;
	}
}
