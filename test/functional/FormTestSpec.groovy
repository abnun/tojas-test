import de.webmpuls.tojas.MasterTestSpec
import pages.ContactFormPage
import pages.IndexPage
import spock.lang.Stepwise

/**
 * Created by IntelliJ IDEA.
 * User: markus
 * Date: 16.04.11
 * Time: 23:26
 * To change this template use File | Settings | File Templates.
 */
@Stepwise
class FormTestSpec extends MasterTestSpec
{
	def "Startseite"()
	{
		when:
		to IndexPage

		then:
		at IndexPage

		expect:
		kontaktButton
	}

	def "leeres Formular"()
	{
		when:
		kontaktButton.click()

		then:
		at ContactFormPage
	}

	def "Formularinhalte ausfuellen"()
	{
		when:
		anrede.value("Herr")
		titel.value("Diplom-Wirtschaftsinformatiker")
		vorname.value("Markus")
		nachname.value("Müller")
		email.value(EMAIL)
		anfrage.value("Testanfrage äöüß")
		submitButton.click()
		then:
		at (ContactFormPage)
		$("p.success").text() == "Vielen Dank für Ihre Anfrage!"
	}
}
