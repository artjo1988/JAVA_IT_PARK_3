import java.util.Scanner;
class Program1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		int x0 = number / 5000;
		number = number % 5000;
		int x1 = number / 1000;
		number = number % 1000;
		int x2 = number / 500;
		number = number % 500;
		int x3 = number / 100;
		number = number % 100;
		int x4 = number / 50;
		number = number % 50;
		int x5 = number / 10;
		number = number % 10;
		int x6 = number / 5;
		number = number % 5;
		int x7 = number / 2;
		number = number % 2;
		int x8 = number;
		
		System.out.println(x8 + " по 1 рублю " 
			+ x7 + " по 2 рубля " 
			+ x6 + " по 5 рублей " 
			+ x5 + " по 10 рублей " 
			+ x4 + " по 50 рублей "
			+ x3 + " по 100 рублей "
			+ x2 + " по 500 рублей "
			+ x1 + " по 1000 рублей "
			+ x0 + " по 5000 рублей ");

	}
}