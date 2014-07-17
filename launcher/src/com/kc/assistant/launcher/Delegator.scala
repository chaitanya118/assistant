package com.kc.assistant.launcher

import com.kc.assistant.common.Command
import com.kc.assistant.activities.Activity

object Delegator {

    def analyzeInput(line: String): Unit = {

        if(line == null || line.isEmpty()) {
            println("Empty String")
            return
        }
        var input = line.split(" ")
        try {
        	val command: Command.Value = Command.withName(input(0))
        	//execute activity
        	println("Executing " + command)
        	Activity.getActivity(command).execute()

        }catch {
            case nse:NoSuchElementException => println("Invalid command")
        }
    }

}