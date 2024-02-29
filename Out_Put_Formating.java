import java.util.Scanner;

public class Out_Put_Formating {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
               int a=s1.length();
               String padded = String.format("%-15s", s1);

               if(a <= 10)
               {
                    if(x >-1 && x < 1000)
                    { 
                        if(x <100)
                        {
                            if(x<10)
                            {
                                System.out.println(padded+0+0+x);
                            }
                            else{
                                System.out.println(padded+0+x);
                            }
                           
                        }
                        else
                        {
                          if(x <1000)
                            {
                                System.out.println(padded+x);
                            }
                        }
                    }
                    else
                    {
                        System.out.println("invalid integer input");
                    }
                } 
               else
               {
                    System.out.println("plese enter valid data");
               }
                
                //Complete this line
                
            }
            System.out.println("================================");

    }
}



