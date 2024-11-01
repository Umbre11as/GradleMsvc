package code.umbre11as.cppmsvc

import org.gradle.api.Plugin
import org.gradle.api.Project

abstract class CppMsvcPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        println("CppMsvcPlugin#apply")
    }
}
