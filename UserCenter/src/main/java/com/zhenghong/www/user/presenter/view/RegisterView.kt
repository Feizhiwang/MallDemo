package com.zhenghong.www.user.presenter.view

import com.zhenghong.www.base.presenter.view.BaseView

interface RegisterView: BaseView {
    fun onRegisterResult(result: String)
}