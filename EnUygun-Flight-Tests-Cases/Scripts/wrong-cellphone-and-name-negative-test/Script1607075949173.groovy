import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

void enterOneByOne(String value, TestObject location) {
	WebUI.click(location)

	WebUI.sendKeys(location, Keys.chord(Keys.HOME))

	for (int i = 0; i < value.length(); i++) {
		String c = value.charAt(i)

		println(c)

		WebUI.sendKeys(location, c)
	}
}

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.enuygun.com/')

WebUI.setText(findTestObject('WebUITests/HomePageFormArea/openOriginInput'), 'Istanbul'
    )

WebUI.click(findTestObject('WebUITests/HomePageFormArea/autoCompleteFirstOriginResult')
    )

WebUI.setText(findTestObject('WebUITests/HomePageFormArea/openDestinationInput'), 'Paris'
    )

WebUI.click(findTestObject('WebUITests/HomePageFormArea/autoCompleteFirstDestinationResult')
    )

WebUI.click(findTestObject('WebUITests/HomePageFormArea/openDepartureDate')
    )

WebUI.click(findTestObject('WebUITests/HomePageFormArea/selectDepartureDate')
    )

WebUI.click(findTestObject('WebUITests/HomePageFormArea/oneWayCheckbox')
    )

WebUI.click(findTestObject('WebUITests/HomePageFormArea/selectReturnDate')
    )

WebUI.click(findTestObject('WebUITests/HomePageFormArea/directFlightCheckbox')
    )

WebUI.click(findTestObject('WebUITests/HomePageFormArea/openPassengerCount')
    )

WebUI.click(findTestObject('WebUITests/HomePageFormArea/selectPassengerCount')
    )

WebUI.click(findTestObject('WebUITests/HomePageFormArea/buttonFindTicket')
    )

WebUI.click(findTestObject('WebUITests/FlightSelectionPage/selectFirstOfferForDepartureFlight')
    )

WebUI.waitForElementPresent(findTestObject('WebUITests/FlightSelectionPage/selectFirstOfferForReturnFlight'), 3
    )

WebUI.click(findTestObject('WebUITests/FlightSelectionPage/selectFirstOfferForReturnFlight')
    )

WebUI.click(findTestObject('WebUITests/ReservationPage/ContactInfoArea/emailInput')
    )

WebUI.setText(findTestObject('WebUITests/ReservationPage/ContactInfoArea/emailInput'), GlobalVariable.Email
    )

TestObject phone = findTestObject('WebUITests/ReservationPage/ContactInfoArea/phoneNumberInput')

enterOneByOne('8976400', phone)

WebUI.click(findTestObject('WebUITests/ReservationPage/goToPaymentButton')
)

WebUI.verifyTextPresent('Please type a valid phone input', false)
WebUI.delay(3)

WebUI.setText(findTestObject('WebUITests/ReservationPage/ContactInfoArea/phoneNumberInput'),'348976400')

WebUI.click(findTestObject('WebUITests/ReservationPage/goToPaymentButton')
)


WebUI.verifyTextPresent('Please type your name and surname info as it is written in your ID or passaport in Turkish or English characters.', false)

WebUI.closeBrowser()
