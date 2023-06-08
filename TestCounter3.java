class Counter{
Counter(){
int count=0;
count++;
System.out.println(count);
}
}
class TestCounter3{
public static void main(String args[]){
Counter c1=new Counter();
Counter c2=new Counter();
Counter c3=new Counter();
}
}