/*
|>Objetivos:  

	Uma sentença é chamada de dançante se sua primeira letra for maiúscula e cada letra subsequente for o oposto da letra anterior. Espaços devem 
ser ignorados ao determinar o case (minúsculo/maiúsculo) de uma letra. Por exemplo, "A b Cd" é uma sentença dançante porque a primeira letra ('A')
é maiúscula, a próxima letra ('b') é minúscula, a próxima letra ('C') é maiúscula, e a próxima letra ('d') é minúscula.

....................................................................................................................................................
  
   Condições:
   
   1)-A entrada contém vários casos de teste. Cada caso de teste é composto por uma linha que contém uma sentença, que é uma string que contém entre
   1 e 50 caracteres ('A'-'Z','a'-'z' ou espaço ' '), inclusive, ou no mínimo uma letra ('A'-'Z','a'-'z').
   
   2)-Transforme a sentença de entrada em uma sentença dançante (conforme o exemplo abaixo) trocando as letras para minúscula ou maiúscula onde for
   necessário. Todos os espaços da sentença original deverão ser preservados, ou seja, " sentence " deverá ser convertido para " SeNtEnCe ".
   
   3)- Não esqueça de imprimir o fim de linha após a saida, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
   
   .................................................................................................................................................   
           __________________________________________________________________________
          |           Exemplo de Entrada  	        |    Exemplos de Saída   		 |
          |	This is a dancing sentence  			|	ThIs Is A dAnCiNg SeNtEnCe	 |
  		  |	This   is         a  dancing   			|	ThIs   Is         A  dAnCiNg |
  		  |	sentence								| 	SeNtEnCe 					 |
		  |	aaaaaaaaaaa								| 	AaAaAaAaAaA	 				 |
		  |	z										|	Z							 |
          |-----------------------------------------|--------------------------------|
____________________________________________________________________________________________________________________________________________________
*/
package URI_3_Strings;

import java.io.BufferedReader;
import java.io.IOException;		                                  //NEW
import java.io.InputStreamReader;

public class URI_1234_Sentença_Dançante_NÃORESOLVIDO {

	public static void main(String[] args) throws IOException{
		
		
		//Classes nativas do Java para entrada de dados      
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader    entrada  = new BufferedReader(in);		  
        
		String sentenca = entrada.readLine();                        
		String sentDanc = "";
		String AUX      = "";
	    //Quando "sentenca == null", significa o fim de entrada;	
		
		while(sentenca != null) {
			
//Objetivo 1 ---------------------------------------------------------------------------------------------------------------------------------------
//1)- Leia uma string;			
			sentenca = entrada.readLine();         

//Objetivo 2 ---------------------------------------------------------------------------------------------------------------------------------------
//2)- Transforme a sentença de entrada em uma sentença dançant trocando as letras para minúscula ou maiúscula onde for necessário. Todos os espaços 
//da sentença original deverão ser preservados, ou seja, " sentence " deverá ser convertido para " SeNtEnCe ".			
			
			//2.1)- Percorra a String sentença:
			for(int i=1; i<sentenca.length(); i++) {
				
				//2.2)- Declare um booleano use ele da seguinte forma: verdadeiro para maiusculo e falso para minusculo;
				boolean verificador = true;
				
				if(sentenca.charAt(i-1) >= 65 && sentenca.charAt(i-1) <=90 && verificador == false){    //Valores da tabela ASCII
					verificador = true;
						   AUX = sentenca.substring(i,i+1);
						   AUX = AUX.toLowerCase();
					sentDanc = sentDanc + AUX;
				
				}else if(sentenca.charAt(i) >= 97 && sentenca.charAt(i) <=122 && verificador == true) {
					verificador = false;
						   AUX = sentenca.substring(i,i+1);
						   AUX = AUX.toUpperCase();
					sentDanc = sentDanc + AUX;
				}else {
						sentDanc = sentDanc + sentenca.substring(i,i+1);
				}				
			}			
			
			System.out.println(sentDanc);			

		}
	
		in.close();
	}
}


