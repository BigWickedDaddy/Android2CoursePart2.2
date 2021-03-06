package com.itis.android2coursepart22.di.module

import android.app.Application
import android.content.Context
import com.itis.android2coursepart22.data.api.mapper.BrewMapper
import dagger.Module
import dagger.Provides
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

@Module
class AppModule {
    @Provides
    fun provideContext(app: Application): Context = app.applicationContext

    @Provides
    fun provideBrewMapper(): BrewMapper = BrewMapper()

    @Provides
    fun provideDefaultDispatcher(): CoroutineDispatcher = Dispatchers.Default
}