package practice_program;
import java.util.*;
public class Kodnest_ass1h {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		int wid = scan.nextInt();
		if (len == wid) {
			System.out.println("The give shape is a square");
		}
		else {
			System.out.println("The given shape is not a square");
		}
	}
}
