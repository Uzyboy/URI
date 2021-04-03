/*
|> Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e atribua esta operação à variável PROD. 
A seguir mostre a variável PROD com mensagem correspondente.
   
   Condições:
   
   1)- O arquivo de entrada contém 2 valores inteiros;
   
   2)- Imprima a mensagem "PROD" e a variável PROD conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade;
   
   3)-Não esqueça de imprimir o fim de linha após o produto, caso contrário seu programa apresentará a mensagem: “Presentation Error”.

          | Exemplos de Entrada | Exemplos de Saída |
          |         3                               |
          |         9           |    PROD = 27      |
          |-----------------------------------------|                
          |       -30                               |
          |        10           |    PROD =-300     | 
          |-----------------------------------------|
          |         0                               |
          |         9           |    PROD = 0       |
          |-----------------------------------------|


______________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1004_Produto_Simples {

	public static void main(String[] args) {
		
		int A;
		int B;
		
		Scanner entrada = new Scanner (System.in); //Para Obter Entrada do Console
		
		A = entrada.nextInt();
		B = entrada.nextInt();
		
		int PROD = A * B;
		
		System.out.println("PROD = " + PROD);
		System.out.println();
				
		entrada.close();
		
	}

}
