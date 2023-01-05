package com.frogobox.research.data.api.sample

import com.frogobox.research.data.api.ApiService

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

    class Creator {
        fun newInstance(baseUrl: String): SampleApi {
            return ApiService.create(baseUrl)
        }
    }

}