package com.ndhzs.module.system.page.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.ndhzs.lib.common.extensions.mapOrCatchApiException
import com.ndhzs.lib.common.extensions.safeSubscribeBy
import com.ndhzs.module.system.bean.Navigation
import com.ndhzs.module.system.network.NavigationService
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers
import java.lang.Exception

/**
author : Watermelon02
email : 1446157077@qq.com
date : 2022/5/31 15:48
 */
class NavigationViewModel : ViewModel() {
    fun getNavigation(successAction: (Navigation) -> Unit) {
        NavigationService.INSTANCE

    }
}