package sub1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/*
 * 
 * JDBC 프로그래밍
 * 
 * 
 */
public class JDBCTest {
	public static void main(String[] args) throws Exception {
		
		// DB정보
		String host = "jdbc:mysql://192.168.44.7:3306/ljw";
		String user = "ljw";
		String pass = "1234";
		
		//1단계 - JDBC 드라이버 동적로드
		//해달클래스가 없을수도 있으므로 예외사항을 적용해야됨
		Class.forName("com.mysql.jdbc.Driver");
		
		//2단계 - 데이터베이스 접속
		Connection conn = DriverManager.getConnection(host, user, pass);
		
		if(conn != null) {
			System.out.println("데이터베이스 접속");
		}
		
		
		//3단계 - 
		
		//6단계 - 데이터베이스 접속종료
		conn.close();
		
		
		
		
		
	
}
}
