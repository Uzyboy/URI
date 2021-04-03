/*
|> Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”. Utilize a 
fórmula:
        
        MaiorAB = (a + b + abs(a - b))
                  --------------------
                            2
Obs.:                           
Obs.: A fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto é necessário para chegar no re-
sultado esperado.

  
   Condições:
   
   1) O arquivo de entrada contém três valores inteiros.
  
   2) Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".

   3)-Não esqueça de imprimir o fim de linha após o produto, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
   
   ...................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Saída   |
          |       7 14 106      |      106 eh o maior    |
          |---------------------|------------------------|
          |      217 14 6       |      217 eh o maior    |
          |---------------------|------------------------|
_____________________________________________________________________________________________________________________________________
*/

package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1013_O_Maior {
	

	public static void main(String[] args) {
	    
		Scanner entrada = new Scanner(System.in);
		
		int A = entrada.nextInt(), //Primeirio Número
		    B = entrada.nextInt(), //Segundo Número
		    C = entrada.nextInt(), //Terceiro Número
		   AB = (A + B + Math.abs(A-B)) / 2, //Comparação entre A e B
		    D = (AB + C + Math.abs(AB-C)) /2; //Comparação entre AB e C 
	
		System.out.println(D + " eh o maior");
		
		System.out.println();   		
		
		entrada.close();
	}

}
