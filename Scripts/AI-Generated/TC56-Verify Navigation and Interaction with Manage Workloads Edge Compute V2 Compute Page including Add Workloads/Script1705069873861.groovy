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

WebUI.navigateToUrl(GlobalVariable.application_domain + '/service/manage-workloads/edge-compute-v2/compute-cloud/testnew/workload')

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

'step 3: Navigate to Page home --> navigate to Page service manage-workloads edge-compute-v2 comp'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/service/manage-workloads/edge-compute-v2/compute-cloud/testnew/workload')

'step 4: At Page service manage-workloads edge-compute-v2 comp click on button object'

testObj = findTestObject('AI-Generated/Page_service_manage-workloads_compute-cloud_testnew_workload/button_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/service/manage-workloads/.*/compute-cloud/testnew/workload/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 5: At Page service manage-workloads edge-compute-v2 comp click on span object'

testObj = findTestObject('AI-Generated/Page_service_manage-workloads_compute-cloud_testnew_workload/span_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/service/manage-workloads/.*/compute-cloud/testnew/workload/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 6: Navigate to Page service manage-workloads edge-compute-v2 comp --> navigate to Page add-workloads compute-cloud edge-compute-v2 t'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/service/manage-workloads/edge-compute-v2/compute-cloud/testnew/workload')

'step 7: At Page add-workloads compute-cloud edge-compute-v2 t click on button object'

testObj = findTestObject('AI-Generated/Page_add-workloads_compute-cloud_testnew/button_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/add-workloads/compute-cloud/.*/testnew/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 8: At Page add-workloads compute-cloud edge-compute-v2 t click on button object'

testObj = findTestObject('AI-Generated/Page_add-workloads_compute-cloud_testnew/button_object_1')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/add-workloads/compute-cloud/.*/testnew/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 9: At Page add-workloads compute-cloud edge-compute-v2 t click on input hostname'

testObj = findTestObject('AI-Generated/Page_add-workloads_compute-cloud_testnew/input_hostname')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/add-workloads/compute-cloud/.*/testnew/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 10: At Page add-workloads compute-cloud edge-compute-v2 t input on input hostname'

testObj = findTestObject('AI-Generated/Page_add-workloads_compute-cloud_testnew/input_hostname')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/add-workloads/compute-cloud/.*/testnew/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_1_input_hostname)

'step 11: At Page add-workloads compute-cloud edge-compute-v2 t click on input label'

testObj = findTestObject('AI-Generated/Page_add-workloads_compute-cloud_testnew/input_label')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/add-workloads/compute-cloud/.*/testnew/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 12: At Page add-workloads compute-cloud edge-compute-v2 t input on input label'

testObj = findTestObject('AI-Generated/Page_add-workloads_compute-cloud_testnew/input_label')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/add-workloads/compute-cloud/.*/testnew/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_2_input_label)

'step 13: At Page add-workloads compute-cloud edge-compute-v2 t click on div object'

testObj = findTestObject('AI-Generated/Page_add-workloads_compute-cloud_testnew/div_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/add-workloads/compute-cloud/.*/testnew/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 14: At Page add-workloads compute-cloud edge-compute-v2 t click on div testssh'

testObj = findTestObject('AI-Generated/Page_add-workloads_compute-cloud_testnew/div_testssh')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/add-workloads/compute-cloud/.*/testnew/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 15: At Page add-workloads compute-cloud edge-compute-v2 t click on span testssh'

testObj = findTestObject('AI-Generated/Page_add-workloads_compute-cloud_testnew/span_testssh')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/add-workloads/compute-cloud/.*/testnew/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 16: At Page add-workloads compute-cloud edge-compute-v2 t click on div object'

testObj = findTestObject('AI-Generated/Page_add-workloads_compute-cloud_testnew/div_object_1')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/add-workloads/compute-cloud/.*/testnew/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 17: At Page add-workloads compute-cloud edge-compute-v2 t click on input object'

testObj = findTestObject('AI-Generated/Page_add-workloads_compute-cloud_testnew/input_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/add-workloads/compute-cloud/.*/testnew/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 18: At Page add-workloads compute-cloud edge-compute-v2 t click on button object --> navigate to Page service manage-workloads edge-compute-v2 comp'

testObj = findTestObject('AI-Generated/Page_add-workloads_compute-cloud_testnew/button_object_1')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/add-workloads/compute-cloud/.*/testnew/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 19: Add visual checkpoint at Page service manage-workloads edge-compute-v2 comp'

WebUI.takeFullPageScreenshotAsCheckpoint('TC56-Verify Navigation and Interaction with Manage Workloads Edge Compute V2 Compute Page including Add Workloads_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
