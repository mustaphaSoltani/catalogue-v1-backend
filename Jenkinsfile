def HTTP_PORT="8090"
node{

 stage('Initialize'){
        def mavenHome  = tool 'maven 3.6.0'
        env.PATH = "${mavenHome}/bin:${env.PATH}"
    }

    stage('Checkout') {
        checkout scm
    }
    stage('Build') {

         sh 'mvn clean install'

     }



   }