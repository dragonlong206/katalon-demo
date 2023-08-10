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

WebUI.navigateToUrl('https://dragonx-migration.dragoncapital.com.vn/vi')

WebUI.click(findTestObject('Object Repository/new testcase/Page_DragonX/a_ng nhp'))

WebUI.click(findTestObject('Object Repository/new testcase/Page_DragonX/div_Ti khon'))

WebUI.setText(findTestObject('Object Repository/new testcase/Page_DragonX/input_S ti khon, Email hoc S in thoi_input-115'), 
    '434916')

WebUI.setEncryptedText(findTestObject('Object Repository/new testcase/Page_DragonX/input_M PIN ng nhp_input-119'), 'CSt51UwWECc=')

WebUI.setText(findTestObject('Object Repository/new testcase/Page_DragonX/input__input-151--0'), '1')

WebUI.setText(findTestObject('Object Repository/new testcase/Page_DragonX/input__input-151--1'), '1')

WebUI.setText(findTestObject('Object Repository/new testcase/Page_DragonX/input__input-151--2'), '1')

WebUI.setText(findTestObject('Object Repository/new testcase/Page_DragonX/input__input-151--3'), '1')

WebUI.setText(findTestObject('Object Repository/new testcase/Page_DragonX/input__input-151--4'), '1')

WebUI.setText(findTestObject('Object Repository/new testcase/Page_DragonX/input__input-151--5'), '1')

WebUI.click(findTestObject('Object Repository/new testcase/Page_DragonX/path'))

WebUI.click(findTestObject('Object Repository/new testcase/Page_DragonX/a_S lnh'))

WebUI.click(findTestObject('Object Repository/new testcase/Page_DragonX/td_09082023'))

WebUI.click(findTestObject('Object Repository/new testcase/Page_DragonX/span_Hy lnh'))

WebUI.setEncryptedText(findTestObject('Object Repository/new testcase/Page_DragonX/input__input-819--0'), 'XtPiXH0+76g=')

WebUI.setEncryptedText(findTestObject('Object Repository/new testcase/Page_DragonX/input__input-819--1'), 'YC0926CP/9Y=')

WebUI.setEncryptedText(findTestObject('Object Repository/new testcase/Page_DragonX/input__input-819--2'), 'HeCM15nHKBI=')

WebUI.setEncryptedText(findTestObject('Object Repository/new testcase/Page_DragonX/input__input-819--3'), 'XtPiXH0+76g=')

WebUI.setEncryptedText(findTestObject('Object Repository/new testcase/Page_DragonX/input__input-819--4'), 'YC0926CP/9Y=')

WebUI.setEncryptedText(findTestObject('Object Repository/new testcase/Page_DragonX/input__input-819--5'), 'HeCM15nHKBI=')

WebUI.click(findTestObject('Object Repository/new testcase/Page_DragonX/span_Xc nhn'))

WebUI.click(findTestObject('Object Repository/new testcase/Page_DragonX/button_ng'))

