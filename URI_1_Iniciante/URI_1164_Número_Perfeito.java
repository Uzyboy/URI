/*
|>Objetivos:  

Na matemática, um número perfeito é um número inteiro para o qual a soma de todos os seus divisores positivos próprios (excluindo ele mesmo) 
é igual ao próprio número. Por exemplo o número 6 é perfeito, pois 1+2+3 é igual a 6. Sua tarefa é escrever um programa que imprima se um deter-
minado número é perfeito ou não.

1)- Leia um inteiro N (1 ≤ N ≤ 20), indicando o número de casos de teste;
 
2)- Verifique caso a caso se é perfeito, imprima a mensagem “X eh perfeito�? ou “X nao eh perfeito�?, de acordo com a especificação fornecida;
  ............................................................................................................................
  
   Condições:
   
   1)- A entrada contém vários casos de teste. A primeira linha da entrada contém um inteiro N (1 ≤ N ≤ 20), indicando o número de casos de teste
   da entrada. Cada uma das N linhas seguintes contém um valor inteiro X (1 ≤ X ≤ 10^8), que pode ser ou não, um número perfeito;
      
   2)- Para cada caso de teste de entrada, imprima a mensagem “X eh perfeito�? ou “X nao eh perfeito�?, de acordo com a especificação fornecida;
   
   3)- Não esqueça de imprimir o fim de linha após a saida, caso contrário seu programa apresentará a mensagem: “Presentation Error�?.
   
   ...................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Saída   |
          |          3          |                        |
          |---------------------|------------------------|
          |          6          |  6 eh perfeito         |
          |---------------------|------------------------|
          |          5          |  5 nao eh perfeito     |
          |---------------------|------------------------|
          |         28          |  28 eh perfeito        |
          |---------------------|------------------------|
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1164_Número_Perfeito {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		      
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------
//1)- Leia um inteiro N (1 ≤ N ≤ 20), indicando o número de casos de teste;
		int N    = entrada.nextInt(),
		    CASO = 0,
		    DIV  = 0;
		
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------
//2)- Verifique caso a caso se é perfeito, imprima a mensagem “X eh perfeito�? ou “X nao eh perfeito�?, de acordo com a especificação fornecida;				   
		for(int j=0; j<N; j++) {
			
		   CASO = entrada.nextInt();							//Entrada para verificar um CASO
		   for(int i=1; i<CASO; i++) {							
			   if( (CASO % i) == 0 ) {							//Isso verifica os divisores de CASO
				   DIV = DIV + i;
			   }
		   }
		   if(DIV == CASO) {										
			   System.out.printf("%d eh perfeito\n", CASO);
		   }else {
			   System.out.printf("%d nao eh perfeito\n", CASO);
		   }
		   DIV = 0;
		}
//---------------------------------------------------------------------------------------------------------------------------------------------
		   entrada.close();
		   
	}
}

