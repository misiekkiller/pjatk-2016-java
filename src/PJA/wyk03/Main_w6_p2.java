package PJA.wyk03;

public class Main_w6_p2 {
	
	public static void main(String[] args){
		{
		int[] tab = {1, 2, 3};
		int[] tab2 = tab;
		
		System.out.println(tab[0]);
		System.out.println(tab2[0]);
		
		tab[0] = 5;
		
		System.out.println(tab[0]);
		System.out.println(tab2[0]);

		}
		// ===================
		
		{
		
		int[] tab;
		int zmienna = 6;
		tab = new int[zmienna];
		
		for(int i=0; i<tab.length; i++)
			tab[i] = (int)(Math.random()*100);
		
		
		
		zmienna += 6;
		
		int[] tmp = new int[zmienna];
		for(int i=0; i<tab.length; i++)
			tmp[i] = tab[i];
		tab = tmp;
		
		for(int i=0; i<tab.length;i++){
			System.out.print(tab[i]+" ");
		}
		System.out.println();
		}
		
		{
		int[][] data = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};
		int[][] op = {
			{0, 0, 1},
			{0, 1, 0},
			{1, 0, 0}
		};
		
		int[][] output = new int[3][3];
		
		for(int i=0; i<output.length; i++){
			for(int j=0; j<output[i].length; j++){
				int suma = 0;
				for(int k=0; k<output[i].length; k++){
					suma += data[i][k] * op[k][j];
				}
				output[i][j] = suma;
				System.out.print(output[i][j]+" ");
			}
			System.out.println();
		}
		
		}
		
		{
			
		int[] tab1 = new int[10];
		for(int i=0; i<tab1.length; i++)
			tab1[i] = (int)(Math.random()*100);
		
		int[] tab2 = new int[10];
		for(int i=0; i<tab2.length; i++)
			tab2[i] = (int)(Math.random()*100);	
		
		{
		int[] data = tab1;
		for( int j = 0; j < data.length; j++){
			// znajdowac minindex 
			int minValueIndex = j;
			for( int i=j+1; i<data.length; i++){
				if(data[minValueIndex] > data[i])
					minValueIndex = i;
			}
			// umieszczac na poczatku
			int tmp = data[minValueIndex];
			data[minValueIndex] = data[j];
			data[j] = tmp;
		}
		
		for(int i=0; i<data.length; i++){
			System.out.print(data[i]+" ");
		}
		System.out.println();
		}
		{
		int[] data = tab2;
		for( int j = 0; j < data.length; j++){
			// znajdowac minindex 
			int minValueIndex = j;
			for( int i=j+1; i<data.length; i++){
				if(data[minValueIndex] > data[i])
					minValueIndex = i;
			}
			// umieszczac na poczatku
			int tmp = data[minValueIndex];
			data[minValueIndex] = data[j];
			data[j] = tmp;
		}
		
		for(int i=0; i<data.length; i++){
			System.out.print(data[i]+" ");
		}
		System.out.println();
		}		
		
		
		int[] tab = new int[20];
		/*
		for(int i=0; i<tab1.length; i++){
			tab[i] = tab1[i];
		}		
		for(int i=0; i<tab2.length; i++){
			tab[tab1.length+i] = tab2[i];
		}
		for(int i=0; i<tab.length; i++){
			System.out.print(tab[i]+" ");
		}
		System.out.println();	
		*/
		
		int indS = 0;
		int indK = 0;
		for(int i = 0; i < tab.length; i++){
			if(indS >= tab1.length)
				for( ; indK < tab2.length; indK++, i++)
					tab[i] = tab2[indK];
			else
				if(indK >= tab2.length)
					for( ; indS < tab1.length; indS++, i++)
						tab[i] = tab1[indS];
				else
					if(tab1[indS] < tab2[indK]){
						tab[i] = tab1[indS++];
					}else{
						tab[i] = tab2[indK++];
					}
		}
		for(int i=0; i<tab.length; i++){
			System.out.print(tab[i]+" ");
		}
		System.out.println();
		
		}
	}
}




