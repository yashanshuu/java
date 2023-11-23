package tester;
import static utils.DBUtils.openConnection;
import java.sql.*;

public class TestDBConnection {

	public static void main(String[] args) {
		try (Connection cn = openConnection()) {
			System.out.println("DB conn successful! " + cn);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
