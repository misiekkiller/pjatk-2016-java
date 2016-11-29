package PJA.wyk03;

public class Main_w5_p2 {
		
	public static void main(String[] args){
		
		int dana01, dana02, dana03;
		int tab[] = { 1, 2, 3};
		int[] tab2 = tab;
		
		int a[], b;
		
		System.out.println("tab[0]: "+tab[0]);
		System.out.println("tab[1]: "+tab[1]);
		System.out.println("tab[2]: "+tab[2]);
		
		System.out.println("Dlugosc tablicy "+tab.length);
		
		for(int i=0; i<tab.length; i++){
			System.out.println("tab["+i+"]: "+tab[i]);
		}
		
		int[] data = {
			(int)(Math.random()*100),
			(int)(Math.random()*100),
			(int)(Math.random()*100),
			(int)(Math.random()*100),
			(int)(Math.random()*100),
			(int)(Math.random()*100),
			(int)(Math.random()*100),
			(int)(Math.random()*100)
		};
		
		for(int i=0; i<data.length; i++){
			if(i % 2 == 0)
				System.out.println("data["+i+"]: "+data[i]);
		}
// =========================================

		for(int i=0; i<data.length; i++){
			System.out.print(data[i]+" ");
		}
		System.out.println();

		int minValue = data[0];
		for( int i=0; i<data.length; i++){
			if(minValue > data[i])
				minValue = data[i];
		}
		System.out.println("minValue: "+minValue);
		
		// =======================================
		{
		int minValueIndex = 0;
		for( int i=1; i<data.length; i++){
			if(data[minValueIndex] > data[i])
				minValueIndex = i;
		}
		System.out.println(
			"minValue: "+data[minValueIndex]+
			"\nNa ideksie: "+minValueIndex );	
			
		int tmp = data[minValueIndex];
		data[minValueIndex] = data[0];
		data[0] = tmp;		
			
		for(int i=0; i<data.length; i++){
			System.out.print(data[i]+" ");
		}
		System.out.println();			
			
		}			
		
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
		
		// ===================================
		
		int[] nazwa[] = { tab, data};
		for(int i=0; i<nazwa.length; i++){
			System.out.println(nazwa[i]);
			for(int j=0; j < nazwa[i].length; j++){
				System.out.print( nazwa[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
	



	