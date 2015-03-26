package pages.order

import pages.MasterPage

/**
 * Created by IntelliJ IDEA.
 * User: markus
 * Date: 16.04.11
 * Time: 23:29
 * To change this template use File | Settings | File Templates.
 */
class UebersichtPage extends MasterPage
{
	static url = "bestellung/uebersicht"

	static at = {
		heading.text().startsWith("Bestellübersicht")
	}

	static content = {
		mitteilung { $("form").find("textarea", name: "bestellung.mitteilung") }
		agbGelesen { $("form").find("input", name: "bestellung.agbGelesen") }

		bestellungAbschliessenButton(to: AbgeschlossenPage) { $("div", id: "ankerAbschliessen") }
	}
}
