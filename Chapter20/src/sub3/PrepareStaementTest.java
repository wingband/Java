package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;

/*
 * 
 * 
 * prepare test 실습
 * SQL을 매핑하는것
 */
public class PrepareStaementTest {
	
	public static void main(String[] args) throws Exception {
		//DB정보
		//1단계
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("사용자 등록(종료:0, 등록:1)");
			System.out.println("선택 : ");
			
			int choice = sc.nextInt();
			
			if (choice ==0) {
				break;
			}
			System.out.println("아이디 입력 : ");
			String uid = sc.next();
			
			System.out.println("이름 입력 : ");
			String name = sc.next();
			
			System.out.println("휴대폰 입력 : ");
			String hp = sc.next();
			
			System.out.println("나이 입력 : ");
			int age = sc.nextInt();
			
			
			insertUser(uid, name, hp, age);
			
			
		}while(true);
			
		System.out.println("프로그램 종료");
		
	}

	
	public static void  insertUser(String uid, String name, String hp, int age) throws Exception {
//		DB 정보
		String host = "jdbc:mysql://192.168.44.7:3306/ljw";
		String user = "ljw";
		String pass = "1234";
		Connection conn = null;

//		1단계 - JDBC 드라이버 로드
		Class.forName("com.mysql.jdbc.Driver");
//		2단계 - 데이터베이스 접속
		conn = DriverManager.getConnection(host, user, pass);
//		3단계 - SQL 실행객체 생성
//		Statement stmt = conn.createStatement();
		String sql = "INSERT INTO `USER1` VALUES(?,?,?,?)";
		java.sql.PreparedStatement psmt = conn.prepareStatement(sql);
		psmt.setString(1, uid);
		psmt.setString(2, name);
		psmt.setString(3, hp);
		psmt.setInt(4, age);
//		4단계 - SQL 실행
		psmt.executeUpdate();
		
		
		
		
		
//		5단계 - 결과셋 처리(SELECT일 경우)1
		
		
//		6단계 - 데이터베이스 종료
		conn.close();
		psmt.close();
		System.out.println("Insert 완료");
		
		
	}
}
