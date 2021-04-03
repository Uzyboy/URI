/*
|>Objetivos:  

1)- Faça um programa que leia 5 valores inteiros;
2)- Conte quantos destes valores digitados são pares;
3)- e mostre esta informação.
  ............................................................................................................................
  
   Condições:
   
c   
   2)- Imprima a mensagem conforme o exemplo fornecido, indicando a quantidade de valores pares lidos.
   
   3)- Não esqueça de imprimir o fim de linha após a saida, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
   
   ...................................................................................................................................   
   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Saída   |
          |          7          |     3 valores pares    |
          |         -5          |                        |
          |          6          |                        |
          |         -4          |                        |
          |         12          |                        |
          |_____________________|________________________|
          
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1065_Pares_entre_Cinco_Números {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		      
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------
//1)- Leia 5 valores inteiros;				   
		
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------
//2)- Conte quantos destes valores digitados são pares;
//OBS.: Condição para um numero ser par: resto desse numero dividido por 2 tem que ser nulo;
		
		int cont = 0;                                      //variavel que registra a quantidade e numeros pares;
		
		for (int i = 1; i<6; i++ ) {                       //será lido 5 vezes, pois a entrada pede 5 numeros;
			
			int num = entrada.nextInt();                   //Objetivo 1;
			
			if((num % 2) == 0) { 						   //Verfica se o número é par;
				cont++;
			}
		}
		   
//Objetivo 3 ---------------------------------------------------------------------------------------------------------------------------------
//3)- e mostre esta informação.
		System.out.println(cont + " valores pares");

//--------------------------------------------------------------------------------------------------------------------------------------------
		   entrada.close();
		   
	}
}

