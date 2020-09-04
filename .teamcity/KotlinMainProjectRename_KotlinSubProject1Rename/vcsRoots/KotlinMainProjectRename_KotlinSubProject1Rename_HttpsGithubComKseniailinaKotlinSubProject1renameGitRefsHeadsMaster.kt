package KotlinMainProjectRename_KotlinSubProject1Rename.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

object KotlinMainProjectRename_KotlinSubProject1Rename_HttpsGithubComKseniailinaKotlinSubProject1renameGitRefsHeadsMaster : GitVcsRoot({
    uuid = "a81a6cdc-1156-4b0f-b95a-dcc940485c43"
    name = "https://github.com/kseniailina/kotlin-SubProject1-rename.git#refs/heads/master"
    url = "https://github.com/kseniailina/kotlin-SubProject1-rename.git"
    authMethod = password {
        userName = "kseniailina"
        password = "credentialsJSON:29a36eda-5eec-4d23-bba8-3e6e5efa792f"
    }
})
