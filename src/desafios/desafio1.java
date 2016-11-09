package desafios;

import java.util.Scanner;

public class desafio1 {

	public desafio1() {

		
		Exercicio1();
//		EXERCICIO1		
// Uma equipa de Formula 1 quer comparar os tempos de volta dos seus três pilotos.
// Pede os tempos de volta de cada um dos pilotos e em seguida diz qual foi o melhor e qual foi o pior;
// sendo que o pior tempo tem de apresentar uma mensagem a dizer " Não está qualificado para a corrida. "
// E fazer ainda a soma dos tempos todos da equipa.	
	}
	
	public void Exercicio1()
	{
	float totaltime;
		
	
	//Pedir tempos de volta.
	System.out.println("Team Eatler. \n Insira os tempos de volta por ordem de chegada.");
	float time1 = (new Scanner(System.in)).nextFloat();
	float time2 = (new Scanner(System.in)).nextFloat();
	float time3 = (new Scanner(System.in)).nextFloat();
	
	if ( time1 > time2 && time2 > time3)
		{
			System.out.println("O piloto com o tempo "+time3+"  tem o melhor tempo e o piloto com o tempo "+time1+" tem o pior tempo.");
			System.out.println("\nO piloto com o tempo  "+time1+"  não está qualificado para a corrida.");
		}
			else if ( time2 > time1 && time1 > time3)
			{
				System.out.print("O piloto com o tempo " +time3+ "  tem  o melhor tempo e o piloto com o tempo "+time2+" tem o pior tempo.");
				System.out.print("\nO piloto com o tempo "+time2+" não está qualificado para a corrida.");
			}
				else if ( time3 > time2 && time2 > time1)
				{
					System.out.print("O piloto com o tempo "+time1+" tem  o melhor tempo e o piloto com o tempo "+time3+" tem o pior tempo.");
					System.out.print("\nO piloto com o tempo "+time3+"  não está qualificado para a corrida.");
				}	
					else if ( time3 > time1 && time1 > time2)
					{
						System.out.println("O piloto com o tempo "+time2+" tem o melhor tempo e o piloto com o tempo "+time3+" tem o pior tempo.");
						System.out.println("\nO piloto com o tempo  "+time3+"  não está qualificado para a corrida.");
					}	
						else if ( time1 > time3 && time3 > time2)
						{
							System.out.print("O piloto com o tempo "+time2+" tem  o melhor tempo e o piloto com o tempo "+time1+" tem o pior tempo.");
							System.out.print("\nO piloto com o tempo  "+time1+"  não está qualificado para a corrida.");
						}	
						else if	( time2 > time3 && time3 > time1)
							{
								System.out.print("O piloto com o tempo "+time1+" tem  o melhor tempo e o piloto com o tempo "+time2+" tem o pior tempo.");
								System.out.print("\nO piloto com o tempo  " +time2+ "  não está qualificado para a corrida.");
							}	
	
		totaltime = time1 + time2 + time3;
		System.out.println("\nA soma de tempos da equipa é de:\n "+totaltime+" segundos. .");
	
	
	}
	
	
		
}
