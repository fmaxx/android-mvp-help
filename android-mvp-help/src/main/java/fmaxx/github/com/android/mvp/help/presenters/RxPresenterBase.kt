package fmaxx.github.com.android.mvp.help.presenters

import fmaxx.github.com.android.mvp.help.interfaces.IView
import io.reactivex.disposables.CompositeDisposable

/**
 * Created by maxim on 12.12.2017.
 */
abstract class RxPresenterBase<V: IView>(view: V): PresenterBase<V>(view) {

    protected val subscription: CompositeDisposable = CompositeDisposable()

    override fun onViewPause(view: V) {
        super.onViewPause(view)
        subscription.clear()
    }
}