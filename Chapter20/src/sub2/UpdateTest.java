package sub2;

/*
 * 
 * JDBC UpdateTest 실습
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTest {
	public static void main(String[] args) {
		
//		DB 정보
		String host = "jdbc:mysql://192.168.44.7:3306/ljw";
		String user = "ljw";
		String pass = "1234";
		Connection conn = null;

		try {
//			1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.jdbc.Driver");
//			2단계 - 데이터베이스 접속
			
				conn = DriverManager.getConnection(host, user, pass);
			
//			3단계 - SQL 실행객체 생성
			Statement stmt = conn.createStatement();
//			4단계 - SQL 실행
			String sql = "UPDATE `USER1` SET `hp`='010-493-4858' ";
					sql += "WHERE `uid` = 'J101'";
			stmt.executeUpdate(sql);
			
//			5단계 - 결과셋 처리(SELECT일 경우)
			
			
			
		} catch (Exception e) {
			System.out.println("드라이버 로드에 실패했습니다.");

		}
		System.out.println("Update 완료");
		

//		6단계 - 데이터베이스 종료
	
}
}
