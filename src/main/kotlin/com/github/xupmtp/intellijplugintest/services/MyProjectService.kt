package com.github.xupmtp.intellijplugintest.services

import com.intellij.openapi.project.Project
import com.github.xupmtp.intellijplugintest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
