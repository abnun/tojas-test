package pages.assortment

import org.apache.commons.lang.math.RandomUtils
import pages.MasterPage
import pages.cart.WarenkorbPage

/**
 * Created by IntelliJ IDEA.
 * User: markus
 * Date: 16.04.11
 * Time: 23:29
 * To change this template use File | Settings | File Templates.
 */
class GranatapfelbaumPage extends MasterPage
{
	static url = "sortiment/granatapfelbaum/preise"

	static at = {
		heading.text().startsWith("Granatapfelbäume")
	}

	static content = {
		Integer randomTree = RandomUtils.nextInt(3)
		println randomTree
		bestellButton(to: WarenkorbPage) { $("a", randomTree, class: 'orderButton') }
	}
}
