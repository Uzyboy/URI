/*
|>Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o 
salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

   Condições:
   
   1)-O arquivo de entrada contém 2 números inteiros e 1 número com duas casas decimais, representando o número, quantidade de horas
   trabalhadas e o valor que o funcionário recebe por hora trabalhada, respectivamente.
   
   2)- Imprima o número e o salário do funcionário, conforme exemplo fornecido, com um espaço em branco antes e depois da igualdade. 
   No caso do salário, também deve haver um espaço em branco após o $.   
   
   3)-Não esqueça de imprimir o fim de linha após o produto, caso contrário seu programa apresentará a mensagem: “Presentation Error”.

          | Exemplos de Entrada | Exemplos de Saída |
          |        25           |                   |
          |        100          |NUMBER = 25        |
          |        5,50         |SALARY = U$ 550    |
          |---------------------|-------------------|                
          |        1            |                   |
          |        200          |NUMBER = 1         |
          |        20,50        |SALARY = U$ 4100,00|
          |---------------------|-------------------|
          |        6            |                   |
          |        145          |NUMBER = 6         |
          |        15,55        |SALARY = U$ 2254,75|
          |_____________________|___________________|


______________________________________________________________________________________________________________________________________
*/

package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1008_Salário {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		int   NUM   = entrada.nextInt(),   //Número do funcionário;
		      HORAS = entrada.nextInt();   //Número de horas trabalhadas;
		float PAGPH = entrada.nextFloat(); //Pagamento por Horas;
		
		float SAL = HORAS * PAGPH;  //Salario
		
		System.out.println("NUMBER = "+NUM); //imprime o número do funcionário
		System.out.printf("SALARY = U$ %.2f", SAL);  //imprime o salário com duas casas decimais
				
		entrada.close();
		
	}

}
