package sub2;

/*
 * 
 * JDBC UpdateTest �ǽ�
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTest {
	public static void main(String[] args) {
		
//		DB ����
		String host = "jdbc:mysql://192.168.44.7:3306/ljw";
		String user = "ljw";
		String pass = "1234";
		Connection conn = null;

		try {
//			1�ܰ� - JDBC ����̹� �ε�
			Class.forName("com.mysql.jdbc.Driver");
//			2�ܰ� - �����ͺ��̽� ����
			
				conn = DriverManager.getConnection(host, user, pass);
			
//			3�ܰ� - SQL ���ఴü ����
			Statement stmt = conn.createStatement();
//			4�ܰ� - SQL ����
			String sql = "UPDATE `USER1` SET `hp`='010-493-4858' ";
					sql += "WHERE `uid` = 'J101'";
			stmt.executeUpdate(sql);
			
//			5�ܰ� - ����� ó��(SELECT�� ���)
			
			
			
		} catch (Exception e) {
			System.out.println("����̹� �ε忡 �����߽��ϴ�.");

		}
		System.out.println("Update �Ϸ�");
		

//		6�ܰ� - �����ͺ��̽� ����
	
}
}
