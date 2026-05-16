<<<<<<< HEAD
pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }docker run -d --name jenkins -p 9090:8080 -p 50000:50000 -v jenkins_home:/var/jenkins_home jenkins/jenkins:lts

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
=======
pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
>>>>>>> e4b4921050dfc5277d5fa1bb29368567ccfeb962
}