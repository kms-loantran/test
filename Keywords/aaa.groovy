import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword

//import ru.yandex.qatools.ashot.Screenshot


import ru.yandex.qatools.ashot.comparison.ImageDiff
import ru.yandex.qatools.ashot.comparison.ImageDiffer

import internal.GlobalVariable

public class aaa {


	ImageDiffer imgDiff = new ImageDiffer();

	ImageDiff diff = imgDiff.makeDiff(expectedImage4, expectedImage3);
}
