package PJA.wyk03;

public class W5_p2_MinArrayIndex {

    public static void main(String[] args) {

/** CREATE ARRAY**/
        int[] data = {(int)(Math.random()*100), (int)(Math.random()*100), (int)(Math.random()*100),
                (int)(Math.random()*100), (int)(Math.random()*100), (int)(Math.random()*100), (int)(Math.random()*100)
        };

/** PRINT ARRAY **/
        for (int k = 0; k < data.length; k++){
            System.out.print(data[k]+" ");
        }
        System.out.println("\n");

/** SEARCH FOR MINIMAL VALUE INDEX**/
        int minValIndex = 0;
        for (int i = 1; i < data.length; i++) {
            System.out.println(
                    data[i] + " < " + data[minValIndex] + " = " + (data[i] < data[minValIndex])
            );
            if (data[i] < data[minValIndex])        //najpierw porównuje z index=0, potem z nowym minValIndex
                minValIndex = i;
        }

/** PRINT RESULT **/
        System.out.println("minimal value : " + data[minValIndex] + ", at index = " + minValIndex);

    }
}