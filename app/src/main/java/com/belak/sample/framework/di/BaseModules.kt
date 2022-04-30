package com.belak.sample.framework.di

import com.belak.sample.view.viewmodels.BaseActivityViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val vmModules = module {
    viewModel { BaseActivityViewModel() }
}
