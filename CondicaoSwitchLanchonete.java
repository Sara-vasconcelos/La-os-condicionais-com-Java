package lacoscondicionais;

import java.util.Scanner;

public class CondicaoSwitchLanchonete {

	public static void main(String[] args) {

//		 escreva um algoritmo em Java que leia o código de um item (número inteiro de 1 a 6) e a 
//		 quantidade comprada deste item (número inteiro). A seguir, mostre na tela o valor total da 
//		 conta e o nome do produto que foi comprado.

//Laço Condicional Switch exe 01

		Scanner leia = new Scanner(System.in);

		int codigoDoProduto, quantidade;

		float ValorTotal;

		float preco1 = 10.00f;
		float preco2 = 15.00f;
		float preco3 = 18.00f;
		float preco4 = 12.00f;
		float preco5 = 08.00f;
		float preco6 = 13.00f;

		System.out.println("Selecione uma opção:");

		System.out.println("*** 1 - Cachorro Quente ***");
		System.out.println("*** 2 - X-Salada ***");
		System.out.println("*** 3 - X-Bacon***");
		System.out.println("*** 4 -Bauru ***");
		System.out.println("*** 4 - Refrigerante ***");
		System.out.println("*** 4 - Suco de laranja ***");

		codigoDoProduto = leia.nextInt();

		System.out.println("Qual é a quantidade que vc quer?");
		quantidade = leia.nextInt();

		switch (codigoDoProduto) {
		case 1:
			ValorTotal = quantidade * preco1;
			System.out.println("Vc comprou " + quantidade + " Cachorro quente e o valor ficou " + ValorTotal);
			break;

		case 2:
			ValorTotal = quantidade * preco2;
			System.out.println("Vc comprou " + quantidade + " Xsalada e o valor ficou " + ValorTotal);
			break;

		case 3:
			ValorTotal = quantidade * preco3;
			System.out.println("Vc comprou " + quantidade + " X-Bacon  e o valor ficou " + ValorTotal);
			break;

		case 4:
			ValorTotal = quantidade * preco4;
			System.out.println("Vc comprou " + quantidade + " Bauru  e o valor ficou " + ValorTotal);
			break;

		case 5:
			ValorTotal = quantidade * preco5;
			System.out.println("Vc comprou " + quantidade + " Refrigerante e e o valor ficou " + ValorTotal);
			break;

		case 6:
			ValorTotal = quantidade * preco6;
			System.out.println("Vc comprou " + quantidade + " Suco de laranja e o valor ficou " + ValorTotal);
			break;
		}

	}

}
