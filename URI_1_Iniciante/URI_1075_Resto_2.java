/*
|>Objetivos:  

1)- Leia um valor inteiro N;

2)- Apresente todos os números entre 1 e 10000 que divididos por N dão resto igual a 2.

.....................................................................................................................................
  
   Condições:
   
   1)- A entrada contém um valor inteiro N (N < 10000);
      
   2)- Imprima todos valores que quando divididos por N dão resto = 2, um por linha;
   
   3)- Não esqueça de imprimir o fim de linha após a saida, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
   
   ...................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Saída   |
          | 		13          | 			2            |
          |						|		   15            |
          |						|          28            |
          |						|          41            |
          |						|          ...           |
          |_____________________|________________________|
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1075_Resto_2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		      
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------
//1)- A entrada contém um valor inteiro N (N < 10000);				   
		int N = entrada.nextInt(),
			i = 1;
		
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------
//2)- Imprima todos valores de 1 até 10.000 que quando divididos por N dão resto = 2, um por linha;
		
		while( i <= 10000 ) {
			
			if( i % N == 2) {
			System.out.println(i);
			}
			
			i++;			
		}
				   
//----------- ---------------------------------------------------------------------------------------------------------------------------------
		   entrada.close();
		   
	}
}

