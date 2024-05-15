pipeline {
  agent any
  stages {
    stage('Git checkout') {
      steps {
        git(url: 'https://github.com/emarrugor1/reactive-api', branch: 'master', credentialsId: 'github_credentials')
      }
    }

    stage('log') {
      steps {
        sh 'ls -la'
      }
    }

    stage('Build gradle') {
      steps {
        sh "chmod +x gradlew"
        sh "./gradlew clean build --no-daemon"
      }
    }
    stage('SonarQube analysis') {
    steps {
    withSonarQubeEnv() { // Will pick the global server connection you have configured
              sh './gradlew sonarqube'
            }
    }
  }
}
