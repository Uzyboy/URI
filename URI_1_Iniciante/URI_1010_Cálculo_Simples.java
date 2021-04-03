/*
|>Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, 
o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

   Condições:
   
   1)-O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente dois inteiros e um valor com
   2 casas decimais.
   
   2)- A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após os dois pontos e um es-
   paço após o "R$". O valor deverá ser apresentado com 2 casas após o ponto.
      
   3)-Não esqueça de imprimir o fim de linha após o produto, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
   
           ______________________________________________
          | Exemplos de Entrada |    Exemplos de Saída   |
          |     12 1 5,30       |                        |
          |     16 2 5,10       |VALOR A PAGAR: R$ 15,50 | 
          |---------------------|------------------------|                
          |    13 2 15,30       |                        |
          |   161 4  5,20       |VALOR A PAGAR: R$ 51,40 |
          |---------------------|------------------------|
          |     1 1 15,10       |                        |
          |     2 1 15,10       |VALOR A PAGAR: R$ 30,20 |
          |_____________________|________________________|


______________________________________________________________________________________________________________________________________
*/

package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1010_Cálculo_Simples {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o codigo da Peça1");
		int    codPeça1   = entrada.nextInt(); //Código da peça
		System.out.println("Informe a quantidade:");
		int      qntPeca1   = entrada.nextInt(); //Quantidade de peças
		System.out.println("Informe o preço de uma unidade da Peça1:");
		double valorPeca1 = entrada.nextDouble(); //Valor de uma peça

		System.out.println("Informe o codigo da Peça2");
		int    codPeça2   = entrada.nextInt(); //Código da peça
		System.out.println("Informe a quantidade:");
		int    qntPeca2   = entrada.nextInt(); //Quantidade de peças
		System.out.println("Informe o preço de uma unidade da Peça2:");
		double valorPeca2 = entrada.nextDouble(); //Valor de uma peça
		
		double TOTAL = ( (qntPeca1 * valorPeca1) + (qntPeca2 * valorPeca2) );
		
		System.out.println(codPeça1);
		System.out.println(codPeça2);
		System.out.printf("VALOR A PAGAR: R$ %.2f", TOTAL);		
		
		System.out.println();   		
		
		entrada.close();
		
	}

}
