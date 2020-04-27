import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("두 수의 절대값을 구합니다\n두 개의 숫자를 입력하세요");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		value(num1,num2);
		
	}
	public static void value(int num1,int num2) {
		if(num1>num2) {
			int re=num1-num2;
			System.out.println(num1+"과 "+num2+"의 차이는 "+re);
		}else if(num1<num2) {
			int re=num2-num1;
			System.out.println(num2+"과 "+num1+"의 차이는 "+re);
			
		}else {
			System.out.println("두 수는 같습니다.");
		}
	}
}
