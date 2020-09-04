package KotlinMainProjectRename_KotlinSubProject1Rename.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs

object KotlinMainProjectRename_KotlinSubProject1Rename_Build : BuildType({
    uuid = "5245312f-0e8b-469b-aa35-f9768740385f"
    name = "Build"

    vcs {
        root(KotlinMainProjectRename_KotlinSubProject1Rename.vcsRoots.KotlinMainProjectRename_KotlinSubProject1Rename_HttpsGithubComKseniailinaKotlinSubProject1renameGitRefsHeadsMaster)
    }

    steps {
        script {
            scriptContent = """echo "hello""""
        }
    }

    triggers {
        vcs {
        }
    }
})
