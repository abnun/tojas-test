package pages.order

import de.webmpuls.tojas.MasterTestSpec
import pages.MasterPage

/**
 * Created by IntelliJ IDEA.
 * User: markus
 * Date: 16.04.11
 * Time: 23:29
 * To change this template use File | Settings | File Templates.
 */
class AbgeschlossenPage extends MasterPage
{
	static url = "bestellung/abgeschlossen"

	static at = {
		heading.text().startsWith("Bestellung abgeschlossen")
	}

	static content = {
		bestaetigung { $("p", text: startsWith("Sie werden in den nächsten Minuten eine Bestätigung des Bestelleingangs an die angegebene E-Mail Adresse '${MasterTestSpec.EMAIL}'")) }
	}
}
