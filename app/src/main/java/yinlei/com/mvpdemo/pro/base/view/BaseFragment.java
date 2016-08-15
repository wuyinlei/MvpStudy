package yinlei.com.mvpdemo.pro.base.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import yinlei.com.mvpdemo.mvp.presenter.impl.MvpBasePresenter;
import yinlei.com.mvpdemo.mvp.view.impl.MvpFragment;

/**
 * 在此写用途
 *
 * @version V1.0 <描述当前版本功能>
 * @FileName: BaseFragment.java
 * @author: 若兰明月
 * @date: 2016-08-14 23:48
 */

public abstract class BaseFragment<P extends MvpBasePresenter> extends MvpFragment<P> {
    //我们自己的fragment 需要缓存视图
    private View viewContent;//缓存视图
    private boolean isInit;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (viewContent == null) {
            viewContent = inflater.inflate(getContentView(), container, false);
            initContentView(viewContent);
        }
        //判断fragment对应的activity是否存在这个视图
        ViewGroup viewGroup = (ViewGroup) viewContent.getParent();
        if (viewGroup !=null){
            //如果存在，直接干掉  重新添加
            viewGroup.removeView(viewContent);
        }
        return viewContent;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (!isInit){
            this.isInit = true;
            initData();
        }
    }

    public void initData() {

    }

    @Override
    protected P bindPresenter() {
        return null;
    }

    public abstract int getContentView();

    public abstract void initContentView(View viewContent);
}
