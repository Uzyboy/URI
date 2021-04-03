/*
|>Objetivos:  

1)- Leia 3 valores de ponto flutuante A, B e C;
2)- Ordene-os em ordem decrescente, de modo que o lado A representa o maior dos 3 lados. 
3)- A seguir, determine o tipo de triângulo que estes três lados formam, com base nos seguintes casos, sempre escrevendo uma mensagem adequada:

	a) Se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO;
	b) Se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO;
	c) Se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO;
	d) Se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO;
	e) Se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO;
	f) Se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES;
....................  ....................  ....................  ....................  ....................

   Condições:
   
   1) A entrada contem três valores de ponto flutuante de dupla precisão, nenhum deve ser nulo ou negativo;
   
   2) Imprima todas as classificações do triângulo especificado na entrada.
   
   3)-Não esqueça de imprimir o fim de linha após a saida, caso contrário seu programa apresentará a mensagem: “Presentation Error�?.
   
   ...................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Saída   |
          |    7.0 5.0 7.0      | TRIANGULO ACUTANGULO   |
          |                     | TRIANGULO ISOSCELES    |
          |---------------------|------------------------|
          |    6.0 6.0 10.0     | TRIANGULO OBTUSANGULO  |
          |                     | TRIANGULO ISOSCELES    |
          |---------------------|------------------------|
          |    6.0 6.0 6.0      | TRIANGULO ACUTANGULO   |
          |                     | TRIANGULO EQUILATERO   |
          |---------------------|------------------------|
          |    5.0 7.0 2.0      | NAO FORMA TRIANGULO    |
          |---------------------|------------------------|
          |    6.0 8.0 10.0     | TRIANGULO RETANGULO    |
          |_____________________|________________________|
          
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1045_Tipos_De_Triângulos {

	public static void main(String[] args) {
		   
		   Scanner entrada = new Scanner(System.in);
		   
//Objetivo 1 ------------------------------------------------------------------------------------------------------------------------           
//1)- Leia 3 valores de ponto flutuante A, B e C;
    double A = entrada.nextDouble(),
    	   B = entrada.nextDouble(),
    	   C = entrada.nextDouble();    
           
//Objetivo 2 ------------------------------------------------------------------------------------------------------------------------           
//2)- Ordene-os em ordem decrescente, de modo que o lado A representa o maior dos 3 lados. 
    double ladoA = 0, 
    	   ladoB = 0,
    	   ladoC = 0;
    	
    	if (A <= B && A <= C ) {
		   ladoC = A;
		   if(B <= C) {
			ladoB  = B;
		    ladoA = C;
		   }else {
			   ladoB  = C;
			   ladoA = B;
		   }
		  
		  }else if (B <= A && B <= C ) {
		   ladoC = B;
		   if(A <= C) {
			ladoB  = A;
		    ladoA = C;
		   }else {
			   ladoB  = C;
			   ladoA = A;
		   }
		  }else if (C < A && C < A ) {
		   ladoC = C;
		   if(A < B) {
			ladoB  = A;
			   ladoA = B;
			  }else {
			   ladoB  = B;
			   ladoA = A;
			  }
		   }   	      
//System.out.printf("LadoA = %.1f\nLadoB = %.1f\nladoC = %.1f\n", ladoA, ladoB, ladoC);
  
//Objetivo 3 ------------------------------------------------------------------------------------------------------------------------           
//3)- A seguir, determine o tipo de triângulo que estes três lados formam, com base nos seguintes casos, sempre escrevendo uma mensagem adequada:

//a) Se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO;
    	if (ladoA >= ladoB + ladoC ) {
    		System.out.println("NAO FORMA TRIANGULO");

    		//b) Se A² = B² + C², apresente a mensagem: TRIANGULO RETANGULO;
    		}else {
    			if ( Math.pow(ladoA,2) == Math.pow(ladoB,2) + Math.pow(ladoC,2) ) {
    			System.out.println("TRIANGULO RETANGULO");
    			}
    			//c) Se A² > B² + C², apresente a mensagem: TRIANGULO OBTUSANGULO;
    			if ( Math.pow(ladoA,2) > Math.pow(ladoB,2) + Math.pow(ladoC,2) ) {
    				System.out.println("TRIANGULO OBTUSANGULO");
    			}

    			//d) Se A² < B² + C², apresente a mensagem: TRIANGULO ACUTANGULO;
    			if ( Math.pow(ladoA,2) < Math.pow(ladoB,2) + Math.pow(ladoC,2) ) {
    				System.out.println("TRIANGULO ACUTANGULO");
    			}
    			
    			//e) Se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO;
    			if (ladoA == ladoB && ladoA == ladoC) {
    				System.out.println("TRIANGULO EQUILATERO");
    			}
    			
    			//f) Se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES;
    			if ( (ladoA == ladoB) && ladoA != ladoC || ladoA == ladoC && ladoA != ladoB || ladoB == ladoC && ladoB != ladoA ) {
    				System.out.println("TRIANGULO ISOSCELES");
    			}
    	
    		}
//-----------------------------------------------------------------------------------------------------------------------------------           
           entrada.close();
		
	}

}

