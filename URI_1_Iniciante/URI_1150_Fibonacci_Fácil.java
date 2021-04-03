/*
|>Objetivos:
A seguinte sequência de números 0 1 1 2 3 5 8 13 21... é conhecida como série de Fibonacci. Nessa sequência, cada número, depois dos 2 
primeiros, é igual à soma dos 2 anteriores. 

1)- Escreva um algoritmo que leia um inteiro N (N < 46) e;

2)- mostre os N primeiros números dessa série.
..............................................................................................................................
  
   Condições:
   
   1)- O arquivo de entrada contém um valor inteiro N (0 < N < 46);
   
   2)- Os valores devem ser mostrados na mesma linha, separados por um espaço em branco. Não deve haver espaço após o último valor;
   
   3)- Não esqueça de imprimir o fim de linha após a saida, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
   
   ...................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Saída   |
          |          5          |        0 1 1 2 3       |
          |---------------------|------------------------|
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1150_Fibonacci_Fácil {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		      
//Objetivo----------------------------------------------------------------------------------------------------------------------------------
//A seguinte sequência de números 0 1 1 2 3 5 8 13 21... é conhecida como série de Fibonacci. Nessa sequência, cada número, depois dos 2 
//primeiros, é igual à soma dos 2 anteriores. 	   
		
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------
//1)- Escreva um algoritmo que leia um inteiro N (N < 46) e;
		
		int N    = entrada.nextInt(),
			ant1 = 1,
			ant2 = 1,
			atual = 0;
		   
		System.out.printf("0");
		System.out.printf(" 1");
		System.out.printf(" 1");

//Objetivo 2 ---------------------------------------------------------------------------------------------------------------------------------
//2)- mostre os N primeiros números dessa série.
		for(int i = 1; i<N-2 ; i++) {
			atual = ant1 + ant2;
		    ant2  = ant1;
			ant1  = atual;
			
			System.out.printf(" %d", atual);
			
		}
		System.out.println();
		   
//--------------------------------------------------------------------------------------------------------------------------------------------
		   entrada.close();
		   
	}
}

