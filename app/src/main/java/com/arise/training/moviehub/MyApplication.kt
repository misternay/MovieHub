package com.arise.training.moviehub

import android.app.Application
import timber.log.Timber

class MyApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            // Initialize Timber
             Timber.plant(Timber.DebugTree())
        }
    }
}