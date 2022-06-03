package com.ndhzs.module.main

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.alibaba.android.arouter.launcher.ARouter
import com.example.learn.api.login.ILoginService
import com.ndhzs.api.test.ITestService
import com.ndhzs.lib.common.config.TEST_ENTRY
import com.ndhzs.lib.common.config.TEST_SHOW
import com.ndhzs.lib.common.extensions.toast
import com.ndhzs.lib.common.service.ServiceManager
import com.ndhzs.lib.common.ui.BaseActivity

class MainActivity : BaseActivity() {
  
  private val mBtnOpenTestActivity: Button by R.id.main_btn_open_test_activity.view()
  private val mBtnOpenLoginActivity: Button by R.id.main_btn_open_login_activity.view()

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.main_activity_main)
    
    mBtnOpenTestActivity.setOnClickListener {
      toast("启动 TestActivity")
      ServiceManager(ITestService::class)
        .startTestActivity(
          this,
          ITestService.Data(
            "123", "12345"
          )
        )
    }

    mBtnOpenLoginActivity.setOnClickListener {
      toast("启动 LoginActivity")
      ServiceManager(ILoginService::class)
        .startLoginActivity(
          this
        )
    }
    
    // 观察 liveData
    ServiceManager(ITestService::class).liveData.observe {
      // ......
    }
    

  }
}