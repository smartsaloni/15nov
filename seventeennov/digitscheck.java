package seventeennov;
import java.util.Scanner;
public class digitscheck {
	public static String digits(int x) {
		String f;
		int c=0;
		
		while(x>0) {
			x=x/10;
			c++;
		}
		f="You have entered a "+c+" digit number";
		
		return f;	
	}
	
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	char ch;
	
	do {
	System.out.println("Enter your number");
	int a=sc.nextInt();
	
	String r=digits(a);
	System.out.println(r);
	System.out.println("\nDo you wish to continue?(Y/N)");
	 ch=sc.next().charAt(0);
	 System.out.println();
	 
	}while(ch=='y' || ch=='Y');
	sc.close();
}

}
