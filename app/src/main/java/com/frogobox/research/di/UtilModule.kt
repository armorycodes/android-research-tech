package com.frogobox.research.di

import android.content.Context
import com.frogobox.research.common.delegate.PreferenceDelegates
import com.frogobox.research.common.delegate.PreferenceDelegatesImpl
import com.frogobox.research.data.remote.sample.SampleApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Created by Faisal Amir on 06/01/23
 * -----------------------------------------
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) Frogobox ID / amirisback
 * All rights reserved
 */

@Module
@InstallIn(SingletonComponent::class)
class UtilModule {

    @Provides
    @Singleton
    fun providePreferenceDelegates(@ApplicationContext context: Context): PreferenceDelegates {
        return PreferenceDelegatesImpl(context, "frogo_research_pref")
    }

}