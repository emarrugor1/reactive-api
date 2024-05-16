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
        sh 'chmod +x gradlew'
        sh './gradlew clean build --no-daemon'
      }
    }

    stage('Sonar') {
      steps {
        withSonarQubeEnv(installationName: 'sonarqube', credentialsId: 'jenkins-sonar', envOnly: true) {
          sh './gradlew sonar'
        }

      }
    }

  }
}