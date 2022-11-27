package basicconcepts;

public class Staticvariable {
	static int i=100;
    int j=200;
    public static void main(String[] args) {
		Staticvariable s1= new Staticvariable();
		Staticvariable s2= new Staticvariable();
		System.out.println(i);
		System.out.println(s1.j);
		System.out.println(i);
		System.out.println(s2.j);
	}

}
