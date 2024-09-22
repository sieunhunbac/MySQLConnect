package huy.dev;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String DB_URL = "JDBC:mysql://localhost:3306/shop";
		final String USER = "root";
		final String PASS = "";
		// Kết nối đến cơ sở dữ liệu MySQL
		 try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            DriverManager.getConnection(DB_URL, USER, PASS);
	            System.out.println("Ket noi thanh cong");
	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	}

}
