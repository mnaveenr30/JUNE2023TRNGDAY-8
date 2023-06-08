class Student{
int roll_no;
String name;
static String collage ="ITS";
static void change(){
collage="MTIET";
}
Student(int r,String n){
roll_no=r;
name=n;
}
void display(){System.out.println(roll_no +"\t"+name+"\t"+collage);}
}
class TestCounter4{
public static void main(String args[]){
Student c1=new Student(223,"Murali  ");
Student c2=new Student(214,"Yaswanth");
Student c3=new Student(210,"Anil    ");
Student.change();
c1.display();
c2.display();
c3.display();
}
}