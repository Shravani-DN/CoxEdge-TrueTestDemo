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

testObj = findTestObject('AI-Generated/Page_service_manage-workloads_compute-cloud_workload/td_object_1')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/service/manage-workloads/.*/compute-cloud/.*/workload/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 5: At Page service workload-detail edge-compute-v2 compu click on div object'

testObj = findTestObject('AI-Generated/Page_service_workload-detail_compute-cloud/div_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/service/workload-detail/.*/compute-cloud/.*/.*/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 6: Navigate to Page service workload-detail edge-compute-v2 compu'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/service/workload-detail/edge-compute-v2/compute-cloud/test1/c7aa8e10-ae7e-4762-967d-4a3148afefc9')

'step 7: At Page service workload-detail edge-compute-v2 compu click on div rc tabs 1 tab settings'

testObj = findTestObject('AI-Generated/Page_service_workload-detail_compute-cloud/div_rc_tabs_1_tab_settings')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/service/workload-detail/.*/compute-cloud/.*/.*/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 8: Navigate to Page service workload-detail edge-compute-v2 compu'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/service/workload-detail/edge-compute-v2/compute-cloud/test1/c7aa8e10-ae7e-4762-967d-4a3148afefc9')

'step 9: At Page service workload-detail edge-compute-v2 compu click on span test1'

testObj = findTestObject('AI-Generated/Page_service_workload-detail_compute-cloud/span_test1')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/service/workload-detail/.*/compute-cloud/.*/.*/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 10: At Page service workload-detail edge-compute-v2 compu click on div object'

testObj = findTestObject('AI-Generated/Page_service_workload-detail_compute-cloud/div_object_1')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/service/workload-detail/.*/compute-cloud/.*/.*/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 11: At Page service workload-detail edge-compute-v2 compu click on button object'

testObj = findTestObject('AI-Generated/Page_service_workload-detail_compute-cloud/button_object_1')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/service/workload-detail/.*/compute-cloud/.*/.*/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 12: Navigate to Page service workload-detail edge-compute-v2 compu'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/service/workload-detail/edge-compute-v2/compute-cloud/test1/c7aa8e10-ae7e-4762-967d-4a3148afefc9')

'step 13: At Page service workload-detail edge-compute-v2 compu click on button object'

testObj = findTestObject('AI-Generated/Page_service_workload-detail_compute-cloud/button_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/service/workload-detail/.*/compute-cloud/.*/.*/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 14: Navigate to Page service workload-detail edge-compute-v2 compu'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/service/workload-detail/edge-compute-v2/compute-cloud/test1/c7aa8e10-ae7e-4762-967d-4a3148afefc9')

'step 15: At Page service workload-detail edge-compute-v2 compu click on div object'

testObj = findTestObject('AI-Generated/Page_service_workload-detail_compute-cloud/div_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/service/workload-detail/.*/compute-cloud/.*/.*/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 16: At Page service workload-detail edge-compute-v2 compu click on div rc tabs 1 tab overview'

testObj = findTestObject('AI-Generated/Page_service_workload-detail_compute-cloud/div_rc_tabs_1_tab_overview')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/service/workload-detail/.*/compute-cloud/.*/.*/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 17: Navigate to Page service workload-detail edge-compute-v2 compu'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/service/workload-detail/edge-compute-v2/compute-cloud/test1/c7aa8e10-ae7e-4762-967d-4a3148afefc9')

'step 18: At Page service workload-detail edge-compute-v2 compu click on div object'

testObj = findTestObject('AI-Generated/Page_service_workload-detail_compute-cloud/div_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/service/workload-detail/.*/compute-cloud/.*/.*/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 19: At Page service workload-detail edge-compute-v2 compu click on div object'

testObj = findTestObject('AI-Generated/Page_service_workload-detail_compute-cloud/div_object_2')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/service/workload-detail/.*/compute-cloud/.*/.*/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 20: At Page service workload-detail edge-compute-v2 compu click on div object'

testObj = findTestObject('AI-Generated/Page_service_workload-detail_compute-cloud/div_object_3')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/service/workload-detail/.*/compute-cloud/.*/.*/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 21: Add visual checkpoint at Page service workload-detail edge-compute-v2 compu'

WebUI.takeFullPageScreenshotAsCheckpoint('TC51-Verify Navigation and Interaction with Workload Detail Edge Compute V2 Compute Page including Settings and Overview Tabs_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
