public class Ueben {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//DAVID: das geht einfacher wenn es ein ein konstantes literal ist:
		//String zeichenKetteFuerDasSpiel = "SR SR SR";
		//String[] dasSpiel = new String[zeichenKetteFuerDasSpiel.length()];

		String[] dasSpiel = "SR SR SR".split(" ");
		//ODER
		String[] dasSpiel_2 = new String[]{"SR","SR","SR"}; //nur zur veranschauung, wird nicht verwendet
		//ODER
		String[] dasSpiel_3 = {"SR","SR","SR"}; //nur zur veranschauung, wird nicht verwendet

		//DAVID: die initialisiere ich direkt...
		//String spielerEins = "";
		//String spielerZwei = "";
		String spielerEins = ermittleSpielerString(dasSpiel, 0, 1);
		String spielerZwei = ermittleSpielerString(dasSpiel, 1, 2);

		System.out.println("Spieler 1: "+spielerEins);
		System.out.println("Spieler 2: "+spielerZwei);


		int punkteStandSpielerEins = 0;
		int punkteStandSpielerZwei = 0;
		//int unentschieden = 0; DAVID: Die fragst Du nieeee ab -> ueberfluessig


		//DAVID: Nicht zu viele Variablen :-)
		//char spielerEinsBuchstabe;
		//char spielerZweiBuchstabe;


		// Der Methode wird eine Zeichenkette uebergeben die anschlieﬂend die Zeichenkette nach Spielereins und zwei aufteilt.
		//DAVID: Aufruf an die gleiche Methode spiel() 
		//spielerEins = SpielEins(dasSpiel);
		//spielerZwei = SpielZwei(dasSpiel);


		// DAVID: das geht auch so ohne CHAR array.
		// Die Spielerzeichenketten werden zu Chararrays 
		//char[] spielerEinsCharArray = spielerEins.toCharArray();
		//char[] spielerZweiCharArray = spielerZwei.toCharArray();



		// Ueber eine forschleife werden die beiden arrays verglichen und die Punkte der Spieler ermittelt.
		for(int i = 0; i<spielerEins.length(); i++) {

			//DAVID: Nicht zu viele Variablen... :-)
			//spielerEinsBuchstabe = spielerEinsCharArray[i];
			//spielerZweiBuchstabe = spielerZweiCharArray[i];

			//DAVID: Vergleich auf Gleicheit koennen wir vorher schon machen, machst du sonst in jedem case wieder...

			if (spielerEins.charAt(i) == spielerZwei.charAt(i)) {
				System.out.println("Die Runde ist unentschieden.");
			} else {
				switch (spielerEins.charAt(i)) {
				case 'S': {
					if (spielerZwei.charAt(i) == 'R') {
						punkteStandSpielerZwei++;
					} else {
						punkteStandSpielerEins++;
					}
					break; //einmal break reicht
				}

				case 'R': {
					if (spielerZwei.charAt(i) == 'S') {
						punkteStandSpielerEins++;

					} else {
						punkteStandSpielerZwei++;
					}
					break;
				}

				case 'P': {
					if (spielerZwei.charAt(i) == 'S') {
						punkteStandSpielerZwei++;
						break;
					} else {
						punkteStandSpielerEins++;
					}
					break;
				}

				}


				/*
			 switch (spielerEinsBuchstabe) {

				case 'S':  if(spielerEinsBuchstabe == spielerZweiBuchstabe) {
							unentschieden++;
							break;
								}else if (spielerZweiBuchstabe  == 'R') {
									punkteStandSpielerZwei++;
									break;

								}else {
									punkteStandSpielerEins++;
									break;
								}
				case 'R': if(spielerEinsBuchstabe == spielerZweiBuchstabe) {
							unentschieden++;
							break;
							}else if(spielerZweiBuchstabe == 'S') {
								punkteStandSpielerEins++;
								break;
							}else {
								punkteStandSpielerZwei++;
								break;
							}
				case 'P': if(spielerEinsBuchstabe == spielerZweiBuchstabe) {
							unentschieden++;
							break;
								}else if(spielerZweiBuchstabe == 'S') {
									punkteStandSpielerZwei++;
									break;
								}else {
									punkteStandSpielerEins++;
									break;
								}

			}
				 */

			}
		}

		//Ausgabe der Spielerpunkte durch die Konsole		 
		if (punkteStandSpielerEins < punkteStandSpielerZwei) {
			System.out.println("Spielerzwei hat gewonnen mit "+ punkteStandSpielerZwei + " Punkten");
		} else if(punkteStandSpielerZwei < punkteStandSpielerEins) {
			System.out.println("Spielereins hat gewonnen mit "+ punkteStandSpielerEins + " Punkten");
		} else {
			System.out.println("Unentschieden es hat keiner gewonnen");
		}

	}


	//DAVID: die beiden Methoden unten kannst du durch eine einzelne ersetzen:
	//Methoden-Namen immer klein anfangen (Konvention)
	//Parameter-Namen immer klein anfangen (Konvention)
	public static String ermittleSpielerString(String[] spiel, int startIndex, int endIndex) {
		String dasSpiel = "";
		String zusammengesetztesSpiel = "";

		for(int i = 0; i <spiel.length; i++) {
			dasSpiel = spiel[i].substring(startIndex, endIndex);
			zusammengesetztesSpiel  += dasSpiel;
		}

		return zusammengesetztesSpiel;
	}



	//String fuer SpielerEins wird erstellt.
	@Deprecated
	public static String SpielEins(String[] Spiel) {

		String dasSpiel = "";
		String zusammengesetztesSpiel = "";

		for(int i = 0; i <Spiel.length; i++) {

			dasSpiel = Spiel[i].substring(0,1);

			zusammengesetztesSpiel  += dasSpiel;

		}

		return zusammengesetztesSpiel;

	}


	//String fuer SpielerZwei wird erstellt.
	@Deprecated
	public static String SpielZwei(String[] Spiel) {

		String dasSpiel = "";
		String zusammengesetztesSpielZwei = "";

		for(int i = 0; i <Spiel.length; i++) {

			dasSpiel = Spiel[i].substring(1,2);

			zusammengesetztesSpielZwei  += dasSpiel;

		}

		return zusammengesetztesSpielZwei;

	}

}
