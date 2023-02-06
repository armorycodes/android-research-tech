package com.frogobox.research.repository.sample

import com.frogobox.research.common.callback.DataResponseCallback
import com.frogobox.research.data.remote.sample.SampleResponse
import javax.inject.Inject

/**
 * Created by Faisal Amir on 06/01/23
 * -----------------------------------------
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) Frogobox ID / amirisback
 * All rights reserved
 */


class SampleRepositoryImpl @Inject constructor(
    private val remoteDataSources: SampleRemoteSourcesImpl,
    private val localDataSources: SampleLocalSourcesImpl
) : SampleRepository {

    override fun getSampleDataFromServer(callback: DataResponseCallback<List<SampleResponse>>) {
        remoteDataSources.getSample(callback)
    }

}