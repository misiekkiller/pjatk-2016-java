package PJA.wyk02;

public class Main_w4_p2{
		
	public static void main(String[] args){
		
		int wrt = 6;
		
		while(wrt > 0){
			System.out.println("test");
			wrt = wrt - 1;
		}
		
		wrt = 6;
		do {
			System.out.println("test2");
			wrt--;
		}while(wrt > 0);
		/*
		for( int i = 0; i < 6; i++){
			System.out.println("test3");
		}
		*/
		for( wrt = 6; wrt > 0; wrt--)
			System.out.println("test4");
		
		//for(;;)
		//	System.out.println("test5");
		
		// ===========================
		/*
		while(true){
			int res = 0;
			res++;
		}
		*/
		
		/*
		for(int res = 0; ;res++)
			;
		*/
		wrt = 9;
		for( int i = 1; i < 11; i++){
			System.out.println(i * wrt);
		}
		
		for(int j=0; j<10; j++){
			for( int i = 1; i < 11; i++){
				System.out.print((i * j)+" ");
			}
			System.out.println();
		}
		
		for(int k = 10; k >= 0; k--){
			System.out.println(k);
		}
		
		for( int l = 0; l < 10; l++){
			int m = l;
			while(m > 0){
				System.out.println(m);
				m--;
			}
		}
		
		int color;
		do{
			color = (int)(Math.random()*4);
			System.out.println("Wylosowano: "+color);
		}while(color != 1);
		// ================================================================
		

		
		double[] tab = { 1.0, 2.0, 3.0};
		int[] tab2 = {1,2,3};
		System.out.println(tab[0]);
		System.out.println(tab[1]);
		System.out.println(tab[2]);
		
		for(int i=0; i < tab.length; i++){
			System.out.println(tab[i]);
		}
		
		int ileLiczbWylosowac = tab.length;
		for(int i=0; i<ileLiczbWylosowac; i++){
			tab[i] = Math.random()*100;
			System.out.println(tab[i]);
		}

		for(int i=0; i < tab.length; i++){
			System.out.println(tab[i]);
		}
		
		int[] tab3 = new int[5];
		for(int i=0; i<tab3.length; i++)
			System.out.println(tab3[i]);
		
	}
}










