package lacoscondicionais;

import java.util.Scanner;

public class CondicaoDoadorDeSangue {

	public static void main(String[] args) {
		
//		Para doar sangue é necessário ter entre 18 e 69 anos de idade. 
//		Pessoas com idade entre 60 e 69 anos, só podem doar se não for a sua primeira doação. 
//		Escreva um Algoritmo em Java que obtenha via teclado o nome do doador (String), a idade (inteiro) do doador e se é a primeira doação (boolean). 
//		De acordo com as Regras para a doação, mostre na tela se o doador está Apto ou Não Apto para doar sangue

		// Exercicio doador de sangue
		
		Scanner leia = new Scanner(System.in);

		int idade;
		String doador;
		boolean primeiraDoacao;
	
		System.out.println("Digite o nome do doador");
		doador = leia.nextLine();
		
		System.out.println("Digite a idade do doador");
		idade = leia.nextInt();
	
		System.out.println("Primeira doação de sangue?");
		primeiraDoacao= leia.nextBoolean();
		
		
		 if (idade >= 18 && idade <= 69) { //valido se ele tem entre 18 e 69
	            if (idade >= 60 && idade <= 69 && primeiraDoacao) { // e valido se ele tem entre 60 e 69
	                System.out.println(doador + " não está apto para doar sangue!");
            } else {
                System.out.println(doador + " está apto para doar sangue!"); // se as condições anteriores forem falsas 
	            }
	        } else {
            System.out.println(doador + " não está apto para doar sangue!");// se as condições anteriores forem falsas , posso colocar quantos else , e else if que eu quiser
        }
		
	
	
		leia.close();
	}

}
