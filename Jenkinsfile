pipeline {
  environment {
    registry = "progc3/spring-docker"
    registryCredential = 'dockerHub'
  }
  agent any
  stages {
    stage('Clone Image from Github'){
      steps {
        sh 'rm -rf GKEExample'
        sh 'git clone https://github.com/shujaatorujov/GKEExample.git'
        sh 'cd GKEExample/'
      }
    }
    
    stage('Compile and Test project'){
      steps {
        script {
            docker.image('maven').inside {
                          git 'https://github.com/takari/maven-wrapper.git'
                          // begin the sh step with "env &&" for troubleshooting, no need in real life
                          sh 'unset MAVEN_CONFIG && env && ./mvnw clean'
                      }
        }
         sh 'pwd  && ls -al'
         sh 'mvnw clean compile install'
      }

    }
   }
}
