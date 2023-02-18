package com.frogobox.research.ui.main

import android.util.Log
import com.frogobox.research.common.base.BaseViewModel
import com.frogobox.research.common.callback.DataResponseCallback
import com.frogobox.research.common.delegate.PreferenceDelegates
import com.frogobox.research.data.remote.sample.SampleResponse
import com.frogobox.research.repository.sample.SampleRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * Created by Faisal Amir on 24/10/22
 * -----------------------------------------
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) Frogobox ID / amirisback
 * All rights reserved
 */

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: SampleRepository,
    private val preferenceDelegates: PreferenceDelegates
): BaseViewModel() {

    fun getData() {
        repository.getSampleDataFromServer(object : DataResponseCallback<List<SampleResponse>> {
            
            override fun onSuccess(data: List<SampleResponse>) {
                Log.d("MainViewModel","onSuccess")
            }

            override fun onFailed(statusCode: Int, errorMessage: String) {
                Log.d("MainViewModel","onFailed")
            }

            override fun onFinish() {
                Log.d("MainViewModel","onFinish")
            }

            override fun onHideProgress() {
                Log.d("MainViewModel","onHideProgress")
            }

            override fun onShowProgress() {
                Log.d("MainViewModel","onShowProgress")
            }
        })
        
    }
    
}