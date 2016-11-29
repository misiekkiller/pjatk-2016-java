// TODO: 29/11/2016. Add to VNTools.Ciphers. Cipher and Decipher methods, or 1 for C, 0 for De.

package PJA.lab03;
import VNTools.*;

public class P7_z5_CipherAddIndexes {

    public static void main(String[] args) {
        String sentence = Input.swingString("Enter a sentence to cipher: ");
        char[] sentenceArray = sentence.toCharArray();
        ArrayShow.oneDimCharPrintValues(sentenceArray, "","");

        for (int i = 0; i < sentenceArray.length ; i++) {
            sentenceArray[i] += i;
        }
        ArrayShow.oneDimCharPrintValues(sentenceArray, "","");

        for (int i = 0; i < sentenceArray.length ; i++) {
            sentenceArray[i] -= i;
        }
        ArrayShow.oneDimCharPrintValues(sentenceArray, "","");

    }
}

/** Utwórz program szyfrujacy i deszyfrujacy ciag znaków dostarczony w programie
 * jako tablica zmiennych typu char. Operacja szyfrowania słowa bedzie polegac
 * na dodaniu do znaku indeksu w tablicy na którym znajduje sie ten znak.
 * Wyswietl wszystkie etapy tego procesu pokazujac słowo: orginalne, zaszyfrowane i odszyfrowane.
 */