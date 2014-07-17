package com.kc.assistant.common

import scala.collection.immutable.HashMap

object Command extends Enumeration {

    type Command = Value
    val open, search = Value
    
    val mapping: HashMap[Command, String] =
    HashMap((open, "OpenActivity"),
        (search, "SerachActivity"))
        
    def getActivityClass(command: Command.Value): String = {
        return mapping.get(command).get
    }

}

    