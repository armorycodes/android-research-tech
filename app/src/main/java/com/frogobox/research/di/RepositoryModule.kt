package com.frogobox.research.di

import com.frogobox.research.repository.SampleRepository
import com.frogobox.research.repository.SampleRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

/**
 * Created by Faisal Amir on 06/01/23
 * -----------------------------------------
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) Frogobox ID / amirisback
 * All rights reserved
 */

@Module(includes = [
    NetworkModule::class,
    ServiceModule::class,
    UtilModule::class])
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun getSampleRepository(repository: SampleRepositoryImpl): SampleRepository

}