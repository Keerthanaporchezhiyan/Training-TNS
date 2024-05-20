package employee;

public class Employee {
	int empiid;
	public int getEmpiid() {
		return empiid;
	}

	public void setEmpiid(int empiid) {
		this.empiid = empiid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	String empname;

	public static void main(String[] args) {
		int emp;
		String name;
		Employee e= new Employee();
		e.setEmpiid(123);
		e.setEmpname("Keerthana");
		emp = e.getEmpiid();
		name = e.getEmpname();
		System.out.println("Empid:"+emp);
		System.out.println("Empname:"+name);
	}

}
