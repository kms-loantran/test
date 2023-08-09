
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
            	sh 'katalonc.sh -projectPath="/Users/loantran/.jenkins/workspace/vicky - docker" -browserType="Chrome" -retry=0 -statusDelay=15 -testSuitePath="Test Suites/test maximize windows" -executionProfile="default" -apiKey="7fdff4d4-2084-40e1-95e3-08033a018e6f" --config -webui.autoUpdateDrivers=true'
            }
        }
    }
    post {
        always {
            archiveArtifacts artifacts: 'Reports/**/*.*', fingerprint: true
            junit 'Reports/**/JUnit_Report.xml'
        }
    }
}
