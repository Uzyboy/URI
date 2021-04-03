/*
|>Objetivos:  

1)- Escreva um programa que leia 2 valores X e Y;

2)- que imprima todos os valores entre eles cujo:

	a) resto da divisão dele por 5 for igual a 2 ou igual a 3.

.....................................................................................................................................
  
   Condições:
   
   1)- O arquivo de entrada contém 2 valores positivos inteiros quaisquer, não necessariamente em ordem crescente;
   
   2)- Imprima todos os valores conforme exemplo abaixo, sempre em ordem crescente;
   
   3)- Não esqueça de imprimir o fim de linha após a saida, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
   
   ...................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Saída   |
          |         10          |12                      |
          |---------------------|13						 |
          |         18          |17                      |
          |---------------------|------------------------|
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1133_Resto_da_Divisão {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		      
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------
//1)- Escreva um programa que leia 2 valores X e Y;
		int X 	 = entrada.nextInt(),
			Y 	 = entrada.nextInt(),
			NUM  = 0,
			AUX  = 0,
			RESTO = 0;
		
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------
//2)- que imprima todos os valores entre eles cujo:
//	a) resto da divisão dele por 5 for igual a 2 ou igual a 3.
	
		if (X < Y) {   				//Isso aqui é pra garantir que a soma sempre começe do menor para o maior
			NUM = X+1;
			AUX = Y;   				//Isso define que o fim do intervalo sempre será o maior numero na reta real;
		}else if(Y < X) {
			NUM = Y+1;
			AUX = X;   				//Isso define que o dim do intervalo sempre será o maior numero na reta real; 
			
		}
		
		while(NUM < AUX) { 			//Isso é pra garantir que o numero não saia do intervalo;
			RESTO = NUM % 5;
			if(RESTO == 2 || RESTO == 3) {
				System.out.println(NUM);
			}
			NUM++;
		}
//---------------------------------------------------------------------------------------------------------------------------------------------
		   
		   entrada.close();
		   
	}
}

