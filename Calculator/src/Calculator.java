import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner (System.in);
		
		System.out.print("변수 a: ");
		int a = stdIn.nextInt();
		
		System.out.print("변수 b: ");
		int b = stdIn.nextInt();
		
		System.out.println("오름차수 정렬 전: " + a + ", " + b);
		
		//Swap (스왑)
		if (a > b) {
			int t = a;
			a = b;
			b = t;
		}
		
		System.out.println("오름차수 정렬 후: " + a + ", " + b);
		System.out.println("a<=b가 되도록 정렬했습니다.");
		System.out.println("변수 a 는 " + a + "입니다.");
		System.out.println("변수 b 는 " + b + "입니다.");
		
		stdIn.close();
	}
	
}
