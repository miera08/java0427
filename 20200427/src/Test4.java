

public class Test4 {
	   public static void main(String[] args) {
	        for(int i = 1; i <= 100; i++) {
	           if(Number(i))
	               	System.out.println(i);
	        }
	    }
	    
	    public static boolean Number(int num) {
	        if(num == 1)
	            return false;
	        
	        for(int i = 2; i < num; i++) {
	            if(num % i == 0)
	                return false;
	        }
	        
	        return true;
	    }
}
