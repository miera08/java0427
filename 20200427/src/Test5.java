import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		result(num);
	}
	public static int result(int num) {
		int re = 2;
		for (int i = 1; i < num; i++) {
			re=re*2;
		}
		System.out.println(re);
		return 1;
	}
}
