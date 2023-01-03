package com.skgames.trafficriderp.accctifiilelr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.orhanobut.hawk.Hawk
import com.skgames.trafficriderp.R
import com.skgames.trafficriderp.gaaaame.GammiiiActivity
import com.skgames.trafficriderp.mainclaaas.GooddderClasssa
import com.skgames.trafficriderp.mainclaaas.GooddderClasssa.Companion.MAIN_IDffrrfrrf
import com.skgames.trafficriderp.mainclaaas.GooddderClasssa.Companion.appsCheckfrr6
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class OneeeFillActivity : AppCompatActivity() {

    val nooolik = "0"

    private fun bgbgbgbghhhh() {

        val ukikikilo = nnhnhjjjjj()

        if (ukikikilo == nooolik) {
            intALonehyhyyfrrf()

        } else {
            GlobalScope.launch(Dispatchers.Default) {
                eddddeee()
            }
            loolloppppp()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oneee_fill)
        Toast.makeText(this, "Loading data", Toast.LENGTH_SHORT).show()
        bgbgbgbghhhh()
    }

    private fun nnhnhjjjjj(): String? {
        val vcvcvfff: String? = Hawk.get(appsCheckfrr6)
        return vcvcvfff
    }


    private fun intALonehyhyyfrrf() {
        val ddede = Intent(this@OneeeFillActivity, GammiiiActivity::class.java)
        hyyhhyyhhy()
        startActivity(ddede)
        finish()
    }

    private fun hyyhhyyhhy() {
        Hawk.put(GooddderClasssa.geomeogtgt, null)
        Hawk.put(GooddderClasssa.countryCodefrrfrfrfrrf, null)
        Hawk.put(appsCheckfrr6, null)
    }

    private fun eddddeee() {
        val client = AdvertisingIdClient(applicationContext)
        client.start()
        val value = client.info.id
        Hawk.put(MAIN_IDffrrfrrf, value)
    }

    private fun loolloppppp() {
        val loolpppkjhhh = Intent(this@OneeeFillActivity, TvooooFilltActivity::class.java)
        startActivity(loolpppkjhhh)
        finish()
    }

}