import java.util.Scanner;

public class Corte2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

		float num, cutoff;

        while (scanner.hasNext()) {

			num = scanner.nextFloat();
			cutoff = scanner.nextFloat();
			
			float numF = num - (int)num;

			if (numF >= cutoff) {
				System.out.println(((int)num) + 1);
			} else {
				System.out.println((int)num);
			}
        }

        scanner.close();
    }
}
