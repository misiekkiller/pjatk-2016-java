package PJA.wyk02;

public class Main_w3_p2{

	public static void main(String[] args){
		
		//final int wrt;
		//System.out.println(wrt);
		//wrt = 6;
		
		System.out.println("3 & 5 => " + (3 & 5) );
		System.out.println("3 | 5 => " + (3 | 5) );
		System.out.println("3 ^ 5 => " + (3 ^ 5) );
		
		System.out.println("3 << 1 => "+ (3 << 1));
		System.out.println("6 >> 1 => "+ (6 >> 1));
		
		int wrt = 3;
		wrt = wrt << 1;
		System.out.println(wrt);
		wrt = wrt >> 1;
		System.out.println(wrt);
		
		wrt = 1;
		wrt = wrt << 31;
		System.out.println(wrt);
		
		//wrt = wrt >> 31;
		//System.out.println(wrt);
		
		wrt = wrt >>> 31;
		System.out.println(wrt);
		
		// ======================================
		
		System.out.println( true && true);
		System.out.println( true || true);
		
		System.out.println( (3 < 7) && (3 > 5));

		// ==============================
		
		if( !true ){
			System.out.println("Jest true");
		} else
			System.out.println("Nie jest true");
		
		// =================================
		
		
		int x = (int)(Math.random()*30) - 15;
		
		
		if(x > 10)
			System.out.println("A");
		else
			if( x < -10)
				System.out.println("B");
			else
				if(x > 0 )
					System.out.println("AC");
				else
					if(x <= -5)
						System.out.println("BC");
					else
						System.out.println("C");
		
		if((x < 7) && (x > 5)){
			
		}
		
		// =========================================
		final int czerwony = 1;
		final int zielony = 2;
		final int niebieski = 4;
		
		
		int color = (int)(Math.random()*8);
/*		
		if(color == czerwony)
			System.out.println("czerwony");
		if(color == zielony)
			System.out.println("zielony");
		if(color == niebieski)
			System.out.println("niebieski");		
*/

		//color = czerwony & czerwony;

//		switch(color){
//			case 1:
//				System.out.println("czerwony");
//				System.out.println("czerwony");
//				break;
//			case zielony:
//				System.out.println("zielony");
//				break;
//			case niebieski:
//				System.out.println("niebieski");
//				break;
//			case czerwony & zielony:
//				System.out.println("zolty");
//				break;
//			case czerwony & niebieski:
//				System.out.println("magenta");
//				break;
//			case niebieski & zielony:
//				System.out.println("cyan");
//				break;
//			case czerwony & zielony & niebieski:
//				System.out.println("bialy");
//				break;
//			default:
//				System.out.println("to nie jest kolor");
		}
	}



