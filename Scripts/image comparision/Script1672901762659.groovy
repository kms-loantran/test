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

//import my.AShotWrapper
//import my.DevicePixelRatioResolver
import ru.yandex.qatools.ashot.Screenshot
import ru.yandex.qatools.ashot.comparison.ImageDiff
import ru.yandex.qatools.ashot.comparison.ImageDiffer

// resolve file name under the target directory
File resolveScreenshotFile(String fileName) {
	Path projectDir = Paths.get(RunConfiguration.getProjectDir())
	Path reportDir = projectDir.resolve('Screenshots')
	Files.createDirectories(reportDir)
	Path pngFile = reportDir.resolve(fileName)
	return pngFile.toFile()
}

// get diff%
Double diffRatioPercent(ImageDiff diff) {
	boolean hasDiff = diff.hasDiff()
	if (!hasDiff) {
		return 0.0
	}
	int diffSize = diff.getDiffSize()
	int area = diff.getMarkedImage().getWidth() * diff.getMarkedImage().getHeight()
	Double diffRatio = diff.getDiffSize() / area * 100
	return diffRatio
}

// ---------------------------------------------------------------------------------

ImageDiffer imgDiff = new ImageDiffer();

ImageDiff diff = imgDiff.makeDiff(expectedImage4, expectedImage3);

WebUI.openBrowser('')

WebUI.navigateToUrl('https://bankmandiri.co.id/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Mandiri/Page_Bank Mandiri - Terdepan, Terpercaya, T_9dcea6/span_Bantuan'))

WebUI.verifyElementPresent(findTestObject('Mandiri/Page_Bantuan/h3_Bantuan  FAQ'), 5)

WebUI.click(findTestObject('Mandiri/Page_Bantuan/input_Mandiri Search Portlet__Mandiri_Searc_fe9aca'))

WebUI.setText(findTestObject('Mandiri/Page_Bantuan/input_Mandiri Search Portlet__Mandiri_Searc_fe9aca'), 'KATALON')

WebUI.takeFullPageScreenshot('C://Users//sugiarto//Katalon Studio//SUGIARTO//Screenshots//Compared.jpg')

// make AShot's ImageDiff
BufferedImage expectedImage = ImageIO.read(new File ("C://Users//sugiarto//Katalon Studio//SUGIARTO//Screenshots//Baseline.jpg"))
BufferedImage actualImage   = ImageIO.read(new File ("C://Users//sugiarto//Katalon Studio//SUGIARTO//Screenshots//Compared.jpg"))
Screenshot expectedScreenshot = new Screenshot(expectedImage)
Screenshot actualScreenshot = new Screenshot(actualImage)

ImageDiff diff = new ImageDiffer().makeDiff(expectedScreenshot, actualScreenshot)

BufferedImage markedImage = diff.getMarkedImage()

DecimalFormat dformat = new DecimalFormat("##0.00")

// check how much difference found between the original and the mimic.
// if diff% exceed the criteria, then mark the test case FAILED
Double criteriaPercent = 3.0
Double diffRatioPercent = diffRatioPercent(diff)
if (diffRatioPercent > criteriaPercent) {
	KeywordUtil.markFailed("diffRatio=${dformat.format(diffRatioPercent)} exceeds criteria=${criteriaPercent}")
}

// save the diff image into file
File diffFile = resolveScreenshotFile("Different.png")
ImageIO.write(markedImage, "PNG", diffFile)
WebUI.comment(">>> wrote the ImageDiff into ${diffFile.toString()}")

WebUI.closeBrowser()


