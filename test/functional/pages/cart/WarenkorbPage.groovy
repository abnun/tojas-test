package pages.cart

import pages.ContactFormPage
import pages.MasterPage
import pages.order.RechnungsanschriftPage

/**
 * Created by IntelliJ IDEA.
 * User: markus
 * Date: 16.04.11
 * Time: 23:29
 * To change this template use File | Settings | File Templates.
 */
class WarenkorbPage extends MasterPage
{
	static url = "warenkorb/uebersicht"

	static at = {
		heading.text().startsWith("Warenkorb")
	}

	static content = {
		versandkostenText { $("p", text: startsWith("zzgl. Versandkosten")) }
		selbstabholer { $("form").find("input", name: "selbstabholer") }
		bestellButton(to: RechnungsanschriftPage) { $("div", id: "ankerBestellen") }
	}
}
