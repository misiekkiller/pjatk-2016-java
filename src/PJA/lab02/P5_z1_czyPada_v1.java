package PJA.lab02;

public class P5_z1_czyPada_v1 {
	
	public static void main(String[] args) {

		boolean czyPada = false;
		boolean czySwieciSlonce = false;
		
		if (czyPada == true && czySwieciSlonce == false) {
			System.out.println("plucha");
		} else if (czyPada == true && czySwieciSlonce == true) {
			System.out.println("tecza");
		} else if (czySwieciSlonce == true && czyPada == false) {
			System.out.println("slonecznie");
		} else {
			System.out.println("pochmurno");
		}
	}
}