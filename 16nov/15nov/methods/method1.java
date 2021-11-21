package methods;

import java.util.Scanner;

public class method1 {
    public static void main(String[]args){

      // WAP To multiply 2 numbers


      Scanner sc = new Scanner(System.in);

      System.out.println("enter the value of a & b ");

       int a = sc.nextInt(); 
       int b = sc.nextInt();

      System.out.print(multiplication(a,b));

            multiplication(a,b);

            sc.close();

      }

       static int multiplication(int a , int b) {

        return  a*b;

        
       }     

    }
    /*
    //WAP by 3 different methods 
       public int multiplication(int n1, int n2){
        return n1*n2;
    }


    public float multiplication(float n1, float n2){
        return n1*n2;
    }


    public long multiplication(long n1, long n2){
        return n1*n2;
    }



*/
    
