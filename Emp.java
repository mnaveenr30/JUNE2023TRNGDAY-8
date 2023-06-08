public class Emp{
int id;
String name;
Address address;
public Emp(int id,String name,Address address){
this.id=id;
this.name=name;
this.address=address;
}
void display(){
System.out.print(id+"\t"+name+"\t");
System.out.println(address.city+"\t"+address.state+"\t"+address.country);
}
public static void main(String args[]){
Address address1=new Address("Palamaner",
"AP","India");
Address address2=new Address("Chittoor",
"AP","India");
Emp e1=new Emp(111,"Anil    ",address1);
Emp e2=new Emp(222,"Yaswanth",address2);
e1.display();
e2.display();
}
}
