package sub1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/*
 * 
 * JDBC ���α׷���
 * 
 * 
 */
public class JDBCTest {
	public static void main(String[] args) throws Exception {
		
		// DB����
		String host = "jdbc:mysql://192.168.44.7:3306/ljw";
		String user = "ljw";
		String pass = "1234";
		
		//1�ܰ� - JDBC ����̹� �����ε�
		//�ش�Ŭ������ �������� �����Ƿ� ���ܻ����� �����ؾߵ�
		Class.forName("com.mysql.jdbc.Driver");
		
		//2�ܰ� - �����ͺ��̽� ����
		Connection conn = DriverManager.getConnection(host, user, pass);
		
		if(conn != null) {
			System.out.println("�����ͺ��̽� ����");
		}
		
		
		//3�ܰ� - 
		
		//6�ܰ� - �����ͺ��̽� ��������
		conn.close();
		
		
		
		
		
	
}
}
