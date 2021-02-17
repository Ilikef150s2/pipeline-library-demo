 libraries {
     lib('pipeline-library-demo')
 }

 pipeline {
  agent any
         stages {
     stage('Demo') {
      steps {
     echo 'Hello world'
      }
     sayHello 'Dave'
 }
        }

 }
 




