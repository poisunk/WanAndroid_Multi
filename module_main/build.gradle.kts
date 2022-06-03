import api.dependApiLogin
import api.dependApiTest
import lib.dependAndroidKtx
import lib.dependAndroidView

plugins {
  id("module-manager")
}

dependAndroidView()
dependAndroidKtx()

dependApiTest()
dependApiLogin()

dependencies {
  implementation(project(":module_test:api_test"))
}