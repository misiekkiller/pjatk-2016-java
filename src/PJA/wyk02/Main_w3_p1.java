package PJA.wyk02;

public class Main_w3_p1{
		
		public static void main(String[] args){
			//final int wrt = 5;
			//wrt = 6;
			
			System.out.println("3 & 5 => " + (3 & 5));	// AND
			//(8421)
			// 0011 = 3
			// 0101 = 5
			// 0001 = 0+0+0+1 = 1
			
			System.out.println("3 | 5 => "+(3 | 5));	// OR
			//(8421)
			// 0011 = 3
			// 0101 = 5
			// 0111 = 0+1+2+4 = 7

			System.out.println("3 ^ 5 => "+(3 ^ 5));	// XOR
			// 0011 = 3
			// 0101 = 5
			// 0110 = 6
			
			System.out.println("1 << 3 => "+(1 << 3));
			// 0001 = 1
			// 1000 = 8

			System.out.println("8 >> 2 => "+(8 >> 2));
			// 1000 = 8
			// 0010 = 2
			
			int wrt = 1;
			System.out.println("wrt << 32 => "+(wrt << 32));
			// 0001
			// 0001 0000 0000 0000 0000
			// Przesunięcie wywołuje zbyt dużą wartość dla int'a.

			System.out.println((5 << 32) >> 32);
			// Zbyt duże przesunięcie daje zły wynik pomimo ponownego przesunięcia z powrotem.

			int wrt2 = 5;
			wrt2 = wrt2 << 31;
			System.out.println("błędna wartość 1: " + wrt2);
			System.out.println("błędna wartość 2: " + (wrt2 >> 31));
			System.out.println("błędna wartość 3: " + ((wrt2 << 31)  >>> 31));
			
			// =================================
			
			int res = 713;
			//(2048 1024 512 256) (128 64 32 16) (8 4 2 1)
			// |0010 1100 1001| = 1 + 8 + 64 + 128 + 512 = 713
			System.out.println(res & (1 << 11));
			// 0001 -> 1000 0000 0000 = 2048
			// 0010 1100 1001 	res
			// 1000 0000 0000 	1 << 11
			// 0000 0000 0000	wynik 0
			System.out.println(res & (1 << 10));
			// 0010 1100 1001 	res
			// 0100 0000 0000	1 << 10
			// 0000 0000 0000	wynik 0
			System.out.println(res & (1 << 9));
			// 0010 1100 1001 	res
			// 0010 0000 0000 	1 << 9
			// 0010 0000 0000	wynik 512
			System.out.println(res & (1 << 8));
			System.out.println(res & (1 << 7));
			System.out.println(res & (1 << 6));
			System.out.println(res & (1 << 5));
			System.out.println(res & (1 << 4));
			System.out.println(res & (1 << 3));
			System.out.println(res & (1 << 2));
			System.out.println(res & (1 << 1));
			System.out.println(res & (1 << 0));
			
			//=====================================
			
			System.out.println( true && false);
			System.out.println( true || false);
			
			System.out.println( (3 < 7) && (3 > 5));
			
			// =======================================
			
			if( false )
				System.out.println("Jest true");
			else 
				System.out.println("Jest false");
			System.out.println("i co ???");
			
			//======================================
			
			if( (3 < 7) && (3 > 5) )
				System.out.println("Jest true");
			else 
				System.out.println("Jest false");
			System.out.println("i co ???");
			
			
			int zmienna = (int)(Math.random()*30)-15;
			System.out.println("zmienna: "+zmienna);
			if( zmienna == 9 )
				System.out.println("Jest 9");
			else
				System.out.println("Nie jest 9");
			
			// ================================
			
			
			if( zmienna > 0)
				System.out.println("A");
			else
				if( zmienna <= -5)
					System.out.println("B");
				else
					if( zmienna >= -10 && zmienna <= 10)
						System.out.println("C");
					
			// ================================		
			final int czerwony = 1;
			final int zielony = 2;
			final int niebieski = 4;
			
			int color = (int)(Math.random()*8);

			if(color == czerwony)
				System.out.println("czerwony");
			if(color == zielony)
				System.out.println("zielony");
			if(color == niebieski)
				System.out.println("niebieski");


			color = czerwony | czerwony;
			
//			switch(color){
//				case 1:
//					System.out.println("czerwony");
//					System.out.println("czerwony");
//					break;
//				case zielony:
//					System.out.println("zielony");
//					break;
//				case niebieski:
//					System.out.println("niebieski");
//					break;
//				case czerwony | zielony:
//					System.out.println("zolty");
//					break;
//				case czerwony | niebieski:
//					System.out.println("magenta");
//					break;
//				case zielony | niebieski:
//					System.out.println("cyan");
//					break;
//				case czerwony | zielony | niebieski:
//					System.out.println("blialy");
//					break;
//				default:
//					System.out.println("nie kolor");
//			}
		}
}