import java.util.Scanner; 

public class number {
	public static void main(String[] args) 
    {
       int a, b, c;          // declaring three int variable        
       Scanner scan = new Scanner(System.in);    //Declaring obj scan to class scanner        
       System.out.println("Enter the value for a");
       a = scan.nextInt();     // assigning value to the variable a
       System.out.println("Enter the value for b");
       b = scan.nextInt();      // assigning value to the variable b
       System.out.println("Enter the value for c"); 
       c = scan.nextInt();      // assigning value to the variable c
       if (a>b && a>c) //compare a value with B and C
          System.out.println("A is largest.");
       else if(b>c) //compare b value with c
	  System.out.println("B is largest.");
       else
	  System.out.println("C is largest.");
    }

}
