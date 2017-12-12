package fmaxx.github.com.android.mvp.help.interfaces

/**
 * Created by maxim on 12.12.2017.
 */
interface IPresenter<in V: IView> {

    fun onViewCreate(view: V)
    fun onViewDestroy(view: V)

    fun onViewResume(view: V)
    fun onViewPause(view: V)

}