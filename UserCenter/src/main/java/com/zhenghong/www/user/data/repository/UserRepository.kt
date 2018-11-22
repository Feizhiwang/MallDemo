package com.zhenghong.www.user.data.repository

import com.zhenghong.www.base.data.net.RetrofitFactory
import com.zhenghong.www.base.data.protocol.BaseResp
import com.zhenghong.www.user.data.api.UserApi
import com.zhenghong.www.user.data.protocol.RegisterReq
import retrofit2.Retrofit
import rx.Observable

class UserRepository {
    fun register(mobile: String, pwd: String, verifyCode: String): Observable<BaseResp<String>> {
        return RetrofitFactory.instantce.create(UserApi::class.java).register(RegisterReq(mobile, pwd, verifyCode))
    }
}