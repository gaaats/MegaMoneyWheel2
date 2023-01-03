package com.skgames.trafficriderp.brovseravtiv

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.*
import androidx.appcompat.app.AppCompatActivity
import android.provider.MediaStore
import android.util.Log
import android.webkit.*
import android.widget.Toast
import com.appsflyer.AppsFlyerLib
import com.google.android.material.snackbar.Snackbar
import com.onesignal.OneSignal
import com.orhanobut.hawk.Hawk
import com.skgames.trafficriderp.R
import com.skgames.trafficriderp.databinding.ActivityBrovisierBinding
import com.skgames.trafficriderp.mainclaaas.GooddderClasssa.Companion.C1gttggtgt
import com.skgames.trafficriderp.mainclaaas.GooddderClasssa.Companion.DEEPLfrfrfrfr
import com.skgames.trafficriderp.mainclaaas.GooddderClasssa.Companion.MAIN_IDffrrfrrf
import com.skgames.trafficriderp.mainclaaas.GooddderClasssa.Companion.cccccccc
import com.skgames.trafficriderp.mainclaaas.GooddderClasssa.Companion.linkfrrrfrffr
import org.json.JSONException
import org.json.JSONObject
import java.io.File
import java.io.IOException

class BrovisierActivity : AppCompatActivity() {


    override fun onBackPressed() {
        if (cdccdcd.canGoBack()) {
            if (bbbbbtgtghyhy) {
                cdccdcd.stopLoading()
                cdccdcd.loadUrl(ccdcdcdcdf)
            }
            this.bbbbbtgtghyhy = true
            cdccdcd.goBack()
            Handler(Looper.getMainLooper()).postDelayed(Runnable {
                bbbbbtgtghyhy = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }

    private fun bvbvvb() {
        val vfvfvf = cdccdcd.settings
        vfvfvf.javaScriptEnabled = true

        vfvfvf.useWideViewPort = true
        vfvfvf.allowFileAccess = true
        vfvfvf.domStorageEnabled = true

        vfvfvf.loadWithOverviewMode = true

        vfvfvf.userAgentString = vfvfvf.userAgentString.replace("; wv", "")

        vfvfvf.javaScriptCanOpenWindowsAutomatically = true
        vfvfvf.setSupportMultipleWindows(false)
        vfvfvf.builtInZoomControls = true
        vfvfvf.displayZoomControls = false

        vfvfvf.setSupportZoom(true)

        vfvfvf.pluginState = WebSettings.PluginState.ON
        vfvfvf.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        vfvfvf.setAppCacheEnabled(true)

        vfvfvf.allowContentAccess = true
    }

    private val gggg = 1

    var jjkkjk: ValueCallback<Array<Uri>>? = null
    lateinit var cdccdcd: WebView

    var ccdcdcdcdf = ""
    fun saaave(lurlurlurlurlur: String?) {
        if (!lurlurlurlurlur!!.contains("t.me")) {

            if (ccdcdcdcdf == "") {
                ccdcdcdcdf = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    AppCompatActivity.MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    lurlurlurlurlur
                ).toString()

                val nnhnhhn =
                    getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)
                val kjjkjk = nnhnhhn.edit()
                kjjkjk.putString("SAVED_URL", lurlurlurlurlur)
                kjjkjk.apply()
            }
        }
    }

    lateinit var klpip: ActivityBrovisierBinding
    var kgjfhdkxfjujuuj: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        klpip = ActivityBrovisierBinding.inflate(layoutInflater)
        setContentView(klpip.root)

        cdccdcd = klpip.bobobobo
        looooaaaad()


        val nhnhnh = CookieManager.getInstance()
        nhnhnh.setAcceptCookie(true)
        nhnhnh.setAcceptThirdPartyCookies(cdccdcd, true)
        bvbvvb()
        val nhnhnhnhj: Activity = this
        cdccdcd.webViewClient = object : WebViewClient() {


            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                try {
                    if (URLUtil.isNetworkUrl(url)) {
                        return false
                    }
                    if (hgtgtgtgttg(url)) {

                        val intent = Intent(Intent.ACTION_VIEW)
                        intent.data = Uri.parse(url)
                        startActivity(intent)
                    } else {

                        Toast.makeText(
                            applicationContext,
                            "Application is not installed",
                            Toast.LENGTH_LONG
                        ).show()
                        startActivity(
                            Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                            )
                        )
                    }
                    return true
                } catch (e: Exception) {
                    return false
                }
                view.loadUrl(url)
            }


            override fun onPageFinished(view: WebView, url: String) {
                super.onPageFinished(view, url)
                saaave(url)
            }

            override fun onReceivedError(
                view: WebView,
                errorCode: Int,
                description: String,
                failingUrl: String
            ) {
                Toast.makeText(nhnhnhnhj, description, Toast.LENGTH_SHORT).show()
            }


        }
        cdccdcd.webChromeClient = object : WebChromeClient() {
            override fun onShowFileChooser(
                webView: WebView, filePathCallback: ValueCallback<Array<Uri>>,
                fileChooserParams: FileChooserParams
            ): Boolean {
                jjkkjk?.onReceiveValue(null)
                jjkkjk = filePathCallback
                var ggtgtgttg: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                if (ggtgtgttg!!.resolveActivity(packageManager) != null) {

                    var vvvv: File? = null
                    try {
                        vvvv = jujujiii()
                        ggtgtgttg.putExtra("PhotoPath", kgjfhdkxfjujuuj)
                    } catch (ex: IOException) {
                    }

                    if (vvvv != null) {
                        kgjfhdkxfjujuuj = "file:" + vvvv.absolutePath
                        ggtgtgttg.putExtra(
                            MediaStore.EXTRA_OUTPUT,
                            Uri.fromFile(vvvv)
                        )
                    } else {
                        ggtgtgttg = null
                    }
                }
                val klklklk = Intent(Intent.ACTION_GET_CONTENT)
                klklklk.addCategory(Intent.CATEGORY_OPENABLE)
                klklklk.type = "image/*"
                val gtgtgtt: Array<Intent?> =
                    ggtgtgttg?.let { arrayOf(it) } ?: arrayOfNulls(0)
                val opopopop = Intent(Intent.ACTION_CHOOSER)
                opopopop.putExtra(Intent.EXTRA_INTENT, klklklk)
                opopopop.putExtra(Intent.EXTRA_TITLE, getString(R.string.takeeeeetttt))
                opopopop.putExtra(Intent.EXTRA_INITIAL_INTENTS, gtgtgtt)
                startActivityForResult(
                    opopopop, gggg
                )
                return true
            }

            @Throws(IOException::class)
            private fun jujujiii(): File {
                var frfrrfr = File(
                    Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),
                    "DirectoryNameHere"
                )
                if (!frfrrfr.exists()) {
                    frfrrfr.mkdirs()
                }

                frfrrfr =
                    File(frfrrfr.toString() + File.separator + "IMG_" + System.currentTimeMillis() + ".jpg")
                return frfrrfr
            }

        }

        cdccdcd.loadUrl(saaacfff())
    }

    private fun looooaaaad() {
        Snackbar.make(
            klpip.root, "Loading...",
            Snackbar.LENGTH_LONG
        ).show()
    }


    private fun opopopo(string: String) {
        OneSignal.setExternalUserId(
            string,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(results: JSONObject) {
                    try {
                        if (results.has("push") && results.getJSONObject("push").has("success")) {
                            val frrfrfrrf = results.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $frrfrfrrf"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("email") && results.getJSONObject("email").has("success")) {
                            val vvvvv =
                                results.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $vvvvv"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("sms") && results.getJSONObject("sms").has("success")) {
                            val kiikik = results.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $kiikik"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }


    private fun saaacfff(): String {

        val hyhyhyhy = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)

        val bggbggb = cccccccc

        val bhnhgfddss = "ad_id="
        val bghyjjuuj = "sub_id_4="
        val bgbhujuuj = "sub_id_5="
        val sub6frfr = "sub_id_6="

        val gthujuki: String? = Hawk.get(MAIN_IDffrrfrrf, "null")
        val cfvgbhnhn: String? = Hawk.get(DEEPLfrfrfrfr, "null")
        val vfvf: String? = Hawk.get(C1gttggtgt, "null")

        val njikiloj = AppsFlyerLib.getInstance().getAppsFlyerUID(this)

        AppsFlyerLib.getInstance().setCollectAndroidID(true)


        val bbgbgbg = "deviceID="
        val kjjkjk = "sub_id_1="



        val mmnnhnh = "naming"
        val deppfrfrf = "deeporg"


        val nnmmjjmmjjm = Build.VERSION.RELEASE

        val jukiikikik = Hawk.get(linkfrrrfrffr, "null")

        var jujujujuukkgffbb = ""


        if (vfvf != "null") {
            jujujujuukkgffbb =
                "$jukiikikik$kjjkjk$vfvf&$bbgbgbg$njikiloj&$bhnhgfddss$gthujuki&$bghyjjuuj$bggbggb&$bgbhujuuj$nnmmjjmmjjm&$sub6frfr$mmnnhnh"
            opopopo(njikiloj.toString())
        } else {
            jujujujuukkgffbb =
                "$jukiikikik$kjjkjk$cfvgbhnhn&$bbgbgbg$njikiloj&$bhnhgfddss$gthujuki&$bghyjjuuj$bggbggb&$bgbhujuuj$nnmmjjmmjjm&$sub6frfr$deppfrfrf"
            opopopo(njikiloj.toString())
        }
        val reeeet = "SAVED_URL"
        return hyhyhyhy.getString("SAVED_URL", jujujujuukkgffbb).toString()
    }


    private fun hgtgtgtgttg(uri: String): Boolean {

        val bgnhnhhnhn = packageManager
        try {
            bgnhnhhnhn.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)

            return true
        } catch (e: PackageManager.NameNotFoundException) {

        }
        return false
    }

    private var bbbbbtgtghyhy = false

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode != gggg || jjkkjk == null) {
            super.onActivityResult(requestCode, resultCode, data)
            return
        }
        var bnnhnhbmmmmnn: Array<Uri>? = null

        if (resultCode == AppCompatActivity.RESULT_OK) {
            if (data == null || data.data == null) {
                bnnhnhbmmmmnn = arrayOf(Uri.parse(kgjfhdkxfjujuuj))
            } else {
                val gyhyhhyhy = data.dataString
                if (gyhyhhyhy != null) {
                    bnnhnhbmmmmnn = arrayOf(Uri.parse(gyhyhhyhy))
                }
            }
        }
        jjkkjk?.onReceiveValue(bnnhnhbmmmmnn)
        jjkkjk = null
    }





}