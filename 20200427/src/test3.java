
import java.util.Scanner;


public class test3 {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("원의 넓이를 구합니다\n 원의 반지름을 입력하세요");
		double radius = scan.nextDouble();

		A(radius);
	}

	public static void A(double radius) {
		double result;
		result = radius * radius * 3.14;
		System.out.println("반지름 " + radius + "인 원의 넓이는 " + result);
	}
}
