package sites;

import personnages.Gaulois;

public class Village {
	protected Gaulois chef;
	private Gaulois[] gaulois = new Gaulois[50];
	public int indice = 0;

	public Village(Gaulois chef) {
		this.chef = chef;
		chef.parler("Je suis un grand guerrier et je vais créer mon village");
	}

	public Gaulois getChef() {
		return chef;
	}

	public void ajouterVillageois(Gaulois gauloiseau) {
		if (indice < gaulois.length) {
			gaulois[indice] = gauloiseau;
			indice++;
			chef.parler("Bienvenue " + gauloiseau.getNom() + "!");
		} else {
			chef.parler("Désolé" + gauloiseau.getNom() + " mon village est déjà bien rempli.");
		}
	}

	public void afficherVillage() {

		System.out.println("Le village" + chef.getNom() + "est habité par");
		for (int i = 0; i < indice; i++) {
			System.out.println(gaulois[i].getNom());
		}

	}

	public void changerChef(Gaulois nouvChef) {

		System.out.println(
				"Le gaulois" + chef.getNom() + " : « Je laisse mon grand bouclier au grand" + nouvChef.getNom());

		chef = nouvChef;
		System.out.println("Le gaulois" + chef.getNom() + " : « Merci ! ».");

	}
}
