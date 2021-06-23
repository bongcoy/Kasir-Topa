package com.example.submissiondicod

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreenActivity : AppCompatActivity() {
    private var mDelayHandler: Handler? = null
    private var durasi: Long=2500 //2.5 detik

    internal val mRunnable: Runnable = Runnable {
        val intent = Intent(applicationContext, MainActivity::class.java)
        startActivity(intent)

        //Terjadi Splash
        finish()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        mDelayHandler = Handler()

        mDelayHandler!!.postDelayed(mRunnable,durasi)
    }
}