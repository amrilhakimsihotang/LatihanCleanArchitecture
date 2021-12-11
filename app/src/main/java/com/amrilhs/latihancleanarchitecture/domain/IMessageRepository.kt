package com.amrilhs.latihancleanarchitecture.domain

interface IMessageRepository {
    fun getWelcomeMessage(name:String): MessageEntity
}