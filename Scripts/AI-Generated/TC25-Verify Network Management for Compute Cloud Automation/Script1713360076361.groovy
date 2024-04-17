import katalon.truetest.TrueTestScripts
import com.kms.katalon.core.model.FailureHandling
import katalon.common.manageNetworksComputeCloudAutomation
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.common.manageComputeCloudEnvAutomationWorkloads
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

"Step 3: Manage compute cloud environment automation workloads"

WebUI.takeScreenshot()

manageComputeCloudEnvAutomationWorkloads.execute(data_path_0, Integer.valueOf(index_0))

"Step 4: Manage networks for compute cloud automation"

WebUI.takeScreenshot()

manageNetworksComputeCloudAutomation.execute(data_path_1, Integer.valueOf(index_1))

"Step 5: Click on input field"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_networks/input_object_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/manage-workloads/.*/compute-cloud/automation/networks?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_networks/input_object_1'))

"Step 6: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC25-Verify Network Management for Compute Cloud Automation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
