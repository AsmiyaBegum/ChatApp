package com.ab.data

import com.ab.data.model.Message

interface MessageDataSource {
    suspend fun getAllMessages() : List<Message>

    suspend fun insertMessage(message: Message)
}