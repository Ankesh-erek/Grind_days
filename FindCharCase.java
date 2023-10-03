import java.util.Scanner;
public class FindCharCase {
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Input ");
		char c = sc.next().charAt(1);
		//char c = 'z';
		int n = c;

		if (n>=65 && n<=90) {
		System.out.println(1);	
	        }
		else if (n>=97 && n<=122) {
			System.out.println(0);
		}else 
		System.out.println(-1);
		
     }
}

