package com.github.xxz1990.plugtemplate.services

import com.intellij.openapi.project.Project
import com.github.xxz1990.plugtemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
