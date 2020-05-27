package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;

/*
 * 
 * 
 * prepare test �ǽ�
 * SQL�� �����ϴ°�
 */
public class PrepareStaementTest {
	
	public static void main(String[] args) throws Exception {
		//DB����
		//1�ܰ�
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("����� ���(����:0, ���:1)");
			System.out.println("���� : ");
			
			int choice = sc.nextInt();
			
			if (choice ==0) {
				break;
			}
			System.out.println("���̵� �Է� : ");
			String uid = sc.next();
			
			System.out.println("�̸� �Է� : ");
			String name = sc.next();
			
			System.out.println("�޴��� �Է� : ");
			String hp = sc.next();
			
			System.out.println("���� �Է� : ");
			int age = sc.nextInt();
			
			
			insertUser(uid, name, hp, age);
			
			
		}while(true);
			
		System.out.println("���α׷� ����");
		
	}

	
	public static void  insertUser(String uid, String name, String hp, int age) throws Exception {
//		DB ����
		String host = "jdbc:mysql://192.168.44.7:3306/ljw";
		String user = "ljw";
		String pass = "1234";
		Connection conn = null;

//		1�ܰ� - JDBC ����̹� �ε�
		Class.forName("com.mysql.jdbc.Driver");
//		2�ܰ� - �����ͺ��̽� ����
		conn = DriverManager.getConnection(host, user, pass);
//		3�ܰ� - SQL ���ఴü ����
//		Statement stmt = conn.createStatement();
		String sql = "INSERT INTO `USER1` VALUES(?,?,?,?)";
		java.sql.PreparedStatement psmt = conn.prepareStatement(sql);
		psmt.setString(1, uid);
		psmt.setString(2, name);
		psmt.setString(3, hp);
		psmt.setInt(4, age);
//		4�ܰ� - SQL ����
		psmt.executeUpdate();
		
		
		
		
		
//		5�ܰ� - ����� ó��(SELECT�� ���)1
		
		
//		6�ܰ� - �����ͺ��̽� ����
		conn.close();
		psmt.close();
		System.out.println("Insert �Ϸ�");
		
		
	}
}
