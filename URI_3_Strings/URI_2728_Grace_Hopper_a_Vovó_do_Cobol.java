/*
|>Objetivos: 

....................................................................................................................................................   
  
   Condições:
   
   1)- 
   
   2)- 
   
   3)- Não esqueça de imprimir o fim de linha após a saida, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
....................................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Saída   |
          |---------------------|------------------------|
____________________________________________________________________________________________________________________________________________________
*/
package URI_3_Strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class URI_2728_Grace_Hopper_a_Vovó_do_Cobol {

	public static void main(String[] args)throws IOException {
			
		InputStreamReader entrada = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(entrada);

//Objetivo 1 ------------------------------------------------------------------------------------------------------------------------------------
//1) - Leia uma String contendo de 1 a 50 caracteres, formado por letras minúsculas e maiúsculas ('a'-'z', 'A'-'Z') e hífens ('-'), sem espaços.

		String caso = in.readLine();

//Objetivo 2 ------------------------------------------------------------------------------------------------------------------------------------
//2)- Neste problema são dadas cinco palavras em cada linha de teste separadas por hífen. Para cada linha será impressa a palavra 'GRACE HOPPER' 
//se no texto de entrada forem encontradas as letras que formam a palavra COBOL no início ou fim de cada palavra em ordem. Caso não encontre, se-
//rá impressa a palavra 'BUG'.
		
		char COBOL[] = {'C','O','B','O','L'};
		
		while (caso!=null) //Caso contrário, novos casos de testes não serão lidos no URI
		{	
			
			//2.1)- Separe em substrings a String A tendo "-" como parâmetro;
			String [] casoSplit = caso.toUpperCase().split("-");
			
			//2.2)- Em cada split gerado, em ordem, verifique se possui as letras da palavra COBOL, no inicio ou fim;
			//Por exemplo, verifique se o primeiro split possui a letra C, se o segundo possui a letra O etc....
			
			boolean BUG = true; //Assumindo que não tenha BUG
			
			for (int i=0; i<casoSplit.length;i++)//Esse for alterna entre cada split
			{
				//Isso verifica se o split atual possui letras da palavra cobol no primeiro e no ultimo caractere
				if (COBOL[i] == casoSplit[i].charAt(0) || COBOL[i] ==casoSplit[i].charAt(casoSplit[i].length()-1)) 
				{
					BUG = false;
				}else {
					BUG = true;
					break;
				}
			}	
			
			//2.3)- Caso tenha todas as letras dde COBOL, imprima GRACE HOPPER, caso não, imprima BUG; 
			if( BUG == false) {
				System.out.println("GRACE HOPPER");
			}else {
				System.out.println("BUG");
			}		
			
			//2.4)- Leia o prox caso, caso ele seja null o programa é encerrado
			caso = in.readLine();
			
		}
		
		
//--------------------------------------------------------------------------------------------------------------------------------------------------	
//System.out.println("" + saidaFormatada.format();
		entrada.close();
		   		
	}
}

