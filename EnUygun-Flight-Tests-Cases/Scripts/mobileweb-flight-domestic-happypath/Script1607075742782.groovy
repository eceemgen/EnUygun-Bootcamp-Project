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
import com.kms.katalon.core.configuration.RunConfiguration

void enterOneByOne(String value, TestObject location) {
WebUI.click(location)

WebUI.sendKeys(location, Keys.chord(Keys.HOME))

for (int i = 0; i < value.length(); i++) {
String c = value.charAt(i)

println(c)

WebUI.sendKeys(location, c)
}
}

Map<String, String> mobileEmulation=new HashMap<>();
mobileEmulation.put("deviceName","Iphone 11");
RunConfiguration.setWebDriverPreferencesProperty("mobileEmulation",mobileEmulation);


WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.enuygun.com/')

WebUI.click(findTestObject('WebMobileTests/HomePageFormArea/selectRoundTrip')
)
WebUI.click(findTestObject('WebMobileTests/HomePageFormArea/openOriginInput')
)

WebUI.setText(findTestObject('WebMobileTests/HomePageFormArea/openOriginInput'), 'Istanbul'
	)

WebUI.click(findTestObject('WebMobileTests/HomePageFormArea/autoCompleteFirstOriginResult')
	)
WebUI.click(findTestObject('WebMobileTests/HomePageFormArea/openDestinationInput')
)
WebUI.setText(findTestObject('WebMobileTests/HomePageFormArea/openDestinationInput'), 'Paris'
	)

WebUI.click(findTestObject('WebMobileTests/HomePageFormArea/autoCompleteFirstDestinationResult')
	)

WebUI.click(findTestObject('WebMobileTests/HomePageFormArea/openDepartureDate')
	)

WebUI.click(findTestObject('WebMobileTests/HomePageFormArea/selectDepartureDate')
	)

WebUI.click(findTestObject('WebMobileTests/HomePageFormArea/openReturnDate')
)

WebUI.click(findTestObject('WebMobileTests/HomePageFormArea/selectReturnDate')
	)


WebUI.click(findTestObject('WebMobileTests/HomePageFormArea/openPassengerCount')
	)

WebUI.click(findTestObject('WebMobileTests/HomePageFormArea/selectPassengerCount')
	)

WebUI.click(findTestObject('WebMobileTests/HomePageFormArea/okeyButtonInPassengerCount')
)

WebUI.click(findTestObject('WebMobileTests/HomePageFormArea/directFlightCheckbox')
)


WebUI.click(findTestObject('WebMobileTests/HomePageFormArea/buttonFindTicket')
	)

WebUI.click(findTestObject('WebMobileTests/FlightSelectionPage/selectFirstOfferForDepartureFlight')
	)

WebUI.waitForElementPresent(findTestObject('WebMobileTests/FlightSelectionPage/selectFirstOfferForReturnFlight'), 3
	)

WebUI.click(findTestObject('WebMobileTests/FlightSelectionPage/selectFirstOfferForReturnFlight')
	)
WebUI.scrollToElement(findTestObject('WebMobileTests/ReservationPage/ContactInfoArea/emailInput'), 3)


WebUI.setText(findTestObject('WebMobileTests/ReservationPage/ContactInfoArea/emailInput'), GlobalVariable.Email
	)

TestObject phone = findTestObject('WebMobileTests/ReservationPage/ContactInfoArea/phoneNumberInput')

enterOneByOne('555123400',phone)

WebUI.setText(findTestObject('WebMobileTests/ReservationPage/PassengerInfoArea/1stPassenger/1stPassengerNameInput'), 'melis')

WebUI.setText(findTestObject('WebMobileTests/ReservationPage/PassengerInfoArea/1stPassenger/1stPassengerSurnameInput'), 'deniz')

WebUI.click(findTestObject('WebMobileTests/ReservationPage/PassengerInfoArea/1stPassenger/open1stPassengerBirthDay')
	)

WebUI.click(findTestObject('WebMobileTests/ReservationPage/PassengerInfoArea/1stPassenger/select1stPassengerBirthDay10')
	)

WebUI.click(findTestObject('WebMobileTests/ReservationPage/PassengerInfoArea/1stPassenger/open1stPassengerBirthMonth')
	)

WebUI.click(findTestObject('WebMobileTests/ReservationPage/PassengerInfoArea/1stPassenger/select1stPassengerBirthMonth10')
	)

WebUI.click(findTestObject('WebMobileTests/ReservationPage/PassengerInfoArea/1stPassenger/open1stPassengerBirthYear')
	)

WebUI.click(findTestObject('WebMobileTests/ReservationPage/PassengerInfoArea/1stPassenger/select1stPassengerBirthYear1998')
	)

WebUI.setText(findTestObject('WebMobileTests/ReservationPage/PassengerInfoArea/1stPassenger/1stPassengerIDInput'), '48430376364')

WebUI.click(findTestObject('WebMobileTests/ReservationPage/PassengerInfoArea/1stPassenger/select1stPassengerGenderWoman')
	)

WebUI.click(findTestObject('WebMobileTests/ReservationPage/selectAssurance')
	)

WebUI.click(findTestObject('WebMobileTests/ReservationPage/InvoiceInfoArea/openInvoiceInfo')

WebUI.click(findTestObject('WebMobileTests/ReservationPage/InvoiceInfoArea/selectInvoiceCountry')
	)

WebUI.click(findTestObject('WebMobileTests/ReservationPage/InvoiceInfoArea/selectInvoiceCity')
	)

WebUI.click(findTestObject('WebMobileTests/ReservationPage/InvoiceInfoArea/selectInvoiceTown')
	)

WebUI.setText(findTestObject('WebMobileTests/ReservationPage/InvoiceInfoArea/invoiceAddressInput'), 'Bebek Mahallesi'
	)

WebUI.click(findTestObject('WebMobileTests/ReservationPage/goToPaymentButton')
	)

WebUI.delay(10)
WebUI.closeBrowser()
