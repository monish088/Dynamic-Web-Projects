package first;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class updateStatement {
	private static final String UPDATE_USERS_SQL = "update Users1 set name =\"Ram\" where id =1"; 

	public static void main(String[] args) throws SQLException {
		
		updateStatement updateStatement = new updateStatement();
		updateStatement.updateRecord();

	}
	public void updateRecord() throws SQLException {
		System.out.println(UPDATE_USERS_SQL);
		try ( Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava","root","Monish@882529");
			Statement st = conn.createStatement();) {
			int result = st.executeUpdate(UPDATE_USERS_SQL);
			System.out.println("Number of records affected :"+ result);
		} catch (SQLException e) {
			System.out.println("Got an exception");
			System.out.println(e.getMessage());
		}
		
	}

}
