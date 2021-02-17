 libraries {
     lib('pipeline-library-demo')
 }

 pipeline {
     stage('Demo') {
     echo 'Hello world'
     sayHello 'Dave'
 }

 }




