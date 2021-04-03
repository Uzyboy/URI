/*
|>Objetivos: 
	Uma brincadeira que crianças adoram é se comunicar na língua do P, acrescentando pê antes de cada sílaba, como uma forma de código para dificul-
tar que outras pessoas entendam a conversa (pê-va pê-mos pê-no pê-ci pê-ne pê-ma?).

	Jacy e Kátia adaptaram a língua do P para mensagens eletrônicas, acrescentando a letra P minúscula ‘p’ antes de cada letra das palavras de uma 
mensagem. Um exemplo de mensagem codificada e a respectiva mensagem decodificada é mostrada na figura abaixo.

			|		Mensagem Codificada		|	Mensagem decodificada	|		 
			|  pVpapmpops papo pcpipnpepmpa |	   Vamos ao cinema 	    |
....................................................................................................................................................   
  
   Condições:
   
   1)- A entrada consiste de uma única linha, contendo uma mensagem escrita na língua do P eletrônica de Jacy e Kátia, a mensagem contém apenas le-
   tras maiúsculas e minúsculas e espaços em branco, a mensagem tem entre 1 e 1000 caracteres, não há dois espaços em branco consecutivos na mensa-
   gem.
   
   2)- Seu programa deve produzir uma única linha, contendo a mensagem decodificada.
   
   3)- Não esqueça de imprimir o fim de linha após a saida, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
....................................................................................................................................................   
           ______________________________________________________
          | 	Exemplo de Entrada  	|    Exemplos de Saída   |
          |  pUpm pfpiplpmpe plpepgpapl |     Um filme legal	 |
          |  pA pppapppa pdpo pPpapppa  |     A papa do Papa	 |
          |-----------------------------|------------------------|
____________________________________________________________________________________________________________________________________________________
*/
package URI_2_AD_HOC;

import java.util.Scanner;
	
public class URI_2453_Língua_do_P {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------------		
//1)- Declare e leia uma String, essa será a mensagem a se codificada;
		String msg = entrada.nextLine();
		
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------------		
//2)- Decodifique a mensagem removendo um "p" antes de cada charater;
		
		//2.1)- Declare uma String pra armazenar a nova String Decodificada;
		String msgDecode = "";

		//2.2)- Divida a String codificada em substrings, usando split e espaço vazio como parametro;
		
		//2.3)- Declare um contador e faça com que ele contabilize a quantidade de splits que serão gerados;
		int contSplit = 0;
		for(int i=0; i<msg.length(); i++) {
			
			if(msg.charAt(i) == ' ') {
				contSplit++;
			}
		}
		contSplit ++;
		
		//2.5)- Declare um vetor pra armazenar cada split;
		String msgSplit[] =	msg.split(" ");
		boolean primeiro = false; //Se for true o primeiro ja foi impresso
		
		//2.4)- Em cada SubString da mensagem codificada, os "p" adicionais sempre ficaram em uma posição par;		 
		for(int j=0; j<contSplit; j++) {
				
			msgDecode = "";
			for(int k=0; k<msgSplit[j].length(); k++) {
				
				if(k%2 == 1) {
					
					msgDecode = msgDecode + msgSplit[j].charAt(k);
									
				}
			}
			
			if(primeiro == false) {
				System.out.print(msgDecode);
				primeiro = true;
			}else {
				System.out.print(" " + msgDecode);
			}

		}	
		System.out.println();
//--------------------------------------------------------------------------------------------------------------------------------------------------	
		entrada.close();
		   		
	}
}

