package desafios;
import java.util.Scanner;
public class desafio2 {

	public desafio2() {
		
		//Pedir um numero até 20 ao utilizador e em seguida pedir ao utilizador o mesmo numero de numeros que introduziu anteriormente.
		//Fazer a soma e média dos ditos numeros. 
		

		Exercicio2();
		
	}

	public void Exercicio2()
	{
		int soma=0;
		int num=0;
		int numdado;
		int numdado2;
		
		//Pedir ao utilizador um numero.
		
		
		System.out.println("Insira um numero até 20.");
		num = (new Scanner(System.in)).nextInt();
		
		//Pedir ao utilizador o mesmo numero de numeros que inseriu anteriormente.
		
		for ( int i=1; i <= num; i++)
		{
			
			System.out.println("Insira " + num + " numeros.");
			numdado = in.nextInt();
			numdado = in.nextInt();
			
			
			
			//Somar os numeros inseridos.
			soma = numdado+numdado2;
			numdado2 = numdado;
			numdado2 = soma;
			
				
		}
		
		System.out.println(" A soma dos numeros é de " +soma+ ".");
	

	}
}

