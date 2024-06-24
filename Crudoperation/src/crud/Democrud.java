package crud;

public class Democrud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.setEno(5);
		s.setName("Nisha");
		s.setStream("Com");
		CrudExample cr = new CrudExample();
		CrudExample.insertData(s.getEno(),s.getName(),s.getStream());
		CrudExample.DeleteData(3);
		CrudExample.getData();
	}

}
