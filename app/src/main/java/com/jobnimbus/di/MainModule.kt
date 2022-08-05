package com.jobnimbus.di

import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.Module

/* --- Old Way ---
val appModule = module {
    single<IMainRepository> { MainRepository() }
    factory { MainUseCase(get()) }
    viewModel { MainViewModel(get()) }
}
*/
@Module
@ComponentScan("com.jobnimbus")
class MainModule