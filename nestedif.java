package testprogram;

public class nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//9)nestedif program
		int rollno=10;
		int marks=50;
		if(rollno<25)
		{
			if(marks==50)
			{
				System.out.println("pass");
			}
			else
			{
				System.out.println("fail");
			}
		}
		else
		   {
			 System.out.println("not match");
		   }
	}

}
