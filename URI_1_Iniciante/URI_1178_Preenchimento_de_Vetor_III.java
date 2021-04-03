/*
|>Objetivos:  

1)- Leia um valor X. 

2)- Coloque este valor na primeira posição de um vetor N[100]. Em cada posição subsequente de N (1 até 99), coloque a metade do 
valor armazenado na posição anterior, conforme o exemplo abaixo. Imprima o vetor N.

....................................................................................................................................................   
  
   Condições:
   
   1)-A entrada contem um valor de dupla precisão com 4 casas decimais.
   
   2)-Para cada posição do vetor N, escreva "N[i] = Y", onde i é a posição do vetor e Y é o valor armazenado naquela posição. Cada valor do vetor 
   deve ser apresentado com 4 casas decimais.
      
   3)- Não esqueça de imprimir o fim de linha após a saida, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
   
....................................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Saída   |
          |      200.0000       |		N[0] = 200.0000  |
		  |						|		N[1] = 100.0000  | 
		  |						|		N[2] = 50.0000   |
		  |						|		N[3] = 25.0000   |
 		  |	    				|		N[4] = 12.5000   |
		  | 					|		     ...         |
          |---------------------|------------------------|
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;
import java.text.DecimalFormat;

public class URI_1178_Preenchimento_de_Vetor_III {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		DecimalFormat saidaFormatada = new DecimalFormat("0.0000");
		      
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------
//1)- Leia um valor double X.
		double X   = entrada.nextDouble();
		double N[] = new double[100];				   
		
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------
//2)- Coloque este valor na primeira posição de um vetor N[100]. Em cada posição subsequente de N (1 até 99), coloque a metade do 
//valor armazenado na posição anterior, conforme o exemplo abaixo. Imprima o vetor N.
		N[0] = X;
		System.out.println("N[0] = " + saidaFormatada.format(N[0]));
		for(int i=1; i<100; i++) {
			
			N[i] = (N[i-1]/2);
			System.out.println("N[" + i + "] = " + saidaFormatada.format(N[i]));
			 
		}
		   
//---------------------------------------------------------------------------------------------------------------------------------------------
			   
		//System.out.println("" + saidaFormatada.format());
		   entrada.close();
		   
	}
}

