public class ZadatakBr1 {
	public static void main(String[] args) {
					
			int x;
			int y; 
			int sum = 0;
			
	        System.out.print("Armstrongovi brojevi od 1 do 1000 su: ");
	        
	        for (int i = 1; i <= 1000; i++){
	        	x = i;
	        	
	            while (x > 0){
	            	y = x%10;
	            	x = x/10;
	            	
	                sum = sum + (y * y * y);
	                
	            }
	            
	            if(sum == i){
	               System.out.print(i + " ");
	            }
	            
	            sum = 0;
	        }

		}

	}