package pages

/**
 * Created by IntelliJ IDEA.
 * User: markus
 * Date: 16.04.11
 * Time: 23:29
 * To change this template use File | Settings | File Templates.
 */
class ServicePage extends MasterPage
{
	static url = "service/rundumservice"

	static at = {
		heading.text().startsWith("Rundumservice")
	}
}
