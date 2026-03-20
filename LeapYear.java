public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2028;
		if(n%4==0 || n%100!=0 && n%400==0) {
			System.out.println("n is a leap year");
		}
		else {
			System.out.println("n is not a leap year");
		}
	}
			
		}
		
Output:
n is a leap year
                                        (OR)
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year:");
		int year=sc.nextInt();
		if((year%4==0 && year%100!=0)||(year%400==0)) {
		System.out.println(year + " is a Leap Year");
		}
		else {
			System.out.println(year + " is  not a Leap Year");
		}
		sc.close();
	}
}
Output:
Enter a year:
2024
2024 is a Leap Year


