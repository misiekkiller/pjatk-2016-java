package PJA.lab01;

public class P3_z4_SetsConditionals {

	public static void main(String[] args) {
// METHOD 1
		int x = 1;
		System.out.println(x < 0 ? "Nalezy do B" : x > 1 ? "Nalezy do A" : "Nalezy do ABC");

// METHOD 2
		String result = "Nalezy do zbioru ";
		if (x < 0) {
			result += "B";
		} else if (x > 1) {
			result += "A";
		} else {
			result += "ABC";
		}
		System.out.println(result);
	}
}

/**
        (-inf , 0) -> B
        [0, 1] -> ABC
        (1, inf) -> A
*/