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

'Get directory project'
String baseDir = System.getProperty('user.dir')

Mobile.startExistingApplication('bcaf.crm.kkb.saleskit')

Mobile.swipe(300, 500, 0, 500)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathkkbsk) + 'Tracking-1') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Tracking/Tracking - Button'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathkkbsk) + 'Tracking-2') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Tracking/Tracking - Input Pencarian'), 0)

Mobile.setText(findTestObject('Tracking/Tracking - Input KCU KCP'), '(KCU) SOLO SLAMET RIYADI', 0)

Mobile.setText(findTestObject('Tracking/Tracking - Input Nama Konsumen'), 'Test Tracking', 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathkkbsk) + 'Tracking-3') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Tracking/Tracking - Button Searching'), 0)

Mobile.delay(20, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(0, 1000, 0, 500)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathkkbsk) + 'Tracking-4') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Tracking/Tracking - Select App in'), 0)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathkkbsk) + 'Tracking-5') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

