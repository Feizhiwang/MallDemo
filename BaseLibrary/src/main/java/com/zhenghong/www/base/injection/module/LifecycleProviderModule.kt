package com.zhenghong.www.base.injection.module

import android.app.Activity
import com.trello.rxlifecycle.LifecycleProvider
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LifecycleProviderModule(private val lifecycleProvider: LifecycleProvider<*>) {

    @Provides
    fun provicesLifecycleProvider(): LifecycleProvider<*> {
        return lifecycleProvider
    }
}