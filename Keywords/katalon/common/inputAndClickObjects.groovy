package katalon.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable

public class inputAndClickObjects {
    
    private static def execute_functional_method(Map data) {
        "Step 1: Click on input field"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_add_vpc_network_compute_cloud_automation/input_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/add-vpc-network/compute-cloud/.*/automation?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_add_vpc_network_compute_cloud_automation/input_object'))
        "Step 2: Enter input value in input field"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_add_vpc_network_compute_cloud_automation/input_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/add-vpc-network/compute-cloud/.*/automation?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.setText(findTestObject('AI-Generated/Page_add_vpc_network_compute_cloud_automation/input_object'), data['input_object'])
        "Step 3: Click on span"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_add_vpc_network_compute_cloud_automation/span_object_2'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/add-vpc-network/compute-cloud/.*/automation?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_add_vpc_network_compute_cloud_automation/span_object_2'))
        "Step 4: Click on div"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_add_vpc_network_compute_cloud_automation/div_object_5'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/add-vpc-network/compute-cloud/.*/automation?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_add_vpc_network_compute_cloud_automation/div_object_5'))
        "Step 5: Click on div"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_add_vpc_network_compute_cloud_automation/div_object_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/add-vpc-network/compute-cloud/.*/automation?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_add_vpc_network_compute_cloud_automation/div_object_1'))
        "Step 6: Click on button"
        WebUI.takeScreenshot()
        WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_add_vpc_network_compute_cloud_automation/button_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)
        WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/add-vpc-network/compute-cloud/.*/automation?/?(?:#.*)?(?:\\?.*)?$', true)
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_add_vpc_network_compute_cloud_automation/button_object'))
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

