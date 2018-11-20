package com.zhenghong.www.user.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.zhenghong.www.base.ui.activity.BaseMvpActivity
import com.zhenghong.www.user.R
import com.zhenghong.www.user.presenter.RegisterPresenter
import com.zhenghong.www.user.presenter.view.RegisterView
import org.jetbrains.anko.startActivity

class RegisterActivity : BaseMvpActivity<RegisterPresenter>(),RegisterView {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

    }

    override fun onRegisterResult(result: Boolean) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
