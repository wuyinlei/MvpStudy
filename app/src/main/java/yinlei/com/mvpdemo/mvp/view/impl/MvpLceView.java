package yinlei.com.mvpdemo.mvp.view.impl;

import yinlei.com.mvpdemo.mvp.view.MvpView;

/**
 * 加载进度使用  请求数据  刷新UI界面
 *
 * @version V1.0 <描述当前版本功能>
 * @FileName: MvpLceView.java
 * @author: 若兰明月
 * @date: 2016-08-14 23:02
 */

public interface MvpLceView<M> extends MvpView {

    //显示加载的进度 监听加载的类型
    public void showLoading(boolean pullToRefresh);

    //显示内容视图
    public void showContent();

    //显示错误
    public void showError(Exception e,boolean pullToRefresh);

    //绑定数据
    public void showData(M data);
}
