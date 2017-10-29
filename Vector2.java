public class Vector2{

	int x;
	int y;
	int z;

	public Vector2(int x, int y, int z){
		this.x=x;
		this.y=y;
		this.z=z;
	}

	public void print(){
		System.out.println("("+x+","+y+","+z+")");
	}


	public double modul(){
		double a;
		a=sqrt(x*x+y*y+z*z);
		return a;
	}

}

