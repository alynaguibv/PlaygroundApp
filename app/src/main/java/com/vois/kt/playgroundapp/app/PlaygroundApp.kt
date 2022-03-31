package com.vois.kt.playgroundapp.app

import android.app.Application
import android.util.Log
import android.widget.Toast

class PlaygroundApp : Application() {

    val TAG = "PlaygroundApp"


    override fun onCreate() {
        super.onCreate()

        Log.i(TAG, "onCreate $TAG")
    }

    override fun onTrimMemory(level: Int) {
        super.onTrimMemory(level)
        Toast.makeText(this, "onTrimMemory Called $level", Toast.LENGTH_LONG).show()
    }
}