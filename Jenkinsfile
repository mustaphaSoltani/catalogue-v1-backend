pipeline{
  agent any
     stages{
        stage('compile stage'){
          steps{
            withMaven(maven : '3.6.0'){
              sh'mvn clean compile'
              }
            }
           }
         stage('testing stage'){
         steps{
              withMaven(maven : 'maven 3.6.0'){
                 sh'mvn test'
            }
          }
         }
          stage('deployement stage'){
         steps{
              withMaven(maven : 'maven 3.6.0'){
                sh'mvn deploy'
              }
           }
       }
   }
}