package com.amrilhs.latihancleanarchitecture.di

import com.amrilhs.latihancleanarchitecture.data.IMessageDataSource
import com.amrilhs.latihancleanarchitecture.data.MessageDataSource
import com.amrilhs.latihancleanarchitecture.data.MessageRepository
import com.amrilhs.latihancleanarchitecture.domain.IMessageRepository
import com.amrilhs.latihancleanarchitecture.domain.MessageInteractor
import com.amrilhs.latihancleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase{
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()

    }
}