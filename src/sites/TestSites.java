package sites;
import personnages.*;

public class TestSites {
	
	public static void main(String[] args) {
		Gaulois vercingetorix = new Gaulois("Vercingétorix", 8);
		
		Gaulois asterix = new Gaulois("Asterix", 5);
		
		Gaulois Agecanonix = new Gaulois("Agecanonix", 1);
		Gaulois Assurancetourix= new Gaulois("Assurancetourix", 2);
		Gaulois Obelix= new Gaulois("Obelix", 15);
		Gaulois Prolix= new Gaulois("Prolix", 2);
		
		Gaulois abraracourcix = new Gaulois("abraracourcix", 5);
		
		Soldat Minus = new Soldat("Minus", 2, Grade.SOLDAT);
		Soldat Brutus= new Soldat("Brutus",5,Grade.CENTURION);
		Soldat Milexcus= new Soldat("Milexcus",2,Grade.SOLDAT);
		Soldat TulliusOctopus= new Soldat("Tullius Octopus",2,Grade.TESSERARIUS);
		Soldat Ballondebaudrus= new Soldat("Ballondebaudrus",3,Grade.OPTIO);
		
		Soldat Briseradius = new Soldat("Briseradius", 4, Grade.SOLDAT);
		Soldat Chorus = new Soldat("Chorus", 2, Grade.CENTURION);
		
		
		System.out.println(asterix.getNom());
		
		Village village= new Village(vercingetorix);
		village.ajouterVillageois(Agecanonix);
		village.ajouterVillageois(Assurancetourix);
		village.ajouterVillageois(Obelix);
		village.ajouterVillageois(Prolix);
		
		village.ajouterVillageois(abraracourcix);
		
		
		
		village.afficherVillage();
		
		Camp camp = new Camp(Minus);
		camp.ajouterSoldat(Brutus);
		camp.ajouterSoldat(Milexcus);
		camp.ajouterSoldat(TulliusOctopus);
		camp.ajouterSoldat(Ballondebaudrus);
		
		camp.ajouterSoldat(Briseradius);
		camp.ajouterSoldat(Chorus);
		
		
		camp.afficherCamp();
		village.changerChef(abraracourcix);
		
		camp.changerCommandant(Briseradius);
		camp.changerCommandant(Chorus);
		
		
	}

}


