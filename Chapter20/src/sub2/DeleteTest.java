package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 
 * JDBC Delete 실습
 */
public class DeleteTest {
	public static void main(String[] args) {
//		DB 정보
		String host = "jdbc:mysql://192.168.44.7:3306/ljw";
		String user = "ljw";
		String pass = "1234";
		Connection conn = null;

//			1단계 - JDBC 드라이버 로드
			
//			2단계 - 데이터베이스 접속
			
	
//			3단계 - SQL 실행객체 생성
			
//			4단계 - SQL 실행
			String sql = "DELETE FROM `USER1` WHERE `uid`='J101'";
			
//			5단계 - 결과셋 처리(SELECT일 경우)
			
			
			
		

//		6단계 - 데이터베이스 종료
	}

}
