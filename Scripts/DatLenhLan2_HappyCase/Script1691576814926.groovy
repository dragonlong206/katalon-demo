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

WebUI.click(findTestObject('Object Repository/Page_DragonX/svg_()_svg-icon svg-fill'))

WebUI.click(findTestObject('Object Repository/Page_DragonX/span_t lnh'))

WebUI.click(findTestObject('Object Repository/Page_DragonX/p_Qu tri phiu'))

WebUI.click(findTestObject('Object Repository/Page_DragonX/span_5.000.000'))

String checkedProperty = WebUI.getAttribute(findTestObject('Page_DragonX/input_Nhp s tin_input-449'), 'checked')

if (checkedProperty == 'true') {
    WebUI.click(findTestObject('Object Repository/Page_DragonX/input_Nhp s tin_input-449'))
}

WebUI.click(findTestObject('Object Repository/Page_DragonX/span_Tip tc'))

WebUI.setText(findTestObject('Object Repository/Page_DragonX/input__otp__0'), '3')

WebUI.setText(findTestObject('Object Repository/Page_DragonX/input__otp--1'), '2')

WebUI.setText(findTestObject('Object Repository/Page_DragonX/input__otp--2'), '1')

WebUI.setText(findTestObject('Object Repository/Page_DragonX/input__otp--3'), '3')

WebUI.setText(findTestObject('Object Repository/Page_DragonX/input__otp--4'), '2')

WebUI.setText(findTestObject('Object Repository/Page_DragonX/input__otp--5'), '1')

WebUI.click(findTestObject('Object Repository/Page_DragonX/span_Xc nhn'))

popupText = WebUI.getText(findTestObject('Page_DragonX/div_Bn  t 5 lnh mua Linh hot vi cng ngy giao dch. Chng ti s khp tng s tin m bn chuyn vo 1 lnh v cc lnh cn li s t ng b hy'))

WebUI.verifyMatch(popupText, 'Bạn đã đặt \\d+ lệnh mua Linh hoạt với cùng ngày giao dịch. Chúng tôi sẽ khớp tổng số tiền mà bạn chuyển vào 1 lệnh và các lệnh còn lại sẽ tự động bị hủy.', 
    true)

WebUI.closeBrowser()

