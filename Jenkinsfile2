pipeline {
    agent any 
    stages {
        stage('Test') {
            steps {
                 sh '/usr/local/bin/docker run -t --rm -v "$(pwd)":/tmp/project katalonstudio/katalon katalonc.sh -projectPath=/tmp/project -testSuitePath="Test Suites/New Test Suite" -browserType="Chrome" -executionProfile="default" -apiKey="4d690cd5-048f-419d-bba7-f560c06e7ded" --config -webui.autoUpdateDrivers=true'  
            }
        }
    }
}
