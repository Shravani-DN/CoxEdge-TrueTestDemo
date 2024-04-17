import com.kms.katalon.core.model.FailureHandling
import katalon.common.performInputSpanPActions
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.common.clickObjectsForWorkloadManagement
import katalon.common.inputAndClickObjects
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.truetest.TrueTestScripts
import katalon.common.clickObjectsInSequence
import internal.GlobalVariable

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://cox-ui.uat.cloudmc.io/"

TrueTestScripts.navigate('/')

"Step 2: Login into Application"

WebUI.takeScreenshot()

TrueTestScripts.login()

"Step 3: Click on button 'TS'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/button_ts'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_ts'))

"Step 4: Click on p"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/p_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/p_object'))

"Step 5: Click on button 'TS'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/button_ts'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_ts'))

"Step 6: Click on button 'Edge Compute 2.0' -> Navigate to page 'service/manage-workloads/*/compute-cloud/automation/workload'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/button_edge compute 2_0'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_edge compute 2_0'))

"Step 7: Click on span"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_workload/span_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/manage-workloads/.*/compute-cloud/automation/workload?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_workload/span_object'))

"Step 8: Click on div"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_workload/div_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/manage-workloads/.*/compute-cloud/automation/workload?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_workload/div_object'))

"Step 9: Click objects for workload management"

WebUI.takeScreenshot()

clickObjectsForWorkloadManagement.execute(data_path_0, Integer.valueOf(index_0))

"Step 10: Click objects in sequence"

WebUI.takeScreenshot()

clickObjectsInSequence.execute()

"Step 11: Input and click objects"

WebUI.takeScreenshot()

inputAndClickObjects.execute(data_path_1, Integer.valueOf(index_1))

"Step 12: Perform input, span, and p actions"

WebUI.takeScreenshot()

performInputSpanPActions.execute(data_path_2, Integer.valueOf(index_2))

"Step 13: Click on button 'VPC Networks' -> Navigate to page 'service/manage-workloads/*/compute-cloud/automation/networks'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_workload_detail_compute_cloud_automation_vpc_details/button_vpc networks'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/workload-detail/.*/compute-cloud/automation/vpc-details-view/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_workload_detail_compute_cloud_automation_vpc_details/button_vpc networks'))

"Step 14: Click on input field"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_networks/input_object_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/manage-workloads/.*/compute-cloud/automation/networks?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_networks/input_object_1'))

"Step 15: Enter input value in input field"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_networks/input_object_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/manage-workloads/.*/compute-cloud/automation/networks?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_networks/input_object_1'), input_object)

"Step 16: Click on button"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_networks/button_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/manage-workloads/.*/compute-cloud/automation/networks?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_networks/button_object'))

"Step 17: Click on span  -> Navigate to page 'service/workload-detail/*/compute-cloud/automation/vpc-details-view/*'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_networks/span_object_2'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/manage-workloads/.*/compute-cloud/automation/networks?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_networks/span_object_2'))

"Step 18: Click on button 'TS'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_workload_detail_compute_cloud_automation_vpc_details/button_ts'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/workload-detail/.*/compute-cloud/automation/vpc-details-view/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_workload_detail_compute_cloud_automation_vpc_details/button_ts'))

"Step 19: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC94-Verify VPC Details in Compute Cloud Automation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
