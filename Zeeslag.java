package weekopdracht;
import java.util.Scanner;

public class Zeeslag {
	public static void main (String[]args){
		Scanner scInt = new Scanner(System.in);
		Speler speler = new Speler();
		
		System.out.println("We gaan zeeslag spelen!");
		printje();
		
		for (int j = 0; j < 5; ++j){
			System.out.println("Welke rij wil je bombarderen?");
			int rijInp = scInt.nextInt();
			
			System.out.println("Welke kolom wil je bombarderen? Kies uit kolom 1 t/m 5.");
			int kolomInp = scInt.nextInt();
			
//			System.out.println(kolomInp-1, rijInp-1);
			speler.bombarderen(kolomInp-1, rijInp-1);
			printje();
		}
		scInt.close();
	}
	
	static void printje() {							// waarom static nodig?
		for (int i = 0; i < 5; i++) {
			System.out.print(Speelveld.rij1[i]);
		}
		System.out.println("");
		for (int i = 0; i < 5; i++) {
			System.out.print(Speelveld.rij2[i]);
		}
		System.out.println("");
		for (int i = 0; i < 5; i++) {
			System.out.print(Speelveld.rij3[i]);
		}
		System.out.println("");
		for (int i = 0; i < 5; i++) {
			System.out.print(Speelveld.rij4[i]);
		}
		System.out.println("");
		for (int i = 0; i < 5; i++) {
			System.out.print(Speelveld.rij5[i]);
		}
		System.out.println("");
	}
}
class Speelveld{
	static String [] rij1 = {"~ ","* ","* ","~ ","~ "};
	static String [] rij2 = {"~ ","* ","* ","~ ","~ "};
	static String [] rij3 = {"~ ","* ","* ","~ ","~ "};
	static String [] rij4 = {"~ ","* ","* ","~ ","~ "};
	static String [] rij5 = {"~ ","* ","* ","~ ","~ "};
}

class Schip{}

class Mijnenveger extends Schip{
	int length = 2;
}
class Slagschip extends Schip{
	int length = 3;
}
class Speler{
	void bombarderen(int kolom, int rij){
//		Speelveld.rij1[plek] = "x ";
		if (Speelveld.rij1[kolom] == "* ") {
			Speelveld.rij1[kolom] = "v ";
		}
		else{
			Speelveld.rij1[kolom] = "o ";
		}
		
	}
}