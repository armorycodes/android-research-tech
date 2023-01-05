package com.frogobox.research.common.base

import androidx.fragment.app.Fragment
import com.frogobox.research.common.delegate.SampleDelegate
import com.frogobox.research.common.delegate.SampleDelegateImpl

/**
 * Created by Faisal Amir on 24/10/22
 * -----------------------------------------
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) Frogobox ID / amirisback
 * All rights reserved
 */

abstract class BaseFragment : Fragment(),
    SampleDelegate by SampleDelegateImpl() {

}