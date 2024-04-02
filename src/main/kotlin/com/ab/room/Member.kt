package com.ab.room

import io.ktor.server.websocket.*
import io.ktor.websocket.*

data class Member(
    val userName : String,
    val sessionId : String,
    val socket: WebSocketSession
)
