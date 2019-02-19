import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class TestInheritanceDemo {
	public static void main(String args[]) {
		/*
		 * Emp rahul = new Emp(); rahul.setEmpName("Rahul Chauhan");
		 * rahul.setEmpSal(60000.0f);
		 * 
		 * Manager vaishali = new Manager(); vaishali.setEmpName("VaishaliS");
		 * vaishali.setEmpSal(5000.0f); vaishali.setDeptName("java");
		 */

		Manager kaushal = new Manager();
		kaushal.setEmpName("VaishaliS");
		kaushal.setEmpSal(8000.0f);
		kaushal.setDeptName("dotnet");

		EntityManager em = JPAUtil.getEntiManager();
		EntityTransaction tran = em.getTransaction();

		tran.begin();
		// em.persist(rahul);
		// em.persist(vaishali);
		em.persist(kaushal);
		tran.commit();
		System.out.println("data is inserted");
	}
}
