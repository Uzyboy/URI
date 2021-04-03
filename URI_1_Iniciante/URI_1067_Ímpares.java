/*
|>Objetivos:  

1)- Leia um valor inteiro X (1 <= X <= 1000). 

2)- Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.

............................................................................................................................
  
   Condições:
   
   1)- O arquivo de entrada contém 1 valor inteiro qualquer;
   
   2)- Imprima todos os valores ímpares de 1 até X, inclusive X, se for o caso;
   
   3)- Não esqueça de imprimir o fim de linha após a saida, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
   
   ...................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Saída   |
          |          8          |            1           |
          |---------------------|------------------------|
          |                     |            3           |
          |---------------------|------------------------|
          |                     |            5           |
          |---------------------|------------------------|
          |                     |            7           |
          |---------------------|------------------------|
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1067_Ímpares {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		      
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------
//1)- O arquivo de entrada contém 1 valor inteiro qualquer;				   
		int num = entrada.nextInt();
		
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------
//2)- Imprima todos os valores ímpares de 1 até X, inclusive X, se for o caso;	
		
		for(int i = 1; i <= num; i++) {        //A verificação começa desde 1 até o numero dado na entrada;
			
			if( (i % 2) == 1) {                //Isso verifica se o numero atual é impar
				System.out.println(i);
			}
			
		}
		   
//---------------------------------------------------------------------------------------------------------------------------------------------			   
		   
		   entrada.close();
		   
	}
}

