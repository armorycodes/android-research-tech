package com.frogobox.research.ui.main

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.frogobox.research.common.base.BaseBindActivity
import com.frogobox.research.common.delegate.PreferenceDelegates
import com.frogobox.research.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : BaseBindActivity<ActivityMainBinding>() {

    companion object {
        private val TAG: String = MainActivity::class.java.simpleName
    }

    private val viewModel: MainViewModel by viewModels()

    @Inject
    lateinit var preferenceDelegates: PreferenceDelegates

    override fun initBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {
            // Call View Model Here
            viewModel.getData()
            Log.d(TAG, "View Model : ${viewModel::class.java.simpleName}")
        }
        Log.d("SampleDelegates Output", getTagMainDelegate())
        // TODO : Add your code here

    }

    override fun initView() {
        super.initView()
        binding.apply {

        }
    }

    override fun initObserver() {
        super.initObserver()
        viewModel.apply {

        }
    }

}