package weekopdracht;
import java.util.Scanner;

public class Speelvelduserinp {
		public static void main (String[]args){
			SpeelveldEx speelveldex = new SpeelveldEx();
			Scanner scveld = new Scanner(System.in);
			
			System.out.println("Hoeveel kolommen en rijen heeft het veld?");
			String scAntw = scveld.nextLine();
			System.out.println(scAntw);
			
			for (int i = 0; i < speelveldex.rij1.length; i++) {
			System.out.print(speelveldex.rij1[i]);
			}
		}
}
class SpeelveldEx{
		String [] rij1 = {"_ ","_ ","_ ","_ ","_ "};		
	}

