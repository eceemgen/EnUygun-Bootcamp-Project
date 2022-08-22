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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.enuygun.com/')

WebUI.click(findTestObject('WebUITests/HomePageFormArea/openDepartureDate')
    )

WebUI.click(findTestObject('WebUITests/HomePageFormArea/selectDepartureDate')
    )

WebUI.click(findTestObject('WebUITests/HomePageFormArea/oneWayCheckbox')

WebUI.click(findTestObject('WebUITests/HomePageFormArea/selectReturnDate')
    )

WebUI.click(findTestObject('WebUITests/HomePageFormArea/buttonFindTicket')
    )

WebUI.verifyElementPresent(findTestObject('WebUITests/NegativeCaseObjects/pleaseWriteFromPlace'),1)
WebUI.verifyElementPresent(findTestObject('WebUITests/NegativeCaseObjects/pleaseWriteToPlace'),1)


WebUI.delay(3)
WebUI.closeBrowser()
