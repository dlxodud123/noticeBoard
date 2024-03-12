package movieJudge;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class movieJudgeDAO {
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	movieJudgeDTO dto;
	
	public movieJudgeDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String id = "c##LTY";
			String pwd = "1213";
			con = DriverManager.getConnection(url, id, pwd);
			System.out.println("연결 성공");
			//String sql;
			//ps = con.prepareStatement(sql);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	ArrayList<movieJudgeDTO> arr = new ArrayList<>();
	
	public void reviewSet(String content, String mvpath) {
		//System.out.println(content);
		String sql = "insert into movie_judge values (?, ?)";
		try {
			//System.out.println(content + ", " + name);
			ps = con.prepareStatement(sql);
			ps.setString(1, content);
			ps.setString(2, mvpath);
			int result = ps.executeUpdate();
			dto = new movieJudgeDTO();
			if (result == 1) {
				Alert alert = new Alert(AlertType.INFORMATION);
				dto.setContent(content);
				dto.setMoviename(mvpath);
				arr.add(dto);
				System.out.println(arr.get(0).getContent());
				System.out.println(arr.get(0).getMoviename());
				alert.setContentText("등록되었습니다");
			    alert.show();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public ArrayList<movieJudgeDTO> judgeList() {
		return arr;
	}
}
