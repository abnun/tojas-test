import geb.spock.GebSpec
import pages.ServicePage
import spock.lang.Stepwise

/**
 * Created by IntelliJ IDEA.
 * User: markus
 * Date: 16.04.11
 * Time: 23:26
 * To change this template use File | Settings | File Templates.
 */
@Stepwise
class ServiceTestSpec extends GebSpec
{
	def "Service"()
	{
		when:
		to ServicePage

		then:
		at ServicePage
	}
}
