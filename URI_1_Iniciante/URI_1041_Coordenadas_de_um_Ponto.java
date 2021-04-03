/*
|> Objetivos:

1)- Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. 
2)- A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
3)- Se o ponto estiver na origem, escreva a mensagem “Origem”.
4)- Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação. 

   Condições:
   
   1)- A entrada contem as coordenadas de um ponto.
   
   2)- A saída deve apresentar o quadrante em que o ponto se encontra.
      
   3)-Não esqueça de imprimir o fim de linha após a saida, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
   
   ...................................................................................................................................   
           _____________________________________________
          | Exemplo de Entrada  |    Exemplos de Saída  |
          |  4.5  -2.2          |            Q4         |
          |---------------------|-----------------------|
          |  0.1   0,1          |            Q1         |
          |---------------------|-----------------------|
          |  0.1   0,1          |           Origem      |    
          |_____________________|_______________________|
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1041_Coordenadas_de_um_Ponto {

	public static void main(String[] args) {
		   
		   Scanner entrada = new Scanner(System.in);

//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------
//1)- Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano; 
          
		double x = entrada.nextDouble(), //entrada da coordenada X do ponto
			   y = entrada.nextDouble(); //entrada da coordenada y do ponto

//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------
//2)- A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
		
		if (x > 0 && y > 0) {                   //Quadrante 1 em que ambas as coordenadas são negativas;
			
			System.out.println("Q1");           
			
		}else if(x < 0 && y > 0) {              //Quadrante 2 em que x é negativo e y positivo;
			 
			System.out.println("Q2");
	    
		}else if(x < 0 && y < 0) {              //Quadrante 3 em que ambas as coordenadas são negativas;
			
			System.out.println("Q3");
			
		}else if (x > 0 && y < 0) { 		    //Quadrante 4 em que x é positivo e y negativo;
			 			
		    System.out.println("Q4");	

//Objetivo 3 ----------------------------------------------------------------------------------------------------------------------------
//3)- Se o ponto estiver na origem, escreva a mensagem “Origem”.		    
		}else if ( x == 0 && y == 0) {
			
			System.out.println("Origem");
			
//Objetivo 3 ----------------------------------------------------------------------------------------------------------------------------
//4)- Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.			
		} else if (x == 0) {
			
			System.out.println("Eixo Y");
			
		} else if (y == 0) {
			
			System.out.println("Eixo X");
			
		}
		
//---------------------------------------------------------------------------------------------------------------------------------------           
           entrada.close();
		
	}

}

