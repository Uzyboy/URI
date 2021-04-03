/*
|>Objetivos:  

1)- Leia um valor inteiro N; 

2)- Apresente o quadrado de cada um dos valores pares, de 1 até N, inclusive N, se for o caso;

...............................................................................................................................
  
   Condições:
   
   1)- A entrada contém um valor inteiro N (5 < N < 2000);
   
   2)- Imprima o quadrado de cada um dos valores pares, de 1 até N, conforme o exemplo abaixo.

   OBS:Tome cuidado! Algumas linguagens tem por padrão apresentarem como saída 1e+006 ao invés de 1000000 o que ocasionará resposta 
   errada. Neste caso, configure a precisão adequadamente para que isso não ocorra.
   
   3)- Não esqueça de imprimir o fim de linha após a saida, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
   
   ...................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Saída   |
          |         6           |        2^2 = 4         |
          |                     |        4^2 = 16        |
          |                     |        6^2 = 36        |
          |---------------------|------------------------|
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1073_Quadrado_de_Pares {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		      
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------
//1)- Leia um valor inteiro N (5 < N < 2000); 
		int N = entrada.nextInt();
		
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------
//2)- Apresente o quadrado de cada um dos valores pares, de 1 até N, inclusive N, se for o caso;
		
		for(int i=1; i<=N ; i++) {
			
			if( (i%2) == 0 ) { 					//Isso verifica se o numero atual do loop é par;
			int	par = i * i;					//Isso armazena o quadrado do numero atual caso ele seja par, você pode por deireto no comando
									            //de impressão, pus aqui apenas pra Você entender;
			System.out.printf("%d^2 = %d\n", i, par);
			
								
			}
		}
		
		   
//---------------------------------------------------------------------------------------------------------------------------------------------
			   
		   entrada.close();
		   
	}
}

