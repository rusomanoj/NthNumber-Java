
import java.util.Scanner;
public class nthnumber
{

	public static void main(String[] args)
	{
		
		System.out.printf("Enter the Value for N:");
		Scanner sc=new Scanner(System.in);
		   int n,a;
		   int b=1,c=4;
		   a=sc.nextInt();
		   for(n=1;n<=a;n++)
		   {
			  
			   b=b*c;
			   
			   
			   
			   
	            	if(n==a)
	            	{
	            		
	            		
	            		System.out.printf(" 1/%d ",b);
	            	}
	            	else
	            	{
	            		
	            		
	            	    System.out.printf(" 1/%d + ",b);
	            	    
	            	}
	            	 
		   }
		 
		  

	}

}
