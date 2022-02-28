package com.github.shirenran.myideaplugin.services

import com.intellij.openapi.project.Project
import com.github.shirenran.myideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
