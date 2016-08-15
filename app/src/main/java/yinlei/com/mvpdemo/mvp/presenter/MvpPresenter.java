package yinlei.com.mvpdemo.mvp.presenter;

import yinlei.com.mvpdemo.mvp.view.MvpView;

/**
 *
 *
 * @version V1.0 <描述当前版本功能>
 * @FileName: MvpPresenter.java
 * @author: 若兰明月
 * @date: 2016-08-14 22:55
 */

public interface MvpPresenter<V extends MvpView> {

    //绑定view
    public void attachView(V view);

    //解除绑定
    public void detachView(V view);
}
