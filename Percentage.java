import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		System.out.println("Calculate percentage");
		System.out.println(" ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks");
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int m3 = sc.nextInt();
		int m4 = sc.nextInt();
		int m5 = sc.nextInt();
		System.out.println("out of");
		int of = sc.nextInt();
		int tm = of*5;
		int sum = (m1+m2+m3+m4+m5);
		System.out.println(sum);
		double p = sum*100/tm;
		System.out.println("The percentage of all the subjects is "+p);
		

	}

}
