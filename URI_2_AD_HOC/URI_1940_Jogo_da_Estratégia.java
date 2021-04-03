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
package URI_2_AD_HOC;

import java.util.Scanner;

public class URI_1940_Jogo_da_Estratégia {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
     
		
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------------		
//1)- Leia dois inteiros J e R, o número de jogadores e de rodadas respectivamente (1 ≤ J, R ≤ 500).
		int J = entrada.nextInt(),
			R = entrada.nextInt();
	
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------------		
//2)- A segunda linha contém J × R inteiros, correspondentes aos Pontos de Vitória em cada uma das jogadas feitas, na ordem em que aconteceram.
//Os Pontos de Vitória obtidos em cada jogada serão sempre inteiros entre 0 e 100, inclusive.
		
		//2.1)- Leia o total de jogadas J X R;
		int jogadas[][] = new int[R][J];

		for(int i=0; i<R; i++) {
			for(int j=0; j<J; j++) {
				jogadas[i][j] = entrada.nextInt();
			}
		}

		//2.2)- Contabilize o total de pontos de cada jogador;
		//2.3)- Imprima a posição do primeiro que tiver a maior pontuação;
		int totalDePontos;
		int maiorSoma = 0;
		int vencedor = 0;

		for(int i=0; i<J; i++) {
			totalDePontos = 0;
			
			for(int j=0; j<R; j++) {
				totalDePontos += jogadas[j][i];
			}

			if(totalDePontos >= maiorSoma) {
				maiorSoma = totalDePontos;
				vencedor = i+1;
			}			
		}
		
		
//Objetivo 3 ----------------------------------------------------------------------------------------------------------------------------------------
//3)- Seu programa deve produzir uma única linha, contendo o inteiro correspondente ao jogador vencedor.
		System.out.println(vencedor);

		
		
//--------------------------------------------------------------------------------------------------------------------------------------------------	
		entrada.close();
		   		
	}
}

