package dia091116;

public class TreinoArrays {

	public TreinoArrays() {
		// Numero de golos num jogo:
		// Porto - Benfica
		// tipo de varivel; [] array; nome de variavel; inicializa��o
		//tamanho de variavel
		
		int[] golos = new int[2];
		//int - nome de variavel. - NOTA MINHA
		// 2 - numero de equipas. - NOTA MINHA
		
		
		//atribuir variaveis ao array
		golos[0] = 1; // golo na posi��o 0 � igual a 1.
		
		
		// N�o se pode fazer pois o array � de inteiros.
		// golos[0]="1";
		
		golos[1] = 1;
		
		// Instancia��o com inicializa��o de variaveis
		int[] portoBenfica =  { 1 , 1 };
		
		//Sporting VS Arouca
		int[] sportingArouca = { 3 , 0 };
		
		//Mar�timo vs Braga.
		int[] maritimoBraga = { 1 , 0 };
		
		
		int [][] jogosGrandes = new int [2][3];
		jogosGrandes[0][0] = portoBenfica[0];
		jogosGrandes[1][0] = portoBenfica[1];
		jogosGrandes[0][1] = sportingArouca[0];
		jogosGrandes[1][1] = sportingArouca[1];
		jogosGrandes[0][2] = maritimoBraga[0];
		jogosGrandes[1][2] = maritimoBraga[1];
		
		System.out.println(jogosGrandes[0][0]);
		
		
	}

}
