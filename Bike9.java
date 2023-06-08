class Bike9{
//final int i=90; it will give error because the final value doesn't change value
int i=90;
void run(){
i=400;
System.out.println("Speed mLimit is...."+i);
}
public static void main(String args[]){
Bike9 obj=new Bike9();
obj.run();
}
}