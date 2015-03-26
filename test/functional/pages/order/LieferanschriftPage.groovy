package pages.order

import pages.ContactFormPage
import pages.MasterPage

/**
 * Created by IntelliJ IDEA.
 * User: markus
 * Date: 16.04.11
 * Time: 23:29
 * To change this template use File | Settings | File Templates.
 */
class LieferanschriftPage extends MasterPage
{
	static url = "bestellung/lieferanschrift"

	static at = {
		heading.text().startsWith("Lieferanschrift")
	}

	static content = {
		anrede { $("form").find("select", name: "liefer.anrede") }
		titel { $("form").find("input", name: "liefer.titel") }
		vorname { $("form").find("input", name: "liefer.vorname") }
		nachname { $("form").find("input", name: "liefer.nachname") }
//		email { $("form").find("input", name: "liefer.email") }
		firma { $("form").find("input", name: "liefer.firma") }
//		ustId { $("form").find("input", name: "liefer.ustId") }
		strasse { $("form").find("input", name: "liefer.strasse") }
		adresszusatz { $("form").find("input", name: "liefer.adresszusatz") }
		plz { $("form").find("input", name: "liefer.plz") }
		ort { $("form").find("input", name: "liefer.ort") }
		land { $("form").find("input", name: "liefer.land") }
		telefon { $("form").find("input", name: "liefer.telefon") }

		bestellungFortsetzenButton(to: UebersichtPage) { $("div", id: "ankerFortsetzen") }
	}
}
