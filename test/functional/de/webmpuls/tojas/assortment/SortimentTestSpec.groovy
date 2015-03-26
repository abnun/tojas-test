package de.webmpuls.tojas.assortment

import geb.spock.GebSpec
import pages.assortment.FeigenbaumPage
import pages.assortment.GranatapfelbaumPage
import pages.assortment.OlivenbaumPage
import pages.assortment.OrangenbaumPage
import pages.assortment.SortimentPage
import pages.assortment.ZitronenbaumPage
import spock.lang.Stepwise

/**
 * Created by IntelliJ IDEA.
 * User: markus
 * Date: 16.04.11
 * Time: 23:26
 * To change this template use File | Settings | File Templates.
 */
@Stepwise
class SortimentTestSpec extends GebSpec
{
	def "Sortiment"()
	{
		when:
		to SortimentPage

		then:
		at SortimentPage
	}

	def "Alle Baum-Seiten"()
	{
		when:
		to OlivenbaumPage

		then:
		at OlivenbaumPage

		when:
		to OrangenbaumPage

		then:
		at OrangenbaumPage

		when:
		to ZitronenbaumPage

		then:
		at ZitronenbaumPage

		when:
		to GranatapfelbaumPage

		then:
		at GranatapfelbaumPage

		when:
		to FeigenbaumPage

		then:
		at FeigenbaumPage
	}
}
