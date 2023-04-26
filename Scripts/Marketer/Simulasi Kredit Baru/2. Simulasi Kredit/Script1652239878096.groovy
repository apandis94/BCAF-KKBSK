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

Mobile.tap(findTestObject('Simulasi Kredit 1/Simulasi - Button Simulasi'), 0)

Mobile.tap(findTestObject('Simulasi Kredit 1/Simulasi - Button Jenis Program'), 0)

Mobile.tap(findTestObject('Simulasi Kredit 1/Simulasi - Jenis Program (Reguler)'), 0)

Mobile.tap(findTestObject('Simulasi Kredit 1/Simulasi - Button Jenis Pembiayaan'), 0)

Mobile.tap(findTestObject('Simulasi Kredit 1/Simulasi - Jenis Pembiayaan (Mobil Baru)'), 0)

Mobile.tap(findTestObject('Simulasi Kredit 1/Simulasi - Button Tipe Konsumen'), 0)

Mobile.tap(findTestObject('Simulasi Kredit 1/Simulasi - Tipe Konsumen (Perorangan)'), 0)

Mobile.tap(findTestObject('Simulasi Kredit 1/Simulasi - Radio Button NPWP (Ya)'), 0)

Mobile.tap(findTestObject('Simulasi Kredit 1/Simulasi - cluster'), 0)

Mobile.tap(findTestObject('Simulasi Kredit 1/Simulasi - Cluster (Solitaire)'), 0)

Mobile.tap(findTestObject('Simulasi Kredit 1/Simulasi - Button Pilih Tujuan Penggunaan'), 0)

Mobile.tap(findTestObject('Simulasi Kredit 1/Simulasi - Tujuan Penggunaan (Produktif)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathkkbsk) + 'Simulasi Kredit 2') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Simulasi Kredit 1/Simulasi - Button Lanjut'), 0)

Mobile.setText(findTestObject('Simulasi Kredit 1/Simulasi - Input Harga Kendaraan'), '500000000', 0)

Mobile.setText(findTestObject('Simulasi Kredit 1/Simulasi - Input Uang Muka (DP)'), '30', 0)

Mobile.tap(findTestObject('Simulasi Kredit 1/Simulasi - Button Pilih Jenis Kendaraan'), 0)

Mobile.tap(findTestObject('Simulasi Kredit 1/Simulasi - Jenis Kendaraan (Passenger)'), 0)

Mobile.tap(findTestObject('Simulasi Kredit 1/Simulasi - Button Pilih Wilayah'), 0)

Mobile.tap(findTestObject('Simulasi Kredit 1/Simulasi - PIlih Wilayah (Lain-Lainnya)'), 0)

Mobile.tap(findTestObject('Simulasi Kredit 1/Simulasi - Button Pilih Asuransi'), 0)

Mobile.tap(findTestObject('Simulasi Kredit 1/Simulasi - Asuransi (Comprehensive)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathkkbsk) + 'Simulasi Kredit 3') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Simulasi Kredit 1/Simulasi - Button Kalkulasi'), 0)

Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathkkbsk) + 'Simulasi Kredit 4') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Simulasi Kredit 1/Simulasi - Button Angsuran (4 Thn)'), 0)

Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathkkbsk) + 'Simulasi Kredit 5') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Simulasi Kredit 1/Simulasi - Button Apply Now (ADDM Prepaid)'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathkkbsk) + 'Simulasi Kredit 6') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

