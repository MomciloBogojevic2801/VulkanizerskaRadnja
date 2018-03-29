
package gume;

/**
 * Klasa koja predstavlja auto gumu.
 * 
 * @author Momcilo Bogojevic
 * @version 1.0
 *
 */

public class AutoGuma {

	/**
	 * Predstavlja marku i model gume.
	 */
	private String markaModel = null;

	/**
	 * Predstavlja precnik gume.
	 */
	private int precnik = 0;

	/**
	 * Predstavlja sirinu gume.
	 */
	private int sirina = 0;

	/**
	 * Predstavlja visinu gume.
	 */
	private int visina = 0;

	/**
	 * Vraca vrednost atributa markaModel.
	 * 
	 * @return marku i model gume kao string.
	 */
	public String getMarkaModel() {
		return markaModel;
	}

	/**
	 * Postavlja novu vrednost za marku i model.
	 * 
	 * @param markaModel
	 *            nova vrednost za marku i model.
	 * 
	 * @throws java.lang.RuntimeException
	 *             ako je za parametar prezime unet:
	 *             <ul>
	 * 
	 *             <li>null String</li>
	 * 
	 *             <li>prazan String</li>
	 * 
	 *             </ul>
	 */
	public void setMarkaModel(String markaModel) {
		if (markaModel == null || markaModel.length() < 3)
			throw new RuntimeException("Morate uneti marku i model");
		this.markaModel = markaModel;
	}

	/**
	 * Vraca vrednost atributa precnik.
	 * 
	 * @return precnik gume kao integer.
	 */
	public int getPrecnik() {
		return precnik;
	}

	/**
	 * Postavlja novu vrednost za precnik gume.
	 * 
	 * @param precnik
	 *            nova vrednost za precnik.
	 * 
	 * @throws java.lang.RuntimeException
	 *             ako je za parametar precnik unet broj koji je van dozvoljenog
	 *             opsega.
	 */
	public void setPrecnik(int precnik) {
		if (precnik < 13 && precnik > 22)
			throw new RuntimeException("Precnik van opsega");
		this.precnik = precnik;
	}

	/**
	 * Vraca vrednost atributa sirina.
	 * 
	 * @return sirinu gume kao integer
	 */
	public int getSirina() {
		return sirina;
	}

	/**
	 * Postavlja novu vrednost za sirinu gume.
	 * 
	 * @param sirina
	 *            nova vrednost za sirinu.
	 * 
	 * @throws java.lang.RuntimeException
	 *             ako je za parametar sirina unet broj koji je van dozvoljenog
	 *             opsega.
	 */
	public void setSirina(int sirina) {
		if (sirina < 135 && sirina > 355)
			throw new RuntimeException("Sirina van opsega");
		this.sirina = sirina;
	}

	/**
	 * Vraca vrednost atributa visina.
	 * 
	 * @return visinu gume kao integer.
	 */
	public int getVisina() {
		return visina;
	}

	/**
	 * Postavlja novu vrednost za visinu gume.
	 * 
	 * @param visina
	 *            nova vrednost za visinu.
	 * 
	 * @throws java.lang.RuntimeException
	 *             ako je za parametar visina unet broj koji je van dozvoljenog
	 *             opsega.
	 * 
	 */

	public void setVisina(int visina) {
		if (visina < 25 || visina > 95)
			throw new RuntimeException("Visina van opsega");
		this.visina = visina;
	}

	/**
	 * Vraca String sa svim podacima o gumi.
	 * 
	 * @return String koji sadrzi podatke o gumi.
	 */
	@Override
	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik + ", sirina=" + sirina + ", visina="
				+ visina + "]";
	}

	/**
	 * Proverava da li su dve gume iste, poredi ih prema:
	 * <ol>
	 * <li>Marki i modelu</li>
	 * <li>Precniku</li>
	 * <li>Sirini</li>
	 * <li>Visini</li>
	 * </ol>
	 * 
	 * @return true ako su marka, model, precnik, sirina i visina obe gume jednaki.
	 *         False u svim ostalim situacijama.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AutoGuma other = (AutoGuma) obj;
		if (markaModel == null) {
			if (other.markaModel != null)
				return false;
		} else if (!markaModel.equals(other.markaModel))
			return false;
		if (precnik != other.precnik)
			return false;
		if (sirina != other.sirina)
			return false;
		if (visina != other.visina)
			return false;
		return true;
	}
}
