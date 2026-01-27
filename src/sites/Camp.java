package sites;
import personnages.*;
public class Camp {
	protected Soldat commandant;
	private Soldat[] romains = new Soldat[80];
	private int indice = 0;
	
	
	
	public Camp(Soldat commandant) {
		this.commandant=commandant;
		commandant.parler("Je suis en charge de créer un nouveau camp romain.");
	}
	
	
	public Soldat getCommandant() {
		return (commandant);
	}
	
	public void ajouterSoldat(Soldat romain) {
		if (indice< 80)	
		{
			romains[indice]= romain ;
			indice ++ ;
			romain.parler("Je mets mon épée au service de Rome dans le camp dirigé par"+commandant.getNom());
		
		}
		else 
		{
			commandant.parler("Désolé"+romain.getNom()+" notre camp est complet !");
		
		}
		}
	
		public void afficherCamp() {
			System.out.println("Le camp dirigé par"+commandant.getNom()+"contient les soldats");
			for (int i=0;i<indice;i++)
			{
				System.out.println(romains[i].getNom());
				
			}
		}
		public void changerCommandant(Soldat nouvCommandant) {
			if (nouvCommandant.getGrade() == Grade.CENTURION) {
				commandant=nouvCommandant ;
				System.out.println("Moi"+nouvCommandant.getNom()+" je prends la direction du camp romain.");
			}
			
			else 
				System.out.println("Le romain"+nouvCommandant.getNom()+": « Je ne suis pas suffisamment gradé pour prendre la direction du camp romain. ».");

			
			
		}
}
