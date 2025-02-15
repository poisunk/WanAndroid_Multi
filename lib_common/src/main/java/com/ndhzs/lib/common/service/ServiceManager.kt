package com.ndhzs.lib.common.service

import androidx.fragment.app.Fragment
import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.launcher.ARouter
import kotlin.reflect.KClass

/**
 * 对服务获取的封装，便于以后修改为其他依赖注入的框架，建议都通过该文件提供的方法获取服务，
 * 不采用 @Autowired 的方式，便于以后更换实现。
 * 使用方法：
 *     1. 在service包中创建对应的服务接口并继承IProvider接口，命名请加上代表接口的I前缀和Service后缀，例如IAccountService；
 *     2. 创建该接口的实现类，命名尽量只去掉I即可，然后加上路由注解，路由地址统一写到RoutingTable中，例如AccountService；
 *     3. 通过ServiceManager.的方式获取实现类。
 */
@Suppress("UNCHECKED_CAST")
object ServiceManager {
  
  operator fun <T : Any> invoke(serviceClass: KClass<T>): T {
    return ARouter.getInstance().navigation(serviceClass.java)
  }
  
  operator fun <T : Any> invoke(servicePath: String): T {
    return ARouter.getInstance().build(servicePath).navigation() as T
  }
  
  fun fragment(servicePath: String, with: (Postcard.() -> Unit)? = null): Fragment {
    return ARouter.getInstance()
      .build(servicePath)
      .apply { with?.invoke(this) }
      .navigation() as Fragment
  }
  
  fun activity(servicePath: String, with: (Postcard.() -> Unit)? = null) {
    ARouter.getInstance()
      .build(servicePath)
      .apply { with?.invoke(this) }
      .navigation()
  }
}