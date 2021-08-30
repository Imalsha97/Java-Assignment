class Author{
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public char getGender(){
        return this.gender;
    }
    // public void setName(String name){
    //     this.name = name;
    // }
    public void setEmail(String email){
        this.email = email;
    }
    // public void setGender(char gender)
    // {
    //     this.gender = gender;
    // }
    public String toString(){
        return  name+" "+email+" "+gender;
    }

}

class Book{
    private String name;
    private  Author author;
    private double price;
    private int qty;

    public Book(String name,Author author,double price, int qty){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    public Book(String name,Author author,double price){
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public String getName(){
        return this.name;
    }
    public Author getAuthor(){
        return this.author;
    }
    public double getPrice(){
        return this.price;
    }
    public int getQty(){
        return this.qty;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setQty(int qty){
        this.qty = qty;
    }
    public String toString(){
        return "Book name "+name+" "+"by "+author.getName()+" email "+author.getEmail();
    }

}


public class TestAuthor {
    public static void main(String args[]){
        Author ob = new Author("imalsha","ima@gmail.com",'f');
        // System.out.println(ob);
        // ob.setEmail("wgdqyhgd@gmail.com") ;
        // System.out.println(ob);
        Book ob1 = new Book("java book",ob,225.00);
        System.out.println(ob1.toString());

    }
}
