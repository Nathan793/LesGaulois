package sites;

import personnages.Gaulois;
import personnages.Grade;
import personnages.Soldat;

public class Village {
protected Gaulois Chef;
private Gaulois[] gaulois = new Gaulois[50];
public int indice = 0 ;
	public Village(Gaulois Chef) {
		this.Chef= Chef;
		Chef.parler("Je suis un grand guerrier et je vais créer mon village");
	}

	
	public Gaulois getChef() {
		return (Chef);
	}
	
	
	public void ajouterVillageois(Gaulois gauloiseau) {
		if (indice< 50)
		{
			gaulois[indice]= gauloiseau;
			indice ++ ;
			Chef.parler("Bienvenue "+ gauloiseau.getNom()+"!");
		}	
		else
		{
		Chef.parler("Désolé"+gauloiseau.getNom()+" mon village est déjà bien rempli.");
		}
	}
	
	public void afficherVillage() {
		
		System.out.println("Le village" +Chef.getNom()+"est habité par");
		for (int i = 0; i<indice;i++) {
			System.out.println(gaulois[i].getNom());
		}
		
		
	}
	public void changerChef(Gaulois nouvChef)
	{
		
		System.out.println("Le gaulois" +Chef.getNom()+" : « Je laisse mon grand bouclier au grand"+ nouvChef.getNom());
		
		Chef=nouvChef ;
		System.out.println("Le gaulois"+ Chef.getNom()+	" : « Merci ! ».");


	}
	}
