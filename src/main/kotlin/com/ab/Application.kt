package com.ab

import com.ab.plugins.*
import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)

    // EngieMain.main will trigger the application module
}

fun Application.module() {
    // Feature needed in server we added here
    configureSockets()
    configureSerialization()
    configureMonitoring()
    configureSecurity()
    configureRouting()
}
