package lacoscondicionais;

import java.util.Scanner;

public class AtividadeLacosCondicionais {

	public static void main(String[] args) {
		
		
		// Lista 01 exercicio 01 :Faça um algoritmo em Java que leia 3 valores inteiros
		// A, B e C e imprima na tela se a soma de e A + B é maior, menor ou igual a C.

		int numeroA, numeroB, numeroC, resultado;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o  número A");
		numeroA = leia.nextInt();

		System.out.println("Digite o  número B");
		numeroB = leia.nextInt();

		System.out.println("Digite o  número C");
		numeroC = leia.nextInt();

		resultado = numeroA + numeroB;

		if (resultado > numeroC) {
			System.out.println("A Soma de  A +  B é maior do que o  C");
		} else if (resultado < numeroC) {
			System.out.println("A Soma de  A + B é menor do que o  C");
		} else {
			System.out.println("A Soma de A + número B é igual a C");
		}

	}

		
		

	}


