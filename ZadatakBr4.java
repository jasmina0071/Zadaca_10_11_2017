import java.util.Scanner;
public class ZadatakBr4 {
	  public static void main(String[] args) {
		  
	        Scanner unos = new Scanner(System.in);
	        
	        System.out.print("Unesite ASCII code: ");
	        
	        int code = unos.nextInt();
	        char ascii = (char) code;

	        System.out.println("Karakter za ASCII code " + code + " je: " +ascii);

	    }
	}
