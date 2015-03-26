package pages

/**
 * Created by IntelliJ IDEA.
 * User: markus
 * Date: 16.04.11
 * Time: 23:29
 * To change this template use File | Settings | File Templates.
 */
class IndexPage extends MasterPage
{
	static url = "inhalt/startseite"

	static at = {
		heading.text().startsWith("Herzlich willkommen bei")
	}

	static content = {
		kontaktButton(to: ContactFormPage) { $("a", text: "Kontakt") }
	}
}
