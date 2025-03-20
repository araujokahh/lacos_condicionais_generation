package switch_case_laco_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);
		
		float numero1, numero2, resultado;
		int operacao;

		System.out.println("\n  CÓDIGO    ||     OPERAÇÃO");
		System.out.println("     1               Soma");
		System.out.println("     2             Subtração");
		System.out.println("     3            Multiplicação");
		System.out.println("     4               Divisão");

		System.out.println("\nDigite o primeiro número: ");
		numero1 = scanner.nextFloat();

		System.out.println("\nDigite o segundo número: ");
		numero2 = scanner.nextFloat();

		System.out.println("\nDigite o número da operação desejada: ");
		operacao = scanner.nextInt();

		switch (operacao) {
		case 1:
			System.out.println("Você escolheu: SOMA");

			resultado = numero1 + numero2;

			System.out.printf(numero1 + " + " + numero2 + " = " + resultado);

			break;

		case 2:
			System.out.println("Você escolheu: SUBTRAÇÃO");

			resultado = numero1 - numero2;

			System.out.printf(numero1 + " - " + numero2 + " = " + resultado);
			break;
		case 3:
			System.out.println("Você escolheu: MULTIPLICAÇÃO");

			resultado = numero1 * numero2;

			System.out.printf(numero1 + " * " + numero2 + " = " + resultado);
			break;
		case 4:
			System.out.println("Você escolheu: DIVISÃO");

			resultado = numero1 / numero2;

			System.out.printf(numero1 + " / " + numero2 + " = " + resultado);
			break;

		default:
			System.out.println("Operação inválida!");
			break;
		}
		scanner.close();

	}

}