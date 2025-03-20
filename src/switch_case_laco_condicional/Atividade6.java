package switch_case_laco_condicional;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nomeColaborador;
		int codigoCargo;
		float salario, reajuste;
		double novoSalario;

		System.out.println("\nCÓD. DO CARGO    ||     CARGO      ||    % DO REAJUSTE");
		System.out.println("     1                 Gerente               10%");
		System.out.println("     2                 Vendedor               7%");
		System.out.println("     3                Supervisor              9%");
		System.out.println("     4                Motorista               6%");
		System.out.println("     5                Estoquista              5%");
		System.out.println("     6               Tecnico de TI            8%");

		System.out.println("\nNome do colaborador: ");
		nomeColaborador = scanner.nextLine();

		System.out.println("Código do cargo: ");
		codigoCargo = scanner.nextInt();

		System.out.println("Informe o salário atual: ");
		salario = scanner.nextFloat();

		switch (codigoCargo) {
		case 1:
			reajuste = 10 / 100f;
			novoSalario = salario + (reajuste * salario);

			System.out.println("Nome do colaborador: " + nomeColaborador + "\nCargo: Gerente");
			System.out.printf("Novo salário: R$ %.2f", novoSalario);

			break;

		case 2:
			reajuste = 7 / 100f;
			novoSalario = salario + (reajuste * salario);

			System.out.println("Nome do colaborador: " + nomeColaborador + "\nCargo: Vendedor");
			System.out.printf("Novo salário: R$ %.2f", novoSalario);

			break;
		case 3:
			reajuste = 9 / 100f;
			novoSalario = salario + (reajuste * salario);

			System.out.println("Nome do colaborador: " + nomeColaborador + "\nCargo: Supervisor");
			System.out.printf("Novo salário: R$ %.2f", novoSalario);

			break;
		case 4:
			reajuste = 6 / 100f;
			novoSalario = salario + (reajuste * salario);

			System.out.println("Nome do colaborador: " + nomeColaborador + "\nCargo: Motorista");
			System.out.printf("Novo salário: R$ %.2f", novoSalario);

			break;
		case 5:
			reajuste = 5 / 100f;
			novoSalario = salario + (reajuste * salario);

			System.out.println("Nome do colaborador: " + nomeColaborador + "\nCargo: Estoquista");
			System.out.printf("Novo salário: R$ %.2f", novoSalario);

			break;
		case 6:
			reajuste = 8 / 100f;
			novoSalario = salario + (reajuste * salario);

			System.out.println("Nome do colaborador: " + nomeColaborador + "\nCargo: Técnico de TI");
			System.out.printf("Novo salário: R$ %.2f", novoSalario);

			break;

		default:
			System.out.println("Por favor, verifique a tabela e escolha uma opção válida.");
			break;
		}
		scanner.close();
		
	}

}
