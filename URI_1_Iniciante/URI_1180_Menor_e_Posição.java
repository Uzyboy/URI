/*
|>Objetivos:  

1)- Faça um programa que leia um valor N. Este N será o tamanho de um vetor X[N]. 

2)- A seguir, leia cada um dos valores de X, encontre o menor elemento deste vetor e a sua posição dentro do vetor, mostrando esta informação.

....................................................................................................................................................   
  
   Condições:
   
   1)-A primeira linha de entrada contem um único inteiro N (1 < N < 1000), indicando o número de elementos que deverão ser lidos em seguida para 
   o vetor X[N] de inteiros. A segunda linha contém cada um dos N valores, separados por um espaço.
   
   2)-A primeira linha apresenta a mensagem “Menor valor:” seguida de um espaço e do menor valor lido na entrada. A segunda linha apresenta a men-
   sagem “Posicao:” seguido de um espaço e da posição do vetor na qual se encontra o menor valor lido, lembrando que o vetor inicia na posição zero.
   
   3)- Não esqueça de imprimir o fim de linha após a saida, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
   
....................................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Saída   |
          |	 		10          |Menor valor: -5         |
          |1 2 3 4 -5 6 7 8 9 10|Posicao: 4              | 
          |---------------------|------------------------|
____________________________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1180_Menor_e_Posição {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		      
//Objetivo 1 ---------------------------------------------------------------------------------------------------------------------------------------
//1)- Faça um programa que leia um valor N inteiro. Este N será o tamanho de um vetor inteiro X[N]. 
		int N   = entrada.nextInt();
		int X[] = new int[N];
		
		int menor = entrada.nextInt(),
		    pos   = 0;
		
		
//Objetivo 2 ---------------------------------------------------------------------------------------------------------------------------------------
//2)- A seguir, leia cada um dos valores de X, encontre o menor elemento deste vetor e a sua posição dentro do vetor, mostrando esta informação.
		for(int i=1; i<N; i++){ 
			
			X[i]= entrada.nextInt();
			
			if(X[i] < menor ){
				menor = X[i];
				pos   = i;				
			}			
		}
		 
		System.out.println("Menor valor: " + menor);
		System.out.println("Posicao: " + pos);
//---------------------------------------------------------------------------------------------------------------------------------------------
		   entrada.close();
		   
	}
}



