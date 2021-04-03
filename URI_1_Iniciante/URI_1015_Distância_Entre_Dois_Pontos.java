/*
|> Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a 
distância entre eles, mostrando 4 casas decimais após a vírgula, segundo a fórmula:
               ___________________
             \/(X2-X1)² + (Y2-Y1)²
 
   Condições:
   
   1) O arquivo de entrada contém duas linhas de dados. A primeira linha contém dois valores de ponto flutuante: x1 y1 e a segunda 
   linha contém dois valores de ponto flutuante x2 y2;
   
   2) Calcule e imprima o valor da distância segundo a fórmula fornecida, com 4 casas após o ponto decimal;
  
   3)-Não esqueça de imprimir o fim de linha após o produto, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
   
   ...................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Saída   |
          |     1,0  7,0        |                        |
          |     5,0  9,0        |        4,4721          | 
          |---------------------|------------------------|
          |    -2,5  0,4        |                        |
          |    12,1  7,3        |        16,1484         |
          |---------------------|------------------------|
          |     2,5  -0,4       |                        |   
          |   -12,1  7,0        |        16,1484         |
          |---------------------|------------------------|
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1015_Distância_Entre_Dois_Pontos {
	

	public static void main(String[] args) {
	    
		Scanner entrada = new Scanner(System.in);
		
		double X1 = entrada.nextDouble(), //Cordenada X do ponto 1;
			   Y1 = entrada.nextDouble(), //Cordenada Y do ponto 1;
     		   X2 = entrada.nextDouble(), //Cordenada X do ponto 2;
               Y2 = entrada.nextDouble(), //Cordenada Y do ponto 2;
               D  = Math.sqrt( Math.pow(X2 - X1, 2) + Math.pow(Y2 - Y1, 2) );//Distancia entre esses 2 pontos;
		
		System.out.printf("%.4f", D);	
		
		System.out.println();   		
		
		entrada.close();
	}

}
