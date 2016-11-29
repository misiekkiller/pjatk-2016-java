package PJA.lab03;

public class Zadanie061116e3 {

	public static void main(String[] args) {

		
		// method 1
//		Random random = new Random();
//		int generatedTabLength = random.nextInt(10);
		
		
		// method 2
		int generatedTabLength = (int)(Math.random()* 10);
		
		int[] tab = new int[generatedTabLength];
		
		System.out.println(tab.length);
		
	}
		
}