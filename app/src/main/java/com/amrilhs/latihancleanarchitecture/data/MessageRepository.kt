package com.amrilhs.latihancleanarchitecture.data

import com.amrilhs.latihancleanarchitecture.domain.IMessageRepository

class MessageRepository(private val messageDataSource: IMessageDataSource):IMessageRepository {
    override fun getWelcomeMessage(name: String)= messageDataSource.getMessageFromSource(name)
}