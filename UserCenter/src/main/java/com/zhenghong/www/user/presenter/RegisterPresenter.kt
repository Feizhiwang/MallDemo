package com.zhenghong.www.user.presenter

import com.zhenghong.www.base.presenter.BasePresenter
import com.zhenghong.www.user.presenter.view.RegisterView

class RegisterPresenter: BasePresenter<RegisterView>() {

    fun register(mobile: String, verifyCode: String) {
        mView.onRegisterResult(true)
    }
}