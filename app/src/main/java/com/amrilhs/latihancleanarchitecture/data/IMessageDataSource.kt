package com.amrilhs.latihancleanarchitecture.data

import com.amrilhs.latihancleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name:String): MessageEntity
}