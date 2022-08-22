import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys


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

WebUI.setText(findTestObject('WebUITests/ReservationPage/ContactInfoArea/emailInput')
    )

TestObject phone = findTestObject('WebUITests/ReservationPage/ContactInfoArea/phoneNumberInput')

enterOneByOne('348976400', phone)

WebUI.setText(findTestObject('WebUITests/ReservationPage/PassengerInfoArea/1stPassenger/1stPassengerNameInput'), 'melis')

WebUI.setText(findTestObject('WebUITests/ReservationPage/PassengerInfoArea/1stPassenger/1stPassengerSurnameInput'), 'deniz')

WebUI.click(findTestObject('WebUITests/ReservationPage/PassengerInfoArea/1stPassenger/open1stPassengerBirthDay')
    )

WebUI.click(findTestObject('WebUITests/ReservationPage/PassengerInfoArea/1stPassenger/select1stPassengerBirthDay10')
    )

WebUI.click(findTestObject('WebUITests/ReservationPage/PassengerInfoArea/1stPassenger/open1stPassengerBirthMonth')
    )

WebUI.click(findTestObject('WebUITests/ReservationPage/PassengerInfoArea/1stPassenger/select1stPassengerBirthMonth10')
    )

WebUI.click(findTestObject('WebUITests/ReservationPage/PassengerInfoArea/1stPassenger/open1stPassengerBirthYear')
    )

WebUI.click(findTestObject('WebUITests/ReservationPage/PassengerInfoArea/1stPassenger/select1stPassengerBirthYear1998')
    )

TestObject ID = findTestObject('WebUITests/ReservationPage/PassengerInfoArea/1stPassenger/1stPassengerIDInput')

enterOneByOne('none', ID)

WebUI.click(findTestObject('WebUITests/ReservationPage/goToPaymentButton')
)

WebUI.verifyTextPresent('Please enter ID of passenger ', false)
 

WebUI.delay(3)
WebUI.closeBrowser()

