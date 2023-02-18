package com.frogobox.research.ui.detail

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.frogobox.research.common.base.BaseBindActivity
import com.frogobox.research.common.delegate.PreferenceDelegates
import com.frogobox.research.databinding.ActivityDetailBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class DetailActivity : BaseBindActivity<ActivityDetailBinding>() {

    companion object {
        private val TAG: String = DetailActivity::class.java.simpleName
    }

    private val viewModel: DetailViewModel by viewModels()

    @Inject
    lateinit var preferenceDelegates: PreferenceDelegates

    override fun initBinding(): ActivityDetailBinding {
        return ActivityDetailBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {
            // Call View Model Here
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