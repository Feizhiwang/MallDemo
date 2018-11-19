package com.zhenghong.www.user.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.zhenghong.www.user.R
import org.jetbrains.anko.startActivity

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        startActivity<LoginActivity>("id" to 10);
    }
}
