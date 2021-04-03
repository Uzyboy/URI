/*
|> Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir, calcule o menor número
de notas e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possí-
veis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.

   Condições:
   
   1) O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00);
     
   2) Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.

   3)-Não esqueça de imprimir o fim de linha após o produto, caso contrário seu programa apresentará a mensagem: “Presentation Error�?.

   Obs: Utilize ponto (.) para separar a parte decimal.
   ...................................................................................................................................   
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1021_Notas_e_Moedas {

	public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
		
		float quantidade= entrada.nextFloat();  
        int valorc = (int) (quantidade*100);	
        int v100 =(int) valorc/10000;
        valorc%= 10000;
        int v50 = (int) valorc/5000;
        valorc%=5000;
        int v20 = (int) valorc/2000;
        valorc%=2000;
        int v10 = (int)valorc/1000;
        valorc%=1000;
        int v5 = (int)valorc/500;
        valorc%=500;
        int v2 = (int)valorc/200;
        valorc%=200;
        int v1 = (int) (valorc/100);
        valorc%=100;
        int v05 = (int) (valorc/50);
        valorc%=50;
        int v25 = (int) (valorc/25);
        valorc%=25;
        int v010 = (int) (valorc/10);
        valorc%=10;
        int v005 = (int) (valorc/5);
        valorc%=5;  
        int v01 = (int) (valorc/1);
        System.out.println("NOTAS:");
        System.out.println(v100+"nota(s) de R$ 100.00");
        System.out.println(v50+" nota(s) de R$ 50.00");
        System.out.println(v20+" nota(s) de R$ 20.00");
        System.out.println(v10+" nota(s) de R$ 10.00");
        System.out.println(v5+" nota(s) de R$ 5.00");
        System.out.println(v2+" nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(v1+" moeda(s) de R$ 1.00");
        System.out.println(v05+" moeda(s) de R$ 0.50");
        System.out.println(v25+" moeda(s) de R$ 0.25");
        System.out.println(v010+" moeda(s) de R$ 0.10");
        System.out.println(v005+" moeda(s) de R$ 0.05");
        System.out.println(v01+" moeda(s) de R$ 0.01");
	
		entrada.close();

	}

}
