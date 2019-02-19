import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.cg.ems.util.DBUtil;

public class TestTransactionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		try {
			con = DBUtil.getCon();
			con.setAutoCommit(false);
			String update1 = "Update emp1 set emp_name='KaushalGarg' where emp_id=111";

			Statement st = con.createStatement();
			st.addBatch(update1);
			int[] a = st.executeBatch();
			for (int i = 0; i < a.length; i++)
				System.out.println(a[i]);
			con.commit();
			System.out.println("Updated Successfully");

		} catch (SQLException e) {

			try {
				con.rollback();
			} catch (SQLException e1) {

				e1.printStackTrace();
			}
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
