package BasicPrograms;

public class PrimeNumbers {
	
	static boolean isPrime(int n){
		if(n<=1) {
			return false;
		} else {
			for(int i=2; i<n/2; i++) {
				if(n%2 == 0) {
					return false;
				}
			}
		}
		return true;
	}
	
	static void checkPrime(int n){
		if(isPrime(n)) {
			System.out.println(n+" is Prime number");
		}else {
			System.out.println(n+" is not Prime number");
		}
	}
	
	
	public static void main(String[] args) {
		  checkPrime(1);    
		  checkPrime(3);    
		  checkPrime(17);    
		  checkPrime(20);  
		  
		  int start = 2;
		  int end = 20;
		  
		  System.out.println("Prime Numbers Between "+ start +" and "+ end +" are:");
		  for (int i= start; i<= end; i++) {
			  if(isPrime(i)) {
				  System.out.println(i);
			  }
		  }
	}

}
