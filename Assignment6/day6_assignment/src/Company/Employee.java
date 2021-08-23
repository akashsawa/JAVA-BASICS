package Company;
public class Employee {
	private int EmployeeId;
	private String EmployeeName;
	
	public Employee(int EmployeeId, String EmployeeName) {
		super();
		this.EmployeeId = EmployeeId;
		this.EmployeeName = EmployeeName;
	}

	public int getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(int EmployeeId) {
		this.EmployeeId = EmployeeId;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String EmployeeName) {
		this.EmployeeName = EmployeeName;
	}

	@Override
	public String toString() {
		return "Employee [EmployeeId=" + EmployeeId + ", EmployeeName=" + EmployeeName + "]";
	}
	
}
