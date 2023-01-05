package com.frogobox.research.repository

import com.frogobox.research.data.api.sample.SampleApi
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
    private val api: SampleApi
) : SampleRepository {

}