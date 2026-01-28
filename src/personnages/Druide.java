package personnages;

import java.security.SecureRandom;
import java.util.Random;

public class Druide extends Gaulois {
	
	private Random random;
	private int forcePotion = random.nextInt(2,6);
	private int nbDose = 5;

	public Druide(String nom, int force) {
		super(nom, force);
		try {
			random = SecureRandom.getInstanceStrong();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void donnerLouche(Gaulois gauloiseau) {
		gauloiseau.force = forcePotion * gauloiseau.force;
		nbDose--;

	}

}
