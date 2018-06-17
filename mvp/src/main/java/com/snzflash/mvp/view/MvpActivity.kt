package com.snzflash.mvp.view

import android.support.v7.app.AppCompatActivity
import com.snzflash.mvp.interfaces.IView
import org.jetbrains.anko.toast

/**
 * Created by maxim on 12.12.2017.
 */
abstract class MvpActivity: AppCompatActivity(), IView {
    override fun onStop() {
        beforeStop()
        super.onStop()
    }

    abstract fun beforeStop()

    override fun showMessage(value: String) {
        toast(value)
    }

    override fun showMessage(resourceId: Int) {
        toast(resourceId)
    }
}