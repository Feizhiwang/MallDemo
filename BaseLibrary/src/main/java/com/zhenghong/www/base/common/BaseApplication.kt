package com.zhenghong.www.base.common

import android.app.Application
import com.zhenghong.www.base.injection.component.AppComponent
import com.zhenghong.www.base.injection.component.DaggerAppComponent
import com.zhenghong.www.base.injection.module.AppModule

class BaseApplication: Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        initAppInjection()
    }

    private fun initAppInjection() {
        appComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }
}