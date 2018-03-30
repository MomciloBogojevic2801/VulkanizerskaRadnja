package gume.radnja;

/**
 * Klasa koja predstavlja vulkanizersku radnju.
 * 
 * @author Momcilo Bogojevic
 * @version 1.0
 *
 */

import java.util.LinkedList;
import gume.AutoGuma;

public class VulkanizerskaRadnja {

	/**
	 * Predstavlja novu listu objekata AutoGuma, pod nazivom "gume"
	 */
	private LinkedList<AutoGuma> gume = new LinkedList<AutoGuma>();

	/**
	 * Dodaje novu gumu u listu gume, na pocetak.
	 * 
	 * @param a
	 *            predstavlja objekat klase AutoGuma
	 * 
	 * @throws java.lang.NullPointerException
	 *             ako je za parametar a unet null.
	 * 
	 * @throws java.lang.RuntimeException
	 *             ako je za parametar a unet objekat koji vec postoji u listi.
	 */
	public void dodajGumu(AutoGuma a) {
		if (a == null)
			throw new NullPointerException("Guma ne sme biti null");
		if (gume.contains(a))
			throw new RuntimeException("Guma vec postoji");
		gume.addFirst(a);
	}

	/**
	 * Pronalazi sve gume iz liste gume, koje imaju istu marku i model kao uneti
	 * parametar.
	 * 
	 * @param markaModel
	 *            vrednost za atribut markaModel
	 * @return Listu objekata tipa guma kao LinkedList
	 * 
	 */
	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
		if (markaModel == null)
			return null;
		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
		for (int i = 0; i < gume.size(); i++)
			// if (gume.get(i).equals(markaModel))
			if (gume.get(i).getMarkaModel().equals(markaModel))
				novaLista.add(gume.get(i));
		return novaLista;
	}
}
