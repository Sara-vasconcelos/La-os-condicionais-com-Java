package lacoscondicionais;

public class LacosCondicionais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero1 , numero2;
		
		numero1=7;
		numero2=4;
		
		int media = 5;
		
		//if sozinho
		
//		if(numero1>numero2 && numero2 == 5) {
//			System.out.println("O numero 1 é menor que o numero 2");
//			System.out.println("O numero é igual a 5 ");
//		} else {
//			System.out.println("Alguma coisa deu erro");
//		}
//
//	} 
		//if /else e else if
		
//		if(media > 5) {
//			System.out.println("Passou direto");
//		}else if (media == 5){
//			System.out.println("Ta de recuperação");  // sempre colocar elfe if , nunca ao contrario.
//			}else {
//				System.out.println("Reprovado");
//			}
//		}
		
		
	//switch case
		
		switch(media){
		case 5:
		System.out.println("Passou");
		break;
		case 4:
			System.out.println("passou raspando");
			break;
		case 3:
			System.out.println("recuperação");
			break;
		case 2:
			System.out.println("talvez reprove");
			break;
			
		case 1:
			System.out.println("reprovou");
			break;
          default:
	       System.out.println("A media precisa ser entre 1 a 5 "); // ele funciona como else , caso as condições acima não forem verdadeira , ele sempre vem por ultimo
          break; //posso colocar o break no final ou não 

		}
			
		}

}
