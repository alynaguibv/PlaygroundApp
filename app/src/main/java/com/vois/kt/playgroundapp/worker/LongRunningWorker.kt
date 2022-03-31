package com.vois.kt.playgroundapp.worker

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters

class LongRunningWorker(appContext: Context, workerParams: WorkerParameters) :
    Worker(appContext, workerParams) {

    private val tag = "LongRunningWorker"

    init {
        Log.i(tag, "LongRunningWorker is initialized")
    }


    override fun doWork(): Result {
        Log.i(tag, "start doWork")

        while (true){
            proceed()
        }

    }

    private fun proceed() {

    }


}