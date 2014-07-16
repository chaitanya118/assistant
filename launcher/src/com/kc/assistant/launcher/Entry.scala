package com.kc.assistant.launcher

import io.Source.stdin;

object Entry {

    def main(args: Array[String]) {
        
        for(ln <- stdin.getLines) {
            Delegator.analyzeInput(ln)
        }
        
    }
}