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

WebUI.setText(findTestObject('Object Repository/Login new test case/Page_Landing page/input_concat(Your Organization, , s Name)_d_469d2a'), 
    'tata')

WebUI.click(findTestObject('Object Repository/Login new test case/Page_Landing page/button_Lets GO'))

WebUI.setText(findTestObject('Object Repository/Login new test case/Page_Question/textarea_1'), '1')

WebUI.click(findTestObject('Object Repository/Login new test case/Page_Question/span_Sign in with Google'))

WebUI.delay(4)

WebUI.switchToWindowTitle('Sign in – Google accounts')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Login new test case/Page_Sign in  Google accounts/input_skillbuilder.io_identifier'), 
    'nilesh.dhale@kilowott.com')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Login new test case/Page_Sign in  Google accounts/span_Next'))

WebUI.delay(2)

WebUI.setEncryptedText(findTestObject('Object Repository/Login new test case/Page_Sign in  Google accounts/input_Too many failed attempts_password'), 
    'zRFj6Tp9B9qt1LVj8dz10g==')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Login new test case/Page_Sign in  Google accounts/input_Too many failed attempts_c3'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Login new test case/Page_Sign in  Google accounts/div_Terms of Service_VfPpkd-RLmnJb'))

WebUI.delay(5)

