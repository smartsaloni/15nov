
import java.util.Scanner;
public class OPERATORS{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter A");
        int n1 = sc.nextInt();
        System.out.println("Enter B");
        int n2 = sc.nextInt();
        String str = n1 > n2 ? "n1 >"+n1 : "n2 >"+n2;
        System.out.println(str);
        System.out.println();
 System.out.println("Enter C ");
        int n3 = sc.nextInt();
        String str1;
        str1 = (n1>n2) ? (n1>n3) ? "n1 > "+n1  : "n3 >" +n3 : (n2>n3) ? "n2 >"+n2: "n3 > "+n3;
        System.out.println(str1);
        System.out.println();
 char ch;
        do {
            System.out.println("enter your number ");
            int num = sc.nextInt();
            int count = 0;

            while (num > 0) {

                num = num / 10;

                count++;
            }

            System.out.println("The digit in the entered number is :- " + count);
            System.out.println("Do you want to continue ?(YES/NO) ");
            ch = sc.next().charAt(0);
        }while (ch == 'YES');
        {

        }

    }
}