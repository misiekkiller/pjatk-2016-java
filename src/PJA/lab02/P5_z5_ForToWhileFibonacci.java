package PJA.lab02;

public class P5_z5_ForToWhileFibonacci {
	
	public static void main(String[] args) {

		int x = 1;
		int s = 0;

		while (x <= 10) {
			s = s + x;
			x++;
		}

		System.out.println(s);
		
		/*
		int s = 0;
		for (int i = 1; i <=10; i++)
			s = s + i;
			
		System.out.println(s);
		*/
	}
}

/**
		 Dana jest nastepujaca petla:
		 1 int s = 0 ;
		 2 for ( int i = 1 ; i <= 1 0 ; i++)
		 3 s = s + i ;
		 Zmodyfikuj powyzszy kod aby wykorzystywał petle while.
 */