/*
|>Objetivos: Leia um valor inteiro N que é a quantidade de casos de teste que vem a seguir. Cada caso de teste consiste de dois inteiros X e Y. Você
deve apresentar a soma de todos os ímpares existentes entre X e Y.

....................................................................................................................................................   
  
   Condições:
   
   1)- A primeira linha de entrada é um inteiro N que é a quantidade de casos de teste que vem a seguir. Cada caso de teste consiste em uma linha co-
   ntendo dois inteiros X e Y.
   
   2)- Imprima a soma de todos valores ímpares entre X e Y.
   
   3)- Não esqueça de imprimir o fim de linha após a saida, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
....................................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Saída   |
          | 7					|	 0					 |	
		  |	4 5		            |	 11					 |	
		  |	13 10       	    |	 5  				 |		
		  |	6 4				    |	 0					 |	
		  |	3 3					|	 0					 |		
		  |	3 5					|	 0					 |
		  |	3 4					|	 12					 |		
		  |	3 8    				|						 |	
          |---------------------|------------------------|
____________________________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1099_Soma_de_Ímpares_Consecutivos_II {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);  
		
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------------		
//1)- Leia um inteiro N que é a quantidade de casos de teste que vem a seguir.
    	int N = entrada.nextInt();
	
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------------		
//2)-  Cada caso de teste consiste em uma linha contendo dois inteiros X e Y.Imprima a soma de todos valores ímpares entre X e Y.
		int soma = 0;

    	for(int i=0; i<N; i++) {
			int X = entrada.nextInt(),
			    Y = entrada.nextInt();
			
				//2.0 E se Y for maior que X;
				//2.1)- Verifique se um número é impar ou não, então some ele em caso "sim".
			if(X<Y) {
				for(int j=(X+1); j<Y; j++) {
					 
					if( (j%2)==1 ) {
						soma += j;
					}
				}
				
			}else {
				for(int j=(Y+1); j<X; j++) {
					 
					if( (j%2)==1 ) {
						soma += j;
					}
				}
				
			}
			 System.out.println(soma);
			 soma = 0;
			
		}
    	    	
//--------------------------------------------------------------------------------------------------------------------------------------------------	
		entrada.close();
		   		
	}
}

