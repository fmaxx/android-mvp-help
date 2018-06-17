package com.snzflash.mvp.presenters

import com.snzflash.mvp.interfaces.IPresenter
import com.snzflash.mvp.interfaces.IView

/**
 * Created by maxim on 12.12.2017.
 */
abstract class PresenterBase<V: IView>(protected var view: V? = null): IPresenter<V> {

    override fun onViewCreated(view: V) {
        this.view = view
    }

    override fun onViewDestroyed(view: V) {
        this.view = null
    }

    override fun onViewResumed(view: V) {

    }

    override fun onViewPaused(view: V) {

    }
}