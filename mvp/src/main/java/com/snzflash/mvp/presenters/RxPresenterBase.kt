package com.snzflash.mvp.presenters

import com.snzflash.mvp.interfaces.IView
import io.reactivex.disposables.CompositeDisposable

/**
 * Created by maxim on 12.12.2017.
 */
abstract class RxPresenterBase<V: IView>(view: V): PresenterBase<V>(view) {

    protected val subscription: CompositeDisposable = CompositeDisposable()

    override fun onViewPaused(view: V) {
        subscription.clear()
        super.onViewPaused(view)
    }
}