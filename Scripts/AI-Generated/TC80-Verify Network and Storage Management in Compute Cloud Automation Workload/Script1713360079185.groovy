import com.kms.katalon.core.model.FailureHandling
import katalon.common.performInputAndDivActions
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import katalon.truetest.TrueTestScripts
import katalon.common.clickObjectsForWorkloadSettings
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

"Step 3: Click on button 'Edge Compute 2.0'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_home/button_edge compute 2_0'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_edge compute 2_0'))

"Step 4: Click objects for workload settings"

WebUI.takeScreenshot()

clickObjectsForWorkloadSettings.execute()

"Step 5: Click on p  -> Navigate to page 'service/workload-detail/*/compute-cloud/automation/reserved-ip-view/*'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_networks/p_object_6'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/manage-workloads/.*/compute-cloud/automation/networks?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_networks/p_object_6'))

"Step 6: Click on button 'Edge Compute 2.0' -> Navigate to page 'service/manage-workloads/*/compute-cloud/automation/workload'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_workload_detail_compute_cloud_automation_reserved_ip/button_edge compute 2_0'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/workload-detail/.*/compute-cloud/automation/reserved-ip-view/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_workload_detail_compute_cloud_automation_reserved_ip/button_edge compute 2_0'))

"Step 7: Click on p  -> Navigate to page 'service/manage-workloads/*/compute-cloud/automation/networks'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_workload/p_object_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/manage-workloads/.*/compute-cloud/automation/workload?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_workload/p_object_1'))

"Step 8: Click on p  -> Navigate to page 'service/workload-detail/*/compute-cloud/automation/reserved-ip-view/*'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_networks/p_object_6'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/manage-workloads/.*/compute-cloud/automation/networks?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_networks/p_object_6'))

"Step 9: Click on button 'Detach'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_workload_detail_compute_cloud_automation_reserved_ip/button_detach'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/workload-detail/.*/compute-cloud/automation/reserved-ip-view/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_workload_detail_compute_cloud_automation_reserved_ip/button_detach'))

"Step 10: Click on svg"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_workload_detail_compute_cloud_automation_reserved_ip/svg_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/workload-detail/.*/compute-cloud/automation/reserved-ip-view/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_workload_detail_compute_cloud_automation_reserved_ip/svg_object'))

"Step 11: Click on div"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_workload_detail_compute_cloud_automation_reserved_ip/div_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/workload-detail/.*/compute-cloud/automation/reserved-ip-view/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_workload_detail_compute_cloud_automation_reserved_ip/div_object'))

"Step 12: Click on button 'Network' -> Navigate to page 'service/manage-workloads/*/compute-cloud/automation/networks'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_workload_detail_compute_cloud_automation_reserved_ip/button_network'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/workload-detail/.*/compute-cloud/automation/reserved-ip-view/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_workload_detail_compute_cloud_automation_reserved_ip/button_network'))

"Step 13: Click on p"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_networks/p_object_4'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/manage-workloads/.*/compute-cloud/automation/networks?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_networks/p_object_4'))

"Step 14: Click objects in sequence"

WebUI.takeScreenshot()

clickObjectsInSequence.execute()

"Step 15: Click on p  -> Navigate to page 'service/manage-workloads/*/compute-cloud/automation/snapshots'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_storage/p_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/manage-workloads/.*/compute-cloud/automation/storage?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_storage/p_object'))

"Step 16: Click on p  -> Navigate to page 'service/manage-workloads/*/compute-cloud/automation/storage'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_snapshots/p_object_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/manage-workloads/.*/compute-cloud/automation/snapshots?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_snapshots/p_object_1'))

"Step 17: Click on svg"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_storage/svg_object_2'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/manage-workloads/.*/compute-cloud/automation/storage?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_storage/svg_object_2'))

"Step 18: Click on div"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_storage/div_object_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/manage-workloads/.*/compute-cloud/automation/storage?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_storage/div_object_1'))

"Step 19: Click on svg"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_storage/svg_object_2'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/manage-workloads/.*/compute-cloud/automation/storage?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_storage/svg_object_2'))

"Step 20: Click on div"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_storage/div_object_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/manage-workloads/.*/compute-cloud/automation/storage?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_storage/div_object_1'))

"Step 21: Click on p  -> Navigate to page 'service/manage-workloads/*/compute-cloud/automation/workload'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_storage/p_object_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/manage-workloads/.*/compute-cloud/automation/storage?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_storage/p_object_1'))

"Step 22: Click on p  -> Navigate to page 'service/manage-workloads/*/compute-cloud/automation/storage'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_workload/p_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/manage-workloads/.*/compute-cloud/automation/workload?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_workload/p_object'))

"Step 23: Click on p  -> Navigate to page 'service/manage-workloads/*/compute-cloud/automation/workload'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_storage/p_object_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/manage-workloads/.*/compute-cloud/automation/storage?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_storage/p_object_1'))

"Step 24: Click on p  -> Navigate to page 'service/manage-workloads/*/compute-cloud/automation/storage'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_workload/p_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/manage-workloads/.*/compute-cloud/automation/workload?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_workload/p_object'))

"Step 25: Click on p  -> Navigate to page 'service/manage-workloads/*/compute-cloud/automation/workload'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_storage/p_object_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/manage-workloads/.*/compute-cloud/automation/storage?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_storage/p_object_1'))

"Step 26: Click on p"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_workload/p_object_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/manage-workloads/.*/compute-cloud/automation/workload?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_workload/p_object_1'))

"Step 27: Perform input and div actions"

WebUI.takeScreenshot()

performInputAndDivActions.execute(data_path_0, Integer.valueOf(index_0))

"Step 28: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC80-Verify Network and Storage Management in Compute Cloud Automation Workload_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
