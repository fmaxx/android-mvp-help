package com.snzflash.mvp.interfaces

import android.app.Application

/**
 * Created by maxim on 12.12.2017.
 */
interface IView {
    fun application(): Application
    fun showMessage(value: String)
    fun showMessage(resourceId: Int)
}