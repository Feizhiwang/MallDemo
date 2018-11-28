package com.zhenghong.www.base.presenter

import com.trello.rxlifecycle.LifecycleProvider
import com.zhenghong.www.base.presenter.view.BaseView
import javax.inject.Inject

open class BasePresenter<T: BaseView>{
    lateinit var mView:T
    @Inject
    lateinit var lifecycleProvider: LifecycleProvider<*>

}
