package KotlinMainProjectRename_KotlinSubProject1Rename

import KotlinMainProjectRename_KotlinSubProject1Rename.buildTypes.*
import KotlinMainProjectRename_KotlinSubProject1Rename.vcsRoots.*
import KotlinMainProjectRename_KotlinSubProject1Rename.vcsRoots.KotlinMainProjectRename_KotlinSubProject1Rename_HttpsGithubComKseniailinaKotlinSubProject1renameGitRefsHeadsMaster
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "052d3d4e-74b9-4cde-ab03-141a00a4ea9d"
    id("KotlinMainProjectRename_KotlinSubProject1Rename")
    parentId("KotlinMainProjectRename")
    name = "Kotlin SubProject1 Rename"

    vcsRoot(KotlinMainProjectRename_KotlinSubProject1Rename_HttpsGithubComKseniailinaKotlinSubProject1renameGitRefsHeadsMaster)

    buildType(KotlinMainProjectRename_KotlinSubProject1Rename_Build)

    features {
        versionedSettings {
            id = "PROJECT_EXT_17"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.PREFER_SETTINGS_FROM_VCS
            rootExtId = "${KotlinMainProjectRename_KotlinSubProject1Rename_HttpsGithubComKseniailinaKotlinSubProject1renameGitRefsHeadsMaster.id}"
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
        }
    }
})
