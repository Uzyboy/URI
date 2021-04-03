/*
|>Objetivos:
Na matemática, um Número Primo é aquele que pode ser dividido somente por 1 (um) e por ele mesmo.
Por exemplo, o número 7 é primo, pois pode ser dividido apenas pelo número 1 e pelo número 7.

1)- Leia um inteiro N (1 ≤ N ≤ 100), indicando o número de casos de teste da entrada;

2)- Cada uma das N linhas seguintes contém um valor inteiro X (1 < X ≤ 10^7),verifique caso a caso se é primo ou não;

3)- Para cada caso de teste de entrada, imprima a mensagem “X eh primo�? ou “X nao eh primo�?, de acordo com a especificação fornecida;


  ............................................................................................................................
  
   Condições:
   
   1)- A entrada contém vários casos de teste. A primeira linha da entrada contém um inteiro N (1 ≤ N ≤ 100), indicando o número de casos de 
   teste da entrada. Cada uma das N linhas seguintes contém um valor inteiro X (1 < X ≤ 10^7), que pode ser ou não, um número primo;
   
   2)- Para cada caso de teste de entrada, imprima a mensagem “X eh primo�? ou “X nao eh primo�?, de acordo com a especificação fornecida;
   
   3)- Não esqueça de imprimir o fim de linha após a saida, caso contrário seu programa apresentará a mensagem: “Presentation Error�?.
   
   ...................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Saída   |
          |          3          |                        |
          |---------------------|------------------------|
          |          8          | 8 nao eh primo         |
          |---------------------|------------------------|
          |         51          | 51 nao eh primo        |
          |---------------------|------------------------|   
          |          7          | 7 eh primo             |
          |---------------------|------------------------|       
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1165_Número_Primo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		      
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------
//1)- Leia um inteiro N (1 ≤ N ≤ 100), indicando o número de casos de teste da entrada;
		int N    = entrada.nextInt(),
			CASO = 0,
			DIV  = 0;
		    
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------
//2)- Cada uma das N linhas seguintes contém um valor inteiro X (1 < X ≤ 107),verifique caso a caso se é primo ou não;
		
		for(int i=0; i<N ; i++) {						//Isso garante que apenas N casos serão lidos
			
			CASO = entrada.nextInt();					//Entrada de cada caso
			
			for(int j=1; j<= CASO; j++) {				//Esse laço "for" testa os numeros de 1 a CASO como divisores
				if((CASO % j) == 0 ) {					//Isso verifica se o numero atual é um divisor inteiro de CASO
					DIV++;
				}
			}
		
//Objetivo 3 ---------------------------------------------------------------------------------------------------------------------------------
//3)- Para cada caso de teste de entrada, imprima a mensagem “X eh primo�? ou “X nao eh primo�?, de acordo com a especificação fornecida;

			if(DIV == 2) {								//Se ele tiver 2 divisores, 1 ou ele mesmo, ele é primo;
				System.out.printf("%d eh primo\n", CASO);
			}else {
				System.out.printf("%d nao eh primo\n", CASO);
			}
			
			DIV = 0;			
		}
		   
//-----------------------------------------------------------------------------------------------------------------------------------------
		   entrada.close();
		   
	}
}

