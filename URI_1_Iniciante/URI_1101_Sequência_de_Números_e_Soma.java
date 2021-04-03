/*
|>Objetivos: Leia um conjunto não determinado de pares de valores M e N (parar quando algum dos valores for menor ou igual a zero). Para cada par li-
do, mostre a sequência do menor até o maior e a soma dos inteiros consecutivos entre eles (incluindo o N e M).

....................................................................................................................................................   
  
   Condições:
   
   1)- O arquivo de entrada contém um número não determinado de valores M e N. A última linha de entrada vai conter um número nulo ou negativo.
   
   2)- Para cada dupla de valores, imprima a sequência do menor até o maior e a soma deles, conforme exemplo abaixo.
   
   3)- Não esqueça de imprimir o fim de linha após a saida, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
....................................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Saída   |
          | 5 2                 |    2 3 4 5 Sum=14		 |
          | 6 3                 |    3 4 5 6 Sum=18		 |	
          | 5 0                 |						 |
          |---------------------|------------------------|
____________________________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1101_Sequência_de_Números_e_Soma {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
     
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------------		
//1)- Leia dois inteiros pares M e N, caso esses receba 0 ou negativo o programa encerra;
		int M = entrada.nextInt(),
			N = entrada.nextInt();
		
		while( M > 0 && N > 0) {
	
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------------		
//2)- Para cada dupla de valores, imprima a sequência do menor até o maior e a soma deles;
			int soma = 0;
			if(M<N) {				
				for(int i=M; i<=N; i++) {
					System.out.print(i+" ");
					soma += i;
				}
			}else {
				for(int i=N; i<=M; i++) {
					System.out.print(i+" ");
					soma += i;
				}
			}

			System.out.println("Sum="+soma);
			
			M = entrada.nextInt();
			N = entrada.nextInt();
			
		}
//--------------------------------------------------------------------------------------------------------------------------------------------------	
		entrada.close();
		   		
	}
}

