import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
        scan.close();
		
        for (int col = 1; col <= N; col++) {
            for (int spa = N-col; spa >= 1; spa--) {
            	System.out.print(" ");
            }
            
            for (int sta = 1; sta <= col; sta++) {
            	System.out.print("*");
            }
            System.out.println();
        }
    }
}