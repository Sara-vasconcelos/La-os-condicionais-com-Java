package lacoscondicionais;

import java.util.Scanner; // sempre que colocar o scanner tem que fazer esse import

public class Calculadora {

	public static void main(String[] args) {
		// Calculadora

		Scanner leia = new Scanner(System.in); // clicar em cima ou na lampada do lado para importar o java util

		int numero1, numero2, opcao, resultado;

		System.out.println("Digite o primeiro número");
		numero1 = leia.nextInt(); // a variavel numero 1 recebe o numero e lê ele e sabe que ele é inteiro

		System.out.println("Digite o segundo número");
		numero2 = leia.nextInt();

		System.out.println("Selecione uma opção:");
		System.out.println("*** 1 - Somar os numeros ***");
		System.out.println("*** 2 - Subtrair os numeros ***");
		System.out.println("*** 3 - Multiplicar os numeros ***");
		System.out.println("*** 4 - Dividir o primeiro pelo segundo ***");

		opcao = leia.nextInt(); // está guardando a opção que o usuario digitou no scanner
		

		switch (opcao) {
		case 1:
			resultado = numero1 + numero2;
			System.out.println("A soma é " + resultado);
			break;

		case 2:
			if(numero1 > numero2) { //aqui eu to garantindo que o primeiro numero seja maior que o segundo 
				resultado = numero1 - numero2;
				System.out.println("A subtração é " + resultado); 
			}else {
				resultado = numero2 - numero1;
				System.out.println("A subtração é " + resultado); //caso não seja eu troco , e coloco ao contrario , para que a subtração seja do maior , para um menor 
			}
			
			break;

		case 3:
			
			resultado = numero1 * numero2;
			if(resultado % 2==0) { //aqui além da multiplicação eu quero saber se ele é par ou impar
				
			System.out.println("A multiplicação é  " + resultado + "  e ele é par");
			}else {
				System.out.println("A multiplicação é  " + resultado + " e ele é impar");
			}
			break;
			
		case 4:
			resultado = numero1 / numero2;
			if(resultado % 2==0) {
				System.out.println("O resultado da  divisão é " + resultado + " e o número  é par");	
			}else {
				System.out.println("O resultado da divisão  é " + resultado + " e o número  é impar");
			}
			
			break;
		default:
			System.out.println("Digite uma opção de 1 a 4");

		}
		
		leia.close(); //quando estamos trabalhando com scanner sempre é bom fechar o scanner no final , na ultima linha do código

	}

}
