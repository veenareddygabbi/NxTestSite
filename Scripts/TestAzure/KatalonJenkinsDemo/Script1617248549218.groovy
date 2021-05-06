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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://nexus-test.azurewebsites.net/#/login?dest=clarity')

WebUI.setText(findTestObject('Object Repository/logintoAutoOrg/Page_Nexus/input_PeopleKey Nexus_form-control'), 'veena@peoplekey.com.au')

WebUI.setEncryptedText(findTestObject('Object Repository/logintoAutoOrg/Page_Nexus/input_PeopleKey Nexus_form-control_1'), 
    'jfi9x37f9DgiwTvmvEZgIQ==')

WebUI.click(findTestObject('Object Repository/logintoAutoOrg/Page_Nexus/input_PeopleKey Nexus_btn btn-info'))

WebUI.click(findTestObject('Object Repository/logintoAutoOrg/Page_Nexus/span_Weasle-Tek Ltd_caret'))

WebUI.click(findTestObject('Object Repository/logintoAutoOrg/Page_Nexus/a_AutoTest'))
WebUI.delay(20)
// Tom branch 
WebUI.closeBrowser()

