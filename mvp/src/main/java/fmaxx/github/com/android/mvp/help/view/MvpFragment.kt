package fmaxx.github.com.android.mvp.help.view

import android.app.Fragment
import fmaxx.github.com.android.mvp.help.interfaces.IView
import org.jetbrains.anko.toast

/**
 * Created by maxim on 12.12.2017.
 */
abstract class MvpFragment: Fragment(), IView {

    override fun onDestroy() {
        beforeDestroy()
        super.onDestroy()
    }

    abstract fun beforeDestroy()

    override fun showMessage(value: String) {
        toast(value)
    }

    override fun showMessage(resourceId: Int) {
        toast(resourceId)
    }
}