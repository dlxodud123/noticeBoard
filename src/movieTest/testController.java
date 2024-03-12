package movieTest;

import java.io.File;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import movieJudge.movieJudgeDAO;
import movieJudge.movieJudgeDTO;
import noticeBoard.noticeBoardMain2;
import noticeBoard.noticeBoardMain3;

public class testController implements Initializable{
	@FXML public Label idName;
	@FXML public Label movie1Name;
	@FXML public Label movie2Name;
	@FXML public Label movie3Name;
	@FXML public Label movie4Name;
	@FXML public ImageView imageProfile;
	@FXML public ImageView movie1Profile;
	@FXML public ImageView movie2Profile;
	@FXML public ImageView movie3Profile;
	@FXML public ImageView movie4Profile;
	@FXML public Label test1Text;
	@FXML public TextArea test2Text;
	@FXML public TextArea test3Text;
	@FXML public TextArea test4Text;

	ObservableList<String> imageArr;
	Parent root;
	MovieTestService mts;
	movieJudgeDAO dao;
	ArrayList<movieJudgeDTO> arr;

	String path1;
	String path;
	String mvpath1, mvpath2, mvpath3, mvpath4;
	

	public void setRoot(Parent root) {
		System.out.println(root);
		mts.setRoot(root);
		this.root = root;
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		mts = new MovieTestServiceImpl();
		dao = new movieJudgeDAO();
		arr = dao.judgeList();
		System.out.println(arr);
		path1 = Paths.get("").toAbsolutePath().toString();
		path1 = "file:/" + path1 + "/src/resources/image" + "/profile.png";
		Image basicImg = new Image(path1);
		imageProfile.setImage(basicImg);
		
		page1();
	}
	public void watchMovieButton() {
		
	}
	public void movieTestButton() {
		
	}
	public void backButton() {
		noticeBoardMain3 mtm = new noticeBoardMain3();
		mtm.viewFx(root);
	}
	public void page1() {
		
		path = Paths.get("").toAbsolutePath().toString();
		path += "/src/resources/images";

		imageArr = FXCollections.observableArrayList();
		File filelist = new File(path);
		for (String p : filelist.list()) {
			imageArr.add(p);
		}
		int mok = imageArr.size() / 4; 
		int nmg = imageArr.size() % 4; 
		if (mok >= 1) {
			for (int i = 0; i < 4; i++) {
				String str = "file:/" + path + "/" + imageArr.get(i);
				Image img = new Image(str);
				if (i == 0) {
					//test1Text.setText(arr.get(i).getContent());
					movie1Profile.setImage(img);
					movie1Name.setText(imageArr.get(i).substring(0, imageArr.get(i).length()-4));
					mvpath1 = imageArr.get(i);
				}else if (i == 1) {
					movie2Profile.setImage(img);
					movie2Name.setText(imageArr.get(i).substring(0, imageArr.get(i).length()-4));
					mvpath2 = imageArr.get(i);
				}else if (i == 2) {
					movie3Profile.setImage(img);
					movie3Name.setText(imageArr.get(i).substring(0, imageArr.get(i).length()-4));
					mvpath3 = imageArr.get(i);
				}else {
					movie4Profile.setImage(img);
					movie4Name.setText(imageArr.get(i).substring(0, imageArr.get(i).length()-4));
					mvpath4 = imageArr.get(i);
				}
			}
		}else {
			for (int i = 0; i < nmg; i++) {
				String str = "file:/" + path + "/" + imageArr.get(i);
				Image img = new Image(str);
				if (i == 0) {
					movie1Profile.setImage(img);
					movie1Name.setText(imageArr.get(i).substring(0, imageArr.get(i).length()-4));
					mvpath1 = imageArr.get(i);
				}else if (i == 1) {
					movie2Profile.setImage(img);
					movie2Name.setText(imageArr.get(i).substring(0, imageArr.get(i).length()-4));
					mvpath2 = imageArr.get(i);
				}else if (i == 2) {
					movie3Profile.setImage(img);
					movie3Name.setText(imageArr.get(i).substring(0, imageArr.get(i).length()-4));
					mvpath3 = imageArr.get(i);
				}else {
					movie4Profile.setImage(img);
					movie4Name.setText(imageArr.get(i).substring(0, imageArr.get(i).length()-4));
					mvpath4 = imageArr.get(i);
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
					movie1Name.setText(imageArr.get(i).substring(0, imageArr.get(i).length()-4));
					mvpath1 = imageArr.get(i);
				}else if (i == 5) {
					movie2Profile.setImage(img);
					movie2Name.setText(imageArr.get(i).substring(0, imageArr.get(i).length()-4));
					mvpath2 = imageArr.get(i);
				}else if (i == 6) {
					movie3Profile.setImage(img);
					movie3Name.setText(imageArr.get(i).substring(0, imageArr.get(i).length()-4));
					mvpath3 = imageArr.get(i);
				}else {
					movie4Profile.setImage(img);
					movie4Name.setText(imageArr.get(i).substring(0, imageArr.get(i).length()-4));
					mvpath4 = imageArr.get(i);
				}
			}
		}else {
			for (int i = 4; i < 4 + nmg; i++) {
				String str = "file:/" + path + "/" + imageArr.get(i);
				Image img = new Image(str);
				if (i == 0) {
					movie1Profile.setImage(img);
					movie1Name.setText(imageArr.get(i).substring(0, imageArr.get(i).length()-4));
					mvpath1 = imageArr.get(i);
				}else if (i == 1) {
					movie2Profile.setImage(img);
					movie2Name.setText(imageArr.get(i).substring(0, imageArr.get(i).length()-4));
					mvpath2 = imageArr.get(i);
				}else if (i == 2) {
					movie3Profile.setImage(img);
					movie3Name.setText(imageArr.get(i).substring(0, imageArr.get(i).length()-4));
					mvpath3 = imageArr.get(i);
				}else {
					movie4Profile.setImage(img);
					movie4Name.setText(imageArr.get(i).substring(0, imageArr.get(i).length()-4));
					mvpath4 = imageArr.get(i);
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
					movie1Name.setText(imageArr.get(i).substring(0, imageArr.get(i).length()-4));
					mvpath1 = imageArr.get(i);
				}else if (i == 9) {
					movie2Profile.setImage(img);
					movie2Name.setText(imageArr.get(i).substring(0, imageArr.get(i).length()-4));
					mvpath2 = imageArr.get(i);
				}else if (i == 10) {
					movie3Profile.setImage(img);
					movie3Name.setText(imageArr.get(i).substring(0, imageArr.get(i).length()-4));
					mvpath3 = imageArr.get(i);
				}else {
					movie4Profile.setImage(img);
					movie4Name.setText(imageArr.get(i).substring(0, imageArr.get(i).length()-4));
					mvpath4 = imageArr.get(i);
				}
			}
		}else {
			for (int i = 8; i < 8 + nmg; i++) {
				String str = "file:/" + path + "/" + imageArr.get(i);
				Image img = new Image(str);
				if (i == 8) {
					movie1Profile.setImage(img);
					movie1Name.setText(imageArr.get(i).substring(0, imageArr.get(i).length()-4));
					mvpath1 = imageArr.get(i);
				}else if (i == 9) {
					movie2Profile.setImage(img);
					movie2Name.setText(imageArr.get(i).substring(0, imageArr.get(i).length()-4));
					mvpath2 = imageArr.get(i);
				}else if (i == 10) {
					movie3Profile.setImage(img);
					movie3Name.setText(imageArr.get(i).substring(0, imageArr.get(i).length()-4));
					mvpath3 = imageArr.get(i);
				}else {
					movie4Profile.setImage(img);
					movie4Name.setText(imageArr.get(i).substring(0, imageArr.get(i).length()-4));
					mvpath4 = imageArr.get(i);
				}
			}
		}
	}
}