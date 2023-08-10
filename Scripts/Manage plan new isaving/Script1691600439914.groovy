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

WebUI.click(findTestObject('Object Repository/Page_DragonX/span_ng nhp'))

WebUI.click(findTestObject('Object Repository/Page_DragonX/div_Ti khon'))

WebUI.setText(findTestObject('Object Repository/Page_DragonX/input_S ti khon, Email hoc S in thoi_input-115'), '999C434916')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_DragonX/input_M PIN ng nhp_input-119'), 'CSt51UwWECc=')

WebUI.click(findTestObject('Object Repository/Page_DragonX/span_ng nhp_1'))

WebUI.setText(findTestObject('Object Repository/Page_DragonX/input__otp__0'), '1')

WebUI.setText(findTestObject('Object Repository/Page_DragonX/input__otp--1'), '1')

WebUI.setText(findTestObject('Object Repository/Page_DragonX/input__otp--2'), '1')

WebUI.setText(findTestObject('Object Repository/Page_DragonX/input__otp--3'), '1')

WebUI.setText(findTestObject('Object Repository/Page_DragonX/input__otp--4'), '1')

WebUI.setText(findTestObject('Object Repository/Page_DragonX/input__otp--5'), '1')

WebUI.click(findTestObject('Object Repository/Page_DragonX/Page_DragonX/svg_()_svg-icon svg-fill'))

WebUI.click(findTestObject('Page_DragonX/span_S lnh'))

WebUI.click(findTestObject('Page_DragonX/span_Hot ng'))

WebUI.click(findTestObject('Page_DragonX/span_Thng tin u t_v-btn__content'))

WebUI.click(findTestObject('Page_DragonX/input_Nhp s tin_input-449'))

WebUI.click(findTestObject('Page_DragonX/span_Tip tc - Manage New isaving'))

WebUI.setText(findTestObject('Object Repository/Page_DragonX/input__otp__0'), '3')

WebUI.setText(findTestObject('Object Repository/Page_DragonX/input__otp--1'), '2')

WebUI.setText(findTestObject('Object Repository/Page_DragonX/input__otp--2'), '1')

WebUI.setText(findTestObject('Object Repository/Page_DragonX/input__otp--3'), '3')

WebUI.setText(findTestObject('Object Repository/Page_DragonX/input__otp--4'), '2')

WebUI.setText(findTestObject('Object Repository/Page_DragonX/input__otp--5'), '1')

WebUI.click(findTestObject('Page_DragonX/span_Xc nhn'))

WebUI.click(findTestObject('Object Repository/Page_DragonX/button_ng'))

