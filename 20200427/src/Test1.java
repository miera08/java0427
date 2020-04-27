import java.util.Scanner;



public class Test1 {
	public static void sum(int num1,int num2) {
		int result=num1+num2;
		System.out.println(num1+" + "+num2+" = "+result);
	}
	public static void subtraction(int num1,int num2) {
		int result=num1-num2;
		System.out.println(num1+" + "+num2+" = "+result);
	}
	public static void multiplication(int num1,int num2) {
		int result=num1*num2;
		System.out.println(num1+" + "+num2+" = "+result);
	}
	public static void division(int num1,int num2) {
		int result=num1/num2;
		int rest=num1%num2;
		System.out.println(num1+" + "+num2+" = "+result+" 나머지 "+rest);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("번호를 입력하세요\n 1:더하기 2:빼기 3:곱하기 4:나누기 5:종료");
			int select=scan.nextInt();
			if(select == 1) {
				System.out.println("덧셈할 숫자를 입력하세요");
				int num1=scan.nextInt();
				int num2=scan.nextInt();
				sum(num1,num2);
				
				
			}else if(select == 2) {
				System.out.println("뺄셈할 숫자를 입력하세요");
				int num1=scan.nextInt();
				int num2=scan.nextInt();
				subtraction(num1, num2);
			}else if(select == 3) {
				System.out.println("곱셈할 숫자를 입력하세요");
				int num1=scan.nextInt();
				int num2=scan.nextInt();
				multiplication(num1, num2);
			}else if(select == 4) {
				System.out.println("나눗할 숫자를 입력하세요");
				int num1=scan.nextInt();
				int num2=scan.nextInt();
				division(num1, num2);
			}else{
				System.out.println("종료합니다.");
				System.exit(1);
			}
			
		}
	}
}
