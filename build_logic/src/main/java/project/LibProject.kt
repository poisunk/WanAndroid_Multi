package project

import lib.dependLibCommon
import project.base.BaseLibraryProject

/**
 * ...
 * @author 985892345 (Guo Xiangrui)
 * @email 2767465918@qq.com
 * @date 2022/5/28 12:21
 */
object LibProject : BaseLibraryProject() {
  override fun initProject() {
    dependLibCommon()
  }
  
  override fun isDependChildModule(): Boolean {
//    if (name == "lib_account") {
//      println(name)
//      return false
//    }
    return super.isDependChildModule()
  }
}