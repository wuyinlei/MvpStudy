package yinlei.com.mvpdemo.mvp.view.impl;

/**
 * 在此写用途
 *
 * @version V1.0 <描述当前版本功能>
 * @FileName: BaseMvpLceView.java
 * @author: 若兰明月
 * @date: 2016-08-14 23:06
 */

public abstract class BaseMvpLceView<M> implements MvpLceView<M>  {

    @Override
    public void showLoading(boolean pullToRefresh) {

    }

    @Override
    public void showContent() {

    }

    @Override
    public void showError(Exception e, boolean pullToRefresh) {

    }

    @Override
    public void showData(M data) {

    }
}
