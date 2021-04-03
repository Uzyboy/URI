/*
|>Objetivos:  

1)- Leia 100 valores inteiros;

2)- Apresente então o maior valor lido e a posição dentre os 100 valores lidos.

......................................................................................................................................
  
   Condições:
   
   1)- O arquivo de entrada contém 100 números inteiros, positivos e distintos.
   
   2)- Apresente o maior valor lido e a posição de entrada, conforme exemplo abaixo.
   
   3)- Não esqueça de imprimir o fim de linha após a saida, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
   
   ...................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Saída   |
          |   	   2            |         34565          |
          |		   113          |         4              |
		  |		   45           |                        |
		  |	       34565        |                        |
		  |	       6            |                        |
		  |		   ...          |                        |
		  |		   8            |                        |
          |---------------------|------------------------|
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1080_Maior_e_Posição {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		      
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------
//1)- Leia 100 valores inteiros;
				int maior   = 0;					 //Armazena o maior numero encontrado até então;
				int posicao = 0;					 //Armazena a posição do maior numero encontrado até então;
				
			 	for(int i=1; i<=100; i++) {          
			 		
			 		int num = entrada.nextInt();    //Lê um número do console;
			 		
			 		if(num > maior) {               //Verifica se o número lido é maior que o anterior;
			 			maior   = num;
			 			posicao = i;
			 		}
			 	}
		
			
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------
//2)- Apresente então o maior valor lido e a posição dentre os 100 valores lidos.

		    	System.out.println(maior);
			 	System.out.println(posicao);
//---------------------------------------------------------------------------------------------------------------------------------------------
			   
		   entrada.close();
		   
	}
}

