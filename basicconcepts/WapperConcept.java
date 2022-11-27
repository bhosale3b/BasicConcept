package basicconcepts;

public class WapperConcept {


	public static void main(String[] args) {
		//boxing (primitive to object)
		float f= 30.52f;//primitive data type
		Float floatobject = new Float(f);//primitive into object
		System.out.println(floatobject);
		byte b=10;
		Byte by = new Byte(b);
		System.out.println(by);
			
	
//autoboxing (primitive into object)
	Float floatboject1=f;//primitive into object
	System.out.println(floatboject1);
	Byte by1=b;
	System.out.println(by1);
	

//unboxing(object into primitive)
Float f2 =30.52f;//wrapper class here f2 is wrapper class
//Float f = new Float(30.52f);//u can also right
float pri=f2;
System.out.println(pri);
float pf=f2.floatValue();// by using floatvalue() method
System.out.println(pf);
}


}


