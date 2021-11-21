package methods;

import java.util.Scanner;

public class method2 {
    
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

    System.out.println("Enter a ");
    int a = sc.nextInt();
   System.out.println("Enter b");
   int b = sc.nextInt(); 
   System.out.println("multiplication of your a,b");
   System.out.println(multiply(a,b));
    multiply( a,b);  
    System.out.println("Enter x");
   Float x = sc.nextFloat();
   System.out.println("Enter  y");
   Float y = sc.nextFloat();
   System.out.println(" multiplication value your x,y");
   System.out.println(multiply(x,y));
    multiply( x,y);
    sc.close();

  }
  static int multiply(int a , int b ) {
        int res =a*b;
        return res;
    }
  static float multiply(float a , float b ) {
        float res =a*b;
        return res;
    }
    static long multiply(long a , long b ) {
        long res =a*b;
        return res;
    }
}
