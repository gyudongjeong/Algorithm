import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for (int j = 0; j < N; j++) {
			if (max < arr[j]) {
				max = arr[j];
			}
			if (min > arr[j]) {
				min = arr[j];
			}
		}
		System.out.print(min + " " + max);
		sc.close();
	}

}