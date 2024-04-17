import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.truetest.TrueTestScripts
import katalon.common.performInputButtonSpanActions
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

"Step 3: Click on button 'Edge Compute 2.0' -> Navigate to page 'service/manage-workloads/*/compute-cloud/test automation/workload'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/button_edge compute 2_0'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_edge compute 2_0'))

"Step 4: Click on p  -> Navigate to page 'service/manage-workloads/*/compute-cloud/test automation/networks'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_test_automation_workload/p_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/manage-workloads/.*/compute-cloud/test_automation/workload?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_test_automation_workload/p_object'))

"Step 5: Click on button 'VPC 2.0'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_test_automation_networks/button_vpc 2_0'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/manage-workloads/.*/compute-cloud/test_automation/networks?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_test_automation_networks/button_vpc 2_0'))

"Step 6: Click on button 'Add VPC 2.0'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_test_automation_networks/button_add vpc 2_0'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/manage-workloads/.*/compute-cloud/test_automation/networks?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_test_automation_networks/button_add vpc 2_0'))

"Step 7: Click on div"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_test_automation_networks/div_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/manage-workloads/.*/compute-cloud/test_automation/networks?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_test_automation_networks/div_object'))

"Step 8: Click on div"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_test_automation_networks/div_object_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/manage-workloads/.*/compute-cloud/test_automation/networks?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_test_automation_networks/div_object_1'))

"Step 9: Perform input, button, span actions"

WebUI.takeScreenshot()

performInputButtonSpanActions.execute(data_path_0, Integer.valueOf(index_0))

"Step 10: Click on button 'Edge Compute 2.0' -> Navigate to page 'service/manage-workloads/*/compute-cloud/automation/workload'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/button_edge compute 2_0'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_edge compute 2_0'))

"Step 11: Click on p  -> Navigate to page 'service/manage-workloads/*/compute-cloud/automation/networks'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_workload/p_object_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/manage-workloads/.*/compute-cloud/automation/workload?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_workload/p_object_1'))

"Step 12: Click on svg"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_networks/svg_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/manage-workloads/.*/compute-cloud/automation/networks?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_networks/svg_object'))

"Step 13: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC26-Verify Network Management in Test Automation Workloads_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
