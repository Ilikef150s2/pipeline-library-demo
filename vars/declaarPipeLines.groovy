 libraries {
     lib('pipeline-library-demo')
 }

 pipeline {
  agent { any
         stages {
     stage('Demo') {
     echo 'Hello world'
     sayHello 'Dave'
 }
        }

 }




