
public class Centrale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Client c = new Client("elmi", "M", "14 voie cite viotte", 29);

		ProdAliement PA = new ProdAliement(25, 14, "yarout");

		ProdElectro pE = new ProdElectro("cres", "TV", "B");

		Commande cc = new Commande(PA, pE, "125er", "20/03/2020");

		System.out.println("=======");

		System.out.println(c.getNom() + "," + c.getSexe() + "," + c.getAdress() + "," + c.getAge() + ","
				+ PA.getDatedefabrication() + "," + PA.getDatelimite() + "," + PA.getLibelle() + "," + pE.getCode()
				+ "," + pE.getLibelle() + "," + pE.getType() + "," + cc.getDate() + "," + cc.getNum());

	}

}