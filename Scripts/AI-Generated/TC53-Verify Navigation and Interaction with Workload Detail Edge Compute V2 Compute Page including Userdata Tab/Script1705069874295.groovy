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

WebUI.navigateToUrl(GlobalVariable.application_domain + '/login')

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

'step 3: At Page home click on button object --> navigate to Page service manage-workloads edge-compute-v2 comp'

testObj = findTestObject('AI-Generated/Page_home/button_object_1')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*//?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 4: At Page service manage-workloads edge-compute-v2 comp click on td object --> navigate to Page service workload-detail edge-compute-v2 compu'

testObj = findTestObject('AI-Generated/Page_service_manage-workloads_compute-cloud_workload/td_object_2')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/service/manage-workloads/.*/compute-cloud/.*/workload/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 5: At Page service workload-detail edge-compute-v2 compu click on button object'

testObj = findTestObject('AI-Generated/Page_service_workload-detail_compute-cloud/button_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/service/workload-detail/.*/compute-cloud/.*/.*/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 6: Navigate to Page service workload-detail edge-compute-v2 compu'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/service/workload-detail/edge-compute-v2/compute-cloud/test1/3739c1e9-ced6-481e-b5ed-8133a4b547be')

'step 7: At Page service workload-detail edge-compute-v2 compu click on p object'

testObj = findTestObject('AI-Generated/Page_service_workload-detail_compute-cloud/p_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/service/workload-detail/.*/compute-cloud/.*/.*/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 8: At Page service workload-detail edge-compute-v2 compu click on div object'

testObj = findTestObject('AI-Generated/Page_service_workload-detail_compute-cloud/div_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/service/workload-detail/.*/compute-cloud/.*/.*/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 9: At Page service workload-detail edge-compute-v2 compu click on div rc tabs 2 tab userdata'

testObj = findTestObject('AI-Generated/Page_service_workload-detail_compute-cloud/div_rc_tabs_2_tab_userdata')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/service/workload-detail/.*/compute-cloud/.*/.*/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 10: At Page service workload-detail edge-compute-v2 compu click on div object'

testObj = findTestObject('AI-Generated/Page_service_workload-detail_compute-cloud/div_object_3')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/service/workload-detail/.*/compute-cloud/.*/.*/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 11: Add visual checkpoint at Page service workload-detail edge-compute-v2 compu'

WebUI.takeFullPageScreenshotAsCheckpoint('TC53-Verify Navigation and Interaction with Workload Detail Edge Compute V2 Compute Page including Userdata Tab_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
