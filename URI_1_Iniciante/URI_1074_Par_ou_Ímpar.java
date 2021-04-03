/*
|>Objetivos:  

1)- Leia um valor inteiro N. Este valor será a quantidade de valores que serão lidos em seguida. 

2)-Para cada valor lido, mostre uma mensagem em inglês dizendo se este valor lido é par (EVEN), ímpar (ODD), positivo (POSITIVE) ou negativo 
(NEGATIVE).No caso do valor ser igual a zero (0), embora a descrição correta seja (EVEN NULL), pois por definição zero é par, seu programa de-
verá imprimir apenas NULL.

  ............................................................................................................................
  
   Condições:
   
   1)- A primeira linha da entrada contém um valor inteiro N(N < 10000) que indica o número de casos de teste. Cada caso de teste a seguir é
   um valor inteiro X (-107 < X <107);
   
   2)- Para cada caso, imprima uma mensagem correspondente, de acordo com o exemplo abaixo. Todas as letras deverão ser maiúsculas e sempre
   deverá haver um espaço entre duas palavras impressas na mesma linha;
   
   3)- Não esqueça de imprimir o fim de linha após a saida, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
   
   ...................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Saída   |
          |         4           |                        |
          |        -5           |     ODD NEGATIVE       |
          |         0           |         NULL           |
          |         3           |     ODD POSITIVE       |
          |        -4           |    EVEN NEGATIVE       |
          |_____________________|________________________|
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1074_Par_ou_Ímpar {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		      
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------
//1)- A primeira linha da entrada contém um valor inteiro N(N < 10000) que indica o número de casos de teste. Cada caso de teste a seguir é
//um valor inteiro X (-107 < X <107);				   
		int N    = entrada.nextInt(),
			CASO = 0,
			cont = 0;
		
		boolean pos = false,
				par = false;
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------
//2)- Para cada caso, imprima uma mensagem correspondente, de acordo com o exemplo abaixo. Todas as letras deverão ser maiúsculas e sempre
//deverá haver um espaço entre duas palavras impressas na mesma linha;
		
		   while(cont < N) {						  //Isso define que apenas N casos serão lidos;
			   CASO = entrada.nextInt();  	
		
					if( (CASO % 2 == 0)) {            //Esse "if" verifica se o número é par ou impar;		
						par = true;					  
					}else {
						par = false;
					}
					
					if(CASO > 0) {					  //Isso verifica se o número é positivo ou negativo;
						pos = true;
					}else if(CASO < 0) {
						pos = false;
					}
//---------------------------------------------------------------------------------------------------------------------------------------------
					//EVEN para par e ODD para impar; NEGATIVE/POSITIVE;
					if(CASO == 0) {							//Se ele for NULO;
						System.out.println("NULL");								
					}else if (par == true && pos == true) {		//Se ele for PAR e POSITIVO;
							System.out.println("EVEN POSITIVE");
						}else if (par == true && pos == false) {	//Se ele for PAR e NEGATIVO;
							System.out.println("EVEN NEGATIVE");
							}else if (par == false && pos == true) {	//Se ele for IMPAR e POSITIVO;
								System.out.println("ODD POSITIVE");
								}else if (par == false && pos == false) {	//Se ele for IMPAR e NEGATIVO;
									System.out.println("ODD NEGATIVE");
									}
//---------------------------------------------------------------------------------------------------------------------------------------------
					
					cont++;
		   }
		   
//---------------------------------------------------------------------------------------------------------------------------------------------
		   entrada.close();
		   
	}
}

