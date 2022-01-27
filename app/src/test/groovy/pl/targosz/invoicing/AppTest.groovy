/*
 * This Spock specification was generated by the Gradle 'init' task.
 */
package pl.targosz.invoicing

import pl.targosz.invoicing.services.InvoiceService
import spock.lang.Specification

class AppTest extends Specification {

    def app = new App()

    def "application init check"() {
        setup:
        def app = new App()

        expect:
        app.main()
    }

}
