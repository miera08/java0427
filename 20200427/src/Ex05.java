
public class Ex05 {

	public static void main(String[] args) {
		BankAccoutn ba1 = new BankAccoutn();
		//같은 패키지에 잇으면 따로 임폴트 할필요없음
		ba1.chckMyBal();
		ba1.depositMyBal(1680000);
		ba1.chckMyBal();
		
		BankAccoutn ba2 = new BankAccoutn();
		ba2.chckMyBal();
		ba2.withdrow(1000000);
		ba2.chckMyBal();
	}
}
