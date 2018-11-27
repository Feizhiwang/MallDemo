package com.zhenghong.www.base.injection.component

import android.app.Activity
import android.content.Context
import com.zhenghong.www.base.injection.ActivityScope
import com.zhenghong.www.base.injection.module.ActivityModule
import com.zhenghong.www.base.injection.module.AppModule
import dagger.Component

@ActivityScope
@Component(
    dependencies = [AppComponent::class],
    modules = [ActivityModule::class]
)
interface ActivityComponent {

    fun activity(): Activity


}