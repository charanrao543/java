package practice_program;
import java.util.*;
public class Kodnest_ass1k {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double A = scan.nextDouble();
		if (A>=90) {
			System.out.println("For a percentage of "+A+"%, the grade is: A");
		}
		else if(A>=80 && A<=89)
			System.out.println("For a percentage of "+A+"%, the grade is: B");
		else if (A>=70 && A<=79)
			System.out.println("For a percentage of "+A+"%, the grade is: C");
		else {
			System.out.println("For a percentage of "+A+"%, the grade is: D");
		}
	}
}
