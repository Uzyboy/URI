/*

  Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem que nele não existem políticos 
corruptos e os recursos arrecadados são utilizados em benefício da população, sem qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é
o R$.

|>Objetivos:  

1)- Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb Em seguida,

2)- Calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
					
					  _____________________________________________________________
					 |           Renda                 |	Imposto de Renda       |
					 |    de   0 - R$2000.00           |           Isento          |
					 |    de  R$ 2000.01 - 3000.00     |            8%             |
					 |    de  R$ 3000.01 - 4500.00     |            18%            |
					 |       Acima de 4500.00          |            28%   	       |
					 |_________________________________|___________________________|
	
	OBS.:Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de salário que fica
	de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 + 18% sobre
	R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com duas casas decimais.

............................................................................................................................
   Condições:
   
   1) -A entrada contém apenas um valor de ponto flutuante, com duas casas decimais;
  
   2) -Imprima o texto "R$" seguido de um espaço e do valor total devido de Imposto de Renda, com duas casas após o ponto. Se o valor de entrada 
   for menor ou igual a 2000, deverá ser impressa a mensagem "Isento";
   
   3)-Não esqueça de imprimir o fim de linha após a saida, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
   
   ...................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Saída   |
          |      3002.00        |       R$ 80.36         |
          |---------------------|------------------------|
          |      1701.12        |         Isento         |
          |---------------------|------------------------|
          |      4520.00        |        R$ 355.60       |
          |_____________________|________________________|
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;
import java.text.DecimalFormat;

public class URI_1051_Imposto_de_Renda {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		DecimalFormat saidaFormatada = new DecimalFormat("0.00");

				      
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------
//1)- Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb Em seguida,
				   double renda   = entrada.nextDouble(),
						  imposto = 0,
						  resto   = 0;

//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------
//2)- Calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda;
		
				   if( renda > 2000.00 ){ //Caso contrario a renda é isenta

					   if(renda > 2000.00 && renda <= 3000.00) {
						   resto   = renda - 2000; //Elimina a parte isenta
						   imposto = resto * 0.08;
						   System.out.println("R$ " + saidaFormatada.format(imposto));
						   
					   }else if(renda > 3000.00 && renda <= 4500.00) {
						   resto   = renda - 3000;//Elimina a parte que não pega na faixa  [3000,4500], que seria o valor max que cabe na faixa 
						   						  //anterior(1000) + a parte isenta(2000) = 3000;
						   
						   imposto = (resto * 0.18) + (1000 * 0.08);
						   System.out.println("R$ " + saidaFormatada.format(imposto));

					   }else if(renda > 4500){
						   resto   = renda - 4500; //Elimina a parte que não pega na faixa [4500,...], que seria o valor max que cabe nas faixas 
	   						  					   //anteriores(1000), (1500) + a parte isenta(2000) = 4500;
						   
						   imposto = (resto * 0.28) + (1500 * 0.18) + (1000 * 0.08);
						   System.out.println("R$ " + saidaFormatada.format(imposto));

					   }
						   
				   }else {
				   System.out.println("Isento");
				  
				   }
			
//-------------------------------------------------------------------------------------------------------------------------------------------

				   entrada.close();
		   
	}
}

