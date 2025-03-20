package switch_case_laco_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Atividade8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);

		float saldo = 1000.00f, saque, deposito;
		int operacao;

		System.out.println("\nCÓD. OPERAÇÃO  |  OPERAÇÃO");
		System.out.println("     1             Saldo");
		System.out.println("     2             Saque");
		System.out.println("     3            Depósito");

		System.out.println("\nEscolha a operação desejada: ");
		operacao = scanner.nextInt();

		switch (operacao) {
		case 1:
			System.out.println("Operação: SALDO");
			System.out.printf("\nSALDO: R$ %.2f", saldo);

			break;

		case 2:
			System.out.println("\nDigite o valor do saque: ");
			saque = scanner.nextFloat();
			System.out.println("Operação: SAQUE");

			if (saque > saldo) {
				System.out.println("Saldo insuficiente!");
			} else {
				saldo = saldo - saque;
				System.out.printf("\nSALDO: R$ %.2f", saldo);

			}

			break;
		case 3:
			System.out.println("\nDigite o valor do depósito: ");
			deposito = scanner.nextFloat();
			System.out.println("Operação: DEPÓSITO");

			saldo = saldo + deposito;
			System.out.printf("\nSALDO: R$ %.2f", saldo);

			break;

		default:
			System.out.println("Operação inválida!");
			break;
		}

		scanner.close();

	}
}
