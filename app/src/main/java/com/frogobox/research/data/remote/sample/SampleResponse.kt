package com.frogobox.research.data.remote.sample

import com.google.gson.annotations.SerializedName

/**
 * Created by Faisal Amir on 06/01/23
 * -----------------------------------------
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) Frogobox ID / amirisback
 * All rights reserved
 */


data class SampleResponse(
    @SerializedName("data")
    var data: String? = "",
)