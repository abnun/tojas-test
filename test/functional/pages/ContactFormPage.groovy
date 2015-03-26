package pages

/**
 * Created by IntelliJ IDEA.
 * User: markus
 * Date: 16.04.11
 * Time: 23:29
 * To change this template use File | Settings | File Templates.
 */
class ContactFormPage extends MasterPage
{
	static url = "inhalt/kontakt"

	static at = {
		heading.text() == "Kontakt"
	}

	static content = {
		anrede { $("form").find("select", name: "kontakt.anrede") }
		titel { $("form").find("input", name: "kontakt.titel") }
		vorname { $("form").find("input", name: "kontakt.vorname") }
		nachname { $("form").find("input", name: "kontakt.nachname") }
		email { $("form").find("input", name: "kontakt.email") }
		anfrage { $("form").find("textarea", name: "kontakt.anfrage") }
		submitButton { $("form").find("button", type: "submit") }
	}

	

}
