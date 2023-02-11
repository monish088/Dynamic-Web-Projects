package first;

import java.sql.*;

public class FetchRecord {

	public static void main(String[] args) {
		getResultByColumnName();

	}
	static void getResultByColumnName() {
		try (
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava","root","Monish@882529");
			Statement st = con.createStatement();
				){
				ResultSet rs = st.executeQuery("select * from user1");
				while (rs.next()) {
					System.out.print(rs.getString("id"));
					System.out.print("\t");
					System.out.print(rs.getString("name"));
					System.out.print("\t");
					System.out.print(rs.getString("email"));
				}	
			} catch (SQLException e) {
				System.out.println("Got an exception");
				System.out.println(e.getMessage());
			
		}
	}

}
