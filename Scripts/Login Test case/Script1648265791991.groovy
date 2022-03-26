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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://alpha.skillbuilder.io/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/login/Page_Landing page/button_My Account'))

WebUI.click(findTestObject('Object Repository/login/Page_Login/span_Sign in with Google'))

WebUI.delay(2)

WebUI.switchToWindowIndex('1')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/login/Page_Sign in  Google accounts/input_skillbuilder.io_identifier'), 
    'nilesh.dhale@kilowott.com')

WebUI.click(findTestObject('Object Repository/login/Page_Sign in  Google accounts/div_Terms of Service_VfPpkd-RLmnJb'))

WebUI.delay(2)

WebUI.setEncryptedText(findTestObject('Object Repository/login/Page_Sign in  Google accounts/input_Too many failed attempts_password'), 
    'zRFj6Tp9B9qt1LVj8dz10g==')

WebUI.click(findTestObject('Object Repository/login/Page_Sign in  Google accounts/input_Too many failed attempts_c3'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/login/Page_Sign in  Google accounts/span_Next'))

