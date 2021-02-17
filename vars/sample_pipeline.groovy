pipeline {
            agent any
                    stages {
                          stage ("the 1st stage") {
                          steps {
                                  echo "this is the first step in the first stage"
                               }
                                                  }
                           }
        }
