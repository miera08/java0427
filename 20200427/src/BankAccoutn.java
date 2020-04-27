
public class BankAccoutn {
	int myBal;/**잔액*/ /*따로 선언하지 않으면 초기값은 자동으로 0*/
	public void chckMyBal() { /**계좌확인*/
		System.out.println("잔액 : "+myBal);
	}
	public void depositMyBal(int in)/**입금*/{
		myBal += in;
		System.out.println(in+"원 입금하였습니다");
	}
	public void withdrow(int out) {/**출금*/
		if(myBal < out) {
			System.out.println("출금실패,잔액이 모자랍니다");
			return;
		}
		myBal -= out;
		System.out.println(out + "원 출급하였습니다");
	}
}
