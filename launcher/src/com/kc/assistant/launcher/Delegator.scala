package com.kc.assistant.launcher

import com.kc.assistant.common.Command

object Delegator {

    def analyzeInput(line: String): Unit = {

        if(line == null || line.isEmpty()) {
            println("Empty String")
            return
        }
        var input = line.split(" ")
        try {
        	Command.withName(input(0))
        }catch {
            case nse:NoSuchElementException => println("Invalid command")
        }
    }

}