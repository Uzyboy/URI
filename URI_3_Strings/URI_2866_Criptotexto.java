/*
|>Objetivos:  
	César é um detetive que investiga uma série de roubos que acontecem em sua cidade. Em todo lugar que um crime acontece, a pessoa que cometeu tal
crime deixa uma mensagem escrita, formada por letras maiúsculas e minúsculas. César conseguiu achar um padrão nestas mensagens e agora extrai um tex-
to oculto em cada mensagem e pede a sua ajuda para tentar descobrir quem está cometendo tais crimes.

....................................................................................................................................................   
  
   Condições:
   
   1)- A entrada é composta por vários casos de teste. A primeira linha contém um número inteiro C (2 <= C <= 99) relativo ao número de casos de tes-
   te. Nas C linhas seguintes, haverá mensagens codificadas, todas com um mesmo padrão em relação ao exemplo abaixo.
   
   2)- Para cada caso de teste de entrada do seu programa, você deve imprimir o texto extraído da mensagem original.
   
   3)- Não esqueça de imprimir o fim de linha após a saida, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
   
....................................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Saída   |
		  |3					|	      sapo			 |
          |NoTApasCAL			|	      batata		 |
          |atEQUEatabELATERMINE	|	      arroz          |
          |zoEIrrRRRRa			|						 |
          |---------------------|------------------------|
____________________________________________________________________________________________________________________________________________________
*/
package URI_3_Strings;

import java.util.Scanner;

public class URI_2866_Criptotexto {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);

//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------------		
//1)- Leia um número inteiro C (2 <= C <= 99) relativo ao número de casos de teste; 			
		int C = entrada.nextInt();
	
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------------		
//2)- Nas C linhas seguintes, haverá mensagens codificadas, todas com um mesmo padrã: letras minusculas de trás para frente;
		for(int i=0; i<C; i++) {
			
			String msgCode = entrada.next();							//Isso lê um código pra ser decodificado
			
			//2.1)- Colete apenas as letras maiusculas e guarde numa string
			String invertMin = "";										//Essa String armazena apenas as letras minusculas da string "msgCode"
			
			for(int j=0; j<msgCode.length(); j++) {
				
				if(msgCode.charAt(j) >= 97 && msgCode.charAt(j)<=122) { //Valores da tabela ASCII para letras minusculas;
					
					invertMin = invertMin + msgCode.charAt(j);			//Isso contatena todas as letras minusculas em uma string;
					
				} 		
	
			}
			//2.2)- Guarde a string onde estão as letras minusculas em um vetor e imprima esse vetor de forma inversa;
			char minDecod[] = new char[invertMin.length()];				
			
			for(int k=invertMin.length()-1; k>=0; k--) {
				minDecod[k] = invertMin.charAt(k);
				System.out.print(minDecod[k]);
			}
			System.out.println();										 //Isso é para que cada codigo decodificado apareça em uma linha;
		}
			
//----------------------------------------------------------------------------------------------------------------------------------------	
//System.out.println("" + saidaFormatada.format();
		entrada.close();
		   		
	}
}

