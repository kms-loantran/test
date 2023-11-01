pipeline {
    agent { 
    	docker {
      		image 'katalonstudio/katalon'
      		args '-u root'
    	}
    }
    stages {
        stage('Test') {
            steps {
            	sh 'katalonc.sh -projectPath="$(pwd)" -browserType="Chrome" -retry=0 -statusDelay=15 -testSuiteCollectionPath="Test Suites/lauch google page and close it - collectioni" -executionProfile="default" -apiKey="a5c1f077-2ee0-4584-ba26-978ee2e11484" --config -webui.autoUpdateDrivers=true'
            }
        }
    }
}
