package basicconcepts;

public class Calculator {
	//global variable (we can write outside the method but inside the class )
		// local variable (we can write within method only)
		int a= 5;
		int b= 4;
		void addition() {//method addition
			int result = a+b;//here result is variable and int is data type
			System.out.println(result);
		}
		void subtraction() {// method subtraction// void no return type?
			int result=a-b;
			System.out.println(result);
		}
		public static void main(String[] args) {
			Calculator calculator= new Calculator();//object creation (Calculator()-is called constructor same name as class name)
			calculator.addition();// method calling ( object creation is only do for the non static variable or method if u want to call in static)
			calculator.subtraction();//calculator= variable
			System.out.println(calculator.a);
		}


}
