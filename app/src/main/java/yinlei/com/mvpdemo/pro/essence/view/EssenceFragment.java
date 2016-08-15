package yinlei.com.mvpdemo.pro.essence.view;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.Arrays;

import yinlei.com.mvpdemo.R;
import yinlei.com.mvpdemo.pro.base.view.BaseFragment;
import yinlei.com.mvpdemo.pro.essence.view.adapter.EssenceAdapter;
import yinlei.com.mvpdemo.pro.essence.view.navigation.EssenceNavigationBuilder;

/**
 * 在此写用途
 *
 * @version V1.0 <描述当前版本功能>
 * @FileName: EssenceFragment.java
 * @author: 若兰明月
 * @date: 2016-08-15 20:59
 */

public class EssenceFragment extends BaseFragment {

    private TabLayout tab_essence;
    private ViewPager vp_essence;

    @Override
    public int getContentView() {
        return R.layout.fragment_essence;
    }

    @Override
    public void initContentView(View viewContent) {
        initToolbar(viewContent);
        this.tab_essence = (TabLayout) viewContent.findViewById(R.id.tab_essence);
        this.vp_essence = (ViewPager) viewContent.findViewById(R.id.vp_essence);

    }

    private void initToolbar(View viewContent) {
        EssenceNavigationBuilder builder = new EssenceNavigationBuilder(getContext());
        builder.setTitleIcon(R.drawable.main_essence_title)
                .setLeftIcon(R.drawable.main_essence_btn_selector)
                .setRightIcon(R.drawable.main_essence_btn_more_selector)
                .setLeftIconOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getContext(), "点击左侧了", Toast.LENGTH_SHORT).show();
                    }
                }).setRightIconOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "点击右侧了", Toast.LENGTH_SHORT).show();
            }
        });

        builder.createAndBind((ViewGroup) viewContent);

    }

    @Override
    public void initData() {
        super.initData();
        String[] titles = getResources().getStringArray(R.array.essence_video_tab);
        EssenceAdapter adapter =
                new EssenceAdapter(getFragmentManager(), Arrays.asList(titles));
        this.vp_essence.setAdapter(adapter);
        this.tab_essence.setupWithViewPager(this.vp_essence);

    }
}
