package com.github.adminqqz.androidcodetemplate.services

import com.intellij.openapi.project.Project
import com.github.adminqqz.androidcodetemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
