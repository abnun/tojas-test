package de.webmpuls.tojas.assortment

import de.webmpuls.tojas.MasterTestSpec
import pages.assortment.OrangenbaumPage
import pages.cart.WarenkorbPage
import pages.order.AbgeschlossenPage
import pages.order.LieferanschriftPage
import pages.order.RechnungsanschriftPage
import pages.order.UebersichtPage
import spock.lang.Stepwise

/**
 * Created by IntelliJ IDEA.
 * User: markus
 * Date: 16.04.11
 * Time: 23:26
 * To change this template use File | Settings | File Templates.
 */
@Stepwise
class OrangenbaumBestellTestSpec extends MasterTestSpec
{
	def "Orangenbaumseite aufrufen"()
	{
		when:
		to OrangenbaumPage

		then:
		at OrangenbaumPage

		expect:
		bestellButton
	}

	def "Baum in den Warenkorb legen"()
	{
		when:
		bestellButton.click()

		then:
		at WarenkorbPage

		expect:
		bestellButton
	}

	def "Bestellprozess starten"()
	{
		when:
		bestellButton.click()

		then:
		at RechnungsanschriftPage
	}

	def "Rechnungsanschrift ausfuellen und weiter"()
	{
		when:
		anrede.value("Herr")
		vorname.value("Markus")
		nachname.value("Müller")
		email.value(EMAIL)
		strasse.value("Iltisweg 6")
		adresszusatz.value("1. Stock")
		plz.value("74078")
		ort.value("Heilbronn")
		land.value("Deutschland")
		telefon.value("07066/917333")

		lieferanschriftWeichtAb.value(true)

		bestellungFortsetzenButton.click()

		then:
		at LieferanschriftPage
	}

	def "Lieferanschrift ausfuellen und weiter"()
	{
		when:
		anrede.value("Frau")
		vorname.value("Claudia")
		nachname.value("Schott")
		strasse.value("Iltisweg 6")
		adresszusatz.value("")
		plz.value("74078")
		ort.value("Heilbronn")
		land.value("Deutschland")
		telefon.value("07066/917333")

		bestellungFortsetzenButton.click()

		then:
		at UebersichtPage
	}

	def "Uebersichtseite anzeigen und Bestellung abschliessen"()
	{
		when:
		mitteilung.value("TEST TEST TEST")
		agbGelesen.value(true)

		bestellungAbschliessenButton.click()

		then:
		at AbgeschlossenPage

		expect:
		bestaetigung
	}
}
