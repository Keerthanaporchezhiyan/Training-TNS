package Area;

public class Area {
	int length;
	int breadth;
	public void setDim(int length,int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public Area(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	int arearec;
	public void Arearec()
	{
		arearec = breadth * length;
		System.out.println("Area of rectangel is :"+arearec);
		
	}
	public static void main(String[] args) {
		Area a = new Area(5,8);
		System.out.println(a.length);
		System.out.println(a.breadth);
		a.Arearec();
		a.setDim(4,7);
		a.Arearec();

	}

}
