package PJA.lab02;

public class P4_z6_Switch {
	
	public static void main(String[] args) {
		
		final int truskawka = 1;
		final int malina = 2;
		final int brzoskwinia = 3;
		final int agrest = 4;
		
		int sloik = 4;
		String odpowiedź = "W słoiku mamy dżem ";

		switch (sloik) {
			case truskawka: odpowiedź += "truskawkowy.";
				break;
			case malina: odpowiedź += "malinowy.";
				break;
			case brzoskwinia: odpowiedź += "brzoskwiniowy.";
				break;
			case agrest: odpowiedź += "agrestowy.";
				break;
		}

		System.out.println(odpowiedź);
	
	}
}


 //