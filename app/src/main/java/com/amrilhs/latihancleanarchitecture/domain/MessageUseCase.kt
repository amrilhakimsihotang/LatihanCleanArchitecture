package com.amrilhs.latihancleanarchitecture.domain

interface MessageUseCase {
    fun getMessage(name: String): MessageEntity
}