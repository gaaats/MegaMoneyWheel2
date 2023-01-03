package com.skgames.trafficriderp.mainactivivivi

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.facebook.applinks.AppLinkData
import com.orhanobut.hawk.Hawk
import com.skgames.trafficriderp.mainclaaas.GooddderClasssa.Companion.geomeogtgt
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import com.skgames.trafficriderp.accctifiilelr.OneeeFillActivity
import com.skgames.trafficriderp.databinding.ActivityMainBinding
import com.skgames.trafficriderp.gaaaame.others.Costya.liiin
import com.skgames.trafficriderp.gaaaame.others.Costya.proip
import com.skgames.trafficriderp.gaaaame.utitti.SsssserviceApi
import com.skgames.trafficriderp.mainclaaas.GooddderClasssa
import com.skgames.trafficriderp.mainclaaas.GooddderClasssa.Companion.countryCodefrrfrfrfrrf



class MainActivity : AppCompatActivity() {


    private suspend fun vcvcvcvc() {
        val hyyhhyyjjj = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(proip)
            .build()
            .create(SsssserviceApi::class.java)
        val oiuiyyy = hyyhhyyjjj.getData().body()?.countryCodefgtgt56556

        Hawk.put(countryCodefrrfrfrfrrf, oiuiyyy)
    }

    fun vfvfbbghhh(context: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            context
        ) { appLinkData: AppLinkData? ->
            appLinkData?.let {
                val value = appLinkData.targetUri.host.toString()
                Hawk.put(GooddderClasssa.DEEPLfrfrfrfr, value)
            }
            if (appLinkData == null) {
            }
        }
    }

    private suspend fun hyhy() {

        val bnbnbn = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(liiin)
            .build()
            .create(SsssserviceApi::class.java)
        val hhhhhhh = bnbnbn.getDataDev().body()?.gyhyhyfrfr.toString()
        val uuuuuuu = bnbnbn.getDataDev().body()?.appsCheckergtgttgtgt556.toString()
        val vvvvv = bnbnbn.getDataDev().body()?.geofgtt55.toString()

        Hawk.put(GooddderClasssa.linkfrrrfrffr, hhhhhhh)
        Hawk.put(GooddderClasssa.appsCheckfrr6, uuuuuuu)
        Hawk.put(GooddderClasssa.geomeogtgt, vvvvv)

    }

    private lateinit var mainBinding: ActivityMainBinding

    private fun kkkkkkk():String?{
        return Hawk.get(geomeogtgt, null)
    }


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)



        vfvfbbghhh(this)

        Toast.makeText(this, "Checking internet connection...", Toast.LENGTH_SHORT).show()

        val service = Executors.newSingleThreadScheduledExecutor()
        var cccccccc: String? = kkkkkkk()
        var gbbgbbggbgbbg: String? = Hawk.get(countryCodefrrfrfrfrrf, null)

        service.scheduleAtFixedRate({
            if (gbbgbbggbgbbg != null && cccccccc != null) {
                service.shutdown()
                mkmkkmmk()
            } else {
                gbbgbbggbgbbg = Hawk.get(countryCodefrrfrfrfrrf)
                cccccccc = Hawk.get(geomeogtgt)
            }
        }, 0, 1, TimeUnit.SECONDS)

        GlobalScope.launch(Dispatchers.IO) {
            kiikikikikki
        }
    }


    private val kiikikikikki: Job = GlobalScope.launch(Dispatchers.IO) {
        vcvcvcvc()
        hyhy()
    }

    private fun mkmkkmmk() {
        val bbbbbbb = Intent(this@MainActivity, OneeeFillActivity::class.java)
        startActivity(bbbbbbb)
        ojojjooj()
    }

    private fun ojojjooj() {
        finish()
    }


}