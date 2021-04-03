/*
|>Objetivos:  

1)- Ler um valor N.

2)- Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.

  ...........................................................................................................................
  
   Condições:
   
   1)- A entrada contém um valor inteiro N (0 < N < 13);
      
   2)- A saída contém um valor inteiro, correspondente ao fatorial de N;
   
   3)- Não esqueça de imprimir o fim de linha após a saida, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
   
   ...................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Saída   |
          |          4          |             24         |
          |---------------------|------------------------|
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1153_Fatorial_Simples {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		      
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------
//1)- Ler um valor inteiro N.
		int N    = entrada.nextInt(),
			SOMA = N;
		
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------
//2)- Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
		for (int i=1; i <N; i++) {
			
			SOMA = SOMA * (N - i); 
			
		}

		   System.out.println(SOMA);
//---------------------------------------------------------------------------------------------------------------------------------------------
		   entrada.close();
		   
	}
}

