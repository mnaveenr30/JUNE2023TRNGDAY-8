class Student{
int roll_no;
String name;
static String collage="ITS";
Student( int r,String n){
roll_no=r;
name=n;
}
void display(){System.out.println(roll_no +"\t"+name+"\t"+collage);}
}
class TestStatic{
public static void main(String args[]){
Student s1=new Student(111,"Karan");
Student s2=new Student(222,"Aryan");
Student.collage="MTIET";
s1.display();
s2.display();
}
}