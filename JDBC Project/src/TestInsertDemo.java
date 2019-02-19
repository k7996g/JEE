import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.cg.ems.util.DBUtil;

public class TestInsertDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*System.out.println("Enter empId");
		int eid = sc.nextInt();
		System.out.println("Enter empName");
		sc.nextLine();
		String ename = sc.nextLine();
		System.out.println("Enter salary");
		float esal = sc.nextFloat();*/
		System.out.println("Enter the id which you want to delete");
		int id=sc.nextInt();
		try {
			Connection con = DBUtil.getCon();
			//String insertQry="INSERT INTO emp1"+"(emp_id,emp_name,emp_sal)"+"VALUES(?,?,?)";
			String insertQry="delete emp1 where emp_id=?";
			PreparedStatement pst=con.prepareStatement(insertQry);
			pst.setInt(1, id);
			/*pst.setString(2, ename);
			pst.setFloat(3, esal);*/
			int data=pst.executeUpdate();
			System.out.println("Data is deleted"+data);
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}

}
