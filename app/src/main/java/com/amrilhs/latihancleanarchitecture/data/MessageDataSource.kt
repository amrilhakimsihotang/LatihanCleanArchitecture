package com.amrilhs.latihancleanarchitecture.data

import com.amrilhs.latihancleanarchitecture.domain.MessageEntity

class MessageDataSource : IMessageDataSource {
    override fun getMessageFromSource(name: String) = MessageEntity(
        "Hello $name! Welcome to Clean Architecture"
    )

}