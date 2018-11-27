package com.zhenghong.www.base.injection.module

import android.content.Context
import com.zhenghong.www.base.common.BaseApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
@Singleton
class AppModule( private val context: BaseApplication) {

    @Provides
    @Singleton
    fun provicesActivity(): Context {
        return context
    }
}