/*
|>Objetivos:
  1)- Leia quatro números (N1, N2, N3, N4), cada um deles com uma casa decimal, correspondente às quatro notas de um aluno; 
  2)- Calcule a média com peso 2, 3, 4 e 1, respectivamente, para cada uma destas notas; 
  3)- Mostre esta média acompanhada pela mensagem "Media: "; 
  4)- Se esta média for maior ou igual a 7.0, imprima a mensagem "Aluno aprovado.";
  5)- Se a média calculada for inferior a 5.0, imprima a mensagem "Aluno reprovado.";
  6)- Se a média calculada for um valor entre 5.0 e 6.9, inclusive estas, o programa deve imprimir a mensagem "Aluno em exame.";
  7)- No caso do aluno estar em exame, leia um valor correspondente à nota do exame obtida pelo aluno; 
  8)- Imprima então a mensagem "Nota do exame: " acompanhada pela nota digitada;
  9)- Recalcule a média (some a pontuação do exame com a média anteriormente calculada e divida por 2). e imprima a mensagem: 
  "Aluno aprovado." (caso a média final seja 5.0 ou mais );
  "Aluno reprovado.", (caso a média tenha ficado 4.9 ou menos);
  10- Para estes dois casos (aprovado ou reprovado após ter pego exame) apresente na última linha uma mensagem "Media final: " 
  seguido da média final para esse aluno.

   Condições:
   
   1)-A entrada contém quatro números de ponto flutuante correspendentes as notas dos alunos;
   
   2)- Todas as respostas devem ser apresentadas com uma casa decimal. As mensagens devem ser impressas conforme a descrição do problema.
   
   3)-Não esqueça de imprimir o fim de linha após a saida, caso contrário seu programa apresentará a mensagem: “Presentation Error”.

          | Exemplos de Entrada | Exemplos de Saída |
          |   2.0-4.0-7.5-8.0   |Media: 5.4         |
		  |  	  6.4        	|Aluno em exame.    |
		  |						|Nota do exame: 6.4 |
		  |						|Aluno aprovado.    | 
		  |						|Media final: 5.9   |
          |---------------------|-------------------|
          |   2.0-6.5-4.0-9.0   |Media: 4.8         |
		  |						|Aluno reprovado.   | 
		  |---------------------|-------------------|
		  |   9.0-4.0-8.5-9.0   |Media: 4.8         |
		  |						|Aluno reprovado.   | 
		  |_____________________|___________________|
______________________________________________________________________________________________________________________________________
*/

package URI_1_Iniciante;

import java.util.Scanner;  //Invocação da Classe Sccaner
import java.text.DecimalFormat; 
/*
A classe DecimalFormat também faz parte do pacote java.text e permite formatar números reais, porém uma particularidade é que ela permite 
que seja informado o a forma a ser formatado o valor. Você pode usar a classe DecimalFormat para formatar números decimais em seqüências espe-
cíficas para a localidade. Esta classe permite-lhe controlar a exibição da esquerda e à quantidade de zeros à direita, prefixos e sufixos,
agrupando (milhares) separadores, e o separador decimal.

Para entender como formatar, analise os caracteres e descrições dos simbolos:

			import java.text.DecimalFormat;
			...
		    DecimalFormat -identificador- = new DecimalFormat("0.0");
		    
		    double NUM = / 7,79;

		    System.out.println("NUM: " + -identificador-.format(NUM));

A saída será: 7,7;
*/
public class URI_1040_Média_3 {

	public static void main(String[] args) {
	    
	    Scanner entrada = new Scanner(System.in);
	    
		DecimalFormat decimal = new DecimalFormat("0.0");

//Objetivo 1 --------------------------------------------------------------------------------------------------------------------------
//1)- Leia quatro números (N1, N2, N3, N4), cada um deles com uma casa decimal, correspondente às quatro notas de um aluno; 
		
		double N1 = entrada.nextDouble(),
			   N2 = entrada.nextDouble(),
			   N3 = entrada.nextDouble(),
			   N4 = entrada.nextDouble();
		
//Objetivo 2---------------------------------------------------------------------------------------------------------------------------
//2)- Calcule a média com peso 2, 3, 4 e 1, respectivamente, para cada uma destas notas; 

		double MEDIA = ( (N1*2) + (N2*3) + (N3*4) + (N4*1) ) / 10.0;
		
//Objetivo 3---------------------------------------------------------------------------------------------------------------------------
//3)- Mostre esta média acompanhada pela mensagem "Media: "; 
 
		System.out.println("Media: " + decimal.format(MEDIA));
		
//Objetivo 4---------------------------------------------------------------------------------------------------------------------------
//4)- Se esta média for maior ou igual a 7.0, imprima a mensagem "Aluno aprovado.";
		if(MEDIA >= 7.0) {
			System.out.println("Aluno aprovado.");
			
		//Objetivo 5---------------------------------------------------------------------------------------------------------------------------
		//5)- Se a média calculada for inferior a 5.0, imprima a mensagem "Aluno reprovado.";
		}else if(MEDIA < 5) {
			System.out.println("Aluno reprovado.");
		}		
//Objetivo 6---------------------------------------------------------------------------------------------------------------------------
//6)- Se a média calculada for um valor entre 5.0 e 6.9, inclusive estas, o programa deve imprimir a mensagem "Aluno em exame.";
		if(MEDIA >= 5.0 && MEDIA <= 6.9) {
			System.out.println("Aluno em exame.");
						
      //Objetivo 7---------------------------------------------------------------------------------------------------------------------------
      //7)- No caso do aluno estar em exame, leia um valor correspondente à nota do exame obtida pelo aluno; 
            Double exame = entrada.nextDouble();					  
			
      //Objetivo 8---------------------------------------------------------------------------------------------------------------------------
      //8)- Imprima então a mensagem "Nota do exame: " acompanhada pela nota digitada;
		    System.out.println("Nota do exame: "+ decimal.format(exame));				
					
      //Objetivo 9---------------------------------------------------------------------------------------------------------------------------
      //9)- Recalcule a média (some a pontuação do exame com a média anteriormente calculada e divida por 2). e imprima a mensagem: 
      //  "Aluno aprovado." (caso a média final seja 5.0 ou mais );
      //  "Aluno reprovado."(caso a média tenha ficado 4.9 ou menos);
		    MEDIA = (MEDIA + exame) / 2;
    
		    if(MEDIA >= 5.0) {
		    	System.out.println("Aluno aprovado.");
		    }
		    else {
		    	System.out.println("Aluno reprovado.");
		    }
						
	  //Objetivo 10--------------------------------------------------------------------------------------------------------------------------
	  //10- Para estes dois casos (aprovado ou reprovado após ter pego exame) apresente na última linha uma mensagem "Media final: " 
      //seguido da média final para esse aluno.
		    System.out.println("Media final: "+ decimal.format(MEDIA));
		    		    
		}	

//-------------------------------------------------------------------------------------------------------------------------------------
		entrada.close();

	}

}
