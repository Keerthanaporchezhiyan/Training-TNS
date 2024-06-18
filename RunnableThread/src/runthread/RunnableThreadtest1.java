package runthread;

public class RunnableThreadtest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintNameRunnable  pnt = new PrintNameRunnable("A");
		Thread t1 = new Thread(pnt);
		t1.start();

	}

}
class PrintNameRunnable implements Runnable
{
	String Name;

	public PrintNameRunnable(String Name) {
		this.Name = Name;
	}
	public void run()
	{
		for (int i=0;i<10;i++)
		{
			System.out.println(Name);
		}
	}
}
