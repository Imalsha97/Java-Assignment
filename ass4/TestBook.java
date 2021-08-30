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
    private  Author[] author;
    private double price;
    private int qty;

    public Book(String name,Author[] author,double price, int qty){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    public Book(String name,Author[] author,double price){
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public String getName(){
        return this.name;
    }
    public Author[] getAuthor(){
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
    public void printAuthors(){
        for(int i=0;i<author.length;i++){
            System.out.println(author[i].getName());
        }
    }
    public String toString(){
        return "Book name "+name+" "+"by "+author.length+" authors";
    }

}


public class TestBook {
    public static void main(String args[]){
       Author a1 = new Author("imalsha","ima@gmail.com",'f');
       Author a2 = new Author("cec","ccc@gmail.com",'m');
       Author[] a = {a1,a2};
       Book b1 = new Book("harry potter",a,200);
       System.out.println(b1);
      

    }
}
