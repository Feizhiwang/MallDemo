package com.zhenghong.www.base.injection.component

import android.content.Context
import com.zhenghong.www.base.injection.module.AppModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {

    fun context(): Context


}