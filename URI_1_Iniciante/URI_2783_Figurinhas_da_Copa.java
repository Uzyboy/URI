/*
|>Objetivos: 

....................................................................................................................................................   
  
   Condições:
   
   1)- 
   
   2)- 
   
   3)- Não esqueça de imprimir o fim de linha após a saida, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
....................................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Saída   |
          |---------------------|------------------------|
____________________________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;


public class URI_2783_Figurinhas_da_Copa {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
 		
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------------		
//1)- Leia três números inteiros N (1 ≤ N ≤ 100) , C (1 ≤ C ≤ N/2) e M (1 ≤ M ≤ 300) indicando respectivamente o número de figurinhas (e espaços) do 
//álbum, o número de figurinhas carimbadas do álbum e o número de figurinhas já compradas. 
    	int N = entrada.nextInt();
    	int C = entrada.nextInt();
    	int M = entrada.nextInt();
	
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------------		
//2)- A segunda linha contém C números inteiros distintos Xi indicando as figurinhas carimbadas do álbum.
    	int [] figCarimbadas = new int [C];
    	for(int i=0; i<C; i++) {
    		figCarimbadas[i] = entrada.nextInt();   	
    	}
    	
//Objetivo 3 ----------------------------------------------------------------------------------------------------------------------------------------		
//3)- A terceira linha contém M números inteiros Yi (1 ≤ Xi , Yi ≤ N) indicando as figurinhas já compradas.    	
    	int[] figCompradas = new int [M];  
    	for(int i=0; i<M; i++) {
    		figCompradas[i] = entrada.nextInt();   	
    	}
//Objetivo 4 -----------------------------------------------------------------------------------------------------------------------------------------    	    	   
//4)- Descubra quantas figurinhas que estão na linha 3, mas não estão na linha 2; Não repetidas;
    	int cont1 = 0, cont2= 0;
    	for(int i=0; i<C; i++ ) {//Percorre as figurinhas carimbadas
    		cont2 = 0;
    		 for(int j=0; j<M; j++) {//Percorre as figurinhas compradas
				  if (figCarimbadas[i] == figCompradas[j]) {//Compara se uma das figurinhas compradas é uma das carimbadas
					   cont2++;//Caso seja, isso contabiliza;
				  }	  
    		 }
    		 if(cont2 == 0) {//Se nenhuma figurinha comprada for uma carimbada isso contabilizaque ela falta;
    			 cont1++;
    		 }
    	}
    	
    	
//Objetivo 3 ----------------------------------------------------------------------------------------------------------------------------------------		
//3) Imprima a quantidade de figurinhas que faltam
    	System.out.println(cont1);

//--------------------------------------------------------------------------------------------------------------------------------------------------	
		entrada.close();
	}
}

