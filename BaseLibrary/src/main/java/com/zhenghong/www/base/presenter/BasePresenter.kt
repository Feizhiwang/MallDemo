package com.zhenghong.www.base.presenter

import com.zhenghong.www.base.presenter.view.BaseView

open class BasePresenter<T: BaseView>{
    lateinit var mView:T
}
