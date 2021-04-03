/*
|>Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
  
  a) a área do triângulo retângulo que tem A por base e C por altura;
  b) a área do círculo de raio C. (pi = 3.14159);
  c) a área do trapézio que tem A e B por bases e C por altura;
  d) a área do quadrado que tem lado B;
  e) a área do retângulo que tem lados A e B.
  
   Condições:
   
   1)-O arquivo de entrada contém três valores com um dígito após o ponto decimal.
   
   2)- O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde a uma das áreas descritas acima, sempre com mensagem
   correspondente e um espaço entre os dois pontos e o valor. O valor calculado deve ser apresentado com 3 dígitos após o ponto decimal.
      
   3)-Não esqueça de imprimir o fim de linha após o produto, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Saída   |
          |   3.0  4.0  5.2     |     TRIANGULO: 7.800   |
          |                     |     CIRCULO: 84.949    |
          |                     |     TRAPEZIO: 18.200   |
          |                     |     QUADRADO: 16.000   |              
          |                     |     RETANGULO: 12.000  | 
          |---------------------|------------------------|
          |  12.7  10.4 15.2    |     TRIANGULO: 96.520  |
          |                     |     CIRCULO: 725.833   |
          |                     |     TRAPEZIO: 175.560  |
		  |						|     QUADRADO: 108.160  | 
		  |					    |	  RETANGULO: 132.080 |
          |---------------------|------------------------|
        

______________________________________________________________________________________________________________________________________
*/

package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1012_Área {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		double A = entrada.nextDouble(),
			   B = entrada.nextDouble(),
			   C = entrada.nextDouble();
		
//-------------------------------------------------------------------------------------------------------------------		
		//a) A área do triângulo retângulo que tem A por base e C por altura;
        //OBS.: Area = (Base * ALtura) / 2 ;
		
		double TRIANGULO = ( (A * C) /2 );
		
	    //b) A área do círculo de raio C. (pi = 3.14159);
		//OBS.: Área = pi * raio² ;
		double CIRCULO = 3.14159 * Math.pow(C, 2);
		
		//c) A área do trapézio que tem A e B por bases e C por altura;
		//OBS.:Área = ( (BaseMaior + Base Menor) * altura ) /2;
		double TRAPEZIO = ( (A+B) * C ) /2;
		
		//d) A área do quadrado que tem lado B;
		//OBS.: Área = lado * lado4;
		double QUADRADO = B * B;
		
		//e) A área do retângulo que tem lados A e B.
		//OBS.: Área = LadoMaior *LadoMenor; 
		double RETANGULO = A * B;
//-------------------------------------------------------------------------------------------------------------------
		System.out.printf("TRIANGULO: %.3f\n", TRIANGULO);
		System.out.printf("CIRCULO: %.3f\n", CIRCULO);
		System.out.printf("TRAPEZIO: %.3f\n", TRAPEZIO);
		System.out.printf("QUADRADO: %.3f\n", QUADRADO);
		System.out.printf("RETANGULO: %.3f\n", RETANGULO);
				
		System.out.println();   		
		
		entrada.close();
		
	}

}
