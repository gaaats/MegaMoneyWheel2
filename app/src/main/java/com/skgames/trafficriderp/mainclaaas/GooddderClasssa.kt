package com.skgames.trafficriderp.mainclaaas

import android.app.Application
import com.onesignal.OneSignal
import com.orhanobut.hawk.Hawk

class GooddderClasssa:Application() {

    companion object {
        val hjhjhjhjhj = "gjgjgjgjgjgjgjgj"
        val cccccccc = "com.skgames.trafficriderp"
        var countryCodefrrfrfrfrrf: String? = "countryCode"
        const val oneSfrgtftrgt = "36e2be25-ead6-492b-91fe-24ecd8e188e7"
        var appsCheckfrr6 = "appsChecker"
        var linkfrrrfrffr = "link"
        var geomeogtgt = "geo"
        var C1gttggtgt: String? = "c11"
        var MAIN_IDffrrfrrf: String? = "mainid"
        var DEEPLfrfrfrfr: String? = "d11"

    }

    override fun onCreate() {
        super.onCreate()
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        gjtgjgtgtjgtjtg()
        OneSignal.setAppId(oneSfrgtftrgt)
        Hawk.init(this).build()
    }

    private fun gjtgjgtgtjgtjtg() {
        OneSignal.initWithContext(this)
    }

}