/*
|>Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor
não estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

OBS:O símbolo ( representa "maior que"(significa que os extremos do intervalo não são elegivies). Por exemplo:
    [0,25]  indica valores entre 0 e 25.0000, inclusive eles.
    (25,50] indica valores maiores que 25 Ex: 25.00001 até o valor 50.0000000

    Condições:
   
   1) O arquivo de entrada contém um número com ponto flutuante qualquer;
  
   2) A saída deve ser uma mensagem conforme exemplo abaixo;
   
   3)-Não esqueça de imprimir o fim de linha após a saida, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
   
   ...................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Saída   |
          |       25,01         |   Intervalo (25,50]    |
          |---------------------|------------------------|
          |       25,00         |   Intervalo [0,25]     |
          |---------------------|------------------------|
          |      100,00         |   Intervalo (75,100]   |
          |---------------------|------------------------|          
          |      -25,02         |   Fora de intervalo    |
          |---------------------|------------------------|          
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1037_Intervalo {

	public static void main(String[] args) {
		   
		   Scanner entrada = new Scanner(System.in);
		   
		   float NUM = entrada.nextFloat();
		   
		   //Os intervalos são: [0,25] ou (25,50] ou (50,75] ou (75,100].
		   if (NUM >=0 && NUM <= 25) {
			   
			   System.out.println("Intervalo [0,25]");
		   }
		   else {
			   if (NUM > 25 && NUM <= 50) {
			   
				   System.out.println("Intervalo (25,50]");
			   }
			   else {
				   if (NUM > 50 && NUM <= 75) {
	   
        	   System.out.println("Intervalo (50,75]");
				   }
				   else {
					   if (NUM > 75 && NUM <= 100) {
	   
						   System.out.println("Intervalo (75,100]");
						   
					   }
					   else {
						   System.out.println("Fora de intervalo");
					   }
				   }
			   }
		   }
		   		
           entrada.close();
		
	}

}

