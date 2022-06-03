package com.example.learn.api.login

import android.content.Context
import androidx.lifecycle.LiveData
import com.alibaba.android.arouter.facade.template.IProvider
import java.io.Serializable

/**
 *创建者： poisunk
 *邮箱：1714480752@qq.com
 */
interface ILoginService : IProvider{

    fun startLoginActivity(context:Context)

    fun getData():Data?

    val liveData:LiveData<Data>

    data class Data(
        val mes:String
    ):Serializable

}