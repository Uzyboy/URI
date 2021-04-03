/*
|>Objetivos: Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

....................................................................................................................................................   

   Condições:

   1)- Não esqueça de imprimir o fim de linha após a saida, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
....................................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Saída   |
          |						|		I=0 J=1          |
		  |						|		I=0 J=2			 |
		  | 					|		I=0 J=3		     |
		  |						|		I=0.2 J=1.2		 |
		  | 					|		I=0.2 J=2.2        |
		  |						|		I=0.2 J=3.2		 |
		  |						|		...				 |	
		  |						|		I=2 J=?  		 |	 |
		  |						|		I=2 J=?	    	 |
		  |						|		I=2 J=?		     |
          |---------------------|------------------------|
____________________________________________________________________________________________________________________________________________________
 */
package URI_1_Iniciante;

public class URI_1098_Sequencia_IJ_4 {

	public static void main(String[] args) {


//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------------		
//1)- Apresente a sequencia conforme o exemplo.
		int g = 0,
			h = 0,
			i = 0,
			j = 1,
			k = 0;
		
		for(g=0; g<11; g++) {
			h = 0;
						
			while(h<3) {
				
				if(i < 2) {
					 
					if(k == 0 || k == 10) {
						System.out.print("I="+i);
						System.out.print(" ");
						System.out.print("J="+(h+j));
						System.out.println();
					}else {
						System.out.print("I="+i+"."+k);
						System.out.print(" ");
						System.out.print("J="+(h+j)+"."+k);
					    System.out.println();
					}
					h++;
					
				}else {
					System.out.print("I=2");
					System.out.print(" ");
					System.out.print("J="+(h+j));
					System.out.println();
					h++;
				}
				
			}
			
			k +=2;
			if(k == 10) {
				k = 0;
				i++;
				j++;
			}
				
		}
		
	}
}

