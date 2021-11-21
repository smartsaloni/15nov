
import java.util.Scanner;

public class grading {

	public static String Grading(int m) {

		String Grade = " ";

		if((m>=90)&&(m<=100))

		{
			Grade="A+";
		}
		else if((m>=80)&&(m<=89))

		{
			Grade="A";
		}

		else if((m>=70)&&(m<=79))

		{
			Grade="B";
		}

		else if((m>=60)&&(m<=69))

		{
			Grade="C";		
		}

		else if((m>=50)&&(m<=59))


		{
			Grade="D";	

		}

		else if(m<50)

		{
			Grade="FAIL :(";

		}

		else

		{

			Grade="Invalid";
		}

		return Grade;
	}
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);

		int m;

		String grd;

		System.out.println("Enter the marks:");

		m=sc.nextInt();

		grd =  Grading(m);

		System.out.println("Your grade : "+grd);

        sc.close();

	}

}
