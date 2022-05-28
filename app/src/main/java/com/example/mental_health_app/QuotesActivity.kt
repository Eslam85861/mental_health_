package com.example.mental_health_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.chaquo.python.Python
import com.chaquo.python.android.AndroidPlatform

import com.example.mental_health_app.databinding.ActivityQuotesBinding
import kotlinx.android.synthetic.main.activity_chat.*
import kotlinx.android.synthetic.main.activity_quotes.*

class QuotesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQuotesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuotesBinding.inflate(layoutInflater)
        binding.quotes.text =quotes()
        binding.author.text =author()
        binding.info.text =info()
        val view: View = binding.root
        setContentView(view)
    }



    private fun quotes(): String {

        val python = Python.getInstance()
        val pythonFile = python.getModule("MQ")
        return pythonFile.callAttr("quotes").toString()
    }
    private fun author(): String {

        val python = Python.getInstance()
        val pythonFile = python.getModule("MQ")
        return pythonFile.callAttr("author").toString()
    }
    private fun info(): String {

        val python = Python.getInstance()
        val pythonFile = python.getModule("Did_You_Know")
        return pythonFile.callAttr("information").toString()
    }

}