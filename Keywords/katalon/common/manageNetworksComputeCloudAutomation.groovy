package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable

public class manageNetworksComputeCloudAutomation {
    
    private static def execute_functional_method(Map data) {
        "Step 1: Click on p  -> Navigate to page 'service/manage-workloads/*/compute-cloud/automation/networks'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_workload/p_object_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/manage-workloads/.*/compute-cloud/automation/workload?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_workload/p_object_1'))
        "Step 2: Click on button 'VPC 2.0'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_networks/button_vpc 2_0'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/manage-workloads/.*/compute-cloud/automation/networks?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_networks/button_vpc 2_0'))
        "Step 3: Click on input field"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_networks/input_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/manage-workloads/.*/compute-cloud/automation/networks?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_networks/input_object'))
        "Step 4: Enter input value in input field"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_networks/input_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/manage-workloads/.*/compute-cloud/automation/networks?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_networks/input_object'), data['input_object'])
        "Step 5: Click on span"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_networks/span_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/manage-workloads/.*/compute-cloud/automation/networks?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_networks/span_object'))
        "Step 6: Click on span"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_networks/span_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/manage-workloads/.*/compute-cloud/automation/networks?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_networks/span_object'))
        "Step 7: Click on p  -> Navigate to page 'service/workload-detail/*/compute-cloud/automation/*/*'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_networks/p_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/manage-workloads/.*/compute-cloud/automation/networks?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_manage_workloads_compute_cloud_automation_networks/p_object'))
        "Step 8: Click on button 'VPC 2.0'"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_service_workload_detail_compute_cloud_automation/button_vpc 2_0'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/service/workload-detail/.*/compute-cloud/automation/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_workload_detail_compute_cloud_automation/button_vpc 2_0'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_object'] = testData.getValue('input_object', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_object'] = 'default_data'
        execute_functional_method(data)
    }
    
    public static def execute(String datasource = null, int rowIndex = 1) {
        if (datasource != null) {
            execute_with_data_source(datasource, rowIndex)
        } else {
            execute_without_data_source()
        }
    }
}

