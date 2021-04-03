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

public class URI_2670_Máquina_de_Café {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
     
		
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------------		
//1)-Leia 3 números inteirois, A1 , A2 , A3 (0 ≤ A1 , A2 , A3 ≤ 1000), um por linha, onde Ai representa o número de pessoas que trabalham no i-ésimo and
	int A1 = entrada.nextInt(),
		A2 = entrada.nextInt(),
		A3 = entrada.nextInt();
	
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------------		
//		
	int menor = (A2*2) + (A3*4);
	
	if( (A1*2) + (A3*2) < menor) {
		menor = (A1*2) + (A3*2);
	}
	
	if( (A1*4 + A2*2) < menor) {
		menor = (A1*4) + (A2*2);
	}
	
	System.out.println(menor);
		
//--------------------------------------------------------------------------------------------------------------------------------------------------	
//System.out.println("" + saidaFormatada.format();
		entrada.close();
		   		
	}
}

