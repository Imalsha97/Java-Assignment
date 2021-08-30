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
		return Math.sqrt(Math.pow(x1,2)+Math.pow(y1,2));
	}
}

class TestMyPoint{
	public static void main(String args[]){
		MyPoint mp1=new MyPoint(3,4);
		MyPoint mp2=new MyPoint(6,5);
		
		System.out.println("Distance : "+mp1.distance(3,4));
        System.out.println(mp2.distance(8, 9));
		
	}
}