package pages.order

import pages.MasterPage

/**
 * Created by IntelliJ IDEA.
 * User: markus
 * Date: 16.04.11
 * Time: 23:29
 * To change this template use File | Settings | File Templates.
 */
class ZahlungsartPage extends MasterPage
{
	static url = "bestellung/rechnungsanschrift"

	static at = {
		heading.text().startsWith("Lieferanschrift")
	}

	static content = {
		anrede { $("form").find("select", name: "rechnung.anrede") }
		titel { $("form").find("input", name: "rechnung.titel") }
		vorname { $("form").find("input", name: "rechnung.vorname") }
		nachname { $("form").find("input", name: "rechnung.nachname") }
//		email { $("form").find("input", name: "rechnung.email") }
		firma { $("form").find("input", name: "rechnung.firma") }
//		ustId { $("form").find("input", name: "rechnung.ustId") }
		strasse { $("form").find("input", name: "rechnung.strasse") }
		adresszusatz { $("form").find("input", name: "rechnung.adresszusatz") }
		plz { $("form").find("input", name: "rechnung.plz") }
		ort { $("form").find("input", name: "rechnung.ort") }
		land { $("form").find("input", name: "rechnung.land") }
		telefon { $("form").find("input", name: "rechnung.telefon") }

		bestellungFortsetzenButton(to: ZahlungsartPage) { $("div", id: "ankerFortsetzen") }
	}
}
