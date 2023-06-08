class Bike{
//final void run(){System.out.println("running...");} it give error becouse ifinal stops overloading of method
void run(){System.out.println("running...");}
}
class Honda extends Bike{
void run(){System.out.println("running safly with 100kph");}
public static void main(String args[]){
Honda obh=new Honda();
obh.run();
}
}