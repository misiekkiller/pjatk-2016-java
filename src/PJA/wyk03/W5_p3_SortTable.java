package PJA.wyk03;

public class W5_p3_SortTable {

    public static void main(String[] args) {

/** CREATE ARRAY**/
        int[] data = {(int)(Math.random()*100),
                (int)(Math.random()*100), (int)(Math.random()*100), (int)(Math.random()*100),
                (int)(Math.random()*100), (int)(Math.random()*100), (int)(Math.random()*100)
        };

/** PRINT ARRAY **/
        for (int p = 0; p < data.length; p++){
            System.out.print(data[p]+ " ");
        }
        System.out.println("\n");

/** MINIMAL INDEX FINDER + INDEXES REPLACER **/
        for (int j = 0; j < data.length-1; j++){
            int minValIndex = j;
            for (int i = j+1; i < data.length; i++) {       // wyszukuje najmniejszą wartość i wstawia ją na początek.
                if (data[i] < data[minValIndex])
                    minValIndex = i;
            }
            System.out.println("Znalazłem najmniejszą wartość i przechodzę w głąb tabeli: " + data[minValIndex]);
            // REPLACEMENT MECHANISM
            {
                int tmp = data[j];                  // tmp przechowuje aktualny element [j]
                data[j] = data[minValIndex];        // pod element [j] podkładamy mniejszy element [i]
                data[minValIndex] = tmp;            // z tmp przywracamy element [j] na miejsce zwolnione przez element [i]
            }
        }
        System.out.println();

/** PRINT RESULT **/
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }

    }
}