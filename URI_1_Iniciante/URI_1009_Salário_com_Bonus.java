/*
|>Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). 
Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas 
casas decimais.

   Condições:
   
   1)-O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2 valores de dupla precisão (double) com duas casas decimais,
   representando o salário fixo do vendedor e montante total das vendas efetuadas por este vendedor, respectivamente.
   
   2)- Imprima o total que o funcionário deverá receber, conforme exemplo fornecido.
      
   3)-Não esqueça de imprimir o fim de linha após o produto, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
   
   DICA: O "TOTAL" é a soma do salario fixo com a comissão sobre as vendas;

          | Exemplos de Entrada | Exemplos de Saída |
          |        JOAO         |                   |
          |        500.00       |TOTAL = R$ 684.54  | 
          |        1230.30      |                   | 
          |---------------------|-------------------|                
          |        PEDRO        |                   |
          |        700.00       |TOTAL = R$ 700.00  |
          |        0.00         |                   |
          |---------------------|-------------------|
          |        MANGOJATA    |                   |
          |        1700.00      |TOTAL = R$ 1884.58 |
          |        1230.50      |                   |
          |_____________________|___________________|


______________________________________________________________________________________________________________________________________
*/

package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1009_Salário_com_Bonus {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		String NOME = entrada.next();   //Nome do funcionário; Note que não é necessario declarar o tipo depois de "next" no caso de Strings
	    
		double SAL    = entrada.nextDouble(),
			   VEN    = entrada.nextDouble(),
			   COM    = VEN * 0.15,
		       TOT    = SAL + COM;
	           
		System.out.println(NOME);
		System.out.printf("TOTAL = R$ %.2f", TOT);   		
		
		entrada.close();
		
	}

}
