package com.zhenghong.www.user.service.impl

import com.zhenghong.www.base.data.protocol.BaseResp
import com.zhenghong.www.base.rx.BaseException
import com.zhenghong.www.user.data.repository.UserRepository
import com.zhenghong.www.user.service.UserService
import rx.Observable
import rx.functions.Func1

class UserServiceImpl: UserService {
    override fun register(mobile: String, pwd: String, verifyCode: String): Observable<Boolean> {
        val repository = UserRepository()
        return repository.register(mobile, pwd, verifyCode)
            .flatMap {
                if (it.status != 0) {
                    Observable.error(BaseException(it.status, it.message))
                } else {
                    Observable.just(true)
                }
                Observable.just(true)


            }
    }
}