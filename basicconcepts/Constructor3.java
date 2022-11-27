package basicconcepts;

public class Constructor3 {
	int id;// global variable
    String name;// global variable
    String address;// globalvariable
    public Constructor3(int id, String name, String address) {//parametrized constructor
    	this.id=id;// this keyword refered instance class global veriables 
    	this.name=name;
    	this.address=address;
    	
    }
    public static void main(String[] args) {

		Constructor3 constructor = new Constructor3(9 ,"pooja","latur");// if u not pass argument then it takes error// otherwise u will put default constructor here for default object
        System.out.println(constructor.id+"\t"+constructor.name+"\t"+constructor.address);//( + is used for join two words , \t used for the gap
		
	}



}
