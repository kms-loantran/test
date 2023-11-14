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
import com.kms.katalon.core.configuration.RunConfiguration
import org.openqa.selenium.WebDriver
import org.openqa.selenium.remote.LocalFileDetector
import org.openqa.selenium.support.events.EventFiringWebDriver

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.selenium.driver.CRemoteWebDriver

'run pass if running with TestCloud Linux Chrome 118'
'run failed if running with TestCloud Windows Chrome 118'

//WebUI.openBrowser('')
//
//WebUI.navigateToUrl('https://store.katalon.com/signin?returnUrl=/manage/publisher/upload-product')
//
//WebUI.setText(findTestObject('Choose File/Page_Store/input_Welcome back_email'), GlobalVariable.username)
//
//WebUI.setEncryptedText(findTestObject('Choose File/Page_Store/input_Welcome back_password'), GlobalVariable.pass)
//
//WebUI.click(findTestObject('Choose File/Page_Store/button_Sign in'))
//
//WebUI.delay(1)
//
//String filePath = System.getProperty("user.dir") + File.separator + 'Data' + File.separator + "ExcelKeywords.jar.zip"
//
//println 'vicky test filePathhhhhhhhhhhhhhh: ' + filePath
//
//WebUI.uploadFile(findTestObject('Object Repository/Choose File/Page_Store/txtChooseFile'), filePath)

'upload file to lambdatest'

WebUI.openBrowser('')

EventFiringWebDriver driver = DriverFactory.getWebDriver()
WebDriver wrappedDriver = driver.getWrappedDriver()
System.out.println(wrappedDriver.getClass())
if (wrappedDriver.class == CRemoteWebDriver) {
	wrappedDriver.setFileDetector(new LocalFileDetector())
}

WebUI.navigateToUrl('https://store.katalon.com/signin?returnUrl=/manage/publisher/upload-product')

WebUI.setText(findTestObject('Choose File/Page_Store/input_Welcome back_email'), GlobalVariable.username)

WebUI.setEncryptedText(findTestObject('Choose File/Page_Store/input_Welcome back_password'), GlobalVariable.pass)

WebUI.click(findTestObject('Choose File/Page_Store/button_Sign in'))

WebUI.delay(1)

String filePath = System.getProperty("user.dir") + File.separator + 'Data' + File.separator + "ExcelKeywords.jar.zip"

println 'vicky test filePathhhhhhhhhhhhhhh: ' + filePath

WebUI.uploadFile(findTestObject('Object Repository/Choose File/Page_Store/txtChooseFile'), filePath)