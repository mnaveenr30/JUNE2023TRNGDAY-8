import java.util.Scanner;
class Operation{
int square(int n){
return n*n;
}
}
class Circle{
Operation op;
double pi=3.14;
double area(int radius){
op=new Operation();
int rsquare=op.square(radius);
return pi*rsquare;
}
public static void main (String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Radies of Circle....");
int z=sc.nextInt();
Circle c=new Circle();
double result=c.area(z);
System.out.println(result);
}
}