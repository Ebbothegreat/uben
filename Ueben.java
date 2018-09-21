

public class Ueben {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String zeichenKetteFuerDasSpiel = "SR SR SR";
		String[] dasSpiel = new String[zeichenKetteFuerDasSpiel.length()];
		String spielerEins = "";
		String spielerZwei = "";
		int punkteStandSpielerEins = 0;
		int punkteStandSpielerZwei = 0;
		int unentschieden = 0;
		
		
		char spielerEinsBuchstabe;
		char spielerZweiBuchstabe ;
		
		
		dasSpiel =  zeichenKetteFuerDasSpiel.split(" ");
		
		
		
		// Der Methode wird eine Zeichenkette uebergeben die anschlieﬂend die Zeichenkette nach Spielereins und zwei aufteilt.
		 spielerEins = SpielEins(dasSpiel);
		 spielerZwei = SpielZwei(dasSpiel);
		 
		 // Die Spielerzeichenketten werden zu Chararrays 
		 char[] spielerEinsCharArray = spielerEins.toCharArray();
		 char[] spielerZweiCharArray = spielerZwei.toCharArray();
		 
		 
		 // Ueber eine forschleife werden die beiden arrays verglichen und die Punkte der Spieler ermittelt.
		 for(int i = 0; i<spielerEinsCharArray.length; i++) {
			 
			 
			 spielerEinsBuchstabe = spielerEinsCharArray[i];
			 spielerZweiBuchstabe = spielerZweiCharArray[i];
			 
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
			 
			
			 	 			 
			 
		 }
		 
		 
		 //Ausgabe der Spielerpunkte durch die Konsole		 
		 if(punkteStandSpielerEins < punkteStandSpielerZwei) {
			 System.out.println("Spielerzwei hat gewonnen mit "+ punkteStandSpielerZwei + " Punkten");
		 }else if(punkteStandSpielerZwei < punkteStandSpielerEins) {
			 System.out.println("Spielereins hat gewonnen mit "+ punkteStandSpielerEins + " Punkten");
		 }else {
			 System.out.println("Unentschieden es hat keiner gewonnen");
		 }
		 
		 
		 
		 
		

	}
	
	
	//String fuer SpielerEins wird erstellt.
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
