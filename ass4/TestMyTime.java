class MyTime {
    private int hour = 00;
    private int minute = 00; 
    private int second = 00;

MyTime(int hour, int minute, int second){
    setTime(hour,minute,second);
}
public void setTime(int hour, int minute , int second){
        if(hour<24 && hour>=0 && minute<60 && minute>=0 && second<60 && second>=0){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        }
        else{
            System.out.println("Invalid hor,minute, or second!");
        }
        
}
public  int getHour(){
        return this.hour;
}
public  int getMinute(){
    return this.minute;
}
public  int getSecond(){
    return this.second;
}
public void setHour(int hour){
    if(hour<24 && hour>=0){
        this.hour = hour;
    }
    else{
        System.out.println("Invalid minute");
    }
    
}
public void setMinute(int minute){
    if(minute<60 && minute>=0){
        this.minute = minute;
    }
    else{
        System.out.println("Invalid minute");
    }
    
}
public void setSecond(int second){
    if (second<60 && second>=0){
        this.second = second;
    }
    else{
        System.out.println("Invalid second");
    }
}
public String toString(){
    return getHour()+":"+getMinute()+":"+getSecond();
}
public MyTime  nextSecond(){
    if(this.second<59)
        this.second++;
    else if(this.second == 59){
        this.second = 00;
        nextMinute();
    }
    return this;

}
public MyTime  nextMinute(){
    if(this.minute<59)
        this.minute++;
    else if(this.minute == 59){
        this.minute = 00;
        nextHour();
    }
    return this;

}
public MyTime  nextHour(){
    if(this.hour<23)
        this.hour++;
    else if(this.hour == 23){
        this.hour = 00;
      
    }
    return this;
}
public MyTime previousSecond(){
    if(this.second>0)
        this.second--;
    else if(this.second == 0){
        this.second = 00;
        previousMinute();
    }
    return this;
}
public MyTime previousMinute(){
    if(this.minute>0)
        this.minute--;
    else if(this.minute == 0){
        this.minute = 00;
        previousHour();
    }
    return this;
}
public MyTime previousHour(){
    if(this.hour>0)
        this.hour--;
    else if(this.hour == 0){
        this.hour = 23;
    }
    return this;
}
}



public class TestMyTime {
    public static void main(String args[]){
        MyTime t1 = new MyTime(4,100,1000);
        System.out.println(t1.toString());
        System.out.println(t1.previousSecond());
        System.out.println(t1.previousMinute());
        System.out.println(t1.previousHour());
    }
    
}
