package basicconcepts;

public class Javaflow {

	int i=100;// non static variable
	static int j=200;// static varible
	static {
System.out.println("static block");
}
	{
		System.out.println("nonstatic block");
	}
	public Javaflow() {// constructor is same as a class name(in constructor by default public)// no return type//compiler create default constructor
		System.out.println("default constructor");//
	}
	public Javaflow(String pooja) {// here u need to put data type of parameters 
		System.out.println("param constructopr"+pooja);
	}
public void methodone() {
	System.out.println("non static method");
}
public static void methodtwo() {
	System.out.println("static method");
}
public static void main(String[] args) {
	System.out.println("main method");
	Javaflow f=new Javaflow();// we have created object for the non static members call in the static body
	Javaflow f1=new Javaflow("pooja");
	System.out.println(f.i);
	System.out.println(f.j);
	f.methodone();
	f.methodtwo();
}


}
