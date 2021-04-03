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
		  |						|		I=3 J=7			 |
		  | 					|		I=3 J=6          |
		  |						|		I=3 J=5			 |
		  |						|		...				 |	
		  |						|		I=9 J=7			 |
		  |						|		I=9 J=6			 |
		  |						|		I=9 J=5			 |
          |---------------------|------------------------|
____________________________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;


public class URI_1096_Sequencia_IJ_2 {

	public static void main(String[] args) {
		
     
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------------		
//1)- Apresente a sequencia conforme o exemplo.
		double i = 0,
			   j = 1,
			   k = 0,
			   cont1,
			   cont2;
		
		for(cont1=0; cont1<5; cont1++) {
			
			for(cont2=0; cont2<3; cont2++) {
				
				System.out.printf ("I=%.1f ",i);
				System.out.println("J="+(j+k));
				j += 1;

			}
			k += 0.2;
			i += k;
			j=1;
		}
	
			   		
	}
}

