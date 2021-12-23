package com.aimanrashid831.volleyprogram

import android.app.DownloadManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.Volley

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fun apicall(){}
    }
    private fun apicall(textView : Any){
        val queue : RequestQueue = Volley.newRequestQueue(this)
        val url = "https://images.unsplash.com/photo-1615789591457-74a63395c990?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8YmFieSUyMGNhdHxlbnwwfHwwfHw%3D&w=1000&q=80"
        val tag = "My Tag"

        Val stringRequest: StringRequest(Request.Method.GET,url,
        Response.Listener<string>{ response ->
            textView.text = "Response is : ${"api call sucessfull"}"
        },
        Response.ErrorListner{textView.text = "That didnot work "}
        queue.add(stringRequest)
        )}
    }
}
