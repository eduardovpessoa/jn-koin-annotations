package com.jobnimbus.domain

import com.jobnimbus.data.remote.IMainRepository
import org.koin.core.annotation.Factory
import org.koin.core.annotation.InjectedParam

@Factory
class MainUseCase(@InjectedParam val repository: IMainRepository) {
    operator fun invoke(): String {
        return repository.getMainData()
    }
}