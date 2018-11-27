package com.zhenghong.www.user.injection.component

import com.zhenghong.www.user.injection.module.UserModule
import com.zhenghong.www.user.ui.activity.RegisterActivity
import dagger.Component

@Component( modules = arrayOf(UserModule::class))
interface UserComponent {

    fun inject(activity: RegisterActivity)
}