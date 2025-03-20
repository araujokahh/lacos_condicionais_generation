package if_laco_condicional;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numero, resultado;

		System.out.println("Por favor, digite um número: ");
		numero = scanner.nextInt();

		resultado = numero % 2;

		if (resultado == 0 && numero < 0) {
			System.out.println("O número " + numero + " é par e negativo!");

		} else if (resultado != 0 && numero > 0) {
			System.out.println("O número " + numero + " é ímpar e positivo!");

		} else if (resultado == 0) {
			System.out.println("O número " + numero + " é par e positivo!");

		} else {
			System.out.println("O número " + numero + " é ímpar e negativo!");

		}

		scanner.close();

	}

}
