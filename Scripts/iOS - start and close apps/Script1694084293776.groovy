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

//Mobile.startApplication('/Users/loan.tran/Downloads/test/Data/Coffee Timer - iPad10 - 16.2.app', true)
//
//Mobile.tap(findTestObject('Object Repository/iOS - coffee timer/XCUIElementTypeStaticText - Colombian'), 0)
//
//Mobile.closeApplication()

'start ipa apps and close it'

//Mobile.startApplication('/Users/loan.tran/Downloads/test/Data/SociosIntegration.ipa', true) //run this script with TestCLoud -> the apps will be taken from the one selected on Schedule Test Run dialog

//Mobile.startApplication('', true) //run this script with TestCLoud -> the apps will be taken from the one selected on Schedule Test Run dialog

String appsPath = System.getProperty('user.dir') + File.separator + 'Data' + File.separator + 'SociosIntegration.ipa' //run this script with TestCLoud -> the apps will be taken from the one selected on Schedule Test Run dialog

Mobile.startApplication(appsPath, true)

Mobile.closeApplication()

