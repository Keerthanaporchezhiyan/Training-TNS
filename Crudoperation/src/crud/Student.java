package crud;

public class Student {
	private String name,stream;
	private Integer Eno;
	public Student()
	{
		
	}
	public Student(String name,String stream,Integer Eno) {
		this.name = name;
		this.stream = stream;
		this.Eno = Eno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public Integer getEno() {
		return Eno;
	}
	public void setEno(Integer eno) {
		Eno = eno;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", stream=" + stream + ", Eno=" + Eno + "]";
	}
	
}
