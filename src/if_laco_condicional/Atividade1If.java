package if_laco_condicional;

import java.util.Scanner;

public class Atividade1If {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a, b, c, somaAb;

		System.out.println("Digite um valor para A: ");
		a = scanner.nextInt();

		System.out.println("Digite um valor para B: ");
		b = scanner.nextInt();

		System.out.println("Digite um valor para C: ");
		c = scanner.nextInt();

		somaAb = a + b;

		System.out.println(
				"Você digitou os valores: \nA = " + a + "| B = " + b + "| C = " + c + "\nSoma de A + B é = " + somaAb);

		if (somaAb > c) {
			System.out.println("\nA soma de A + B é MAIOR que o valor de C");

		} else if (somaAb < c) {
			System.out.println("\nA soma de A + B é MENOR que o valor de C");

		} else {
			System.out.println("\nA soma de A + B é IGUAL ao valor de C");
		}
		scanner.close();

	}

}
