/*
|> -Objetivo-  

  a) -Sub-Obejetivo1;-
  b) -Sub-Obejetivo2;-
  c) -Sub-Obejetivo3;-
  d) -Sub-Obejetivo4;-
  e) -Sub-Obejetivo5;-
  ....................
  
   Condições:
   
   1) -Condição1-
   
   2) -Condição2-
   
   3)-Não esqueça de imprimir o fim de linha após a saida, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
   
   ...................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Saída   |
          |                     |                        |
          |---------------------|------------------------|
          |                     |                        |
          |---------------------|------------------------|
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1060_Números_Positivos {

	public static void main(String[] args) {
		   
		   Scanner entrada = new Scanner(System.in);
		   
//Objetivo 1 ------------------------------------------------------------------------------------------------------------------------           
//
		   int cont = 1,
			   positivo = 0;
		              
//Objetivo 2 ------------------------------------------------------------------------------------------------------------------------           
//         
		   while(cont <=6 ) {
			   double n = entrada.nextDouble();
			   if(n > 0) {
				   positivo++;
				 
			   }  
			   cont++;
		   }
   	           
//Objetivo 3 ------------------------------------------------------------------------------------------------------------------------           
//         
		   System.out.printf("%d valores positivos\n", positivo);
//-----------------------------------------------------------------------------------------------------------------------------------
           entrada.close();
		
	}

}

