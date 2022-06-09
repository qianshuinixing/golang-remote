package com.github.qianshuinixing.golangremote.services

import com.intellij.openapi.project.Project
import com.github.qianshuinixing.golangremote.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
