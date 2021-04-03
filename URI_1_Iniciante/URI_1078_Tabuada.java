/*
|>Objetivos:  

1)- Leia 1 valor inteiro N (2 < N < 1000).

2)- A seguir, mostre a tabuada de N:      
1 x N = N      2 x N = 2N        ...       10 x N = 10N

  ............................................................................................................................
  
   Condições:
   
   1)- A entrada contém um valor inteiro N (2 < N < 1000);
   
   2)- Imprima a tabuada de N, conforme o exemplo fornecido;
   
   3)- Não esqueça de imprimir o fim de linha após a saida, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
   
   ...................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Saída   |
          |        140          |1 x 140 = 140           |
		  |					    |2 x 140 = 280           |
		  |						|3 x 140 = 420           |
		  |						|4 x 140 = 560           |
		  |						|5 x 140 = 700           |
		  |						|6 x 140 = 840           | 
		  |						|7 x 140 = 980           |
		  |						|8 x 140 = 1120          |
		  |						|9 x 140 = 1260          |
		  | 					|10 x 140 = 1400         |
          |---------------------|------------------------|
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1078_Tabuada {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		      
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------
//1)- Leia 1 valor inteiro N (2 < N < 1000).
		int N = entrada.nextInt();
				
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------
//2)- A seguir, mostre a tabuada de N:      
//1 x N = N      2 x N = 2N        ...       10 x N = 10N
		for(int i=1; i<=10 ; i++) {
			
			System.out.printf("%d x %d = %d\n", i, N, i*N);
			
		}
//---------------------------------------------------------------------------------------------------------------------------------------------
			   
		   entrada.close();
		   
	}
}

