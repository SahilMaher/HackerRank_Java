import java.util.*;
import java.io.*;

class Nested_Loop{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
     
        for(int i=0;i<t;i++)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
             for ( int u = 0;  u< n; u++) 
             {
                 
                int result = a;
                for (int j = 0; j <= u; j++) {
                result += Math.pow(2, j) * b;
                    
                }
                System.out.print(result + " ");
                
            }
            
         System.out.println();
        }
        in.close();
    }
}
