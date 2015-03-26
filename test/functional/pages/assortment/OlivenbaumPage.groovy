package pages.assortment

import org.apache.commons.lang.math.RandomUtils
import pages.ContactFormPage
import pages.MasterPage
import pages.cart.WarenkorbPage

/**
 * Created by IntelliJ IDEA.
 * User: markus
 * Date: 16.04.11
 * Time: 23:29
 * To change this template use File | Settings | File Templates.
 */
class OlivenbaumPage extends MasterPage
{
	static url = "sortiment/olivenbaum/preise"

	static at = {
		heading.text().startsWith("Olivenbäume")
	}

	static content = {
		Integer randomTree = RandomUtils.nextInt(5)
		println randomTree
		bestellButton(to: WarenkorbPage) { $("a", randomTree, class: 'orderButton') }
	}
}
