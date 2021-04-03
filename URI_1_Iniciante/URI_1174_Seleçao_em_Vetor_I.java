/*
|>Objetivos:  

1)- Faça um programa que leia um vetor real A[100]. 

2)- No final, mostre todas as posições do vetor que armazenam um valor menor ou igual a 10 e o valor armazenado em cada uma das posições.
....................................................................................................................................................   
  
   Condições:
   
   1)-A entrada contém 100 valores, podendo ser inteiros, reais, positivos ou negativos.
   
   2)-Para cada valor do vetor menor ou igual a 10, escreva "A[i] = x", onde i é a posição do vetor e x é o valor armazenado na posição, com 
   uma casa após o ponto decimal.
   
   3)- Não esqueça de imprimir o fim de linha após a saida, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
   
....................................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Saída   |
          |         0           |    A[0] = 0.0          |
          |---------------------|------------------------|
          |        -5           |    A[1] = -5.0         |
          |---------------------|------------------------|
          |        63           |    A[3] = -8.5         |
          |---------------------|------------------------|
          |        -8.5         |          ...           |
          |---------------------|------------------------|
          |        ...          |          ...           |
          |---------------------|------------------------|
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;
import java.text.DecimalFormat;

public class URI_1174_Seleçao_em_Vetor_I {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		DecimalFormat saidaFormatada = new DecimalFormat("0.0");
		      
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------
//1)- Faça um programa que leia um vetor real A[100]. 
		double A[] = new double[100];
		
		for( int i=0; i<A.length; i++) {
			
			A[i] = entrada.nextDouble();
			
		}
		
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------
//2)- No final, mostre todas as posições do vetor que armazenam um valor menor ou igual a 10 e o valor armazenado em cada uma das posições.
		for( int j=0; j<A.length; j++) {
				
			if( A[j] <= 10 ) {
								
				System.out.println( "A["+j+"] = " + saidaFormatada.format(A[j]) );
				
			}
		}
		   
//---------------------------------------------------------------------------------------------------------------------------------------------
		entrada.close();
		   
	}
}

