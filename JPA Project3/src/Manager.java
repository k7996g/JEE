import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue(value = "MGR")
public class Manager extends Emp {
	private String deptName;

	public Manager() {

	}

	public Manager(int empId, String empName, float empSal, String deptName) {
		super(empId, empName, empSal);
		this.deptName = deptName;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Manager [deptName=" + deptName + "]";
	}

}
