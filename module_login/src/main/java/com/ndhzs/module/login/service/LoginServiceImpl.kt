package com.ndhzs.module.login.service

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.learn.api.login.ILoginService
import com.ndhzs.lib.common.config.LOGIN_SERVICE
import com.ndhzs.module.login.page.ui.LoginActivity

/**
 *创建者： poisunk
 *邮箱：1714480752@qq.com
 */
@Route(path = LOGIN_SERVICE)
class LoginServiceImpl : ILoginService {

    private val mDataLive = MutableLiveData<ILoginService.Data>()

    override fun startLoginActivity(context: Context) {
        LoginActivity.start(context)
    }

    override fun getData() = mDataLive.value

    override val liveData: LiveData<ILoginService.Data>
        get() = mDataLive

    override fun init(context: Context?) {
    }
}