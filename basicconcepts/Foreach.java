package basicconcepts;

public class Foreach {
	//this is used for object,array,&collection(more than one method or object present)
		public static void main(String[] args) {
			int [] i = new int[10];
			for(Integer a: i ) {
				// syntax :- for( returntype x : on which element u want to do operatin)
				System.out.println(a);
			}
		}

}
