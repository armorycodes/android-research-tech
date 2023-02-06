package com.frogobox.research.repository.sample

import com.frogobox.research.common.callback.DataResponseCallback
import com.frogobox.research.common.ext.disposedBy
import com.frogobox.research.data.remote.sample.SampleApi
import com.frogobox.research.data.remote.sample.SampleResponse
import com.frogobox.research.repository.DataSourcesImpl
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers
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


class SampleRemoteSourcesImpl @Inject constructor(
    private val api: SampleApi,
) : DataSourcesImpl(), SampleRemoteSources {

    override fun getSample(callback: DataResponseCallback<List<SampleResponse>>) {
        api.getSample().subscribeOn(Schedulers.io())
            .doOnSubscribe {
                callback.onShowProgress()
            }
            .doAfterTerminate {
                callback.onHideProgress()
                callback.onFinish()
            }
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                it.data?.let { it1 -> callback.onSuccess(it1) }
            }, {
                callback.onFailed(500, it.message.toString())
            }).disposedBy(compositeDisposable)

    }


}