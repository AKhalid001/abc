import java.util.Scanner;
public class Converter {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Enter yoiur value in km");
		int z = x.nextInt();
		double m = 0.62137119;
		double a = z * m;
		System.out.println(z + " km is " + a + " miles");
		
		
		
		

	}

}
