package com.frogobox.research.ui.main

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.frogobox.research.common.base.BaseBindActivity
import com.frogobox.research.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseBindActivity<ActivityMainBinding>() {

    companion object {
        private val TAG: String = MainActivity::class.java.simpleName
    }

    private val viewModel: MainViewModel by viewModels()

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