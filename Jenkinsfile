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
        sh 'mvn -version'
        sh 'mvn clean compile install'
      }
    }
   }
}
