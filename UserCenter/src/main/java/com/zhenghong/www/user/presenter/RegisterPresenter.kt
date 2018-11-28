package com.zhenghong.www.user.presenter

import com.zhenghong.www.base.ext.execute
import com.zhenghong.www.base.presenter.BasePresenter
import com.zhenghong.www.base.rx.BaseSubscriber
import com.zhenghong.www.user.presenter.view.RegisterView
import com.zhenghong.www.user.service.UserService
import com.zhenghong.www.user.service.impl.UserServiceImpl
import javax.inject.Inject

class RegisterPresenter @Inject constructor() : BasePresenter<RegisterView>() {

    @Inject
    lateinit var userService: UserService

    fun register(mobile: String, pwd: String, verifyCode: String) {
        userService.register(mobile, verifyCode, pwd)
            .execute(object : BaseSubscriber<Boolean>() {
                override fun onNext(t: Boolean) {
                    if(t) {
                        mView.onRegisterResult("register success!!")
                    }

                }

                override fun onCompleted() {
                }

                override fun onError(e: Throwable) {
                    mView.onRegisterResult(e.toString())
                }
            }, lifecycleProvider)
    }
}