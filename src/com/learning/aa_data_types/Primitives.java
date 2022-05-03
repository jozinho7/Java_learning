package com.learning.aa_data_types;

class Primitives {
	public static void main(String[] args) {
		/*
		 * primitivne datove typy
		 * 8 primitivnych datovych typov,ktore sa delia na 4 skupiny
		 * 1sk. cele cisla
		 * 2sk. desatinne cisla
		 * 3sk. znaky
		 * 4sk. logicke hodnoty
		 * 
		 * 1sk. 
		 * byte, short, int, long
		 * 2sk.
		 * float, double
		 * 3sk.  
		 * char (akykolvek 1 znak z ascii tabulky)
		 * 4sk.
		 * boolean (true false)
		 *
		 * staci zo zaciatku dobre vediet pouzivat int, double, char a boolean 
		 */
		int vahaMukyVGramoch = 0;
		System.out.println("Pocet gramov muky: " + vahaMukyVGramoch);

		int PocetLicencii;
		char Otaznik;
		int PocetRokov;
		boolean retardovany;
		int StupenRetardosti;
		double VahaVKilogramoch;
		boolean SchvalenieDokumentu;
		double FrekvenciaCPU;
		char ZalohovanieFlase;
		boolean bezOS;
		char pocujeNepocujeIrca;
		boolean pocujeNepocujeIrca2;
		int volumeSpeakers;
		
		// da sa vedla seba, v riadku za datovym typom deklarovat viacero premennych..
		// vsetky tieto tri premenne budu mat datovy typ boolean t.j. true alebo false
		boolean powerON, powerOFF, muted;
		
		// literal je doslovna hodnota, napriklad cislo 5 alebo znak '&', ci true alebo false,
		// ktora je takto explicitne niekde v kode napisana (tato terminologia nie je vobec dolezita)

		/*
		 * Priradenie hodnoty nastava z pravej strany na lavu cez operator priradenia.
		 * Operator priradenia je ako v matematike znamienko rovna sa (=)
		 * 
		 * Na lavej strane lezi premenna nejakeho datoveho typu a na pravej strane od = sa nachadza
		 * bud literal prislusneho datoveho typu alebo dokonca nazov inej premennej, ktorej hodnota
		 * sa ma priradit premennej, co je momentalne na lavej strane..
		 * Plati vsak, ze obe tieto premenne musia mat rovnaky datovy typ.
		 */

		// na lavej strane mame deklarovanu premennu a, ktorej priradzujeme hodnotu (literal) cisla 5
		int a = 5;

		// to iste sa deje aj tu s premennou b
		int b = 1234456677;
		
		// na nasledujucich riadkoch sme vytvorili premennu s nazvom c, a priradili jej hodnotu, ktora
		// sa nachadza v premennej s nazvom a, cize cislo 5. Teraz sa nachadza cislo 5 v premennej a aj c.
		int c = a;
		
		// deklaracia sa v kode pre kazdy nazov premennej robi len raz, takze vzdy ked chcem premennu pouzit
		// znovu, tak ju len zavolam a to napisanim jej nazvu.. v nasledujucom prikaze priradzujem hodnotu
		// premennej b do premennej c, ktora mala do teraz v sebe cislo 5.. po tejto operacii bude to co je
		// v premennej c prepisane tym, co je aktualne v premennej pod nazvom b; t.j. c aj b maju hodnotu 1234455...
		c = b;

		// vypisme si na konzolu (vystup) co sa aktualne vo vsetkych tychto premennych nachadza..
		System.out.println("Hodnoty premennych:");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);

		// je mozne spravit aj taketo nieco, ale v praxi sa s tym asi ani nestretnes..
		// ide o priradenie jednej hodnoty vsetkym premennym naraz v jednom riadku..
		int d = c = b = a;

		// vysledok bude to co sa teraz nachadza v premennej a.
		// to bude mat v seba kazda z tychto premennych, pretoze nezabudni, ze vsetky hodnoty
		// sa priradzuju z pravej strany na lavu...cize hodnota a sa vlozila do b, a ked b nadobudlo
		// hodnotu 5, tak ju posunulo dalej az do premennej s nazvom d.
		System.out.println("----------");
		System.out.println("Hodnoty premennych po zapise 'int d = c = b = a;'");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
