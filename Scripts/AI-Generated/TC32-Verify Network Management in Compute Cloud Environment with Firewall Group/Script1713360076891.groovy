import com.kms.katalon.core.model.FailureHandling
import katalon.common.inputAndClickObjectsForNetworkManagement
import katalon.common.performInputSpanPActions
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.common.inputAndClickObjects
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.truetest.TrueTestScripts
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

"Step 6: Click on button 'Edge Compute 2.0' -> Navigate to page 'service/manage-workloads/*/compute-cloud/aaadd/workload'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/button_edge compute 2_0'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_edge compute 2_0'))

"Step 7: Click on span"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_aaadd_workload/span_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/manage-workloads/.*/compute-cloud/aaadd/workload?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_aaadd_workload/span_object'))

"Step 8: Click on div  -> Navigate to page 'environment/*/manage-environment/compute-cloud'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_aaadd_workload/div_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/manage-workloads/.*/compute-cloud/aaadd/workload?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_aaadd_workload/div_object'))

"Step 9: Click on input field"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_environment_manage_environment_compute_cloud/input_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/environment/.*/manage-environment/compute-cloud?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_environment_manage_environment_compute_cloud/input_object'))

"Step 10: Enter input value in input field"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_environment_manage_environment_compute_cloud/input_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/environment/.*/manage-environment/compute-cloud?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_environment_manage_environment_compute_cloud/input_object'), input_object)

"Step 11: Click on button  -> Navigate to page 'service/manage-workloads/*/compute-cloud/automation/workload'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_environment_manage_environment_compute_cloud/button_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/environment/.*/manage-environment/compute-cloud?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_environment_manage_environment_compute_cloud/button_object'))

"Step 12: Click on p"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_workload/p_object_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/manage-workloads/.*/compute-cloud/automation/workload?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_workload/p_object_1'))

"Step 13: Perform input, span, and p actions"

WebUI.takeScreenshot()

performInputSpanPActions.execute(data_path_0, Integer.valueOf(index_0))

"Step 14: Click on button 'VPC Networks' -> Navigate to page 'service/manage-workloads/*/compute-cloud/automation/networks'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_workload_detail_compute_cloud_automation_vpc_details/button_vpc networks'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/workload-detail/.*/compute-cloud/automation/vpc-details-view/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_workload_detail_compute_cloud_automation_vpc_details/button_vpc networks'))

"Step 15: Click on input field"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_networks/input_object_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/manage-workloads/.*/compute-cloud/automation/networks?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_networks/input_object_1'))

"Step 16: Enter input value in input field"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_networks/input_object_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/manage-workloads/.*/compute-cloud/automation/networks?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_networks/input_object_1'), input_object_1)

"Step 17: Click on div"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_networks/div_object_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/manage-workloads/.*/compute-cloud/automation/networks?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_networks/div_object_1'))

"Step 18: Input and click objects"

WebUI.takeScreenshot()

inputAndClickObjects.execute(data_path_1, Integer.valueOf(index_1))

"Step 19: Click on div 'rc-tabs-4-tab-settings'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_workload_detail_compute_cloud_automation/div_rc-tabs-4-tab-settings'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/workload-detail/.*/compute-cloud/automation/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_workload_detail_compute_cloud_automation/div_rc-tabs-4-tab-settings'))

"Step 20: Click on svg"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_workload_detail_compute_cloud_automation/svg_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/workload-detail/.*/compute-cloud/automation/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_workload_detail_compute_cloud_automation/svg_object'))

"Step 21: Click on span"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_workload_detail_compute_cloud_automation/span_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/workload-detail/.*/compute-cloud/automation/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_workload_detail_compute_cloud_automation/span_object'))

"Step 22: Click on svg"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_workload_detail_compute_cloud_automation/svg_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/workload-detail/.*/compute-cloud/automation/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_workload_detail_compute_cloud_automation/svg_object'))

"Step 23: Click on span"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_workload_detail_compute_cloud_automation/span_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/workload-detail/.*/compute-cloud/automation/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_workload_detail_compute_cloud_automation/span_object'))

"Step 24: Click on button 'Continue'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_workload_detail_compute_cloud_automation/button_continue'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/workload-detail/.*/compute-cloud/automation/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_workload_detail_compute_cloud_automation/button_continue'))

"Step 25: Click on svg"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_workload_detail_compute_cloud_automation/svg_object_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/workload-detail/.*/compute-cloud/automation/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_workload_detail_compute_cloud_automation/svg_object_1'))

"Step 26: Click on svg"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_workload_detail_compute_cloud_automation/svg_object_2'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/workload-detail/.*/compute-cloud/automation/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_workload_detail_compute_cloud_automation/svg_object_2'))

"Step 27: Click on button 'Workload'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_workload_detail_compute_cloud_automation/button_workload'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/workload-detail/.*/compute-cloud/automation/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_workload_detail_compute_cloud_automation/button_workload'))

"Step 28: Input and click objects for network management"

WebUI.takeScreenshot()

inputAndClickObjectsForNetworkManagement.execute(data_path_2, Integer.valueOf(index_2))

"Step 29: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC32-Verify Network Management in Compute Cloud Environment with Firewall Group_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
