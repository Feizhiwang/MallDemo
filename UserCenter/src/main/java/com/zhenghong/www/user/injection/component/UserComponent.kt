package com.zhenghong.www.user.injection.component

import com.zhenghong.www.base.injection.PerComponentScope
import com.zhenghong.www.base.injection.component.ActivityComponent
import com.zhenghong.www.user.injection.module.UserModule
import com.zhenghong.www.user.ui.activity.RegisterActivity
import dagger.Component
@PerComponentScope
@Component( dependencies = [ActivityComponent::class],modules = [UserModule::class])
interface UserComponent {

    fun inject(activity: RegisterActivity)
}