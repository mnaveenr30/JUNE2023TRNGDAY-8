class Author{
String authorname;
int age;
String place;
Author(String name,int age,String place){
this.authorname=name;
this.age=age;
this.place=place;
}
}
class Book{
String name;
int price;
Author author;
Book(String n,int p,Author auther){
this.name=n;
this.price=price;
this.author=auther;
}
public static void main(String args[]){
Author author=new Author("John",42,"USA");
Book b=new Book("Java for Begginers",800,author);
System.out.println("Book name..."+b.name);
System.out.println("Book price..."+b.price);
System.out.println("________Auther Details__________");
System.out.println("Auther Name:\t"+b.author.authorname);
System.out.println("Auther Age:\t"+b.author.age);
System.out.println("Auther Place:\t"+b.author.place);
}
}