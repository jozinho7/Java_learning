package com.learning.a_bordel;

/**
 * Tato trieda znazornuje pouzitie komentarov v zdrojovom kode.
 */
public class Priklad {

	/**
	 * Tato metoda zabezpecuje to, aby mohol byt projekt z nejakeho
	 * bodu spusteny.. java hlada main metodu presne v tomto tvare
	 * ako vstupny bod programu, a zacina vykonavat riadok po riadku,
	 * ako su uvedene v tejto metode.
 	 */
	public static void main(String[] args) {

		// vypise na vystup do konzoly definovany text bez zalomenia na novy riadok
		System.out.print("Hello, world");
		System.out.print(" ");

		// pripoji k vypisu vykricnik a zalomy text na dalsi riadok
		System.out.println("!");
		
		/*
		 * Nizsie uvedene prikazy sa daju prelozit do anglictiny nasledovne:
		 * 
		 * "Get system output and print"..
		 * "Ziskaj pristup k systemovej konzole a na jej vystup vytlac/vypis"
		 * System.out.print();
		 *
		 * "Get system output and print line.."
		 * "Ziskaj pristup k systemovej konzole a na jej vystup vytlac/vypis riadok"
		 * System.out.println();
		 */
	}
}
