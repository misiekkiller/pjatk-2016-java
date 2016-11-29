package PJA.wyk03;

public class Main_w6_p1 {

	public static void main(String[] args){
	{
	int wrt = 6;

	int[] tab;
	tab = new int[wrt];
	int[] tab2;
	tab2 = tab;		// case oscypka, oscypek i łoscypek to ten sam byt, ale dwie różne nazwy.

	tab2 = new int[wrt*2];		//


	int w;
	
	for (int i = 0; i < tab.length; i++){
		System.out.print(tab[i]+" ");
	}
	System.out.println();
	
	for (int i = 0; i < tab.length; i++){
		tab[i] = (int)(Math.random()*100);
	}
		
	for (int i = 0; i < tab2.length; i++){
		tab2[i] = (int)(Math.random()*100);
	}	


	{
		int[] data = tab;
		for (int j = 0; j < data.length-1; j++){
			int minValIndex = j;
			for (int i = j + 1; i < data.length; i++){
				if (data[i] < data[minValIndex])
					minValIndex = i;
			}
			System.out.println("minVal: " + data[minValIndex]);
			{
			int tmp = data[j];
			data[j] = data[minValIndex];
			data[minValIndex] = tmp;
			}
		}		
	}
	
	{
		int[] data = tab2;
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
	}	


	
	int[] resTab = new int[tab.length+tab2.length];
/*	
	for( int i=0; i< tab.length; i++){
		resTab[i] = tab[i];
	}	
	
	for( int i=0; i< tab2.length; i++){
		resTab[tab.length + i] = tab2[i];
	}	
*/
 /** O TO TO, TEN PROGRAM **/
	int indTab = 0, indTab2 = 0;
	for(int i=0; i < resTab.length; i++){
		
		if( indTab >= tab.length)
			for( ; indTab2 < tab2.length; indTab2++, i++)
				resTab[i] = tab2[indTab2];
		else
			if( indTab2 >= tab2.length)
				for( ; indTab < tab.length; indTab++, i++)
					resTab[i] = tab[indTab];
			else
				if(tab[indTab] < tab2[indTab2]){
					resTab[i] = tab[indTab++];
				}else{
					resTab[i] = tab2[indTab2++];
				}
	}

	
	for( int i=0; i< resTab.length; i++){
		System.out.print(resTab[i]+" ");
	}
	System.out.println();
	
	}
	/** NEW NEW NEW NEW NEW **/
	{
		
	int[][] data = {
		{1, 2, 3},
		{4, 5, 6},
		{7, 8, 9}
	};
		
	int[][] op = {
		{0, 0, 1},
		{0, 1, 0},
		{1, 0, 0},
	};

	int[][] output = new int[3][3];
	
	for(int i=0; i < output.length; i++){
		for(int j=0; j<output[i].length; j++){
			int suma = 0;
			for(int k = 0; k<3; k++){
				suma += data[i][k] * op[k][j];
			}
			output[i][j] = suma;
			System.out.print(output[i][j]+" ");
		}
		System.out.println();
	}
		
		
	}
	
	}
}