import java.util.Scanner;
public class ZadatakBr3 {
	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		
		System.out.println("Molimo unesite neki string: ");
		
		System.out.println("Unijeti string naopako glasi: " + new StringBuilder(unos.nextLine()).reverse());
		
		unos.close();
	}

}