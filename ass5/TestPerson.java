import java.util.*;
class Person{
    private String name;
    private String address;

    Person(){

    }

    Person(String name, String address){
            this.name = name;
            this.address = address;
    }
    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String tiString(){
        return "name is "+name+ "and address is "+address;
    }
}

  class Student extends Person{
    private int numCourses=0;
    // private String[] courses;
    // private int[] grades;

    ArrayList<String> courses = new ArrayList<String>();
    ArrayList<Integer> grades = new ArrayList<Integer>();

    public Student(String name, String address){
        this.setName(name);
        this.setAddress(address);
    }
    public void addCourseGrade(String course, int grade){
        courses.add(course);
        grades.add(grade);
        numCourses++;
    }
    public void printGrade(){
        for(int i = 0 ;i<numCourses;i++){
            System.out.println(courses.get(i)+" "+grades.get(i));
        }
    }
    public double getAverageGrade(){
        double avg = 0;
        int sum = 0;
        for(int i =0;i<numCourses;i++){
                sum = sum + grades.get(i);
        }
        avg = (sum/numCourses);
        return avg;
    }
    public String toString(){
        return getName()+" " +getAddress();
    }
}

class Teacher extends Person{
    private int numCourses=0;
    ArrayList<String> courses = new ArrayList<String>();

    public Teacher(String name, String address){
            this.setName(name);
            this.setAddress(address);
    }
    public  boolean addCourse(String course){
        for(int i =0 ;i<numCourses;i++){
            if(courses.contains(course))
            return false;
        }
        courses.add(course);
        numCourses++;
        return true;
    }
    public boolean removeCourse(String course){
        boolean flag = false;
        int index = 0;
        for(int i=0;i<numCourses;i++){
            if(course.equals(courses.get(i))){
                flag  = true;
                index = i;
                break;
            }
            else{
                flag = false;
            }
        }
        courses.remove(index);
        return flag;
    }
    public void printCourses(){
        System.out.println(courses);
    }
    public String toString(){
        return getName()+" "+getAddress();
    }
}

class TestPerson{
    public static void main(String args[]){
        Student m1 = new Student("imalsha","kelaniya");
        m1.addCourseGrade("java", 70);
        m1.addCourseGrade("java2", 80);
        m1.printGrade();
        System.out.println(m1.getAverageGrade());
        System.out.println(m1.toString());

        Teacher t1 = new Teacher("gamage","homagama");
		
		t1.addCourse("CSC1");
		t1.addCourse("CSC2");
		t1.addCourse("CSC3");
		
		t1.printCourses();
	     t1.removeCourse("CSC3");
		t1.printCourses();
        System.out.println(t1.toString());


    }
}