package testprogram;

public class string_sameor_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5)difference-string-The string class is immutable.&slow,cosnsumes more memory
	    //stringbuffer -stringbuffer is mutable&fast,consumes less memory
		//6)check two string values are same or not program:
		String amazon="food";
		String flipkart="home";
		String swiggy="food";
		System.out.println(amazon.equals(flipkart));
		System.out.println(amazon.equals(swiggy));
	}

}
