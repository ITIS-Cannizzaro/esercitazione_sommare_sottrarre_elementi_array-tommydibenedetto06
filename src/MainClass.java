import java.util.Scanner;
public class MainClass
{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("scegli l'esercizio:");
		int scelta = Integer.parseInt(in.nextLine());
		switch (scelta)
		{
		case 1:
			esercizio1 ();
			break;
		case 2:
			esercizio2 ();
			break;
		}
	}
	public static void esercizio1()
	{
		System.out.println("inserire la quantità degli indici:");
		int k = Integer.parseInt(in.nextLine());
		int [] numeri = new int [k];

		for (int i = 0; i < numeri.length; i++)
		{			
			System.out.println("inserire un numero:");
			numeri[i] = Integer.parseInt(in.nextLine());
		}
		somma_sottrazione (numeri);
	}
	public static void somma_sottrazione (int [] numeri)
	{	
		int addizione = 0;
		int sottrazione = 0;
			for (int j = 0; j < numeri.length; j++)
			{
				if ((j % 2 == 0 )|| (j==0))
				{
					addizione = addizione+ numeri[j];
				}

				else
				{
					sottrazione = -sottrazione - numeri[j];
				}
			}
			System.out.println("il risultato delle somme tra gli indici pari è:" + addizione);
			System.out.println("il risultato delle differenze tra gli indici dispari è:" + sottrazione);
	}
	public static void esercizio2()
	{
		System.out.println("inserire la quantità degli indici:");
		int k = Integer.parseInt(in.nextLine());
		int [] numeri = new int [k];

		for (int i = 0; i < numeri.length; i++)
		{			
			System.out.println("inserire un numero:");
			numeri[i] = Integer.parseInt(in.nextLine());
		}
		inverso(numeri);
	}
	public static void inverso(int [] numeri)
	{
		int [] scambio = new int [numeri.length];
		for (int j = 0; j < numeri.length; j++)
		{
			scambio [j] = numeri [numeri.length-j-1];
		}
		for (int n = 0; n < numeri.length; n++)
		{
			System.out.print(scambio[n]+ ";");
		}
	}
}

