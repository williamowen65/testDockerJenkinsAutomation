pipelineJob('read-voices-test') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        github('williamowen65/read_voices')
                    }
                }
            }
            scriptPath('Jenkinsfile')
        }
    }
    triggers {
        githubPush()
    }
}
