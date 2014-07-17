package com.kc.assistant.activities

import com.kc.assistant.common.Command

trait Activity {

    def execute()
}
import scala.reflect.runtime.universe

object Activity{

    val packageName: String = "com.kc.assistant.activities"

    def getActivity(command: Command.Value): Activity = {
        val activity: String =  packageName + "." + Command.getActivityClass(command)
        
        val runtimeMirror = universe.runtimeMirror(getClass.getClassLoader)
		val module = runtimeMirror.staticModule(activity)
		val obj = runtimeMirror.reflectModule(module)
		obj.instance.asInstanceOf[Activity]
    }

}