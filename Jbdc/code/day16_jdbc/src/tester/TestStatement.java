package tester;
import java.sql.*;
import static utils.DBUtils.openConnection;

public class TestStatement {

	public static void main(String[] args) {
		try(//establisg db conn
				Connection cn=openConnection();
				//create a JDBC statement
				Statement st=cn.createStatement();
				//execute Query --> RST 
				ResultSet rst=st.executeQuery("select * from users order by reg_amt desc");
				) {
			//RST processing : rst cursor : before the 1st row
			while(rst.next())
				System.out.println("User Id "+rst.getInt(1)
				+ " Name "+rst.getString(2)+" Email "+rst.getString(3)
				+" reg amt "+rst.getDouble(5)+" reg date "+rst.getDate(6));
		} //JVM : rst.close() -- st.close --cn.close()
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
