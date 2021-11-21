class revision{
 public static void main(String[]args) {
    // System.out.println("hi");
    //calculate sum
    int sum = 0;
    for ( int i=1;i<=10;i++){
        sum = sum+i;
    }
        System.out.println(sum);
        


        // calculate factorial
        int fact = 1;
        for (int i = 5; i>=1;i--){
            fact = fact * i;
        }
        System.out.println(fact);


        // print table
        int  n = 5;
        for ( int i = 1;i <=10;i++){
            int prod = n*i;
            System.out.println(n + "*" + i + "=" + prod);
        }
    
    
    }
}
