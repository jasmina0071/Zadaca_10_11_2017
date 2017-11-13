import java.util.Scanner;
public class ZadatakBr2 {
		public static void main(String[] args) {
			
			Scanner unos = new Scanner(System.in);
			
			System.out.println("Unesite neki broj: ");
			int unosKorisnika = unos.nextInt();
			
			
			 for (int i = 1; i <= unosKorisnika; i++) {

		            if (unosKorisnika % i == 0)
		                System.out.print(i + " ");
		             }
			 
		        unos.close();
		}

	}
