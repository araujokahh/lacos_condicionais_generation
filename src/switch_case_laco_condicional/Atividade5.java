package switch_case_laco_condicional;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int item, quantidadeComprada;
		float valorTotal;

		System.out.println("\nEscolha as opções de lanche: ");
		System.out.println("\nCÓD. DO PRODUTO    ||     PRODUTO      ||    PREÇO UNITÁRIO");
		System.out.println("     1                Cachorro Quente            R$ 10,00");
		System.out.println("     2                    X-Salada               R$ 15,00");
		System.out.println("     3                    X-Bacon                R$ 18,00");
		System.out.println("     4                      Bauru                R$ 12,00");
		System.out.println("     5                  Refrigerante             R$  8,00");
		System.out.println("     6                Suco de laranja            R$ 13,00");

		System.out.println("\nDigite o código desejado: ");
		item = scanner.nextInt();

		switch (item) {
		case 1:
			System.out.println("Digite a quantidade: ");
			quantidadeComprada = scanner.nextInt();

			valorTotal = quantidadeComprada * 10;

			System.out.printf("Produto: CACHORRO QUENTE || Valor total R$ %.2f", valorTotal);

			break;

		case 2:
			System.out.println("Digite a quantidade: ");
			quantidadeComprada = scanner.nextInt();

			valorTotal = quantidadeComprada * 15;

			System.out.printf("Produto: X-SALADA || Valor total R$ %.2f", valorTotal);
			break;
		case 3:
			System.out.println("Digite a quantidade: ");
			quantidadeComprada = scanner.nextInt();

			valorTotal = quantidadeComprada * 18;

			System.out.printf("Produto: X-BACON || Valor total R$ %.2f", valorTotal);
			break;
		case 4:
			System.out.println("Digite a quantidade: ");
			quantidadeComprada = scanner.nextInt();

			valorTotal = quantidadeComprada * 12;

			System.out.printf("Produto: BAURU || Valor total R$ %.2f", valorTotal);
			break;
		case 5:
			System.out.println("Digite a quantidade: ");
			quantidadeComprada = scanner.nextInt();

			valorTotal = quantidadeComprada * 8;

			System.out.printf("Produto: REFRIGERANTE || Valor total R$ %.2f", valorTotal);
			break;
		case 6:
			System.out.println("Digite a quantidade: ");
			quantidadeComprada = scanner.nextInt();

			valorTotal = quantidadeComprada * 13;

			System.out.printf("Produto: SUCO DE LARANJA || Valor total R$ %.2f", valorTotal);
			break;

		default:
			System.out.println("Por favor, verifique a tabela e escolha uma opção válida.");
			break;
		}
		scanner.close();

	}

}
