package basicconcepts;

public class TypeCasting {
	
		// typecating convert one type into another type 
		//two types 1) auto widing - convert smallest data type into biggest , 2) explicit narrowing - biggest to smallest (not possible if u cross the range of that data type u will get error )
		// range of data type - byte < int < long < float < double
		// syntax:- 2type a =(2type) 1type;
		public static void main(String[] args) {
			//auto widing 
			short s=123;
			int i =s;
			System.out.println(i);
			//explicit narrowing
			int ant = 500;
			short smt = (short)ant;
			System.out.println(smt);
		}


}
