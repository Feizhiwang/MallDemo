package com.zhenghong.www.base.rx

data class BaseException(val status: Int, val msg:String): Throwable() {
}