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

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathkkbsk) + 'Data Konsumen 1') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Data Konsumen/Data Konsumen - Input NIK'), '3201241107690002', 0)

Mobile.setText(findTestObject('Data Konsumen/Data Konsumen - Input Nama Lengkap'), 'LUKMAN WIJAYA', 0)

Mobile.setText(findTestObject('Data Konsumen/Data Konsumen - Input Tanggal Lahir'), '13-03-1989', 0)

Mobile.setText(findTestObject('Data Konsumen/Data Konsumen - Input Alamat'), 'JL. RAYA CISEENG NO.12 BLOK A', 
    0)

Mobile.setText(findTestObject('Data Konsumen/Data Konsumen - Input Provinsi'), 'JAWA BARAT', 0)

Mobile.setText(findTestObject('Data Konsumen/Data Konsumen - Input Kabupaten'), 'BOGOR', 0)

Mobile.setText(findTestObject('Data Konsumen/Data Konsumen - Input Kecamatan'), 'CISEENG', 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathkkbsk) + 'Data Konsumen 2') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Lanjut')

Mobile.setText(findTestObject('Data Konsumen/Data Konsumen - Input Kode Pos'), '16660', 0)

Mobile.setText(findTestObject('Data Konsumen/Data Konsumen - Input No Telp'), '081283490030', 0)

Mobile.setText(findTestObject('Data Konsumen/Data Konsumen - Input Email'), 'lukman.wijaya@gmail.com', 
    0)

Mobile.setText(findTestObject('Data Konsumen/Data Konsumen - Input No Rekening'), '0880562167', 0)

Mobile.setText(findTestObject('Data Konsumen/Data Konsumen - Input Keterangan'), 'Testing 1', 0)

Mobile.tap(findTestObject('Data Konsumen/Data Konsumen - Button Lanjut 1'), 0)

Mobile.setText(findTestObject('Data Konsumen/Data Konsumen - Input Nik Pasangan'), '3175070101909999', 0)

Mobile.setText(findTestObject('Data Konsumen/Data Konsumen - Input Nama Pasangan'), 'BILLY BUMBLEBEE SIFULAN', 
    0)

Mobile.setText(findTestObject('Data Konsumen/Data Konsumen - Input Tanggal Lahir Pasangan'), '02-Jan-1990', 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint(((baseDir + GlobalVariable.sspathkkbsk) + 'Data Konsumen 3') + '.png', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Data Konsumen/Data Konsumen - Button Lanjut 2'), 0)

Mobile.closeApplication()

