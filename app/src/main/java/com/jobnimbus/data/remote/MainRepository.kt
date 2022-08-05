package com.jobnimbus.data.remote

import org.koin.core.annotation.Single

@Single
class MainRepository : IMainRepository {
    override fun getMainData(): String {
        return "Koin Annotations Worked! :)"
    }
}