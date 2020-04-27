import java.util.Scanner;

class AccountBank{
	int myBal = 0;
	public void deposit(int input) {
		myBal =  myBal + input;
	}
}
public class Ex04 {
	public static void main(String[] args) {
//		Scanner scan =  new Scanner(System.in);
//		int select = scan.nextInt();
//		if (select ==1) {
//			
//		} else if(select == 2){
//
//		}
		
		AccountBank ab1= new AccountBank();
		System.out.println("내 잔액 = "+ab1.myBal);
		
		ab1.deposit(3000);
		System.out.println("내 잔액 = "+ab1.myBal);
		
		AccountBank ab2 = new AccountBank();
		System.out.println("텅텅잔액 = "+ab2.myBal);
	}
}
