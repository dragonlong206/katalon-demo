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

WebUI.click(findTestObject('Object Repository/new testcase/Page_DragonX/span_ng nhp'))

WebUI.click(findTestObject('Object Repository/new testcase/Page_DragonX/div_Ti khon'))

WebUI.setText(findTestObject('Object Repository/new testcase/Page_DragonX/input_S ti khon, Email hoc S in thoi_input-115'), 
    '999C449634')

WebUI.setEncryptedText(findTestObject('Object Repository/new testcase/Page_DragonX/input_M PIN ng nhp_input-119'), 'T7UTTNAEdNM=')

WebUI.click(findTestObject('Object Repository/new testcase/Page_DragonX/div_ng dng DragonX  Qut m QR  Ti khon S ti _a30b7d'))

WebUI.click(findTestObject('Object Repository/new testcase/Page_DragonX/div_S ti khon, Email hoc S in thoiM PIN ng _595471'))

WebUI.click(findTestObject('Object Repository/new testcase/Page_DragonX/button_ng nhp'))

popupunsuccess = WebUI.getText(findTestObject('Object Repository/new testcase/Page_DragonX/div_Tn ng nhp hoc mt khu khng chnh xc, vui _ccfb66'))

WebUI.verifyMatch(popupunsuccess, 'Tên đăng nhập hoặc mật khẩu không chính xác, vui lòng kiểm tra lại', false)

WebUI.click(findTestObject('Page_DragonX/button_ng'))

WebUI.click(findTestObject('new testcase/Page_DragonX/hyperlink_quenpass'))

WebUI.setText(findTestObject('Object Repository/new testcase/Page_DragonX/input_S ti khon, Email hoc S in thoi_input-154'), 
    '999C029346')

WebUI.click(findTestObject('Object Repository/new testcase/Page_DragonX/span_Xc nhn'))

WebUI.click(findTestObject('new testcase/Page_DragonX/button_dongKhithaydoipass'))

WebUI.closeBrowser()

