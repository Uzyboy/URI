/*
|>Objetivos: 
  A Betalândia é um país que apenas recentemente se abriu para o comércio exterior e está preparando agora sua primeira grande exportação. A So-
ciedade Betalandesa de Comércio (SBC) ficou encarregada de conduzir a exportação e determinou que, seguindo os padrões internacionais, a carga 
será transportada em contêineres, que são, por sua vez, colocados em grandes navios para o transporte internacional.

  Todos os contêineres betalandeses são idênticos, medindo A metros de largura, B metros de comprimento e C metros de altura. Um navio porta-
-contêineres pode ser visto como um retângulo horizontal de X metros de largura e Y metros de comprimento, sobre o qual os contêineres são colo
cados. Nenhuma parte de contêiner pode ficar para fora do navio. Além disso, para possibilitar a travessia de pontes, a altura máxima da carga 
no navio não pode ultrapassar Z metros.

  Devido a limitações do guindaste utilizado, os contêineres só podem ser carregados alinhados com o navio. Ou seja, os contêineres só podem ser
colocados sobre o navio de tal forma que a largura e o comprimento do contêiner estejam paralelos à largura e ao comprimento do navio, respecti-
vamente.

  A SBC está com problemas para saber qual a quantidade máxima de contêineres que podem ser colocados no navio e pede sua ajuda. Sua tarefa, ne-
ste problema, é determinar quantos contêineres podem ser carregados no navio respeitando as restrições acima.
....................................................................................................................................................   
  
   Condições:
   
   1)- A entrada consiste de duas linhas. A primeira linha contém três inteiros A, B e C que representam as dimensões dos contêineres, enquanto
   a segunda linha contém outros três inteiros X, Y e Z (1 ≤ A, B, C, X, Y, Z ≤ 106) que representam as dimensões do navio.
   
   2)- Seu programa deve imprimir apenas uma linha contendo um inteiro que indica a quantidade máxima de contêineres que o navio consegue trans-
   portar.
   
   3)- Não esqueça de imprimir o fim de linha após a saida, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
....................................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Saída   |
          |	1 1 1               |    1                   |  
		  | 1 1 1	  			|					     |
          |---------------------|------------------------|
          |	1 3 5               |    54                  |  
		  | 9 6 11	  			|					     |
          |---------------------|------------------------|
          |	1 2 12              |    0                   |  
		  | 6 9 10	  			|					     |
          |---------------------|------------------------|


____________________________________________________________________________________________________________________________________________________
*/
package URI_2_AD_HOC;

import java.text.DecimalFormat;
import java.util.Scanner;


public class URI_2395_Transporte_de_Contêineres {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);   
		
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------------		
//1) Leia um inteiro A, um inteiro B e um inteiro C, que serão as dimensões de um contâiner;
    	int A = entrada.nextInt(),//LARGURA
    		B = entrada.nextInt(),//COMPRIMENTO
    		C = entrada.nextInt();//ALTURA
	
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------------		
//2) Leia um inteiro X, um inteiro Y e um inteiro Z, que serão as dimensões do porta-contâiner;
    	int X = entrada.nextInt(),//LARGURA
        	Y = entrada.nextInt(),//COMPRIMENTO
        	Z = entrada.nextInt();//ALTURA
    	
//Objetivo 3 ----------------------------------------------------------------------------------------------------------------------------------------		
//3) Calcule quantos conteiners cabem no navio;
       	int cabem =  (X/A) * (Y/B) * (Z/C);
    	System.out.println(cabem);
    	
//--------------------------------------------------------------------------------------------------------------------------------------------------	
//System.out.println("" + saidaFormatada.format();
		entrada.close();
		   		
	}
}

