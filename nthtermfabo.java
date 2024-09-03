import java.util.*; 

public class nthtermfabo {

	public static void main(String[] args) {
		
//	fibonacci series	0 1 1 2 3 5 8 13 21 
			int a = 0,b=1,c;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a range");
			int var = sc.nextInt();
			for(int i = 1; i<=var; i++) {
				c=a+b;
				a=b;
				b=c;
			
			}	
			System.out.print(b-a);
		}
	}
	//this is the program to find the nth term of the fabbonacci series