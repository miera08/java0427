import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
        toBinary(num);
    }
    
    public static int toBinary(int decimal) {
        if(decimal > 0) {
            int bin = decimal % 2;
            decimal /= 2;
            
            toBinary(decimal);
            System.out.print(bin);
        }
        
        return 0;
    }
}
