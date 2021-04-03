/*
|>Objetivos: 

Durante anos, todos os contratos da AssociaÃ§Ã£o de Contratos da ModernolÃ¢ndia (ACM) foram datilografados em uma velha mÃ¡quina de datilografia.

Recentemente Sr. Miranda, um dos contadores da ACM, percebeu que a mÃ¡quina apresentava falha em um, e apenas um, dos dÃ­gitos numÃ©ricos. Mais especi-
ficamente, o dÃ­gito falho, quando datilografado, nÃ£o Ã© impresso na folha, como se a tecla correspondente nÃ£o tivesse sido pressionada. Ele percebeu 
que isso poderia ter alterado os valores numÃ©ricos representados nos contratos e, preocupado com a contabilidade, quer saber, a partir dos valores 
originais negociados nos contratos, que ele mantinha em anotaÃ§Ãµes manuscritas, quais os valores de fato representados nos contratos. Por exemplo, se
a mÃ¡quina apresenta falha no dÃ­gito 5, o valor 1500 seria datilografado no contrato como 100, pois o 5 nÃ£o seria impresso. Note que o Sr. Miranda 
quer saber o valor numÃ©rico representado no contrato, ou seja, nessa mesma mÃ¡quina, o nÃºmero 5000 corresponde ao valor numÃ©rico 0, e nÃ£o 000 (como 
ele de fato aparece impresso). 

1)- As entrada consistem en uma linha. Cada linha contÃ©m dois inteiros D e N (1 â‰¤ D â‰¤ 9, 1 â‰¤ N < 10100 );

....................................................................................................................................................
  
   CondiÃ§Ãµes:  
   
   1)- A entrada consiste de diversos casos de teste, cada um em uma linha. Cada linha contÃ©m dois inteiros D e N (1 â‰¤ D â‰¤ 9, 1 â‰¤ N < 10^100 ), re-
   presentando, respectivamente, o dÃ­gito que estÃ¡ apresentando problema na mÃ¡quina e o nÃºmero que foi negociado originalmente no contrato (que po-
   dem ser grande, pois ModernolÃ¢ndia tem sido acometida por hiperinflaÃ§Ã£o nas Ãºltimas dÃ©cadas).
   
   O ultimo caso de teste Ã© seguido por uma linha que contÃ©m apenas dois zeros separados por espaÃ§os em branco.
   
   2)- Para cada caso de teste da entrada o seu programa deve imprimir uma linha contendo um Ãºnico inteiro V, o valor numÃ©rico representado de fa-
   to no contrato.
   
   3)- NÃ£o esqueÃ§a de imprimir o fim de linha apÃ³s a saida, caso contrÃ¡rio seu programa apresentarÃ¡ a mensagem: â€œPresentation Errorâ€�.
....................................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de SaÃ­da   |
		  | 5 5000000           |    0 					 |
		  |	3 123456			|    12456               |
		  |	9 23454324543423	|    23454324543423      |
		  | 9 99999999991999999 |    1                   |
		  |	7 777				|    0                   |
		  |	0 0 				|					     |
          |---------------------|------------------------|
_____________________________________________________________________________________________________________________________________
*/
package URI_3_Strings;

import java.io.BufferedReader;									 //NEW
import java.io.IOException;		                             	 //NEW  
import java.io.InputStreamReader;								 //NEW
import java.math.BigInteger;

public class URI_1120_Revisão_de_Contrato {

	public static void main(String[] args) throws IOException {  //NEW
		
		//Classes nativas do Java para entrada de dados      
		InputStreamReader in = new InputStreamReader(System.in); //Faz a entrada e armazena os dados, porem esses fican inacessÃ­veis por si sÃ³;
		//Fluxo de transmissÃ£o de dados;
		BufferedReader entrada = new BufferedReader(in);		 //Transporta a(s) entrada(s) lida(s) no InputStreamReader; Torna os dados lidos 
																 //acessiveis e manipulaveis;		      
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------
//1)- As entrada consistem em uma linha. Cada linha contÃ©m dois inteiros D e N (1 â‰¤ D â‰¤ 9, 1 â‰¤ N < 10^100 );

//		String NUM = entrada.readLine(),                               //Aqui vocÃª pode ler uma string assim como o "nextLine" da classe Scanner;		

//----------------------------------------------------------------------------------------------------------------------------------------------		

//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------
//2)- Elimine todos os Numeros N da string NUM;
		boolean NULO = false;
		while( NULO == false) {
			String NUM = entrada.readLine(),            //Isso vai vai ler a string de entrada;		
					N  = NUM.substring(0, 1),           //Isso vai pegar o primeiro numero da string NUM;
					D  = NUM.substring(2);			    //Isso vai pegar todos os nÃºmeros na posiÃ§Ã£o 2 em diante;

			if( N.equals("0") && D.equals("0")) {		//Caso seja nulo, ambos os nÃºmeros, o processo para;
				NULO = true;
			
			}else {
			//2.1)- Subistitua todo N por espaÃ§o vazio na string D;
				D = D.replaceAll(N , "");
				
		    //2.2)- Se a String D estiver vazia, imprima um 0;
				if(D.isEmpty()) {
					System.out.println("0");
				}else {
					
			//2.3)- Imprima a string D, agora sem os N;
					BigInteger DInteiro = new BigInteger(D);
					System.out.println((DInteiro));
				}
				
				}
			}
								
//---------------------------------------------------------------------------------------------------------------------------------------------
			   
		//System.out.println("" + saidaFormatada.format());
		in.close();
		   
	}
}

