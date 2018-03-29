/**
 * 
 */
package gume;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author momcilobogojevic2801
 *
 */
public class AutoGumaTest {

	private AutoGuma a;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		a = new AutoGuma();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		a = null;
	}

	/**
	 * Test method for {@link gume.AutoGuma#setMarkaModel(java.lang.String)}.
	 */
	@Test
	public void testSetMarkaModel() {
		a.setMarkaModel("TigarMirage");

		assertEquals("TigarMirage", a.getMarkaModel());
	}

	/**
	 * Test method for {@link gume.AutoGuma#setMarkaModel(java.lang.String)}.
	 */
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelNull() {
		a.setMarkaModel(null);
	}

	/**
	 * Test method for {@link gume.AutoGuma#setMarkaModel(java.lang.String)}.
	 */
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelPrazanString() {
		a.setMarkaModel("");
	}

	/**
	 * Test method for {@link gume.AutoGuma#setMarkaModel(java.lang.String)}.
	 */
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelKratakString() {
		a.setMarkaModel("TM");
	}

	/**
	 * Test method for {@link gume.AutoGuma#setPrecnik(int)}.
	 */
	@Test
	public void testSetPrecnik() {
		a.setPrecnik(20);

		assertEquals(20, a.getPrecnik());
	}

	/**
	 * Test method for {@link gume.AutoGuma#setPrecnik(int)}.
	 */
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetPrecnikVanOpsegaIspod() {
		a.setPrecnik(10);
	}

	/**
	 * Test method for {@link gume.AutoGuma#setPrecnik(int)}.
	 */
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetPrecnikVanOpsegaIznad() {
		a.setPrecnik(200);
	}

	/**
	 * Test method for {@link gume.AutoGuma#setSirina(int)}.
	 */
	@Test
	public void testSetSirina() {
		a.setSirina(255);

		assertEquals(255, a.getSirina());
	}

	/**
	 * Test method for {@link gume.AutoGuma#setSirina(int)}.
	 */
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetSirinaVanOpsegaIspod() {
		a.setSirina(50);
	}

	/**
	 * Test method for {@link gume.AutoGuma#setSirina(int)}.
	 */
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetSirinaVanOpsegaIznad() {
		a.setSirina(400);
	}

	/**
	 * Test method for {@link gume.AutoGuma#setVisina(int)}.
	 */
	@Test
	public void testSetVisina() {
		a.setVisina(45);

		assertEquals(45, a.getVisina());
	}

	/**
	 * Test method for {@link gume.AutoGuma#setVisina(int)}.
	 */
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetVisinaVanOpsegaIspod() {
		a.setVisina(1);
	}

	/**
	 * Test method for {@link gume.AutoGuma#setVisina(int)}.
	 */
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetVisinaVanOpsegaIznad() {
		a.setVisina(1000);
	}

	/**
	 * Test method for {@link gume.AutoGuma#toString()}.
	 */
	@Test
	public void testToString() {

		a.setMarkaModel("TigarMirage");
		a.setPrecnik(15);
		a.setSirina(155);
		a.setVisina(65);

		assertEquals("AutoGuma [markaModel=TigarMirage, precnik=15, sirina=155, visina=65]", a.toString());
	}

	/**
	 * Test method for {@link gume.AutoGuma#equals(java.lang.Object)}.
	 */
	@Test
	public void testEqualsObject() {
		AutoGuma b = new AutoGuma();
		a.setMarkaModel("TigarMirage");
		a.setPrecnik(15);
		a.setSirina(155);
		a.setVisina(65);

		b.setMarkaModel("TigarMirage");
		b.setPrecnik(15);
		b.setSirina(155);
		b.setVisina(65);

		assertTrue(a.equals(b));
	}

	/**
	 * Test method for {@link gume.AutoGuma#equals(java.lang.Object)}.
	 */
	@Test
	public void testEqualsObjectFalseMarkaModel() {
		AutoGuma b = new AutoGuma();
		a.setMarkaModel("TigarMirage");
		a.setPrecnik(15);
		a.setSirina(155);
		a.setVisina(65);

		b.setMarkaModel("TigarSigura");
		b.setPrecnik(15);
		b.setSirina(155);
		b.setVisina(65);

		assertFalse(a.equals(b));
	}

	/**
	 * Test method for {@link gume.AutoGuma#equals(java.lang.Object)}.
	 */
	@Test
	public void testEqualsObjectFalsePrecnik() {
		AutoGuma b = new AutoGuma();
		a.setMarkaModel("TigarMirage");
		a.setPrecnik(15);
		a.setSirina(155);
		a.setVisina(65);

		b.setMarkaModel("TigarMirage");
		b.setPrecnik(13);
		b.setSirina(155);
		b.setVisina(65);

		assertFalse(a.equals(b));
	}

	/**
	 * Test method for {@link gume.AutoGuma#equals(java.lang.Object)}.
	 */
	@Test
	public void testEqualsObjectFalseSirina() {
		AutoGuma b = new AutoGuma();
		a.setMarkaModel("TigarMirage");
		a.setPrecnik(15);
		a.setSirina(155);
		a.setVisina(65);

		b.setMarkaModel("TigarMirage");
		b.setPrecnik(15);
		b.setSirina(165);
		b.setVisina(65);

		assertFalse(a.equals(b));
	}

	/**
	 * Test method for {@link gume.AutoGuma#equals(java.lang.Object)}.
	 */
	@Test
	public void testEqualsObjectFalseVisina() {
		AutoGuma b = new AutoGuma();
		a.setMarkaModel("TigarMirage");
		a.setPrecnik(15);
		a.setSirina(155);
		a.setVisina(65);

		b.setMarkaModel("TigarMirage");
		b.setPrecnik(15);
		b.setSirina(155);
		b.setVisina(80);

		assertFalse(a.equals(b));
	}

}
