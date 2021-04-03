/*
|>Objetivos: Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

....................................................................................................................................................   
  
   Condições:
   
   1)- Não esqueça de imprimir o fim de linha após a saida, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
....................................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Saída   |
          |						|		I=1 J=7          |
		  |						|		I=1 J=6			 |
		  | 					|		I=1 J=5			 |
		  |						|		I=3 J=9			 |
		  | 					|		I=3 J=8          |
		  |						|		I=3 J=7			 |
		  |						|		...				 |	
		  |						|		I=9 J=15		 |	 |
		  |						|		I=9 J=14		 |
		  |						|		I=9 J=13		 |
          |---------------------|------------------------|
____________________________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;


public class URI_1097_Sequencia_IJ_3 {

	public static void main(String[] args) {
		
     
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------------		
//1)- Apresente a sequencia conforme o exemplo.
		int i = 1,
			j = 7,
			 cont1,
			 cont2;
		
		for(cont1=0; cont1<5; cont1++) {
			
			for(cont2=0; cont2<3; cont2++) {
				
				System.out.print  ("I="+i+" ");
				System.out.println("J="+j);
				j -= 1;

			}
			i += 2;
			j += 5;
		}
	
			   		
	}
}

