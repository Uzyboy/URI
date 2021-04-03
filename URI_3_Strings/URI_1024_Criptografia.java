/*
|>Objetivos: Solicitaram para que vocÃª construisse um programa simples de criptografia. Este programa deve possibilitar enviar mensagens codifi-
cadas sem que alguÃ©m consiga lÃª-las. O processo Ã© muito simples. SÃ£o feitas trÃªs passadas em todo o texto.

Na primeira passada, somente caracteres que sejam letras minÃºsculas e maiÃºsculas devem ser deslocadas 3 posiÃ§Ãµes para a direita, segundo a tabe-
la ASCII: letra 'a' deve virar letra 'd', letra 'y' deve virar caractere '|' e assim sucessivamente. Na segunda passada, a linha deverÃ¡ ser in-
vertida. Na terceira e Ãºltima passada, todo e qualquer caractere a partir da metade em diante (truncada) devem ser deslocados uma posiÃ§Ã£o para 
a esquerda na tabela ASCII. Neste caso, 'b' vira 'a' e 'a' vira '`'.

Por exemplo, se a entrada for â€œTexto #3â€�, o primeiro processamento sobre esta entrada deverÃ¡ produzir â€œWh{wr #3â€�. O resultado do segundo proces-
samento inverte os caracteres e produz â€œ3# rw{hWâ€�. Por Ãºltimo, com o deslocamento dos caracteres da metade em diante, o resultado final deve ser
â€œ3# rvzgVâ€�.
....................................................................................................................................................   
  
   CondiÃ§Ãµes:
   
   1)- A entrada contÃ©m vÃ¡rios casos de teste. A primeira linha de cada caso de teste contÃ©m um inteiro N (1 â‰¤ N â‰¤ 1*104), indicando a quantida-
   de de linhas que o problema deve tratar. As N linhas contÃ©m cada uma delas M (1 â‰¤ M â‰¤ 1*103) caracteres.

   2)- Para cada entrada, deve-se apresentar a mensagem criptografada.
   
   3)- NÃ£o esqueÃ§a de imprimir o fim de linha apÃ³s a saida, caso contrÃ¡rio seu programa apresentarÃ¡ a mensagem: â€œPresentation Errorâ€�.
....................................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de SaÃ­da   |
		  |	4				    |                        |
		  | Texto #3		    | 3# rvzgV               |
		  |	abcABC1			    | 1FECedc                |
	      | vxpdylY .ph			| ks. \n{frzx            |
		  |	vv.xwfxo.fd			| gi.r{hyz-xx            |
          |---------------------|------------------------|
____________________________________________________________________________________________________________________________________________________
*/
package URI_3_Strings;

import java.io.BufferedReader;								
import java.io.IOException;		                             	 
import java.io.InputStreamReader;

public class URI_1024_Criptografia {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader entrada = new BufferedReader(in);
		
//Objetivo 1 ------------------------------------------------------------------------------------------------------------------------------------		
//1)- Leia um inteiro N indicando a quantidade de casos de teste;
		int N = Integer.parseInt(entrada.readLine());
	
//Objetivo 2 ------------------------------------------------------------------------------------------------------------------------------------		
//2)- Declare uma String para receber a mensagem codificada;
		String s2 = "";

//Objetivo 3 ------------------------------------------------------------------------------------------------------------------------------------		
//3)- Leia N Strings de tamanho M(variavel a cada leitura) e encripte String segundo as especificaÃ§Ãµes abaixo;
		int cont = 0;		
		while(cont < N){
		
			//3.0)- Leia uma string que serÃ¡ analisada
			String s1 = entrada.readLine(); 
			
			//3.1)- Na primeira passada, somente caracteres que sejam letras minÃºsculas e maiÃºsculas devem ser deslocadas 3 posiÃ§Ãµes para a direita,
			//segundo a tabela ASCII: letra 'a' deve virar letra 'd', letra 'y' deve virar caractere '|' e assim sucessivamente. 
			for(int i=0; i<s1.length(); i++) {
				char c = s1.charAt(i);
				//minusculo									 //MAIUSCULO
				if(s1.charAt(i) >= 97 && s1.charAt(i) <=122 || s1.charAt(i) >= 65 && s1.charAt(i) <=90) { //Valores da tabela ASCII
					s2 = s2 + (char)(c + 3); 
				}else {
					s2 = s2 + c;
				}
			}
			
			//3.2)- Na segunda passada, a linha deverÃ¡ ser invertida. 
			String s3 = "";
			for(int i=s2.length()-1; i>=0; i--) {
				s3 = s3 + s2.charAt(i);				
			}
			
			//3.3)- Na terceira e Ãºltima passada, todo e qualquer caractere a partir da metade em diante (truncada) devem ser deslocados uma posiÃ§Ã£o 
			//para a esquerda na tabela ASCII. Neste caso, 'b' vira 'a' e 'a' vira '`'.
			String s4 = "";
			for(int i=0; i< s3.length()/2; i++){//Vai atÃ© a primeira metade;
				s4 = s4 + s3.charAt(i);				
			}
			
			for(int i=s3.length()/2; i<s3.length(); i++) {//Vai da segunda metade atÃ© o final;
				char c = s3.charAt(i);
				s4 = s4 + (char)(c - 1);
			}
		
			System.out.println(s4);
			
			cont++; 											//Decremento do While;
		}				
//--------------------------------------------------------------------------------------------------------------------------------------------------	
		 in.close();  		
	}
}

NÃO RESOLVIDO
