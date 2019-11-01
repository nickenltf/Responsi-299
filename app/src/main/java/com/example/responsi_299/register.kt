package com.example.responsi_299

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.net.Uri
import kotlinx.android.synthetic.main.activity_register.*

class register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)


        button_regist.setOnClickListener () {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
