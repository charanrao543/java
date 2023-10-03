package practice_program;
import java.util.Scanner;
public class Kodnest_ass1i {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if (n <= 700000) {
			System.out.println("Income is 7,00,000 or less. No tax is required");
		}
		else {
			System.out.println("Income is greater than 7,00,000. tax must be paid");
		}
	}
	
}
