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
import com.kms.katalon.core.util.KeywordUtil


WebUI.openBrowser('https://google.com')

WebUI.click(findTestObject('Object Repository/demo page/Page_CURA Healthcare Service/a_Make Appointment'))


//WebUI.maximizeWindow()
//
////WebUI.navigateToUrl('https://webapp-attack-2.azurewebsites.net/')
//
//WebUI.click(findTestObject('Object Repository/Page_Welcome/a_Sign In'))
//
//WebUI.click(findTestObject('Object Repository/Page_login page/a_Register here'))
//
//WebUI.setText(findTestObject('Object Repository/Page_Sign up/input_Login here_email'), 'test@test.com')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign up/input_Login here_password'), 'tzH6RvlfSTg=')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign up/input_Login here_cpassword'), 'tzH6RvlfSTg=')
//
//WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Sign up/input'), 5)
//
//WebUI.click(findTestObject('Object Repository/Page_Sign up/input'))
//
////WebUI.click(findTestObject('Object Repository/successfully'))
//
////WebUI.setText(findTestObject('Object Repository/Page_login page/input_UserID_email'), 'test@test.com')
////
////WebUI.setEncryptedText(findTestObject('Object Repository/Page_login page/input_Password_password'), 'tzH6RvlfSTg=')
////
////WebUI.click(findTestObject('Object Repository/Page_login page/input'))

WebUI.closeBrowser()

