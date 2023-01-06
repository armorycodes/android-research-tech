package com.frogobox.research.data.remote.sample

import com.frogobox.research.data.remote.ApiService
import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET

/**
 * Created by Faisal Amir on 24/10/22
 * -----------------------------------------
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) Frogobox ID / amirisback
 * All rights reserved
 */

interface SampleApi {

    // TODO : Add your code here

    @GET("v1/sample/test")
    fun getSample() : Observable<SampleResponse>

    class Creator {
        fun newInstance(baseUrl: String): SampleApi {
            return ApiService.create(baseUrl)
        }
    }

}