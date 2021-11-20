package oddeven;
class controls{
    public static void main(String[]args){
       // 1&3) program to print the square of number when number is less than 10 otherwise write invalid number

        int n = 9;
        if (n<10){
           int res = n*n;
           System.out.println("square of your no.-" + res);
        }

        else{
            System.out.println("invalid number");
        }
        

    }

    

        ///2 no.  same or not
        
         public static void issame(int a, int b){
            if(a == b)
            {
                System.out.println("same number");
            }     else{
                System.out.println("not same number");
             }
        }
       // 5) write a method wheather the given no. is positive or not
         public static void  ispositive(int a){
            if (a>0){
                System.out.println("a is positive");
            }
            else{
                System.out.println("a is negative");
            }
        }

  //6) write a program to find odd or even no.

       
       public static void oddeven(int a){
            if (a %2 == 0){
                System.out.println(" a is even ");
            }
            else{
                System.out.println("a is odd");
            }
    }
}






