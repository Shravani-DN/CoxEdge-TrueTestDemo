import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page home --> navigate to Page login'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/service/manage-workloads/edge-compute/stackpath-cox-uat/regression/vpcs')

'step 2: Login at Page login --> navigate to Page home'

'--> At login page input username'

testObj = findTestObject('AI-Generated/Page_login/input_username')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/login/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, GlobalVariable.username)

'--> At login page input password'

testObj = findTestObject('AI-Generated/Page_login/input_password')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/login/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, GlobalVariable.password)

'--> At login page submit login form'

testObj = findTestObject('AI-Generated/Page_login/form_login_info')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/login/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.submit(testObj)

'--> Wait for login action to be completed'

WebUI.delay(15)

'step 3: Navigate to Page home --> navigate to Page service manage-workloads edge-compute stackpa'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/service/manage-workloads/edge-compute/stackpath-cox-uat/regression/vpcs')

'step 4: At Page service manage-workloads edge-compute stackpa click on button object --> navigate to Page add-vpcs testingstandarduser stackpath-cox-ua'

testObj = findTestObject('AI-Generated/Page_service_manage-workloads_edge-compute_stackpath-cox-uat_reg/button_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/service/manage-workloads/edge-compute/stackpath-cox-uat/regression/vpcs/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 5: At Page add-vpcs testingstandarduser stackpath-cox-ua click on button object'

testObj = findTestObject('AI-Generated/Page_add-vpcs_testingstandarduser_stackpath-cox-uat_edge-compute/button_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/add-vpcs/testingstandarduser/stackpath-cox-uat/edge-compute/regression/.*/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 6: Add visual checkpoint at Page add-vpcs testingstandarduser stackpath-cox-ua'

WebUI.takeFullPageScreenshotAsCheckpoint('TC57-Verify Navigation and Interaction with Manage Workloads Edge Compute Stackpath Page including Add Vpcs_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
