package noticeBoard;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Controller implements Initializable{
	@FXML public ImageView imageProfile;
	@FXML public ImageView movie1Profile;
	@FXML public ImageView movie2Profile;
	@FXML public ImageView movie3Profile;
	@FXML public ImageView movie4Profile;
	@FXML public Label idName;
	@FXML public Label movie1Name;
	@FXML public Label movie2Name;
	@FXML public Label movie3Name;
	@FXML public Label movie4Name;
	
	ObservableList<String> imageArr;
	String path;
	String path1;
	Parent root;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		path1 = Paths.get("").toAbsolutePath().toString();
		path1 += "/src/resources/image";
		String basicStr = "file:/" + path1 + "/profile.png";
		
		//File file = new File(path + "/" + imageArr.get(index));
		//System.out.println(file.toURI().toString());
		Image basicImg = new Image(basicStr);
		imageProfile.setImage(basicImg);
		
		page1();
	}
	public void page1() {
		path = Paths.get("").toAbsolutePath().toString();
		path += "/src/resources/images";
		
		imageArr = FXCollections.observableArrayList();
		File fileList = new File(path);
		imageArr = FXCollections.observableArrayList();
		for(String p : fileList.list() ) {
			//System.out.println(p);
			imageArr.add(p);
		}
		// 6
		int mok = imageArr.size() / 4; // 1
		int nmg = imageArr.size() % 4; // 2
		if (mok >= 1) {
			for (int i = 0; i < 4; i++) {
				String str = "file:/" + path + "/" + imageArr.get(i);
				//System.out.println(imageArr.get(i));
				Image img = new Image(str);
				if (i == 0) {
					movie1Profile.setImage(img);
					movie1Name.setText(imageArr.get(i));
				}else if (i == 1) {
					movie2Profile.setImage(img);
					movie2Name.setText(imageArr.get(i));
				}else if (i == 2) {
					movie3Profile.setImage(img);
					movie3Name.setText(imageArr.get(i));
				}else {
					movie4Profile.setImage(img);
					movie4Name.setText(imageArr.get(i));
				}
			}
		}else {
			for (int i = 0; i < nmg; i++) {
				String str = "file:/" + path + "/" + imageArr.get(i);
				Image img = new Image(str);
				if (i == 0) {
					movie1Profile.setImage(img);
					movie1Name.setText(imageArr.get(i));
				}else if (i == 1) {
					movie2Profile.setImage(img);
					movie2Name.setText(imageArr.get(i));
				}else if (i == 2) {
					movie3Profile.setImage(img);
					movie3Name.setText(imageArr.get(i));
				}else {
					movie4Profile.setImage(img);
					movie4Name.setText(imageArr.get(i));
				}
			}
		}
	}
	public void page2() {
		int mok = imageArr.size() / 4; 
		int nmg = imageArr.size() % 4; 
		path = Paths.get("").toAbsolutePath().toString();
		path += "/src/resources/images";
		
		imageArr = FXCollections.observableArrayList();
		File fileList = new File(path);
		imageArr = FXCollections.observableArrayList();
		for(String p : fileList.list() ) {
			//System.out.println(p);
			imageArr.add(p);
		}
		if (mok >= 2) {
			for (int i = 4; i < 8; i++) {
				String str = "file:/" + path + "/" + imageArr.get(i);
				Image img = new Image(str);
				if (i == 4) {
					movie1Profile.setImage(img);
					movie1Name.setText(imageArr.get(i));
				}else if (i == 5) {
					movie2Profile.setImage(img);
					movie2Name.setText(imageArr.get(i));
				}else if (i == 6) {
					movie3Profile.setImage(img);
					movie3Name.setText(imageArr.get(i));
				}else {
					movie4Profile.setImage(img);
					movie4Name.setText(imageArr.get(i));
				}
			}
		}else {
			for (int i = 4; i < 4 + nmg; i++) {
				String str = "file:/" + path + "/" + imageArr.get(i);
				Image img = new Image(str);
				if (i == 0) {
					movie1Profile.setImage(img);
					movie1Name.setText(imageArr.get(i));
				}else if (i == 1) {
					movie2Profile.setImage(img);
					movie2Name.setText(imageArr.get(i));
				}else if (i == 2) {
					movie3Profile.setImage(img);
					movie3Name.setText(imageArr.get(i));
				}else {
					movie4Profile.setImage(img);
					movie4Name.setText(imageArr.get(i));
				}
			}
		}
	}
	public void page3() {
		int mok = imageArr.size() / 4; 
		int nmg = imageArr.size() % 4; 
		path = Paths.get("").toAbsolutePath().toString();
		path += "/src/resources/images";
		
		imageArr = FXCollections.observableArrayList();
		File fileList = new File(path);
		imageArr = FXCollections.observableArrayList();
		for(String p : fileList.list() ) {
			//System.out.println(p);
			imageArr.add(p);
		}
		if (mok >= 3) {
			for (int i = 8; i < 12; i++) {
				String str = "file:/" + path + "/" + imageArr.get(i);
				Image img = new Image(str);
				if (i == 8) {
					movie1Profile.setImage(img);
				}else if (i == 9) {
					movie2Profile.setImage(img);
				}else if (i == 10) {
					movie3Profile.setImage(img);
				}else {
					movie4Profile.setImage(img);
				}
			}
		}else {
			for (int i = 8; i < 8 + nmg; i++) {
				String str = "file:/" + path + "/" + imageArr.get(i);
				Image img = new Image(str);
				if (i == 8) {
					movie1Profile.setImage(img);
				}else if (i == 9) {
					movie2Profile.setImage(img);
				}else if (i == 10) {
					movie3Profile.setImage(img);
				}else {
					movie4Profile.setImage(img);
				}
			}
		}
	}
	
	public void watchMovieButton() {
		
	}
	
	public void movieTestButton() {
//		Stage stage = (Stage)root
//		
//		FXMLLoader loader = new FXMLLoader(getClass().getResource("movieTest.fxml"));
//		
//		Parent root = loader.load();
//		Scene scene = new Scene(root);
//		stage.setScene(scene);
//		stage.show();
		movieTestMain mtm = new movieTestMain();
		mtm.viewFx(root);
		
	}
	
	public void movie1judge() {
		
	}
	public void movie2judge() {
		
	}
	public void movie3judge() {
		
	}
	public void movie4judge() {
		
	}
	public void setRoot(Parent root) {
		this.root = root;
	}
}
