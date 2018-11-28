package com.zhenghong.www.user.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.zhenghong.www.base.ui.activity.BaseMvpActivity
import com.zhenghong.www.user.R
import com.zhenghong.www.user.injection.component.DaggerUserComponent
import com.zhenghong.www.user.presenter.RegisterPresenter
import com.zhenghong.www.user.presenter.view.RegisterView
import kotlinx.android.synthetic.main.activity_register.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast
import javax.inject.Inject

class RegisterActivity : BaseMvpActivity<RegisterPresenter>(), RegisterView {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)


        mRegisterBtn.setOnClickListener {
            mPresenter.register(
                mMobileEt.text.toString().trim(),
                mPwdEt.text.toString(),
                mVerifyCodeEt.text.toString().trim()
            )
        }
    }

    override fun injectComponent() {
        DaggerUserComponent.builder()
            .activityComponent(activityComponent)
            .build().inject(this)
        mPresenter.mView = this
    }

    override fun onRegisterResult(result: String) {
        toast("login result: $result")

    }

}
