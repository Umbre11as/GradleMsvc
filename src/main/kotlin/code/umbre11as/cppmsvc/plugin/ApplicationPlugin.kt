package code.umbre11as.cppmsvc.plugin

import code.umbre11as.cppmsvc.CppMsvcPlugin
import org.gradle.api.Project

class ApplicationPlugin : CppMsvcPlugin() {

    override fun apply(target: Project) {
        super.apply(target)

        println("ApplicationPlugin#apply")
    }
}
