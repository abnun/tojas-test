package pages.assortment

import pages.MasterPage

/**
 * Created by IntelliJ IDEA.
 * User: markus
 * Date: 16.04.11
 * Time: 23:29
 * To change this template use File | Settings | File Templates.
 */
class SortimentPage extends MasterPage
{
	static url = "sortiment/uebersicht"

	static at = {
		heading.text() == "Sortiment"
	}
}
