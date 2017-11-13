import java.util.Scanner;
public class ZadatakBr5 {
	public static void main(String[] args) {
	
	       Scanner unos=new Scanner(System.in);
           System.out.println("Unesite neki string:");
           
		   String poruka = unos.nextLine();
		   
		   System.out.println("Prvi karakter koji se ne pojavljuje "
		   		+ "u ostatku stringa je: " + poruka.charAt(0) + " ");
	
unos.close();
	}

}