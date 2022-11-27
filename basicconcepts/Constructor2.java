package basicconcepts;

public class Constructor2 {
	int id;
	String name;
	String address;
	public Constructor2() {
		//here we have used default constructor for default object
	}
	public Constructor2(int x, String y, String z) {
		id=x;
		name=y;
		address=z;
	}
	public static void main(String[] args) {
		Constructor2 constructor = new Constructor2();// so here no need to pass parameters
	}


}
