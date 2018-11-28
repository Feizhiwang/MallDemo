package com.zhenghong.www.base.injection.module

import android.app.Activity
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ActivityModule(private val activity: Activity) {

    @Provides
    fun provicesActivity(): Activity {
        return activity
    }
}