package yinlei.com.mvpdemo.mvp.view.impl;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import yinlei.com.mvpdemo.mvp.presenter.impl.MvpBasePresenter;
import yinlei.com.mvpdemo.mvp.view.MvpView;

/**
 * 将我们的MVP架构集成到我们的Activity
 *
 * @version V1.0 <描述当前版本功能>
 * @FileName: MvpActivity.java
 * @author: 若兰明月
 * @date: 2016-08-14 23:24
 */

public abstract class MvpActivity<P extends MvpBasePresenter> extends AppCompatActivity implements MvpView {

    protected P presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = bindPresenter();
        //我们的presenter中介是不是管理view
        if (presenter != null){
            presenter.attachView(this);
        }
    }

    //具体的实现我不知道   留给别人去实现
    public abstract P bindPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //解除绑定
        if (presenter != null){
            presenter.detachView(this);
        }
    }
}
