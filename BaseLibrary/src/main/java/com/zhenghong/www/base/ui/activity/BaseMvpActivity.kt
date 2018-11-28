package com.zhenghong.www.base.ui.activity

import android.os.Bundle
import android.os.PersistableBundle
import com.zhenghong.www.base.common.BaseApplication
import com.zhenghong.www.base.injection.component.ActivityComponent
import com.zhenghong.www.base.injection.component.DaggerActivityComponent
import com.zhenghong.www.base.injection.module.ActivityModule
import com.zhenghong.www.base.injection.module.LifecycleProviderModule
import com.zhenghong.www.base.presenter.BasePresenter
import com.zhenghong.www.base.presenter.view.BaseView
import javax.inject.Inject

abstract class BaseMvpActivity<T : BasePresenter<*>> : BaseActivity(), BaseView {

    lateinit var activityComponent: ActivityComponent
    @Inject
    lateinit var mPresenter: T

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initActivityInjection()
    }

    private fun initActivityInjection() {
        activityComponent = DaggerActivityComponent.builder()
            .appComponent((application as BaseApplication).appComponent)
            .activityModule(ActivityModule(this))
            .lifecycleProviderModule(LifecycleProviderModule(this))
            .build()
    }

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