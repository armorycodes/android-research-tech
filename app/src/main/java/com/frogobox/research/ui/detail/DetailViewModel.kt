package com.frogobox.research.ui.detail

import com.frogobox.research.common.base.BaseViewModel
import com.frogobox.research.common.delegate.PreferenceDelegates
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
class DetailViewModel @Inject constructor(
    private val repository: SampleRepository,
    private val preferenceDelegates: PreferenceDelegates
): BaseViewModel() {


}