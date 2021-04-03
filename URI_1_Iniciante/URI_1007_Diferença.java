/*
|>Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a
fórmula: DIFERENCA = (A * B - C * D).

   Condições:
   
   1)-O arquivo de entrada contém 4 valores inteiros;
   
   2)- Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo abaixo, com um espaço em branco antes e depois da
   igualdade;
   
   3)-Não esqueça de imprimir o fim de linha após o produto, caso contrário seu programa apresentará a mensagem: “Presentation Error”.

          | Exemplos de Entrada | Exemplos de Saída |
          |         5           |                   |
          |         6           |                   |
          |         7           |                   |
          |         8           | DIFERENÇA = -26   |
          |---------------------|-------------------|                
          |         0           |                   |
          |         0           |                   |
          |         7           |                   |
          |         8           | DIFERENÇA = -56   |
          |---------------------|-------------------|
          |         5           |                   |
          |         6           |                   |
          |        -7           |                   |
          |         8           | DIFERENÇA = 86    |
          |_____________________|___________________|

______________________________________________________________________________________________________________________________________
*/

package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1007_Diferença {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int A          = entrada.nextInt(),
		    B          = entrada.nextInt(),
		    C          = entrada.nextInt(),
		    D          = entrada.nextInt(),
	 	    DIFERENÇA  =((A * B) - (C * D));
		
		System.out.printf("DIFERECA = %d", DIFERENÇA);
		
		System.out.println();
		
		entrada.close();		
	}

}
