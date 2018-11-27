package com.zhenghong.www.base.ui.activity

import com.zhenghong.www.base.presenter.BasePresenter
import com.zhenghong.www.base.presenter.view.BaseView
import javax.inject.Inject

abstract class BaseMvpActivity<T: BasePresenter<*>>: BaseActivity(), BaseView {

    @Inject
    lateinit var mPresenter: T

    override fun showLoading() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hideLoading() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onError(text: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}