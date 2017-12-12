package fmaxx.github.com.android.mvp.help.presenters

import fmaxx.github.com.android.mvp.help.interfaces.IPresenter
import fmaxx.github.com.android.mvp.help.interfaces.IView

/**
 * Created by maxim on 12.12.2017.
 */
abstract class PresenterBase<V: IView>(protected var view: V? = null): IPresenter<V> {

    override fun onViewCreate(view: V) {
        this.view = view
    }

    override fun onViewDestroy(view: V) {
        this.view = null
    }

    override fun onViewResume(view: V) {

    }

    override fun onViewPause(view: V) {

    }
}