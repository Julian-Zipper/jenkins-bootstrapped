pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}
pipelineJob('recipeJob') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/Julian-Zipper/cicd-demo.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}