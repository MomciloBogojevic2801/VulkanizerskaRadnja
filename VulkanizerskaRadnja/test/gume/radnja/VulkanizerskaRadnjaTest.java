/**
 * 
 */
package gume.radnja;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import gume.AutoGuma;

/**
 * @author momcilobogojevic2801
 *
 */
public class VulkanizerskaRadnjaTest {

	VulkanizerskaRadnja radnja;
	AutoGuma a;
	LinkedList<AutoGuma> gume;

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

		radnja = new VulkanizerskaRadnja();
		gume = new LinkedList<>();
		a = new AutoGuma();
		a.setMarkaModel("TigarMirage");
		a.setPrecnik(15);
		a.setSirina(155);
		a.setVisina(65);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		radnja = null;
		a = null;
		gume = null;
	}

	/**
	 * Test method for
	 * {@link gume.radnja.VulkanizerskaRadnja#dodajGumu(gume.AutoGuma)}.
	 */
	@Test
	public void testDodajGumu() {
		radnja.dodajGumu(a);
		LinkedList<AutoGuma> lista = new LinkedList<>();
		lista = radnja.pronadjiGumu(a.getMarkaModel());
		assertTrue(lista.contains(a));
	}

	/**
	 * Test method for
	 * {@link gume.radnja.VulkanizerskaRadnja#dodajGumu(gume.AutoGuma)}.
	 */
	@Test(expected = java.lang.NullPointerException.class)
	public void testDodajGumuNull() {
		radnja.dodajGumu(null);
	}

	/**
	 * Test method for
	 * {@link gume.radnja.VulkanizerskaRadnja#dodajGumu(gume.AutoGuma)}.
	 */
	@Test(expected = java.lang.RuntimeException.class)
	public void testDodajGumuVecPostoji() {
		radnja.dodajGumu(a);
		radnja.dodajGumu(a);
	}

	/**
	 * Test method for
	 * {@link gume.radnja.VulkanizerskaRadnja#pronadjiGumu(java.lang.String)}.
	 */
	@Test
	public void testPronadjiGumu() {
		radnja.dodajGumu(a);
		LinkedList<AutoGuma> lista;
		lista = radnja.pronadjiGumu("TigarMirage");

		assertTrue(lista.contains(a));

	}

	/**
	 * Test method for
	 * {@link gume.radnja.VulkanizerskaRadnja#pronadjiGumu(java.lang.String)}.
	 */
	@Test
	public void testPronadjiGumuNull() {
		
		assertEquals(null, radnja.pronadjiGumu(null));
		
	}

	/**
	 * Test method for
	 * {@link gume.radnja.VulkanizerskaRadnja#pronadjiGumu(java.lang.String)}.
	 */
	@Test
	public void testPronadjiGumuNemaTakveUListi() {
		
		assertEquals(0, radnja.pronadjiGumu("TigarVintera").size());

	}

	/**
	 * Test method for
	 * {@link gume.radnja.VulkanizerskaRadnja#pronadjiGumu(java.lang.String)}.
	 */
	@Test
	public void testPronadjiGumuRazliciteDimenzije() {
		AutoGuma b = new AutoGuma();
		b.setMarkaModel("TigarMirage");
		b.setPrecnik(13);
		b.setSirina(155);
		b.setVisina(65);
		
		AutoGuma c = new AutoGuma();
		c.setMarkaModel("TigarMirage");
		c.setPrecnik(14);
		c.setSirina(155);
		c.setVisina(65);
		
		AutoGuma d = new AutoGuma();
		d.setMarkaModel("TigarMirage");
		d.setPrecnik(16);
		d.setSirina(155);
		d.setVisina(65);
		
		radnja.dodajGumu(a);
		radnja.dodajGumu(b);
		radnja.dodajGumu(c);
		radnja.dodajGumu(d);
		
		LinkedList<AutoGuma> lista = new LinkedList<>();
		lista = radnja.pronadjiGumu("TigarMirage");
		assertEquals(4, lista.size());
	}
}
