/*
|>Objetivos: Escreva um algoritmo que leia 2 números e imprima o resultado da divisão do primeiro pelo segundo. Caso não for possível mostre a mensa-
gem “divisao impossivel” para os valores em questão.

....................................................................................................................................................   
  
   Condições:
   
   1)- A entrada contém um número inteiro N. Este N será a quantidade de pares de valores inteiros (X e Y) que serão lidos em seguida.
   
   2)- Para cada caso mostre o resultado da divisão com um dígito após o ponto decimal, ou “divisao impossivel” caso não seja possível efetuar o cál-
   culo.
   
   3)- Não esqueça de imprimir o fim de linha após a saida, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
....................................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Saída   |
          | 3					|	-1.5                 |							
		  |	3 -2				|	divisao impossivel   |
		  | -8 0				|	0.0                  |							
		  | 0 8					|						 |			
          |---------------------|------------------------|
____________________________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1116_Dividindo_X_por_Y {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
    	DecimalFormat saidaFormatada = new DecimalFormat("0.0");
		
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------------		
//1)- Leia um número inteiro N. Este N será a quantidade de pares de valores inteiros (X e Y) que serão lidos em seguida.
    	float N = entrada.nextInt();
	
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------------		
//2)- Leia 2 interios X e Y, divida X por Y, e imprima a divisão se possivel ou "divisao impossivel" em caso contrário.
    	for(int i=0; i<N; i++) {
    		float X = entrada.nextInt(),
    		      Y = entrada.nextInt();
    	
    		if(Y !=0) {
    			if(X == 0) {
    				System.out.println("0.0");
    				
    			}else {
    				System.out.println(saidaFormatada.format( X/Y ));
    			}
    			
    		}else {
    			System.out.println("divisao impossivel");
    		}
    		
    		
    		
    	}
		
//----------------------------------------------------------------------------------------------------------------------------------------------------
		entrada.close();
		   		
	}
}

