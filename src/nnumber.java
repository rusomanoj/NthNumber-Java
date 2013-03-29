import java.util.Scanner;
public class nnumber {

	public static void main(String[] args)
	{
		
		System.out.printf("Enter the Value for N:");
		Scanner sc=new Scanner(System.in);
		   int a;
		   int b=0,c=0;
		   a=sc.nextInt();
		   
		   for(int i=1;i<=a;i++)
		   {
			   
			  b=i*i;
			  c=c+(1/(int)b);
			  if(i==1)
	                System.out.printf("\n 1 +");
	            else 
	            	if(i==a)
	            	{
	            		System.out.println(b);
	            	}
	            	else
	            	{
	            		 System.out.printf(" + ",b);
	            	}
			  
		   }
		   System.out.printf("\n\n THE SUM OF THIS SERIES IS", b);
		

	}

}
