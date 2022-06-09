import java.util.Scanner;

public class Print_pattern {
    // function to print row
    static void printn(int num){
         // base case
         if(num ==0)
             return ;
        System.out.print("* ");

        // recursively calling printn()
        printn(num - 1);
    }
     static void pattern(int n , int i){
         // function to print the pattern
         if(n==0)
              return;
            printn(i);
            System.out.println();
            // recursively callig pattern()
            pattern(n-1, i+1);
         
        
         
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n , 1);

        

         
    }
}
