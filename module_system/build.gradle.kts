import lib.dependAndroidView
import lib.dependAndroidKtx
import lib.dependNetwork
import lib.dependRxjava

plugins {
//    id("module-manager")
  id("module-debug")
}

dependAndroidView()
dependAndroidKtx()
dependNetwork()
dependRxjava()