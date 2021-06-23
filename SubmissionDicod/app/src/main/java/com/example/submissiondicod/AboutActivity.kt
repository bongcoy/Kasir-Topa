package com.example.submissiondicod

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class AboutActivity : AppCompatActivity() {
    private var title : String = "Profil Siswa"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        setActionBarTitle(title)
    }
    private fun setActionBarTitle(title : String) {
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = title
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}