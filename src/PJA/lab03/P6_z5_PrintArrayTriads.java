package PJA.lab03;

public class P6_z5_PrintArrayTriads {
    public static void main(String[] args) {
/** program łamie się kiedy długość tablicy % 3 != 0. */

        int[] tab = {1, 0, 0, 0, 2, 0, 0, 0, 3};
//        int[] tab = ArrayAugment.oneDimIntCreateRandom(33,33,0,3);
        int counter = 1;

// PRINT 1/3
        for (int i = 0; i < tab.length; i++) {
            if (i % 3 == 0) {
                System.out.print(counter + "\t");
            }
            System.out.print(tab[i] + " ");
            if (i % 3 == 2) {                                   /** 2 MODULO 3 = 2 !!!! | 2(Reminder) = 0 * 3(Divisor) + 2 **/
                System.out.println();
                counter++;
            }
        }
        System.out.println();

// PRINT 2/3
        counter = 1;
        for (int i = tab.length-1; i >= 0; i--) {
            if (i % 3 == 0) {
                System.out.print(counter + "\t");
                for (int j = i; j <= i+2; j++) {
                        System.out.print(tab[j] + " ");
                    if (j == i+2) {
                        System.out.println();
                        counter++;
                    }
                }
            }
        }
        System.out.println();

// PRINT 3/3
        counter = 1;
        for (int i = tab.length-1; i >= 0; i--) {
            if (i % 3 == 2) {
                System.out.print(counter + "\t");
            }
            System.out.print(tab[i] + " ");
            if (i % 3 == 0) {
                System.out.println();
                counter++;
            }
        }

    }
}

// 012 345 678 | 678 345 012

/** TODO Say you have 1 banana and group of 6 people, this you would express: 1 mod 6 / 1 % 6 / 1 modulo 6.
 * You need 6 bananas for each person in group to be well fed and happy.
 * So if you then have 1 banana and need to share it with 6 people,
 * but you can only share if you have 1 banana for each group member, that is 6 persons,
 * then u will have 1 banana (remainder, not shared on anyone in group),
 * the same goes for 2 bananas. Then you will have 2 banana as remainder (nothing is shared).
 * But when you get 6 bananas, then you should be happy,
 * because then there is 1 banana for each member in group of 6 people,
 * and the remainder is 0 or no bananas left when you shared all 6 bananas on 6 people.
 * Now, for 7 bananas and 6 people in group, you then will have 7 mod 6 = 1,
 * this because you gave 6 people 1 banana each, and 1 banana is the remainder.
 * For 12 mod 6 or 12 bananas shared on 6 people, each one will have two bananas, and the remainder is then 0.
 * */

/** Napisz program, który wyswietli wartosi tej tablicy w nastepujacy sposób:
  1 0 0
  0 2 0
  0 0 3

  0 0 3
  0 2 0
  1 0 0

  3 0 0
  0 2 0
  0 0 1
 **/