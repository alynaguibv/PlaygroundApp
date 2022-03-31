package com.vois.kt.playgroundapp.view

import android.content.Context
import android.os.Handler
import android.os.Looper
import android.os.Message
import android.util.AttributeSet
import android.view.View

class MessageHandler(context: Context?, attrs: AttributeSet?) :
    View(context, attrs) ,Handler.Callback {


    private var handlerCallback: Handler.Callback? = null

    var handlerObj = Looper.myLooper()?.let { Handler(it, this) }
        private set

    override fun handleMessage(msg: Message): Boolean {
        handlerCallback?.let {
            it.handleMessage(msg)
            return true
        }
        return false
    }

    fun setHandlerCallback(handlerCallback: Handler.Callback?) {
        this.handlerCallback = handlerCallback
    }
}