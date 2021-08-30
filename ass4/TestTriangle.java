class MyPoint{
	private int x=0;
	private int y=0;
	
	public MyPoint(){
		
	}
	
	public MyPoint(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	public void setX(int x){
		this.x=x;
	}
	public void setY(int y){
		this.y=y;
	}
	public int getX(){
		return this.x;
	}
	public int getY(){
		return this.y;
	}
	
	public void setXY(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	public String toString(){
		return x+" "+y;
	}
	
	public double distance(int x, int y){
		return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
	}
	
	public double distance(MyPoint myPoint){
		int x1=myPoint.getX();
		int y1=myPoint.getY();
		return Math.sqrt(Math.pow(x1-x,2)+Math.pow(y1-y,2));
	}
}



class MyTriangle{
	private MyPoint v1;
	private MyPoint v2;
	private MyPoint v3;
	
	MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
		this.v1.setX(x1);
		this.v1.setY(y1);
		this.v2.setX(x2);
		this.v2.setY(y2);
		this.v3.setX(x3);
		this.v3.setY(y3);
	}
	
	MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3){
		this.v1=v1;
		this.v2=v2;
		this.v3=v3;
	}
	
	public String toString(){
		return "Triangle @ ("+v1.getX()+","+v1.getY()+") , ("+v2.getX()+","+v2.getY()+") , ("+v3.getX()+","+v3.getY()+")";
	}
	
	public double getPerimeter(){
		return v1.distance(v2)+v2.distance(v3)+v3.distance(v1);
	}
	
	public void printType(){
		System.out.print("Triangle type : ");
		if(v1.distance(v2)==v2.distance(v3) && v2.distance(v3)==v1.distance(v3))
			System.out.println("Equilateral");
		else if(v1.distance(v2)==v2.distance(v3) || v1.distance(v2)==v1.distance(v3) || v2.distance(v3)==v1.distance(v3))
			System.out.println("Isosceles");
		else
			System.out.println("Scalene");
	}
}


class TestTriangle{
	public static void main(String args[]){
		MyPoint v1=new MyPoint(9,-2);
		MyPoint v2=new MyPoint(4,6);
		MyPoint v3=new MyPoint(20,16);
		
		MyTriangle t1=new MyTriangle(v1,v2,v3);
		System.out.println(t1);
		
		System.out.println("Perimeter of the triangle : "+t1.getPerimeter());
		t1.printType();
	}
}