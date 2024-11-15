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

import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions



//String ks_Chromedriver = DriverFactory.getChromeDriverPath()
//println 'loan testttttttt: ' + ks_Chromedriver
//System.setProperty("webdriver.chrome.driver", ks_Chromedriver)
//
//
//System.setProperty('webdriver.chrome.driver', ks_Chromedriver)
////Declare your chrome driver
//WebDriver chromeDriver = new ChromeDriver()
//// Tell Katalon to use your Chrome driver:
//DriverFactory.changeWebDriver(chromeDriver)
//
//
//WebUI.navigateToUrl('https://google.com')
//WebUI.closeBrowser()

//============================

System.setProperty('webdriver.chrome.driver', DriverFactory.getChromeDriverPath())

ChromeOptions options = new ChromeOptions()

String tempDirPath = (System.getProperty('java.io.tmpdir') + '/ChromeDriver/') + System.currentTimeMillis()

System.out.println('Temp directory path : ' + tempDirPath)

options.addArguments("user-data-dir=$tempDirPath")

def driver = new ChromeDriver(options)

DriverFactory.changeWebDriver(driver)

WebUI.navigateToUrl('google.com')

WebUI.closeBrowser()
