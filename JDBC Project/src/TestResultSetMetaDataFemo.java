import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.cg.ems.util.DBUtil;

public class TestResultSetMetaDataFemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection con = DBUtil.getCon();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from emp1");
			ResultSetMetaData rsmd = rs.getMetaData();
			int colCount = rsmd.getColumnCount();
			System.out.println("No of Columns: " + colCount);
			for (int i = 1; i <= colCount; i++) {
				System.out
						.println(i + " Column name " + rsmd.getColumnName(i) + " Column type: " + rsmd.getColumnTypeName(i));

			}

		} catch (SQLException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
