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

Mobile.setText(findTestObject('Login/1. Login - Username'), 'MOKKB1', 0)

Mobile.setText(findTestObject('Login/2. Login - Password'), 'mobile123+', 0)

Mobile.tap(findTestObject('Login/3. Login - Password View'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathkkbsk) + 'Login-1') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Login/4. Login - Button Submit'), 0)

Mobile.delay(8, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathkkbsk) + 'Login-2') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Login/5. Login - Profile View'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathkkbsk) + 'Login-3') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Login/6. Login - Home Page'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathkkbsk) + 'Login-4') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

