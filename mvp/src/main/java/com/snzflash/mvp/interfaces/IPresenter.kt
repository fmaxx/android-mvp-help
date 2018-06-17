package com.snzflash.mvp.interfaces

/**
 * Created by maxim on 12.12.2017.
 */
interface IPresenter<in V: IView> {

    fun onViewCreated(view: V)
    fun onViewDestroyed(view: V)

    fun onViewResumed(view: V)
    fun onViewPaused(view: V)

}