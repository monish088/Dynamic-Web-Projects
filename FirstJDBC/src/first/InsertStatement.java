  package first;
  import java.sql.*;

public class InsertStatement {

	public static void main(String[] args) {
		try ( Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava","root","Monish@882529");
){
			//String url = "jdbc:mysql://localhost:3306/advjava","root","Monish@882529";
			Statement st = conn.createStatement();
			int result = st.executeUpdate("INSERT INTO Users1 VALUES (2,'Deepa','deepa@gmail.com','INDIA','123')," 
			                               + "(3,'Tom','top@gmail.com','USA','123');");
			System.out.println(result);
			conn.close();
			
		} catch (Exception e) {
			System.out.println("Got an exception");
			System.out.println(e.getMessage());
		}

	}

}
