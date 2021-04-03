/*
|>Objetivos: 
Matheus estava conversando com a sua noiva via mensagem de texto, quando ela lhe enviou a seguinte mensagem:

1-4-3

 Ele não entendeu a mensagem, então ele perguntou o que isso significava, e ela respondeu que era 'I Love You" e logo ele percebeu que cada
número separado por um ' - ' é a quantidade de caracteres de cada uma das palavras que compõem a frase. Com isso, ele teve a ideia de criar
um programa que inserindo determinada frase, ele calcula a quantidade de caracteres de cada uma das palavras e separa os valores por ' - '.
Mas ele ainda teve a ideia de que o programa deveria receber várias frases linha por linha e ainda no final da execução do programa, a pala-
vra com a maior quantidade de letras deveria ser exibida.
 
....................................................................................................................................................   
  
   Condições:
   
   1)- A entrada consiste de vários casos de teste. A primeira linha de um caso de teste contém uma 1 ≤ String ≤ 100 com uma única palavra 
   ou um conjunto de palavras que formam uma frase. Os casos de teste serão processados quando o número 0 for recebido. Não pode haver mais
   que um espaço separando cada palavra.
 
   2)- Para cada caso de teste, exiba o número de caracteres de cada palavra que compõe a frase recebida. Separe a quantidade de caracteres
    de cada palavra por um ' - '. Exiba também a palavra com a maior quantidade de caracteres de todas as frases recebidas.
    Exiba "The biggest word: " seguida da maior palavra;
   
   3)- Não esqueça de imprimir o fim de linha após a saida, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
....................................................................................................................................................   
           _____________________________________________________________________
          | 	Exemplo de Entrada  	 |    Exemplos de Saída   				|
		  | i love you			         |    1-4-3								|
		  | squirtle squirtle squirtle	 |	  8-8-8								|
		  | chondrocraniums				 |    15								|
		  | coal is so dark				 |    4-2-2-4							|
          | lacing your dreams			 |    6-4-6								|
          | te t e te t e te t e te		 |    2-1-1-2-1-1-2-1-1-2				|
          | 0							 |										|
          |	                             |    The biggest word: chondrocraniums |
          |------------------------------|--------------------------------------|
____________________________________________________________________________________________________________________________________________________
*/
package URI_3_Strings;

import java.util.Scanner;


public class URI_2108_Contando_Caracteres {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
 		
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------------		
//1) Leia Strings 1 ≤ String ≤ 100, e se por acaso um 0 dor lido, ponha uma condição para parar.
		String Palavra = entrada.nextLine();
		
		//2.3)*
		int maior          = 0;
		String maiorString = "";
		
		while(Palavra.equals("0") == false) {
			
		//Objetivo 2 --------------------------------------------------------------------------------------------------------------------------------		
		//2)- Conte quantos caracteres cada palavra da string possui;
			
			 //2.1)- Separe a Palavra atual tendo espaço vazio como parametro e guarde num vetor;
			String[] palavraS = Palavra.split(" ");
			boolean primeiro = false;
				
			//2.2)- Conte cada caractere de cada split;
			
			for(int i=0; i<palavraS.length; i++) {
				
				if(primeiro == false) {
					System.out.print(palavraS[i].length());
					primeiro = true;
				}else {
					System.out.print("-" + palavraS[i].length() );
				}
			
				//2.3)- Contabilize a palavra com mais caracteres, ou maior length;
				if(palavraS[i].length() > maior);{
					maior 		= palavraS[i].length();
					maiorString = palavraS[i];
		
				}
				
			}	
			System.out.println();
				
			Palavra = entrada.nextLine();
		}
		
		System.out.println("The biggest word: " + maiorString);
		
	
//--------------------------------------------------------------------------------------------------------------------------------------------------	

		entrada.close();
		
		   		
	}
}

