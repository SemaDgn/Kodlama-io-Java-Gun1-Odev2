package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {

		int number = 2;
		int remainder = number % 2;
		boolean isframe = true;
		if (number == 1) {

			System.out.println("Sayı asal değildir.");
			return;
		}
		if (number < 1) {
			System.out.println("Geçersiz sayı");

		}
		for (int i = 2; i < number; i++) {

			if (number % i == 0) {
				isframe = false;

			}

		}
		if (isframe) {
			System.out.println("Sayı asaldır.");

		} else {
			System.out.println("Sayı asal değildir.");
		}

	}
}
