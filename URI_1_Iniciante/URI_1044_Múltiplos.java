/*
|>- Objetivos:

1)- Leia 2 valores inteiros (A e B);
2)- Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si.

..........................................................................................................................................
   Condições:
   
   1)- A entrada contém valores inteiros;
   
   2)- A saída deve conter uma das mensagens conforme descrito acima.
   
   3)-Não esqueça de imprimir o fim de linha após a saida, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
   
   ...................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Saída   |
          |     6    24         |    São Multiplos       |
          |---------------------|------------------------|
          |     6    25         |    Não são Multiplos   |
          |---------------------|------------------------|
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1044_Múltiplos {

	public static void main(String[] args) {
		   
		   Scanner entrada = new Scanner(System.in);

//Objetivo 1 ------------------------------------------------------------------------------------------------------------------------           
//1)- Leia 2 valores inteiros (A e B);
           int A = entrada.nextInt(),
        	   B = entrada.nextInt();
           
//Objetivo 1 ------------------------------------------------------------------------------------------------------------------------           
//2)- Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si.
           
           if( (B%A) == 0 || (A%B) == 0 ) { //se o resto da divisaõ de pelo menos uma das possibilidades for 0 significa que UM deles é o 
        	                                //divisor do OUTRO, logo esse OUTRO é multiplo desse UM;
        	   System.out.println("Sao Multiplos");        	   
           }else {
        	   System.out.println("Nao sao Multiplos");
           }
             		   
//-----------------------------------------------------------------------------------------------------------------------------------           
           entrada.close();
		
	}

}

