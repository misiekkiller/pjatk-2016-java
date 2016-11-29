package PJA.wyk02;

public class Main_w4_p1{
	
	public static void main(String[] args){

		/** WHILE **/
		int wrt = 6;
		while(wrt > 0){
			System.out.println("test1");
			wrt = wrt - 1;
		}

		/** DO WHILE **/
		wrt = 6;
		do{
			System.out.println("test2");
			wrt = wrt - 1;			
		}while(wrt > 0);

		/** FOR **/
		for(int i = 6; i > 0; i--){
			System.out.println("test3");
		}
		
		// =====================================================
		/*
		for(;;)
			System.out.println("test4");
		*/
		// =====================================================
		
		int res = 713;
		
//		for(int i = 31; i >= 0; i--){
//			if((res & (1 << i)) != 0)
//				System.out.print("1");
//			else
//				System.out.print("0");
//			if(i%4 == 0)
//				System.out.print(" ");
//		}
//		System.out.println();
		
		// ======================================================
		
		wrt = 2;
		for(int i = 0; i< 10; i++){
			System.out.println(i * wrt);
		}
		/*
		while(true){
			int res = 0;
			res++;
		}
		*/

		/** LOOP IN LOOP **/
		for(int i = 1; i< 11; i++){
			for( int j = 1; j< 11; j++)
				System.out.print((i * j)+" ");
			System.out.println();
		}
		/*
		while(true){
			int u = (int)(Math.random()*50);
			for(int k = 0; k < u; k++){
				System.out.print('*');
			}
			System.out.println();
		}
		*/
		
		// ==================================================
		int iloscLiczb = 5;
		double wrtLosowa;
		for(int i = 0; i < iloscLiczb; i++){
			wrtLosowa = (Math.random() * 100);
			System.out.println(wrtLosowa);
		}
		
		// ====================================================

		/** LOOP FOR ARRAY **/
		double[] tab = {1.0, 2.0, 3.0};
		/*
		System.out.println(tab[0]);
		System.out.println(tab[1]);
		System.out.println(tab[2]);
		*/
		for(int i=0; i<tab.length; i++)
			System.out.println(tab[i]);
		
		// ============================================
		
		iloscLiczb = tab.length;
		for(int i = 0; i < iloscLiczb; i++){
			tab[i] = (Math.random() * 100);
			System.out.println(tab[i]);
		}
		
		for(int i=0; i<tab.length; i++)
			System.out.println(tab[i]);
		
		int tab2[] = null;
		System.out.println(tab2);
		tab2 = new int[5];
		System.out.println(tab2);
		for(int i=0; i<tab2.length; i++)
			System.out.println(tab2[i]);
	}

}


