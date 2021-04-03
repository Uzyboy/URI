/*
|>Objetivos
1)- Leia 3 valores reais (A, B e C);
2)- Verifique se eles formam ou não um triângulo. 

    a)- Em caso positivo, calcule o perímetro do triângulo e apresente a mensagem:
    
    Perimetro = XX.X
    
    b)- Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem

    Area = XX.X
 .......................................................................................................................................
  
   Condições:
   
   1)- A entrada contém três valores reais;
   
   2)- O resultado deve ser apresentado com uma casa decimal;
   
   3)-Não esqueça de imprimir o fim de linha após a saida, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
   
   ...................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Saída   |
          | 6.0 4.0 2.0         | Area = 10.0            |
          |---------------------|------------------------|
          | 6.0 4.0 2.0         | Perimetro = 12.1       |
          |---------------------|------------------------|
 
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;
import java.text.DecimalFormat;

public class URI_1043_Triângulo {

	public static void main(String[] args) {
		   
		   Scanner entrada = new Scanner(System.in);
           DecimalFormat saidaFormatada = new DecimalFormat("0.0");

           //Objetivo 1---------------------------------------------------------------------------------------------------------------------------------
//1)- Leia 3 valores reais (A, B e C);
		   double A = entrada.nextDouble(),
				  B = entrada.nextDouble(),
				  C = entrada.nextDouble();

//Objetivo 2---------------------------------------------------------------------------------------------------------------------------------
//2)- Verifique se eles formam ou não um triângulo. 
/*Condição de existencia de um triangilo, a soma de 2 lados tem sempre que ser maior que o tercwiro lado;

		a + b > c
		a + c > b
		b + c > a
		   		   
*/
		   if (A + B > C && A + C > B && B + C > A) {
			  
//a)- Em caso positivo, calcule o perímetro do triângulo e apresente a mensagem: Perimetro = XX.X 

			   double perimetro = A + B + C;
			   System.out.println("Perimetro = " + saidaFormatada.format(perimetro));
		   
		    
//b)- Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem: Area = XX.X	   
	 }else {
		 
		 	double area = ((A+B) * C) / 2; 
		 	System.out.println("Area = " + saidaFormatada.format(area));
	 }
		  	   
//-------------------------------------------------------------------------------------------------------------------------------------------
         
		   entrada.close();
		
	}

}

