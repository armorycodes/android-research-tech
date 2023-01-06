package com.frogobox.research.common.callback

import com.frogobox.research.common.base.BaseResponseCallback

/**
 * Created by Faisal Amir on 06/01/23
 * -----------------------------------------
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) Frogobox ID / amirisback
 * All rights reserved
 */


interface DataResponseCallback<T> : BaseResponseCallback {
    fun onSuccess(data: T)
}