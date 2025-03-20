package if_laco_condicional;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String nome;
		int idade;
		boolean primeiaDoacao;

		System.out.println("### FICHA DE DOADOR DE SANGUE ###");
		System.out.println("\nNome do doador: ");
		nome = scanner.nextLine();

		System.out.println("Idade: ");
		idade = scanner.nextInt();

		System.out.println("É a sua primeira doação de sangue? ");
		primeiaDoacao = scanner.nextBoolean();

		if (idade >= 18 && idade <= 59) {
			System.out.println(nome + " está APTO(a) para doar sangue. Parabéns pela iniciativa!");

		} else if (idade >= 60 && idade <= 69 && primeiaDoacao == true) {
			System.out.println(nome + " NÃO está apto(a) para doar sangue! ");

		} else if (idade >= 60 && idade <= 69 && primeiaDoacao == false) {
			System.out.println(nome + " está APTO(a) para doar sangue. Parabéns pela iniciativa!");

		} else  if (idade < 18 || idade > 70) {
			System.out.println(nome + " NÃO está apto(a) para doar sangue!");
		}

		scanner.close();

	}

}
