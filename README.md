# pipeline-library-demo

Demonstrates how to use a Shared Library in Jenkins pipelines. This repository defines a single function, `sayHello`, which will echo a greeting.

## Setup instructions

1. In Jenkins, go to Manage Jenkins &rarr; Configure System. Under _Global Pipeline Libraries_, add a library with the following settings:

    - Name: `pipeline-library-demo`
    - Default version: Specify a Git reference (branch or commit SHA), e.g. `master`
    - Retrieval method: _Modern SCM_
    - Select the _Git_ type
    - Project repository: `https://github.com/monodot/pipeline-library-demo.git`
    - Credentials: (leave blank)

2. Then create a Jenkins job with the following pipeline (note that the underscore `_` is not a typo):

    ```
    @Library('pipeline-library-demo')_

    stage('Demo') {

      echo 'Hello World'
   
      sayHello 'Dave'

    }
    ```

This will output the following from the build:

```
[Pipeline] stage
[Pipeline] { (Demo)
[Pipeline] echo
Hello world
[Pipeline] echo
Hello, Dave.
[Pipeline] }
[Pipeline] // stage
[Pipeline] End of Pipeline
Finished: SUCCESS
```
#### Summary (TL;DR)
That’s it for my intro to Shared Libraries in Jenkins! As you can see they’re a useful way to share common code that you might use across different Jenkinsfiles.

Here are the important things to remember:

- [ ] You need to use Groovy to write your custom functions or steps  
_To write pipeline steps that you can call from your pipelines (e.g. deployApplication, readConfigFile, etc.):_

- [ ] Create a file in the vars/ directory in your repository, with the name of your custom step

- [ ] The file should implement the [def call()](https://github.com/Ilikef150s2/pipeline-library-demo/blob/58ed215b82c2b1070927316973e21ba4d7330a85/vars/sayHello.groovy#L3) method; you can also define parameters to your step

##### To write other common Groovy code, add it into src/

- [ ] Add your Shared Library in Jenkins using the Configure System screen
Thanks for reading! I hope you’ve found this example Jenkins pipeline library useful.

How are you using Jenkins pipelines? Any feedback please create an issue and I will address after workon this article? You’re very welcome to post your thoughts in the comments section below.



