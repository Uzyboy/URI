/*
|>Objetivos:  

1)- Leia um valor inteiro X.

2)- Em seguida apresente os 6 valores ímpares consecutivos a partir de X, um valor por linha, inclusive o X ser for o caso.
  ............................................................................................................................
  
   Condições:
   
   1)- A entrada será um valor inteiro positivo;
   
   2)- A saída será uma sequência de seis números ímpares;
   
   3)- Não esqueça de imprimir o fim de linha após a saida, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
   
   ...................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Saída   |
          |         8           |             9          |
          |                     |            11          |
          |                     |            13          |
          |                     |            15          |
          |                     |            17          |
          |                     |            19          |
          |_____________________|________________________|
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1070_Seis_Ímpares_Consecutivos {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		      
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------
//1)- A entrada será um valor inteiro positivo;
		int num = entrada.nextInt();			   
		
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------
//2)- Em seguida apresente os 6 valores ímpares consecutivos a partir de X, um valor por linha, inclusive o X ser for o caso.
		int   cont = 0;
		while(cont < 6) {  				//Isso determina que apenas 6 numeros serão impressos;
			
			if((num%2) == 1) { 				//Isso verifica se o numero num é impar;
				System.out.println(num);    //Caso seja, será impresso;
				cont++;                     //Isso incrementa até que 6 numeros sejam impressos;
			}
			
			num++;  						//Isso incrementa o numero para veridicar se o seu consecutivo é impar;
			
		}
		   
//---------------------------------------------------------------------------------------------------------------------------------

		entrada.close();
		   
	}
}

