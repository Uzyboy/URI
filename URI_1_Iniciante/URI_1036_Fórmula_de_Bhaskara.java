/*
|> Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. Se não
for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular�?, caso haja
uma divisão por 0 ou raiz de numero negativo.
  
   Condições:
   
   1) Leia três valores de ponto flutuante (double) A, B e C.
   
   2) Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular".
   Caso contrário, imprima o resultado das raízes com 5 dígitos após o ponto, com uma mensagem corres-
   pondente conforme exemplo abaixo. 
   
   3)-Não esqueça de imprimir o fim de linha após o produto, caso contrário seu programa apresentará 
   a mensagem: “Presentation Error�?.
   
   OBS:
   Se Δ < 0, a equação do segundo grau não possui raízes reais;

   Se Δ = 0, a equação do segundo grau possui uma raiz real;

   Se Δ > 0, a equação do segundo grau possui duas raízes reais.
   
   E "a" diferente de zero;
   x = -b +-\/b² - 4ac
       -----------------
              2a
   ...................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Saída   |
          |                     |   R1 = -0.29788        |
          |   10.0 20.1 5.1     |   R2 = -1.71212        |
          |---------------------|------------------------|
          |                     |                        |
          |    0.0 20.0 5.0     |  Impossivel calcular   |
          |---------------------|------------------------|
          |                     |   R1 = -0.02466        |
          |   10.3 203.0 5.0    |   R2 = -19.68408       |
          |---------------------|------------------------|
          |                     |                        |
          |   10.0 3.0 5.0      |  Impossivel calcular   |
          |---------------------|------------------------|
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1036_Fórmula_de_Bhaskara {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
	    //Condição 1: Leia três valores de ponto flutuante (double) A, B e C.
		double A = entrada.nextDouble(), //Coeficiente "a", ATENÇÂO: esse não pode ser nulo ou resultara em divisão por zero e consequentemente erro;
			   B = entrada.nextDouble(), //Coeficiente "b"
			   C = entrada.nextDouble(), //Coeficiente "c"
			   X1,                       //Raiz 1;
			   X2,                       //Raiz 2;
		       D = (B * B) -4 * A * C;     //Δ = b² - 4ac
		      
//------------------------------------------------------------------------------------------------------------------------------------
		if(D >= 0 && A != 0){ //Se Δ > 0, a equação do segundo grau possui duas raízes reais, se Δ = 0, a equação do segundo grau possui uma raiz real;
		       
			X1 = (-B + Math.sqrt(D)) / (2 * A);
			X2 = (-B - Math.sqrt(D)) / (2 * A);
			
			System.out.printf("R1 = %.5f\n", X1); //Condição 2: imprima o resultado das raízes com 5 dígitos após o ponto,
			System.out.printf("R2 = %.5f\n", X2);
			
		    }
			else if(D < 0 || A == 0){ //Se Δ < 0, a equação do segundo grau não possui raízes reais;
				
				//Condição 2: Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular";
				System.out.println("Impossivel calcular");			
			}
			
	           entrada.close();
		}
}

