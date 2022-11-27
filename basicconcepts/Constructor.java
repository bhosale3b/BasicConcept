package basicconcepts;

public class Constructor {
	int id;// global variable
    String name;// global variable
    String address;// globalvariable
    public Constructor(int x, String y, String z) {//parametrized constructor
    	id=x;
    	name=y;
    	address=z;
    	
    }
    public static void main(String[] args) {

		Constructor constructor = new Constructor(9 ,"pooja","latur");// if u not pass argument then it takes error// otherwise u will put default constructor here for default object
        System.out.println(constructor.id+"\t"+constructor.name+"\t"+constructor.address);//( + is used for join two words , \t used for the gap
		
	}


}
