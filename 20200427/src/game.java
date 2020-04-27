import java.util.Scanner;

class Human{
	int hp=100;
	void doAtt(Monster mon) {
		mon.hp = mon.hp -3;
		System.out.println("몬스터 hp = "+mon.hp);
		if(mon.hp==0) {
			System.out.println("몬스터가 죽었습니다.");
		}
	}
}
class Monster{
	int hp=100;
	void doAtt(Human human) {
		human.hp = human.hp -4;
		System.out.println("사람 hp = "+human.hp);
		if(human.hp==0) {
			System.out.println("사람이 죽었습니다.");
		}
	}
	
}
public class game {
	public static void main(String[] args) {
		Human h1 =new Human();
		Monster m1 = new Monster();
		
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("무슨 행동을 하시겠습니까");
			System.out.println("1번 사람이 몬스터 공격\n2번 몬스터가 사람을 공격\n3번 종료");
			int select = scan.nextInt();
			if(select ==1) {
				h1.doAtt(m1);
			}else if(select ==  2) {
				m1.doAtt(h1);
			}else {
				System.out.println("종료합니다");
				System.exit(1);
			}
			
		}
	}
}
