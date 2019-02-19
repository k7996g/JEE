import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class TestSelectEmpDemo {

	public static void main(String[] args) {
		Connection con = null;
		Statement st ;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "Capgemini123");
			st =  con.createStatement();
			ResultSet rs = st.executeQuery("select * from emp1 ");
			System.out.println("ID\t\t NAME\t\t\t SALARY\t\t DOJ");
			while (rs.next()) {
				System.out.println(rs.getInt("emp_id") + "\t\t" + rs.getString("emp_name") + "\t\t"
						+ rs.getInt("emp_sal") + "\t\t" + rs.getDate("emp_doj"));
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
