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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://sketch.io/sketchpad/')

WebUI.click(findTestObject('Object Repository/Page_Sketchpad - Draw, Create, Share/alert-close-link_Accepted formats_close-but_ef71b7'))

WebUI.click(findTestObject('Object Repository/Page_Sketchpad - Draw, Create, Share/sketch-tool_Drop files here_selected'))

WebUI.mouseOver(findTestObject('Object Repository/Page_Sketchpad - Draw, Create, Share/sketch-input-content_2px (1)'))

WebUI.click(findTestObject('Object Repository/Page_Sketchpad - Draw, Create, Share/sketch-range_Line Width_animate'))

WebUI.click(findTestObject('Object Repository/Page_Sketchpad - Draw, Create, Share/sketch-tool_Drop files here_selected'))

WebUI.click(findTestObject('Object Repository/Page_Sketchpad - Draw, Create, Share/sketch-tool_Drop files here_selected'))

WebUI.click(findTestObject('Object Repository/Page_Sketchpad - Draw, Create, Share/sketch-tool_Drop files here_selected'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Sketchpad - Draw, Create, Share/sketch-doc-scrollarea_Drop files here_ps ps_47b0ba'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Sketchpad - Draw, Create, Share/sketch-doc-scrollarea_Drop files here_ps ps_47b0ba'))

not_run: WebUI.clickOffset(findTestObject('Tap at Position/Page_Sketchpad - Draw, Create, Share/sketch-doc-scrollarea_Drop files here_ps ps_47b0ba'), 
    100, 100)

not_run: WebUI.clickOffset(findTestObject('Tap at Position/Page_Sketchpad - Draw, Create, Share/sketch-doc-scrollarea_Drop files here_ps ps_47b0ba'), 
    100, 160)

not_run: WebUI.clickOffset(findTestObject('Tap at Position/Page_Sketchpad - Draw, Create, Share/sketch-doc-scrollarea_Drop files here_ps ps_47b0ba'), 
    100, 170)

not_run: WebUI.clickOffset(findTestObject('Tap at Position/Page_Sketchpad - Draw, Create, Share/sketch-doc-scrollarea_Drop files here_ps ps_47b0ba'), 
    100, 180)

not_run: WebUI.clickOffset(findTestObject('Tap at Position/Page_Sketchpad - Draw, Create, Share/sketch-doc-scrollarea_Drop files here_ps ps_47b0ba'), 
    50, 120)

not_run: WebUI.clickOffset(findTestObject('Tap at Position/Page_Sketchpad - Draw, Create, Share/sketch-doc-scrollarea_Drop files here_ps ps_47b0ba'), 
    30, 120)

not_run: WebUI.clickOffset(findTestObject('Tap at Position/Page_Sketchpad - Draw, Create, Share/sketch-doc-scrollarea_Drop files here_ps ps_47b0ba'), 
    10, 120)

not_run: WebUI.clickOffset(findTestObject('Tap at Position/Page_Sketchpad - Draw, Create, Share/sketch-doc-scrollarea_Drop files here_ps ps_47b0ba'), 
    0, 120)

not_run: WebUI.clickOffset(findTestObject('Tap at Position/Page_Sketchpad - Draw, Create, Share/sketch-doc-scrollarea_Drop files here_ps ps_47b0ba'), 
    0, 0)

not_run: WebUI.clickOffset(findTestObject('Tap at Position/Page_Sketchpad - Draw, Create, Share/sketch-doc-scrollarea_Drop files here_ps ps_47b0ba'), 
    250, 250)

not_run: WebUI.clickOffset(findTestObject('Tap at Position/Page_Sketchpad - Draw, Create, Share/sketch-doc-scrollarea_Drop files here_ps ps_47b0ba'), 
    -250, -250)

not_run: WebUI.clickOffset(findTestObject('Tap at Position/Page_Sketchpad - Draw, Create, Share/sketch-doc-scrollarea_Drop files here_ps ps_47b0ba'), 
    -250, 250)

not_run: WebUI.clickOffset(findTestObject('Tap at Position/Page_Sketchpad - Draw, Create, Share/sketch-doc-scrollarea_Drop files here_ps ps_47b0ba'), 
    250, -250)

WebUI.clickOffset(findTestObject('Tap at Position/Page_Sketchpad - Draw, Create, Share/sketch-doc-scrollarea_Drop files here_ps ps_47b0ba'), 
    0, 125)

WebUI.clickOffset(findTestObject('Tap at Position/Page_Sketchpad - Draw, Create, Share/sketch-doc-scrollarea_Drop files here_ps ps_47b0ba'), 
    0, 200)

WebUI.clickOffset(findTestObject('Tap at Position/Page_Sketchpad - Draw, Create, Share/sketch-doc-scrollarea_Drop files here_ps ps_47b0ba'), 
    -200, 0)

WebUI.clickOffset(findTestObject('Tap at Position/Page_Sketchpad - Draw, Create, Share/sketch-doc-scrollarea_Drop files here_ps ps_47b0ba'), 
    0, -200)

WebUI.clickOffset(findTestObject('Tap at Position/Page_Sketchpad - Draw, Create, Share/sketch-doc-scrollarea_Drop files here_ps ps_47b0ba'), 
    200, 0)

WebUI.clickOffset(findTestObject('Tap at Position/Page_Sketchpad - Draw, Create, Share/sketch-doc-scrollarea_Drop files here_ps ps_47b0ba'), 
    -710, -350)

WebUI.delay(10)

