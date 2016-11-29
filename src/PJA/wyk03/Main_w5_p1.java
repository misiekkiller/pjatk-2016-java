package PJA.wyk03;

public class Main_w5_p1{

	public static void main(String[] args){
		int wrt = 0;
		int dana01, dana02;
		int[] tab01, tab02;
		int a[], b;
		
		int[] tab = {1, 2, 3, 4, 5};
		System.out.println("tab[0] " + tab[0]);
		System.out.println("tab[1] " + tab[1]);
		System.out.println("tab[2] " + tab[2]);

		System.out.println("Długość tablicy: " + tab.length);

		for (int i = 0; i < tab.length; i++){
			System.out.println("tab[" + i + "]" + tab[i]);
		}
		
		int[] data = {
			(int)(Math.random()*100),
			(int)(Math.random()*100),
			(int)(Math.random()*100),
			(int)(Math.random()*100),
			(int)(Math.random()*100),
			(int)(Math.random()*100),
			(int)(Math.random()*100)
		};
		
		for (int i = 0; i < data.length; i++){
			System.out.println("data[" + i + "]" + data[i]);
		}		
		
//		if (data == null) {
//			System.out.println("Tablica nie istnieje");
//		}
//		else {
//			int minVal = data[0];
//			if (data.length >= 2){
//				for (int i = 1; i < data.length; i++){
//					System.out.println(
//						data[i] + " < " + minVal + " = " + (data[i] < minVal)
//					);
//					if(data[i] < minVal)
//						minVal = data[i];
//				}
//			}
//		}
		
		/*
		int[] tmpTab = null;
		
		System.out.println(tmpTab == null);
		*/
		
		// ========================
		{
		//Gdzie jest minVal
		int minValIndex = 0;
		
		for(int i=1; i<data.length; i++){
			System.out.println(
				data[i] +" < "+ data[minValIndex] + " = " + (data[i] < data[minValIndex])
			);
			if(data[i] < data[minValIndex])
				minValIndex = i;
		}
		System.out.println("minVal: "+data[minValIndex]);
		
		// zamien wartosc
		{
		int tmp = data[0];
		data[0] = data[minValIndex];
		data[minValIndex] = tmp;
		}
		
		for(int i=0; i<data.length; i++){
			System.out.print(data[i]+", ");
		}
		System.out.println();
		
		}
		// =========================================
		
		for( int j = 0; j < data.length-1; j++){
			int minValIndex = j;
			for(int i=j+1; i<data.length; i++){
				if(data[i] < data[minValIndex])
					minValIndex = i;
			}
			System.out.println("minVal: "+data[minValIndex]);		
			{
			int tmp = data[j];
			data[j] = data[minValIndex];
			data[minValIndex] = tmp;
			}
		}
		
		for(int i=0; i<data.length; i++){
			System.out.print(data[i]+", ");
		}
		System.out.println();
		
		
		// ==========================================
		
		//int[] myTab[] = { tab, data};
		int[][] myTab = { tab, data};
		
		for (int i = 0; i < myTab.length; i++) {
			System.out.println(myTab[i]);
			for (int j = 0; j < myTab[i].length; j++){
				System.out.print(myTab[i][j]+", ");
			}
			System.out.println();
		}
		
	}
	
}