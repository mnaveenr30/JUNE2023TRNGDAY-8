class TestOuter{
static int data=10;
static class Inner{
void msg(){System.out.println("Data is ...."+data);}
}
public static void main(String args[]){
TestOuter.Inner obj=new TestOuter.Inner();
obj.msg();
}
}