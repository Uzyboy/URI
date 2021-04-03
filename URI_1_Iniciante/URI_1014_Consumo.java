/*
|> Calcule o consumo médio de um automóvel sendo fornecidos a distância total percorrida (em Km) e o total de combustível gasto 
(em litros).
  
   Condições:
   
   1) -O arquivo de entrada contém dois valores: um valor inteiro X representando a distância total percorrida (em Km), e um valor 
   real Y representando o total de combustível gasto, com um dígito após o ponto decimal.
   
   2) -Apresente o valor que representa o consumo médio do automóvel com 3 casas após a vírgula, seguido da mensagem "km/l".
   
   3)-Não esqueça de imprimir o fim de linha após o produto, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
   
   ...................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Saída   |
          |        500          |      14,286 km/l       |
          |        35,0         |                        |      
          |---------------------|------------------------|
          |        2254         |      18,119 km/l       |
          |        124,4        |                        |
          |---------------------|------------------------|
          |        4554         |       9,802 km/l       |
          |        464,6        |                        |
          |---------------------|------------------------|
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1014_Consumo {

	public static void main(String[] args) {
	    
		Scanner entrada = new Scanner(System.in);

		int X    = entrada.nextInt();   //Distancia Total Percorrida em km
		double Y = entrada.nextDouble(),//Total de Combustivel Gasto em l
		      CM = X / Y ; //Média de consumo km/l
		
		System.out.printf("%.3f km/l", CM);		
		
		System.out.println();   		
		
		entrada.close();
	}

}
