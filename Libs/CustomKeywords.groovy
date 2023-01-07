
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String



def static "com.testwithhari.katalon.plugins.Browserstack.updateTestStatusAndReason"(
    	String sessionID	
     , 	String testStatus	
     , 	String reasonForFailure	) {
    (new com.testwithhari.katalon.plugins.Browserstack()).updateTestStatusAndReason(
        	sessionID
         , 	testStatus
         , 	reasonForFailure)
}


def static "com.testwithhari.katalon.plugins.Browserstack.getCurrentTestRunSessionID"() {
    (new com.testwithhari.katalon.plugins.Browserstack()).getCurrentTestRunSessionID()
}


def static "com.testwithhari.katalon.plugins.Browserstack.updateTestName"(
    	String sessionID	
     , 	String TestName	) {
    (new com.testwithhari.katalon.plugins.Browserstack()).updateTestName(
        	sessionID
         , 	TestName)
}
