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

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathkkbsk) + 'Upload File 1') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Upload File/Upload - Button Pilih KTP'), 0)

Mobile.tap(findTestObject('Upload File/Upload - Pilih Dari (Galeri)'), 0)

Mobile.scrollToText('Upload File')

Mobile.tap(findTestObject('Upload File/Upload - Folder Gallery (Upload File)'), 0)

Mobile.tap(findTestObject('Upload File/Upload - Pilih File KTP'), 0)

Mobile.tap(findTestObject('Upload File/Upload - Button Pilih KTP Pasangan'), 0)

Mobile.tap(findTestObject('Upload File/Upload - Pilih Dari (Galeri)'), 0)

Mobile.scrollToText('Upload File')

Mobile.tap(findTestObject('Upload File/Upload - Galeri Folder Upload File'), 0)

Mobile.tap(findTestObject('Upload File/Upload - Pilih File KTP Pasangan'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathkkbsk) + 'Upload File 2') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('NPWP')

Mobile.tap(findTestObject('Upload File/Upload - Pilih KK'), 0)

Mobile.tap(findTestObject('Upload File/Upload - Pilih Dari (Galeri)'), 0)

Mobile.scrollToText('Upload File')

Mobile.tap(findTestObject('Upload File/Upload - Button Pilih KK'), 0)

Mobile.tap(findTestObject('Upload File/Upload - Pilih File KK'), 0)

Mobile.tap(findTestObject('Upload File/Upload - Upload Pilih NPWP'), 0)

Mobile.tap(findTestObject('Upload File/Upload - Pilih Dari (Galeri)'), 0)

Mobile.scrollToText('Upload File')

Mobile.tap(findTestObject('Upload File/Upload - Button Pilih NPWP'), 0)

Mobile.tap(findTestObject('Upload File/Upload - Pilih FIle NPWP'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathkkbsk) + 'Upload File 3') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Bukti Rumah')

Mobile.tap(findTestObject('Upload File/Upload - Button Pilih Bukti Penghasilan'), 0)

Mobile.tap(findTestObject('Upload File/Upload - Pilih Dari (Galeri)'), 0)

Mobile.scrollToText('Upload File')

Mobile.tap(findTestObject('Upload File/Upload - Pilih Bukti Penghasilan'), 0)

Mobile.tap(findTestObject('Upload File/Upload - Pilih FIle Bukti Penghasilan'), 0)

Mobile.scrollToText('Rekening Tabungan')

Mobile.tap(findTestObject('Upload File/Upload - Button Bukti Rumah'), 0)

Mobile.tap(findTestObject('Upload File/Upload - Pilih Dari (Galeri)'), 0)

Mobile.scrollToText('Upload File')

Mobile.tap(findTestObject('Upload File/Upload - Pilih Bukti Rumah'), 0)

Mobile.tap(findTestObject('Upload File/Upload - Pilih File Bukti Rumah'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathkkbsk) + 'Upload File 4') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('BPKB')

Mobile.tap(findTestObject('Upload File/Upload - Button Rekening Tabungan'), 0)

Mobile.tap(findTestObject('Upload File/Upload - Pilih Dari (Galeri)'), 0)

Mobile.scrollToText('Upload File')

Mobile.tap(findTestObject('Upload File/Upload - Pilih Rekening Tabungan'), 0)

Mobile.tap(findTestObject('Upload File/Upload - Pilih File Buku Tabungan'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathkkbsk) + 'Upload File 5') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Lanjut')

Mobile.tap(findTestObject('Upload File/Upload - Button Pilih BPKB'), 0)

Mobile.tap(findTestObject('Upload File/Upload - Pilih Dari (Galeri)'), 0)

Mobile.scrollToText('Upload File')

Mobile.tap(findTestObject('Upload File/Upload - PIlih BPKB'), 0)

Mobile.tap(findTestObject('Upload File/Upload - Pilih File BPKB'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathkkbsk) + 'Upload File 6') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Upload File/Upload - Button Lanjut'), 0)

Mobile.closeApplication()

