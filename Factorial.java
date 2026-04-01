import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=sc.nextInt();
		int Fact=1;
		int i=1;
		while(i<=num) {
			Fact=Fact*i;
			i++;
		}
		System.out.println(Fact);
	}
}

Output:

Enter a number:
5
120