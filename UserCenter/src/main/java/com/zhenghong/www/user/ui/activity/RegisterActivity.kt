package com.zhenghong.www.user.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.zhenghong.www.base.ui.activity.BaseMvpActivity
import com.zhenghong.www.user.R
import com.zhenghong.www.user.presenter.RegisterPresenter
import com.zhenghong.www.user.presenter.view.RegisterView
import kotlinx.android.synthetic.main.activity_register.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

class RegisterActivity : BaseMvpActivity<RegisterPresenter>(),RegisterView {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        mPresenter = RegisterPresenter();
        mPresenter.mView = this;

        mRegisterBtn.setOnClickListener {
            mPresenter.register("aa","bb", "")
        }
    }

    override fun onRegisterResult(result: Boolean) {
       toast("login result: $result" )

    }

}
