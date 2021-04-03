/*
|> Joaozinho quer calcular e mostrar a quantidade de litros de combustível gastos em uma viagem, ao utilizar um automóvel que faz 
12KM/L. Para isso, ele gostaria que você o auxiliasse através de um simples programa. Para efetuar o cálculo, deve-se fornecer o tempo 
gasto na viagem (em horas) e a velocidade média durante a mesma (em km/h). Assim, pode-se obter distância percorrida e, em seguida,cal
cular quantos litros seriam necessários. Mostre o valor com 3 casas decimais após o ponto.

   Condições:
   
   1) O arquivo de entrada contém dois inteiros. O primeiro é o tempo gasto na viagem (em horas) e o segundo é a velocidade média dura-
   nte a mesma (em km/h);
  
   2) Imprima a quantidade de litros necessária para realizar a viagem, com três dígitos após o ponto decimal;
   
   3) Não esqueça de imprimir o fim de linha após o produto, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
   
   ...................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Saída   |
          |         10          |         70,833         |
          |         85          |                        |
          |---------------------|------------------------|
          |          2          |         15,333         |
          |         92          |                        |
          |---------------------|------------------------|
          |         22          |        122,833         |
          |         67          |                        |
          |---------------------|------------------------|
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1017_Gasto_de_Combustível {
	

	public static void main(String[] args) {
	    
		Scanner entrada = new Scanner(System.in);
		
		/*Quantidade de litros de combustivel gastos em uma viagem = X
		Carro gasta 1L a cada 12 KM (12K/L);
		Tempo da viagem = THoras;
		Velocidade media = VEL KM/H;

		1) Monte uma formula que de a distancia percorrida, o tempo e a velocidade são fornecidas pelo usuário;

		Velocidade =    KM     =>  DIST KM= VEL * H
		              -------
		                 H
		Basta multiplicar a velocidade pelo tempo;

		2)Quantos litros nessa distancia serão necessarios.
		se o carro gasta 1L a cada 12KM quanto ele vai gastar em  DIST KM?

		                 KM        L
		                 12   \/   1  =>    12x=DIST =< X=DIST/12
		                 DIST /\   X
		                 
		                 
		*/

		int T  = entrada.nextInt(),
		   VEL = entrada.nextInt();
		
		double DIST  = T * VEL,
			   GASTO = DIST/12;
		
		System.out.printf("%.3f", GASTO);
				
		System.out.println();   		
		
		entrada.close();
	}

}
