package PJA.wyk02;

public class W4_p5_InfiniteWaveform {

    public static void main(String[] args) {

        while (true) {
            int u = (int)(Math.random()*50);
            for (int k = 0; k < u; k++){
                System.out.print('*');
            }
            System.out.println();
        }

    }
}
