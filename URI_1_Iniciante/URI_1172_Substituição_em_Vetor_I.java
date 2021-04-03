/*
|>Objetivos:  

1)- Faça um programa que leia um vetor X[10]. 

2)- Substitua a seguir, todos os valores nulos e negativos do vetor X por 1. 

3)- Em seguida mostre o vetor X.
....................................................................................................................................................   
  
   Condições:
   
   1)- A entrada contém 10 valores inteiros, podendo ser positivos ou negativos.
   
   2)- Para cada posição do vetor, escreva "X[i] = x", onde i é a posição do vetor e x é o valor armazenado naquela posição.
   
   3)- Não esqueça de imprimir o fim de linha após a saida, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
   
....................................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Saída   |
          |         0           |    X[0] = 1            |
          |---------------------|------------------------|
          |        -5           |    X[1] = 1            |
          |---------------------|------------------------|
          |        63           |    X[2] = 63           |
          |---------------------|------------------------|
          |         0           |    X[3] = 1            |
          |---------------------|------------------------|
          |        ...          |          ...           |
          |---------------------|------------------------|
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1172_Substituição_em_Vetor_I {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		      
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------
//1)- Leia um vetor X[10] inteiro;
//tipo identificador [] = new tipo [tamanho];
		int X [] = new int [10];
		
		for( int i=0; i<X.length; i++) {
			
			X[i] = entrada.nextInt();
			
		}

		   
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------
//2)- Substitua todos os valores nulos e negativos do vetor X por 1.
		for( int j=0; j<X.length; j++) {
			
			if(X[j] == 0 || X[j] < 0) {
				
				X[j] = 1;
				
			}
			
			System.out.printf("X[%d] = %d\n", j, X[j]);
			
		}
	    
		   
//---------------------------------------------------------------------------------------------------------------------------------------------
			   
		   entrada.close();
		   
	}
}
