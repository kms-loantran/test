pipeline {
    agent any 
    stages {
        stage('Test') {
            steps {
                 sh '/usr/local/bin/docker run -t --rm -v "$(pwd)":/tmp/project katalonstudio/katalon katalonc.sh -testSuitePath="Test Suites/New Test Suite" -executionProfile="default" -apiKey="b5fa5836-b028-450f-9c3c-9c2e5ad9e36f"'  
            }
        }
    }
}
