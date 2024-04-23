package lacoscondicionais;

import java.util.Scanner;

public class CondicaoImparPar {

	public static void main(String[] args) {
		// Exercicio par/impar e negativo/positivo
		
//		Escreva um algoritmo em Java, que leia um número inteiro via teclado e
//		mostre na tela uma mensagem indicando se este número é par ou ímpar e se o número é positivo ou negativo

		int numero;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um número");
		numero = leia.nextInt();

		if (numero % 2 == 0) { // aqui ele valida se ele é par , e positivo e negativo
			if (numero > 0) {
				System.out.println("O número " + numero + " é par e positivo!");
			} else if (numero < 0) {
				System.out.println("O número " + numero + " é par e negativo!");
			} else {
				System.out.println("Vc digitou   zero e ele é par e negativo!");// caso as duas condições sejam falsas ,
																				// e o usuario digitar 0
			}
		} else { // senão terá outra condição , que o numero é impar , e se é positivo ou
					// negativo
			if (numero > 0) {
				System.out.println("O número " + numero + " é ímpar e positivo!");
			} else if (numero < 0) {
				System.out.println("O número " + numero + " é ímpar e negativo!");
			} else {
				System.out.println("Vc digitou   zero e ele é par e negativo!");
			}
		}

		leia.close(); // fecha o scanner

	}

}
