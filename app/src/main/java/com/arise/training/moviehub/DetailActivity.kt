package com.arise.training.moviehub

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailActivity : AppCompatActivity() {
    var count = 0
    override fun onStart() {
        super.onStart()
        Log.d("DetailActivity", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("DetailActivity", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("DetailActivity", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("DetailActivity", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("DetailActivity", "onDestroy")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        if (savedInstanceState != null) {
            Log.d("DetailActivity", "count: ${savedInstanceState.getInt(STATE_COUNT)}")
            count = savedInstanceState.getInt(STATE_COUNT)
        }

        val backBtn = findViewById<Button>(R.id.detailBtn)
        backBtn.setOnClickListener {
            count += 1
            Log.d("DetailActivity", "count: $count")
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(STATE_COUNT, count)
    }

    companion object {
        const val STATE_COUNT = "STATE_COUNT"
    }
}