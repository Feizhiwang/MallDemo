package com.zhenghong.www.user.presenter

import android.util.Log
import android.widget.Toast
import com.zhenghong.www.base.ext.execute
import com.zhenghong.www.base.presenter.BasePresenter
import com.zhenghong.www.base.rx.BaseSubscriber
import com.zhenghong.www.user.presenter.view.RegisterView
import com.zhenghong.www.user.service.impl.UserServiceImpl
import rx.Observer
import rx.Subscriber
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

class RegisterPresenter : BasePresenter<RegisterView>() {

    fun register(mobile: String, pwd: String, verifyCode: String) {
        val service = UserServiceImpl()
        service.register(mobile, verifyCode, pwd)
            .execute(object : BaseSubscriber<Boolean>() {
                override fun onNext(t: Boolean) {
                    mView.onRegisterResult(t)
                }

                override fun onCompleted() {
                }

                override fun onError(e: Throwable) {
                }
            })
    }
}