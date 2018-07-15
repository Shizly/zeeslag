package weekopdracht;
import java.util.Scanner;

public class Zeeslag {
	public static void main (String[]args){
		Scanner scInt = new Scanner(System.in); 	
		Speler speler = new Speler();					
		Mijnenveger mijnenveger = new Mijnenveger(); 
		mijnenveger.plaatsen();
		Slagschip slagschip = new Slagschip();
		slagschip.plaatsen();
		
		System.out.println("We gaan zeeslag spelen!\n Tekenuitleg: \n~: de zee \no: een misser\nv: geraakt");
		printje();

		for (int j = 0; j < 12; ++j){
			System.out.println("Welke kolom wil je bombarderen? Je hebt "+(12-j) +" pogingen.\nKies uit kolom 1 t/m 5.");
			int kolomInp = scInt.nextInt();
		
			System.out.println(kolomInp-1);
			speler.bombarderen(kolomInp-1);
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
	static String [] rij1 = {"~ ","~ ","~ ","~ ","~ "};
	static String [] rij2 = {"~ ","~ ","~ ","~ ","~ "};
	static String [] rij3 = {"~ ","~ ","~ ","~ ","~ "};
	static String [] rij4 = {"~ ","~ ","~ ","~ ","~ "};
	static String [] rij5 = {"~ ","~ ","~ ","~ ","~ "};

}

class Schip{}

class Mijnenveger extends Schip{
	int length = 2;
	void plaatsen() {
		Speelveld.rij1[1] = "* ";
		Speelveld.rij1[2] = "* ";
		Speelveld.rij1[3] = "* ";
	}
}
class Slagschip extends Schip{
	int length = 3;
	void plaatsen() {
		Speelveld.rij3[3] = "* ";
		Speelveld.rij4[3] = "* ";
		Speelveld.rij5[3] = "* ";
	}
}
class Speler{
	void bombarderen(int kolom){ //int rij
		if (Speelveld.rij1[kolom] == "* ") {
			Speelveld.rij1[kolom] = "v ";
			System.out.println("Raak! Het veld ziet er nu zo uit:");
			Zeeslag.printje();
		}
		else{
			Speelveld.rij1[kolom] = "o ";
			System.out.println("Mis! Het veld ziet er nu zo uit:");
			Zeeslag.printje();
		}
	}
}