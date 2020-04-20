package com.abhamid.allstarroster

import android.content.Intent
import android.graphics.Color
import android.os.AsyncTask
import android.os.Build
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.view.View
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import com.squareup.picasso.Picasso

import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
            window.statusBarColor = Color.WHITE
        }

        val nname = intent.getStringExtra("name")
        val ndesc = intent.getStringExtra("desc")
        val nnumber = intent.getStringExtra("number")
        val nphoto = intent.getStringExtra("photo")
        val npos = intent.getStringExtra("position")
        val nteam = intent.getStringExtra("team")
        val hg = intent.getStringExtra("link")

        name.text = nname
//        desc.text = ndesc
        number.text = nnumber
        pos.text = npos
        team.text = nteam

        Picasso.get().load(nphoto).into(player_det_img)

        var webView = findViewById<WebView>(R.id.highlight_view)
        webView!!.settings.javaScriptEnabled = true
        webView!!.webViewClient = object : WebViewClient(){
            override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
                view?.loadUrl(hg)
                return true
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                det_progressbar.visibility = View.GONE
                highlight_view.visibility = View.VISIBLE
            }
        }
        webView!!.loadUrl(hg)

        back_button.setOnClickListener {
            val backIntent = Intent(this, MainActivity::class.java)
            startActivity(backIntent)
        }




    }

}
