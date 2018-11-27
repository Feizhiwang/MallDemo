package com.zhenghong.www.user.injection.module

import com.zhenghong.www.user.service.UserService
import com.zhenghong.www.user.service.impl.UserServiceImpl
import dagger.Module
import dagger.Provides

@Module
class UserModule {

    @Provides
    fun providesUserService(service: UserServiceImpl): UserService {
        return service
    }
}