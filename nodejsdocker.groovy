pipelineJob('github-demo') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        github('https://github.com/williamowen65/read_voices')
                    }
                }
            }
            scriptPath('Jenkinsfile')
        }
    }
    triggers {
        githubPush()
}
