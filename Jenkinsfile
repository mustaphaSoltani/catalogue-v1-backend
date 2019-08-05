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


  stage('Sonar'){
          try {
                withCredentials([string(credentialsId: 'SONAR_TOKEN', variable: 'TOKEN')]) {
                               sh "mvn sonar:sonar -Dsonar.login=$TOKEN"
                }

          } catch(error){
              echo "The sonar server could not be reached ${error}"
          }
       }


   }