import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[9];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}
		
		int max = 0;
		int place = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			if (max < numbers[i]) {
				max = numbers[i];
				place = i + 1;
			}
		}
		System.out.println(max);
		System.out.println(place);
        sc.close();
	}

}
