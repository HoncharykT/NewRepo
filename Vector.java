package Zav2;

public class Vector{
	int x;
	int y;
	int z;

	public Vector(){}
	public Vector(int x,int y,int z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	public Vector vect(Vector a){
		Vector rez=new Vector;
		rez.x=this.y*a.z-this.z*a.y;
		rez.y=this.z*a.x-this.x*a.z;
		rez.z=this.x*a.y-this.y*a.x;
	}
	

	public void print(){
		System.out.println("("+x+","+y+","+z+")");
	}
}

