import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class tpgestiontest {

	ProdAliement pA;

	ProdElectro p1;

	ProdElectro pE;

	Commande cc;

	@Before
	public void setUp() {

		pA = new ProdAliement(34, 25, "yaourt");

		pE = new ProdElectro("cres", "TV", "B");

		cc = new Commande(pA, pE, "125er", "20/03/2020");
	}

	@Test
	public void testN() {

		assertNotNull(pA);

		assertNotNull(pE);

		assertNotNull(cc);

	}

	@Test
	public void testpA() {

		// produit Alimentaire

		assertEquals(pA.getDatedefabrication(), 34);

		assertEquals(pA.getDatelimite(), 25);

		assertEquals(pA.getLibelle(), "yaourt");

		// produit Electro

	}

	@Test
	public void testpe() {

		assertEquals(pE.getType(), Energetique.Economique);

		assertEquals(pE.getLibelle(), "TV");

		assertEquals(pE.getCode(), "cres");

	}

	@Test
	public void testcc() {

		assertEquals(cc.getNum(), "125er");

		assertEquals(cc.getDate(), "20/03/2020");

	}

}
