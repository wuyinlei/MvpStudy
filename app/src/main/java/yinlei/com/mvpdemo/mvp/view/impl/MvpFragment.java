package yinlei.com.mvpdemo.mvp.view.impl;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;

import yinlei.com.mvpdemo.mvp.presenter.impl.MvpBasePresenter;
import yinlei.com.mvpdemo.mvp.view.MvpView;

/**
 * 在此写用途
 *
 * @version V1.0 <描述当前版本功能>
 * @FileName: MvpFragment.java
 * @author: 若兰明月
 * @date: 2016-08-14 23:36
 */

public abstract class MvpFragment<P extends MvpBasePresenter> extends Fragment implements MvpView {

    protected P presenter;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        presenter = bindPresenter();
        if (presenter != null) {
            presenter.attachView(this);
        }

    }

    protected abstract P bindPresenter();

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (presenter != null) {
            presenter.detachView(this);
        }
    }
}
