package if_laco_condicional;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String ave = "ave", mamifero = "mamifero", inseto = "inseto", anelideo = "anelideo", carnivoro = "carnivoro",
				onivoro = "onivoro", hematofago = "hematofago", vertebrado = "vertebrado",
				invertebrado = "invertebrado", caracteristica1, caracteristica2, caracteristica3;

		System.out.println("Escolha a primeira característica: VERTEBRADO ou INVERTEBRADO");
		caracteristica1 = scanner.nextLine();
		if (caracteristica1.equalsIgnoreCase(vertebrado)) {
			System.out.println("Escolha a segunda característica: AVE ou MAMIFERO");
			caracteristica2 = scanner.nextLine();
			if (caracteristica2.equalsIgnoreCase(ave)) {
				System.out.println("Escolha a terceira característica: CARNÍVORO ou ONÍVORO");
				caracteristica3 = scanner.nextLine();
				if (caracteristica3.equalsIgnoreCase(carnivoro)) {
					System.out.println("Águia");

				} else {
					System.out.println("Pomba");

				}

			} else if (caracteristica2.equalsIgnoreCase(mamifero)) {
				System.out.println("Escolha a terceira característica: ONÍVORO ou HERBÍVORO");
				caracteristica3 = scanner.nextLine();
				if (caracteristica3.equalsIgnoreCase(onivoro)) {
					System.out.println("Homem");

				} else {
					System.out.println("Vaca");

				}

			}
		} else if (caracteristica1.equalsIgnoreCase(invertebrado)) {
			System.out.println("Escolha a segunda característica: INSETO ou ANELÍDEO");
			caracteristica2 = scanner.nextLine();
			if (caracteristica2.equalsIgnoreCase(inseto)) {
				System.out.println("Escolha a terceira característica: HEMATÓFAGO ou HERBÍVORO");
				caracteristica3 = scanner.nextLine();
				if (caracteristica3.equalsIgnoreCase(hematofago)) {
					System.out.println("Pulga");

				} else {
					System.out.println("Lagarta");

				}

			} else if (caracteristica2.equalsIgnoreCase(anelideo)) {
				System.out.println("Escolha a terceira característica: HEMATÓFAGO ou ONÍVORO");
				caracteristica3 = scanner.nextLine();
				if (caracteristica3.equalsIgnoreCase(hematofago)) {
					System.out.println("Sanguessuga");

				} else {
					System.out.println("Minhoca");

				}

			}

		}
		scanner.close();

	}
}
