
import java.util.Scanner;

public class Soma {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int num1, num2, soma;

		System.out.println("Digite um número: ");
		num1 = entrada.nextInt();

		System.out.println("Digite outro número: ");
		num1 = entrada.nextInt();

		soma = num1 + num2;

		System.out.printf("A soma de %d e %d e %d!\n", num1, num2, soma);
	}
}
