package com.zhenghong.www.user.service.impl

import com.zhenghong.www.user.service.UserService
import rx.Observable

class UserServiceImpl: UserService {
    override fun register(mobile: String, verifyCode: String, pwd: String): Observable<Boolean> {
        return Observable.just(Math.random() > 0.5)
    }
}