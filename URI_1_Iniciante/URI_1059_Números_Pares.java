/*
|>Objetivos:  

1)- Faça um programa que mostre os números pares entre 1 e 100, inclusive.

  ............................................................................................................................
  
   Condições:
   
   1)- Neste problema extremamente simples de repetição não há entrada;
   
   2)- Imprima todos os números pares entre 1 e 100, inclusive se for o caso, um em cada linha;
   
   3)- Não esqueça de imprimir o fim de linha após a saida, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
   
   ...................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Saída   |
          |                     |            2           |
          |                     |            4           |
          |                     |            6           |
          |                     |            .           |
          |                     |            .           |
          |                     |            .           |
          |                     |           100          |
          |---------------------|------------------------|
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;


public class URI_1059_Números_Pares {

	public static void main(String[] args) {
		
		      
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------
//1)- Faça um programa que mostre os números pares entre 1 e 100, inclusive.
		
		for(int i = 1; i<=100; i++) {
			
			if((i % 2) == 0) {
				System.out.println(i);
			}
		}
		   
		   
	}
}

