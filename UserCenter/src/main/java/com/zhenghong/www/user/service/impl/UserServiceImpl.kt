package com.zhenghong.www.user.service.impl

import com.zhenghong.www.base.data.protocol.BaseResp
import com.zhenghong.www.base.rx.BaseException
import com.zhenghong.www.base.rx.BaseFuncBoolean
import com.zhenghong.www.user.data.repository.UserRepository
import com.zhenghong.www.user.service.UserService
import rx.Observable
import rx.functions.Func1
import javax.inject.Inject

class UserServiceImpl @Inject constructor() : UserService {
    @Inject
    lateinit var repository: UserRepository

    override fun register(mobile: String, pwd: String, verifyCode: String): Observable<Boolean> {
        return repository.register(mobile, pwd, verifyCode)
            .flatMap(BaseFuncBoolean())
    }
}