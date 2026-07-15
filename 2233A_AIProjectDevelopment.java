import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // no. of testcases
        while(t-- > 0){  // input : 
            long n = sc.nextLong();
            long x = sc.nextLong();
            long y = sc.nextLong();
            long z = sc.nextLong();
            
            // solution 
            // without ai
            long withoutAI = (n + (x + y)- 1)/ (x + y);
            // with ai
            long LinesDuringSetup = z * x;
            long withAI = 0;
            if(LinesDuringSetup >= n){
                withAI = z;
            }else{
                long remaining = n - LinesDuringSetup;
                long extra = (remaining + ( x + 10*y) - 1) / (x + 10 * y);
                withAI = z + extra;
            }
            long answer = Math.min(withoutAI, withAI);
            System.out.println(answer);
        }
        
    }
}
