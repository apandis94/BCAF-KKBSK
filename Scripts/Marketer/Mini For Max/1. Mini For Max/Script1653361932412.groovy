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

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathkkbsk) + 'Simulasi Kredit 1') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Mini For Max/Minimax - Menu'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Mini For Max/Minimax - Jenis Program'), 0)

Mobile.tap(findTestObject('Mini For Max/Minimax - Checker'), 0)

Mobile.tap(findTestObject('Mini For Max/Minimax - Jenis Pembiayaan'), 0)

Mobile.tap(findTestObject('Mini For Max/Minimax - Jenis Pembiayaan (Mobil Baru)'), 0)

Mobile.tap(findTestObject('Mini For Max/Minimax - Tipe Konsumen'), 0)

Mobile.tap(findTestObject('Mini For Max/Minimax - Tipe Konsumen (Perorangan)'), 0)

Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Mini For Max/Minimax - NPWP (Ya)'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Mini For Max/Minimax - Cluster'), 0)

Mobile.tap(findTestObject('Mini For Max/Minimax - Cluster (Solitare)'), 0)

Mobile.tap(findTestObject('Mini For Max/Minimax - Tujuan Penggunaan'), 0)

Mobile.tap(findTestObject('Mini For Max/Minimax - Tujuan Penggunaan (Produktif)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathkkbsk) + 'Simulasi Kredit 2') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Mini For Max/Minimax - Button Lanjut 2'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Mini For Max/Minimax - Input Harga Kendaraan'), '500000000\\n', 10)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Mini For Max/Minimax - Uang Muka 2'), '30\\n', 10)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Mini For Max/Minimax - Input DownPayment'), '100000000\\n', 200)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Mini For Max/Minimax - Jenis Kendaraan 2'), 0)

Mobile.tap(findTestObject('Mini For Max/Minimax - Jenis Kendaraan (Passenger)'), 0)

Mobile.tap(findTestObject('Mini For Max/Minimax - Wilayah'), 0)

Mobile.tap(findTestObject('Mini For Max/Minimax - Wilayah (Lain-Lainnya)'), 0)

Mobile.tap(findTestObject('Mini For Max/Minimax - Asuransi'), 0)

Mobile.tap(findTestObject('Mini For Max/Minimax - Asuransi (Comprehensive)'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Mini For Max/Minimax - RSCC'), 0)

Mobile.tap(findTestObject('Mini For Max/Minimax - RSMB'), 0)

Mobile.tap(findTestObject('Mini For Max/Mini Max - TJH 25 JT'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathkkbsk) + 'Simulasi Kredit 3') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Mini For Max/Minimax - Button Kalkulasi 2'), 0)

Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathkkbsk) + 'Simulasi Kredit 4') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Mini For Max/Apply Button/Minimax - Apply p4'), 0)

Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathkkbsk) + 'Simulasi Kredit 5') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Mini For Max/Minimax - Button Apply Now'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathkkbsk) + 'Simulasi Kredit 6') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

