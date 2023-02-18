package com.frogobox.research.common.delegate

/**
 * Created by Faisal Amir on 24/10/22
 * -----------------------------------------
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) Frogobox ID / amirisback
 * All rights reserved
 */


class SampleDelegatesImpl : SampleDelegates {

    override fun getTagMainDelegate(): String {
        return SampleDelegatesImpl::class.java.simpleName
    }

}