import com.belizwp.ig.MyConfig

plugins {
    alias(libs.plugins.ig.android.library)
}

android {
    namespace = "com.belizwp.model"

    compileSdk = MyConfig.TARGET_SDK
}
