package yinlei.com.mvpdemo.pro.essence.view.navigation;

import android.content.Context;

import yinlei.com.mvpdemo.R;
import yinlei.com.mvpdemo.pro.base.view.navigation.NavigationBuilderAdapter;

/**
 * 在此写用途
 *
 * @version V1.0 <描述当前版本功能>
 * @FileName: EssenceNavigationBuilder.java
 * @author: 若兰明月
 * @date: 2016-08-15 22:17
 */

public class EssenceNavigationBuilder extends NavigationBuilderAdapter {
    public EssenceNavigationBuilder(Context context) {
        super(context);
    }

    @Override
    public int getLayoutId() {
        return R.layout.toolbar_essence_layout;
    }
}
