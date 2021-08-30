

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

// class TestMyPoint{
// 	public static void main(String args[]){
// 		MyPoint mp1=new MyPoint(3,4);
// 		MyPoint mp2=new MyPoint(6,5);
		
// 		System.out.println("Distance : "+mp1.distance(3,4));
//         System.out.println(mp2.distance(8, 9));
		
// 	}
// }

class MyCircle{
    private MyPoint center;
    private int radius;

    public MyCircle(int x , int y, int radius){
            this.center.setX(x);
            this.center.setY(y);
            this.radius = radius;
    }
    
    public MyCircle(MyPoint center, int radius){
		this.center=center;
		this.radius=radius;
	}
    public int getRadius(){
        return this.radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public MyPoint getCenter(){
        return this.center;
    }
    public void setCenter(MyPoint center){
        this.center = center;
    }
    public int getCenterX(){
        return this.center.getX();
    }
    public int getCenterY(){
        return this.center.getY();
    }
    public void setCenterXY(int x, int y){
        this.center.setX(x);
        this.center.setY(y);
    }
    public String toString(){
        return "Circle @ ("+center.getX()+","+center.getY()+") radius="+radius;
    }
    public double getArea(){
        return (3.14*radius*radius);
    }
}

public class TestMyCircle {
    public static void main(String args[]){
        MyPoint p1=new MyPoint(3,4);
		
		MyCircle c1=new MyCircle(p1,7);
		System.out.println(c1);
		System.out.println("Area of the circle: "+c1.getArea());

        MyCircle c2 = new MyCircle(12,14,41);
        System.out.println(c2.getArea());
    }
}
