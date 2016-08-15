package yinlei.com.mvpdemo.mvp.presenter.impl;

import yinlei.com.mvpdemo.mvp.presenter.MvpPresenter;
import yinlei.com.mvpdemo.mvp.view.MvpView;

/**
 * 在此写用途
 *
 * @version V1.0 <描述当前版本功能>
 * @FileName: MvpBasePresenter.java
 * @author: 若兰明月
 * @date: 2016-08-14 23:08
 */

public abstract class MvpBasePresenter<V extends MvpView> implements MvpPresenter<V> {

    private V view;

    @Override
    public void attachView(V view) {
        this.view = view;
    }

    @Override
    public void detachView(V view) {
        if (view != null){
            view = null;
        }
    }
}
