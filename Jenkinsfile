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
            	sh 'katalonc.sh -projectPath="$(pwd)":/tmp/project -browserType="Chrome" -retry=0 -statusDelay=15 -testSuitePath="Test Suites/test maximize windows" -executionProfile="default" -apiKey="7fdff4d4-2084-40e1-95e3-08033a018e6f" --config -webui.autoUpdateDrivers=true'
            }
        }
    }
}
