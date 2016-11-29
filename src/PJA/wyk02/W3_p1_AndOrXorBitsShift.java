package PJA.wyk02;

public class W3_p1_AndOrXorBitsShift {

    public static void main(String[] args) {

//        final int wrt = 5;
//        wrt = 6;

        /** AND, OR, XOR **/
        System.out.println("3 & 5 => "+(3 & 5));	// AND
        // 0110 = 3
        // 1010 = 5
        // 0010 = 0+1+0+0 = 1

        System.out.println("3 | 5 => "+(3 | 5));	// OR
        //(4210)
        // 0110 = 3
        // 1010 = 5
        // 1110 = 0+1+2+4 = 7

        System.out.println("3 ^ 5 => "+(3 ^ 5));	// XOR
        // 0110 = 3
        // 1010 = 5
        // 1100 = 6
        System.out.println();


        /** BITS SHIFT
         * Binary Left Shift Operator. The left operands value is moved left by the number of bits specified by the right operand.
         *      (60 << 2 will give 240 which is 1111 0000).
         * Binary Right Shift Operator. The left operands value is moved right by the number of bits specified by the right operand.
         *      (60 >> 2 will give 15 which is 1111).
         * Shift right zero fill operator. The left operands value is moved right by the number of bits specified by the right operand
         *      and shifted values are filled up with zeros. (60 >>> 2 will give 15 which is 0000 1111).
         * Binary Ones Complement Operator is unary and has the effect of 'flipping' bits.
         *      (~A will give -61 which is 1100 0011 in 2's complement form due to a signed binary number).
         */
        System.out.println("1 << 3 => "+(1 << 3));
        // 0001 = 1
        // 1000 = 8

        System.out.println("8 >> 2 => "+(8 >> 2));
        // 1000 = 8
        // 0010 = 2

        int wrt = 1;
        System.out.println("wrt << 32 => "+(wrt << 32));
        // 0001
        // 0001 0000 0000 0000 0000
        // Przesunięcie wywołuje zbyt dużą wartość dla int'a.

        System.out.println((5 << 32) >> 32);
        // Zbyt duże przesunięcie daje zły wynik pomimo ponownego przesunięcia z powrotem.

        int wrt2 = 5;
        wrt2 = wrt2 << 31;
        System.out.println("błędna wartość 1: " + wrt2);
        System.out.println("błędna wartość 2: " + (wrt2 >> 31));
        System.out.println("błędna wartość 3: " + ((wrt2 << 31)  >>> 31));
        System.out.println();

        int res = 713;
        //(2048 1024 512 256) (128 64 32 16) (8 4 2 1)
        // |0010 1100 1001| = 1 + 8 + 64 + 128 + 512 = 713
        System.out.println(res & (1 << 11));
        // 0001 -> 1000 0000 0000 = 2048
        // 0010 1100 1001 	res
        // 1000 0000 0000 	1 << 11
        // 0000 0000 0000	wynik 0
        System.out.println(res & (1 << 10));
        // 0010 1100 1001 	res
        // 0100 0000 0000	1 << 10
        // 0000 0000 0000	wynik 0
        System.out.println(res & (1 << 9));
        // 0010 1100 1001 	res
        // 0010 0000 0000 	1 << 9
        // 0010 0000 0000	wynik 512
        System.out.println();


    }
}
