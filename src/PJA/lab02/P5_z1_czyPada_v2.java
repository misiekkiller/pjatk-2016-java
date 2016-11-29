package PJA.lab02;

public class P5_z1_czyPada_v2 {

    public static void main(String[] args) {

        boolean czyPada = true;
        boolean czySwieciSlonce = true;

        if (czyPada && !czySwieciSlonce) {
            System.out.println("plucha");
        } else if (czyPada && czySwieciSlonce) {
            System.out.println("tęcza");
        } else if (!czyPada && czySwieciSlonce) {
            System.out.println("słonecznie");
        } else {
            System.out.println("pochmurno");
        }

    }
}

/**
 Napisz program wykorzystujacy instrukcje warunkowa if i wyswietlajacy stany pogody jako:
  plucha – gdy pada i nie swieci słonce,
  tecza – gdy pada i swieci słonce,
  słonecznie - gdy swieci słonce i nie pada,
  pochmurno - gdy nie swieci słonce i nie pada.
 */